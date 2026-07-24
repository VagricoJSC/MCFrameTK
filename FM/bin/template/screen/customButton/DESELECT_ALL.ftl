<#if S("${aBlockId}_${anItemId}_EVENT_${eIndex}_IN")!="">
${"\t\t"}clearSelection(${S("${aBlockId}_${anItemId}_EVENT_${eIndex}_IN")}Table);
<#else>
${"\t\t"}clearSelection(${aBlockId}Table);
</#if>
