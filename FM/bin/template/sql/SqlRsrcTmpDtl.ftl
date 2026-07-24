	/**
	 * <PRE>
<#list cmt_sql as cs>
	 * ${cs}
</#list>
	 * </PRE>
	 *
	 * @ID ${varname} 
	 * @since ${upddate}
	 * @author ${devname}
	 * @memo <PRE>
<#list cmt_note as cn>
	 *    ${cn}
</#list> 
	 *    </PRE>
	 */
	public static final String ${varname} =
<#list var_sql as vs>
		${vs}
</#list>
