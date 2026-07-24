<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="C"||S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="CC"||S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="CLB">String</#if><#t>
<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="N">Number</#if><#t>
<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="D">Date</#if><#t>
<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="TS">Timestamp</#if><#t>
<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="F">Boolean</#if><#t>
<#if S(S("BLOCK_ID") + "_${anItemId}_TYPE")=="B">Binary</#if><#t>