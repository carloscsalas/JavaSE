package com.exercises.javase.parsejson;

import org.apache.commons.lang3.math.NumberUtils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.Configuration.ConfigurationBuilder;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.json.JacksonJsonProvider;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

public class BeanJacksonUtil {
    private final static Logger LOGGER = LoggerFactory.getLogger(BeanJacksonUtil.class);

    static Configuration configuration = new ConfigurationBuilder().jsonProvider(new JacksonJsonProvider()).mappingProvider(new JacksonMappingProvider()).build();
    public static final String TYPE_NUMBER = "number";
    public static final String TYPE_STRING = "string";
    public static final String TYPE_BOOLEAN = "boolean";



    private static String[] TYPES = { TYPE_NUMBER, TYPE_STRING, TYPE_BOOLEAN };

    private static String[] BOOLEANS = { "true", "false" };

    private static ObjectMapper objectMapper = null;
    private static ObjectMapper objectMapperSerialize = null;

    private static ObjectMapper getObjectMapperSerialize() {
        if (objectMapperSerialize == null) {
            objectMapperSerialize = new ObjectMapper();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            objectMapperSerialize.setDateFormat(df);
            objectMapperSerialize.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapperSerialize.setSerializationInclusion(Include.NON_NULL);
            objectMapperSerialize.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
            objectMapperSerialize.toString();
        }
        return objectMapperSerialize;
    }

    private static ObjectMapper getObjectMapper() {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            objectMapper.setDateFormat(df);
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        }
        return objectMapper;
    }

    @SuppressWarnings("unchecked")
    public static <T> T deserializeJson(String json, TypeReference<T> type) {
        if (json == null || json.trim().length() == 0) {
            return null;
        }
        long inicio=0L,fin=0L;
        Object obj = null;

        try {
            inicio = System.currentTimeMillis();
            obj = getObjectMapper().readValue(json, type);
            fin = System.currentTimeMillis();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
        }finally {
            long tiempo=fin-inicio;
            LOGGER.info("tiempo deserializacion : "+tiempo +"mls ");
        }

        return (T) obj;
    }

    @SuppressWarnings("unchecked")
    public static <T> T deserializeJson(String json, Class<T> type) {

        if (json == null || json.trim().length() == 0) {
            return null;
        }
        long inicio=0L,fin=0L;
        Object obj = null;

        try {
            inicio = System.currentTimeMillis();
            obj = getObjectMapper().readValue(json, type);
            fin = System.currentTimeMillis();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
        }finally {
            long tiempo=fin-inicio;
            LOGGER.info("tiempo deserializacion : "+tiempo +"mls ");
        }
        return (T) obj;
    }

    @SuppressWarnings("rawtypes")
    public static Object obtenerValorJSON(String filtro, String stringSerialize) {
        try {
            Object salida = JsonPath.read(stringSerialize, filtro);
            if (salida instanceof List) {
                List resultado = (List) salida;
                if (resultado != null && resultado.size() == 1) {
                    return resultado.get(0);
                }
            } else {
                return salida;
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
        }
        return null;
    }

    public static String serializeObject(Object object) {
        try {
            return getObjectMapperSerialize().writeValueAsString(object);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
        }

        return null;
    }

    public static String codigoError(String json, String filtro) {
        String mensaje = null;
        List<String> tag = null;
        try {
            tag = JsonPath.read(json, filtro);
        } catch (Exception e) {
            mensaje = "Error al leer el JSON ";
            LOGGER.error(e.getMessage(),e);
        }
        if (tag == null || tag.isEmpty()) {
            mensaje = "Error, no se encuentra el atributo solicitado: ";
        } else if (tag.size() > 1) {
            mensaje = "Error, error el atributo se encuentra duplicado: ";
        }

        Object value = obtenerValue(json, filtro, "value");
        Object type = obtenerValue(json, filtro, "type");

        if (value == null) {
            return "El atributo valor se encuentra vacío: ";
        }

        if (type == null) {
            return "El atributo tipo se encuentra vacío: ";
        }

        if (!Arrays.asList(TYPES).contains(type.toString())) {
            return "El atributo tipo es incorrecto ";
        }

        if (type.toString().equals(TYPE_NUMBER) && !NumberUtils.isNumber(value.toString())) {
            return "El valor debe ser numérico: ";
        }

        if (type.toString().equals(TYPE_BOOLEAN) && !Arrays.asList(BOOLEANS).contains(value.toString())) {
            return "El valor debe ser true o false: ";
        }

        if (type.toString().equals(TYPE_STRING)) {
            return null;
        }

        return mensaje;
    }

    public static Object obtenerValue(String json, String filtro, String campo) {
        if (isBlank(json) || isBlank(filtro)) {
            return null;
        }
        List<String> tag = null;
        try {

            tag = JsonPath.read(json, filtro + "." + campo);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
        }
        if (tag != null && tag.size() == 1) {
            return tag.get(0);
        }
        return null;
    }

    public static boolean isBlank(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }
}
