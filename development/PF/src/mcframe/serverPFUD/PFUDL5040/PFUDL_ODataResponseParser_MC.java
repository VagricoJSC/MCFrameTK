package mcframe.serverPFUD.PFUDL5040;


import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.notice.MCAppException;
import mcframe.commonCore.util.MCDataConvUtil;
import mcframe.commonCore.util.MCDataConvUtil.JSON;
import static mcframe.serverCore.requester.MCRequestObject.*;
import java.util.Optional;

public class PFUDL_ODataResponseParser_MC {
	

	protected static final Class<PFUDL_ODataResponseParser> CLAZZ = PFUDL_ODataResponseParser.class;

	public enum ODataEdmType {

	    STRING("Edm.String", String.class) {
	        @Override protected Object convert(Object raw) {
	            return raw != null ? raw.toString() : null;
	        }
	    },

	    BOOLEAN("Edm.Boolean", Boolean.class) {
	        @Override protected Object convert(Object raw) {
	            if (raw == null) return null;
	            if (raw instanceof Boolean) return raw;
	            return Boolean.parseBoolean(raw.toString());
	        }
	    },

		INT16("Edm.Int16", Short.class) {
			@Override
			protected Object convert(Object raw) {
				return raw != null ? Short.valueOf(raw.toString()) : null;
			}
		},
	    
	    INT32("Edm.Int32", Integer.class) {
	        @Override protected Object convert(Object raw) {
	            return raw != null ? Integer.valueOf(raw.toString()) : null;
	        }
	    },

	    DECIMAL("Edm.Decimal", BigDecimal.class) {
	        @Override protected Object convert(Object raw) {
	            return raw != null ? new BigDecimal(raw.toString()) : null;
	        }
	    },

	    DOUBLE("Edm.Double", Double.class) {
	        @Override protected Object convert(Object raw) {
	            return raw != null ? Double.valueOf(raw.toString()) : null;
	        }
	    },

	    GUID("Edm.Guid", UUID.class) {
	        @Override protected Object convert(Object raw) {
	            return raw != null ? UUID.fromString(raw.toString()) : null;
	        }
	    },

	    DATE("Edm.Date", MCDate.class) {
	        @Override protected Object convert(Object raw) {
	            return raw != null ? parseToMCDate(raw.toString()) : null;
	        }
	    },

	    DATETIME("Edm.DateTime", MCDate.class) {
	        @Override protected Object convert(Object raw) {
	            return raw != null ? parseToMCDate(raw.toString()) : null;
	        }
	    },

	    DATETIMEOFFSET("Edm.DateTimeOffset", MCDate.class) {
	        @Override protected Object convert(Object raw) {
	            return raw != null ? parseToMCDate(raw.toString()) : null;
	        }
	    },

	    TIME("Edm.Time", LocalTime.class) {
	        @Override
	        protected Object convert(Object raw) {
	            if (raw == null) return null;
	            try {
	                String str = raw.toString();
	                // 例：午前3時8分6秒の場合
	                // v2の一部の実装では[PT3H8M6S]という形式
	                // それ以外は[03:08:06]という形式
	                if (str.startsWith("PT")) {
	                    return parseDurationToLocalTime(str);  
	                }
	                return LocalTime.parse(str, DateTimeFormatter.ofPattern("HH:mm:ss"));
	            } catch (DateTimeParseException e) {
	                return null;
	            }
	        }
	    },
	    
	    TIMEOFDAY("Edm.TimeOfDay", LocalTime.class) {
	        @Override protected Object convert(Object raw) {
	            if (raw == null) return null;
	            try {
					return LocalTime.parse(raw.toString(), DateTimeFormatter.ISO_LOCAL_TIME);
	            } catch (DateTimeParseException e) {
	                return null;
	            }
	        }
	    };


	    protected  String edmName;
	    protected  Class<?> javaType;

	    ODataEdmType(String edmName, Class<?> javaType) {
	        this.edmName = edmName;
	        this.javaType = javaType;
	    }

	    protected String getEdmName() {
	        return edmName;
	    }

	    protected Class<?> getJavaType() {
	        return javaType;
	    }

	    protected abstract Object convert(Object raw);

	    protected  Optional<ODataEdmType> _fromEdmName(String edmName) {
	        for (ODataEdmType t : values()) {
	            if (t.edmName.equals(edmName)) return Optional.of(t);
	        }
	        return Optional.empty();
	    }

	    protected static final Pattern PatternODataV2 = Pattern.compile("/Date\\((\\d+)([+-]\\d{4})?\\)/");
	    protected static final Pattern PatternDate = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
	    protected static final Pattern PatternDateTime = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}$");
	    protected static final String DateFormat = "yyyy-MM-dd";
	    protected static final String DateTimeFormat = "yyyy-MM-dd'T'HH:mm:ss";

		protected LocalTime parseDurationToLocalTime(String duration) {
			Pattern pattern = Pattern.compile("PT(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?");
			Matcher matcher = pattern.matcher(duration);
			if (matcher.matches()) {
				int hours = matcher.group(1) != null ? Integer.parseInt(matcher.group(1)) : 0;
				int minutes = matcher.group(2) != null ? Integer.parseInt(matcher.group(2)) : 0;
				int seconds = matcher.group(3) != null ? Integer.parseInt(matcher.group(3)) : 0;
				return LocalTime.of(hours, minutes, seconds);
			}
			return null;
		}

