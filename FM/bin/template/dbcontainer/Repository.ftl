<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<SPEC>
<ID>${tableName}</ID>
<COLUMN ID="MODULE_ID" TYPE="STRING">${moduleID}</COLUMN>
<COLUMN ID="SUBMODULE_ID" TYPE="STRING"/>
<COLUMN ID="CLASS" TYPE="STRING"/>
<COLUMN ID="NAME" TYPE="STRING"/>
<COLUMN ID="CLASS_SUFFIX" TYPE="STRING">${getDbcSuffix()}</COLUMN>
<COLUMN ID="SUPER_ID" TYPE="STRING">$def$</COLUMN>
<COLUMN ID="SUPER_CLASS" TYPE="STRING"/>
<COLUMN ID="SUPER_CLASS_SUFFIX" TYPE="STRING"/>
<COLUMN ID="GENE_TYPE" TYPE="STRING">C</COLUMN>
<COLUMN ID="MEMO" TYPE="STRING"/>
<COLUMN ID="PACKAGE_FORM" TYPE="STRING"/>
<COLUMN ID="MODIFIER" TYPE="STRING"/>
<COLUMN ID="OPT1" TYPE="STRING"/>
<COLUMN ID="IMPLE_INTERFACE" TYPE="STRING"/>
<COLUMN ID="SUPER_INTERFACE" TYPE="STRING"/>
<COLUMN ID="ACTYPE" TYPE="STRING"/>
<COLUMN ID="GENE_DETAIL" TYPE="STRING"/>
<blocks>
<BLOCK>
<ID>${tableName}</ID>
<COLUMN ID="TYPE" TYPE="STRING"/>
<COLUMN ID="DEPEND_TYPE" TYPE="STRING"/>
<COLUMN ID="DEPEND" TYPE="STRING"/>
<COLUMN ID="MEMO" TYPE="STRING"/>
<COLUMN ID="CLASS" TYPE="STRING">${tableName}</COLUMN>
<COLUMN ID="MODULE_ID" TYPE="STRING">${moduleID}</COLUMN>
<COLUMN ID="CLASS_SUFFIX" TYPE="STRING">${getDbcSuffix()}</COLUMN>
<#if (getDbcSuperSuffix())?has_content><COLUMN ID="SUPER_CLASS_SUFFIX" TYPE="STRING">${getDbcSuperSuffix()}</COLUMN><#else><COLUMN ID="SUPER_CLASS_SUFFIX" TYPE="STRING"/></#if>
<#if (getDbcSuperListClass())?has_content><COLUMN ID="SUPER_LIST_CLASS" TYPE="STRING">${getDbcSuperListClass()}</COLUMN><#else><COLUMN ID="SUPER_LIST_CLASS" TYPE="STRING"/></#if>
<#if (getDbcSuperRowClass())?has_content><COLUMN ID="SUPER_ROW_CLASS" TYPE="STRING">${getDbcSuperRowClass()}</COLUMN><#else><COLUMN ID="SUPER_ROW_CLASS" TYPE="STRING"/></#if>
<COLUMN ID="MODIFIER" TYPE="STRING">public</COLUMN>
<COLUMN ID="OPT1" TYPE="STRING"/>
<COLUMN ID="GENE_MODE" TYPE="STRING">${DBCMark}</COLUMN>
<COLUMN ID="GENE_MODE_LAYER" TYPE="NUMBER">1</COLUMN>
<COLUMN ID="TABLE_ALIAS" TYPE="STRING">${getDbcTMark()}</COLUMN>
<COLUMN ID="SUPER_DML_CLASS" TYPE="STRING">${getDbcSuperDmlClass()}</COLUMN>
<COLUMN ID="TABLE" TYPE="STRING">${tableName}</COLUMN>
<COLUMN ID="PACKAGE_FORM" TYPE="STRING"/>
<COLUMN ID="EXCLUSIVE" TYPE="STRING">${exCtrl?then('TRUE', 'FALSE')}</COLUMN>
<COLUMN ID="SUPER_ROW_MODULE_ID" TYPE="STRING"/>
<COLUMN ID="SUPER_ROW_ID" TYPE="STRING"/>
<COLUMN ID="SUPER_LIST_MODULE_ID" TYPE="STRING"/>
<COLUMN ID="SUPER_LIST_ID" TYPE="STRING"/>
<COLUMN ID="SUPER_DML_MODULE_ID" TYPE="STRING"/>
<COLUMN ID="SUPER_DML_ID" TYPE="STRING"/>
<COLUMN ID="TABLE_TYPE" TYPE="STRING">${tableType}</COLUMN>
<COLUMN ID="AUTO_GEN" TYPE="STRING">${isAutoGen()?then('TRUE', 'FALSE')}</COLUMN>
<COLUMN ID="FULLNAME" TYPE="STRING">${fullName}</COLUMN>
<bNum>0</bNum>
<items>
<#list getAllColumnList() as column>
<ITEM>
<ID>${column.javaColumnName}</ID>
<COLUMN ID="KEY" TYPE="STRING"/>
<#if (column.fullName)?has_content><COLUMN ID="NAME" TYPE="STRING">${column.fullName}</COLUMN><#else><COLUMN ID="NAME" TYPE="STRING"/></#if>
<#if (column.japanese)?has_content><COLUMN ID="MESSAGE" TYPE="STRING">${column.japanese}</COLUMN><#else><COLUMN ID="MESSAGE" TYPE="STRING"/></#if>
<COLUMN ID="MESSAGE_CTL" TYPE="STRING"/>
<#if (column.metaID)?has_content><COLUMN ID="TYPE" TYPE="STRING">${column.metaID}</COLUMN><#else><COLUMN ID="TYPE" TYPE="STRING">${column.dataType}</COLUMN></#if>
<#if (column.metaID)?has_content><COLUMN ID="DIGIT" TYPE="STRING"/><#else><COLUMN ID="DIGIT" TYPE="STRING">${column.length}</COLUMN></#if>
<COLUMN ID="MEMO" TYPE="STRING"/>
<#if (column.metaID)?has_content><COLUMN ID="_LENGTH" TYPE="NUMBER"/><#else><COLUMN ID="_LENGTH" TYPE="NUMBER">${column.integerLength}</COLUMN></#if>
<#if (column.metaID)?has_content><COLUMN ID="_DECIMAL" TYPE="NUMBER"/><#else><COLUMN ID="_DECIMAL" TYPE="NUMBER">${column.decimalLength}</COLUMN></#if>
<COLUMN ID="_MINUS" TYPE="BOOLEAN">false</COLUMN>
<COLUMN ID="CP_ALIAS" TYPE="STRING"/>
<COLUMN ID="LEVEL" TYPE="STRING">${column.getDbcLevel4Repository()}</COLUMN>
<COLUMN ID="F_KEY" TYPE="STRING"/>
<#if (column.getRefTableName())?has_content><COLUMN ID="TABLE_ALIAS" TYPE="STRING">${column.getRefTableName()}</COLUMN><#else><COLUMN ID="TABLE_ALIAS" TYPE="STRING"/></#if>
<COLUMN ID="NULLABLE" TYPE="STRING">${column.getNullDisp()}</COLUMN>
<#if (column.dbcColumnType)?has_content><COLUMN ID="DEF" TYPE="STRING">${column.dbcColumnType}</COLUMN><#else><COLUMN ID="DEF" TYPE="STRING"/></#if>
<#if (column.getRefColumnName())?has_content><COLUMN ID="ALIAS" TYPE="STRING">${column.getRefColumnName()}</COLUMN><#else><COLUMN ID="ALIAS" TYPE="STRING"/></#if>
<#if (column.restriction)?has_content><COLUMN ID="LABEL" TYPE="STRING">${column.restriction}</COLUMN><#else><COLUMN ID="LABEL" TYPE="STRING"/></#if>
</ITEM>
</#list>
</items>
<#if getForeignCount() == 0>
<foreignItems/>
<#else>
<#assign foreignId = 0>
<foreignItems>
<#list foreignList as foreign>
<ITEM>
<ID>${foreignId}</ID>
<COLUMN ID="KEY" TYPE="STRING"/>
<COLUMN ID="NAME" TYPE="STRING">${foreign.refTable}</COLUMN>
<COLUMN ID="MESSAGE" TYPE="STRING">${foreign.getRefSynonym()}</COLUMN>
<COLUMN ID="MESSAGE_CTL" TYPE="STRING"/>
<COLUMN ID="TYPE" TYPE="STRING"/>
<COLUMN ID="DIGIT" TYPE="STRING"/>
<COLUMN ID="MEMO" TYPE="STRING"/>
<COLUMN ID="_LENGTH" TYPE="NUMBER"/>
<COLUMN ID="_DECIMAL" TYPE="NUMBER"/>
<COLUMN ID="_MINUS" TYPE="BOOLEAN">false</COLUMN>
<COLUMN ID="CP_ALIAS" TYPE="STRING"/>
<COLUMN ID="LEVEL" TYPE="STRING">FOREIGN</COLUMN>
<COLUMN ID="F_KEY" TYPE="STRING">${foreign.items?lower_case}</COLUMN>
<COLUMN ID="TABLE_ALIAS" TYPE="STRING"/>
<COLUMN ID="NULLABLE" TYPE="STRING"/>
<COLUMN ID="DEF" TYPE="STRING"/>
<COLUMN ID="ALIAS" TYPE="STRING"/>
<COLUMN ID="LABEL" TYPE="STRING">${foreign.refItems?lower_case}</COLUMN>
</ITEM>
<#assign foreignId = foreignId + 1>
</#list>
<#list dbcForeignKeyList as foreign>
<ITEM>
<ID>${foreignId}</ID>
<COLUMN ID="KEY" TYPE="STRING"/>
<COLUMN ID="NAME" TYPE="STRING">${foreign.refTable}</COLUMN>
<COLUMN ID="MESSAGE" TYPE="STRING">${foreign.getRefSynonym()}</COLUMN>
<COLUMN ID="MESSAGE_CTL" TYPE="STRING"/>
<COLUMN ID="TYPE" TYPE="STRING"/>
<COLUMN ID="DIGIT" TYPE="STRING"/>
<COLUMN ID="MEMO" TYPE="STRING"/>
<COLUMN ID="_LENGTH" TYPE="NUMBER"/>
<COLUMN ID="_DECIMAL" TYPE="NUMBER"/>
<COLUMN ID="_MINUS" TYPE="BOOLEAN">false</COLUMN>
<COLUMN ID="CP_ALIAS" TYPE="STRING"/>
<COLUMN ID="LEVEL" TYPE="STRING">FOREIGN</COLUMN>
<COLUMN ID="F_KEY" TYPE="STRING">${foreign.items?lower_case}</COLUMN>
<COLUMN ID="TABLE_ALIAS" TYPE="STRING"/>
<COLUMN ID="NULLABLE" TYPE="STRING"/>
<COLUMN ID="DEF" TYPE="STRING"/>
<COLUMN ID="ALIAS" TYPE="STRING"/>
<COLUMN ID="LABEL" TYPE="STRING">${foreign.refItems?lower_case}</COLUMN>
</ITEM>
<#assign foreignId = foreignId + 1>
</#list>
</foreignItems>
</#if>
</BLOCK>
</blocks>
</SPEC>
