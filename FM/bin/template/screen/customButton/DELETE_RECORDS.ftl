<#if S("${aBlockId}_${anItemId}_EVENT_${eIndex}_IN")!="">
${"\t\t"}deleteRows(${S("${aBlockId}_${anItemId}_EVENT_${eIndex}_IN")}Table);
<#else>
${"\t\t"}deleteRows(${aBlockId}Table);
</#if>