		protected MCDate parseToMCDate(String dateStr) {
	        if (dateStr == null) return null;

	        Matcher v2Matcher = PatternODataV2.matcher(dateStr);
	        if (v2Matcher.matches()) {
	            long millis = Long.parseLong(v2Matcher.group(1));
	            
	            // ミリ秒をDateクラス→DateクラスをMCDate、と変換すると、
	            // JVM のローカルタイムゾーン（日本だと9時）で見えてしまう。
	            // 正しく0時で扱うため、UTC時刻に変換。
	            // UTC0時であれば、ローカルタイムゾーンになっているMCDateの時刻をカットする。
	            Instant instant = Instant.ofEpochMilli(millis);
	            LocalDateTime utcDateTime = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
	            boolean isMidnight = utcDateTime.toLocalTime().equals(LocalTime.MIDNIGHT); 

				return isMidnight ? MCDate.valueOf(new Date(millis)).startTimeOfDay() : MCDate.valueOf(new Date(millis));
			}

	        if (PatternDate.matcher(dateStr).matches()) {
	            return MCDate.valueOf(dateStr, DateFormat);
	        }

	        if (PatternDateTime.matcher(dateStr).matches()) {
	            return MCDate.valueOf(dateStr, DateTimeFormat);
	        }

			// 例: [2024-09-25T01:32:26.212251Z]の形式
	        if (dateStr.endsWith("Z")) {
	            try {
	                Instant instant = Instant.parse(dateStr);
	                LocalDateTime utcDateTime = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
	                String dateTimeStr = utcDateTime.toString(); // "yyyy-MM-ddTHH:mm:ss[.SSS]"
	                // MCDateで扱うため、ミリ秒切り捨て
	                return MCDate.valueOf(dateTimeStr, DateTimeFormat);
	            } catch (DateTimeParseException e) {
	                return null;
	            }
	        }
	        
	        return null;
	    }

	}

	protected Optional<ODataEdmType> fromEdmName(String edmName) {
		for (ODataEdmType t : ODataEdmType.values()) {
			if (t.edmName.equals(edmName)) return Optional.of(t);
		}
		return Optional.empty();
	}

	public static <T> T convertField(String fieldName, Map<String, String> typeMap, Map<String, Object> dataMap) {
		return object(CLAZZ)._convertField(fieldName, typeMap, dataMap);
	}

	@SuppressWarnings("unchecked")
	protected <T> T _convertField(String fieldName, Map<String, String> typeMap, Map<String, Object> dataMap) {
		String typeName = typeMap.get(fieldName);
		Object rawValue = dataMap.get(fieldName);

		if (typeName == null || rawValue == null) return null;

		return (T) fromEdmName(typeName).map(type -> type.convert(rawValue)).orElse(null);
	}

	public static List<Map<String, Object>> responseToChildNodes(String response) {
		return object(CLAZZ)._responseToChildNodes(response);
	}

	protected List<Map<String, Object>> _responseToChildNodes(String response) {

		Map<String, Object> root = parseJsonResponse(response);
		return extractNodes(root);

	}
	
	protected  Map<String, Object> parseJsonResponse(String response) {
		try {
			JSON json = MCDataConvUtil.JSON.create();
			return json.toMap(response);
		}
		catch (Exception e) {
			throw new MCAppException(e);
		}
	}
	
	protected  List<Map<String, Object>> extractNodes(Map<String, Object> root) {
		if (isODataV2(root)) {
			return extractV2Nodes(root);
		}
		else if (isODataV4(root)) {
			return extractV4Nodes(root);
		}
		return new ArrayList<>();
	}
	
	@SuppressWarnings("unchecked")
	protected  List<Map<String, Object>> extractV2Nodes(Map<String, Object> root) {

		if (root == null) return new ArrayList<>();

		Object dObj = root.get("d");
		if (dObj instanceof Map) {
			Map<?, ?> d = (Map<?, ?>) dObj;

			if (d.containsKey("results")) {
				Object results = d.get("results");
				if (results instanceof List) {
					return (List<Map<String, Object>>) results;
				}
			}
			else {
				return new ArrayList<>(Arrays.asList((Map<String, Object>) d));
			}
		}
		
		return extractFromODataJsonLight(root);
		    
	}
	
	@SuppressWarnings("unchecked")
	protected  List<Map<String, Object>> extractFromODataJsonLight(Map<String, Object> root) {
		
		if (root == null || !root.containsKey("odata.metadata")) {
			return new ArrayList<>();
		}
		   
		// [odata.metadata]で始まる場合（検索結果複数件）
		Object valueObj = root.get("value");
		if (valueObj instanceof List) {
			return (List<Map<String, Object>>) valueObj;
		}

		// 検索結果1件
		return new ArrayList<>(Arrays.asList((Map<String, Object>) root));

	}
	
	protected  List<Map<String, Object>> extractV4Nodes(Map<String, Object> root) {
		if (root.containsKey("value")) {
			Object val = root.get("value");
			if (val instanceof List) {
				return  (List<Map<String, Object>>) val;
			}
		}
		else {
			return  new ArrayList<>(Arrays.asList((Map<String, Object>) root));
		}
		return new ArrayList<>();
	}

	
	protected  boolean isODataV2(Map<?, ?> root) {
		 if (root == null) return false;
		    return root.containsKey("d") || root.containsKey("odata.metadata");
	}

	protected  boolean isODataV4(Map<?, ?> root) {
	    if (root == null) return false;
	    return root.containsKey("@odata.context");
	}

}
