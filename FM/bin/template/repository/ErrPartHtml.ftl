<#if A("ERRORS")?size!=0>
*************************************************************************************<br>
${A("ERRORS")?size}件のエラー・警告が発生しています。<br>
<table border=1 cellspacing=0 cellpadding=2 >
<#list A("ERRORS") as err>
<tr><td>

<#list err?split("\n") as lToken>
  ${lToken}<br>
</#list>

</td></tr>
</#list>
</table>
</#if>