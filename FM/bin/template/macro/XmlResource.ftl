<#macro CDATA value>
<![CDATA[${value?replace("]]>","]]]]><![CDATA[>")}]]><#rt>
</#macro>

<#macro SUB_HEAD aHead>
<${aHead}>
<#list GET_NS_SUBKEYS_FROM_XML(aHead + ".") as aNode>
<@XML_BLOCK aNode aHead + "." + aNode "\t"/>
</#list>
</${aHead}>

</#macro>

<#macro XML_BLOCK node path tabs>
<#if GET_FROM_XML(path)!="">
${tabs}<${node}><#if node=="label"||node=="message"||node=="msg"><@CDATA GET_FROM_XML(path)/><#else>${GET_FROM_XML(path)}</#if></${node}>
<#else>
${tabs}<${node}>
<#list GET_NS_SUBKEYS_FROM_XML(path + ".") as aNode>
<@XML_BLOCK aNode path + "." + aNode tabs + "\t"/>
</#list>
${tabs}</${node}>
</#if>
</#macro>