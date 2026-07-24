<#if S("${aBlockId}_${anItemId}_EVENT_${eIndex}_IN")!="">
${"\t\t"}selectAll(${S("${aBlockId}_${anItemId}_EVENT_${eIndex}_IN")}Table);
<#else>
${"\t\t"}selectAll(${aBlockId}Table);
</#if>
