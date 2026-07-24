<#import "/macro/Panel.ftl" as PANEL>
<#if S("${aBlockId}_${anItemId}_EVENT_${eIndex}_IN")!="">
${"\t\t"}deleteRow(${S("${aBlockId}_${anItemId}_EVENT_${eIndex}_IN")}<@PANEL.B_SWING_SUF comp=S(S("${aBlockId}_${anItemId}_EVENT_${eIndex}_IN") + "_COMPONENT")/>);
<#else>
${"\t\t"}deleteRow(${aBlockId}<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/>);
</#if>
