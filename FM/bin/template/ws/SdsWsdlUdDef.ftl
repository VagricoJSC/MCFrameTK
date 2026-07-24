			<!--上り電文(${method})-->
			<xs:complexType name="${method}">
				<xs:sequence>

<#assign upBlockList=CB_COMMENT_LIST("UP_BLOCK_LIST." + method)/>
<!-- FMCB UP_BLOCK_LIST.${method} START -->
<#list upBlockList as aBlockId>
<!-- ${aBlockId} -->
</#list>
<!-- FMCB UP_BLOCK_LIST.${method} END -->

					<xs:element minOccurs="0" name="up" type="tns:MCWSUpParam"/>
<!-- FMCB UP_DEF.${method} START -->
<#assign udIndexList=CB_NODE_NAME_LIST("UP_DEF." + method, "xs:element")/>
<#list udIndexList as udIndex>
					<xs:element <#if CB_NODE_ATT("UP_DEF." + method, "xs:element", udIndex, "maxOccurs")!="">maxOccurs="unbounded" </#if>minOccurs="0" name="${udIndex}" <#if CB_NODE_ATT("UP_DEF." + method, "xs:element", udIndex, "nillable")!="">nillable="true" </#if>type="${CB_NODE_ATT("UP_DEF." + method, "xs:element", udIndex, "type")}"/>
</#list>
<!-- FMCB UP_DEF.${method} END -->
				</xs:sequence>
			</xs:complexType>

<#list upBlockList as aBlockId>
			<!--上り電文コンテナヘッダー(${method})-->
			<xs:complexType name="${method}Up${aBlockId_index}">
				<xs:complexContent>
					<xs:extension base="tns:MCWSContainer">
						<xs:sequence>
<!-- FMCB UP_CNT_DEF.${method}.Up.${aBlockId} START -->
<#assign contNameList=CB_NODE_NAME_LIST("UP_CNT_DEF." + method + ".Up." + aBlockId, "xs:element")/>
<#list contNameList as anItemId>
							<xs:element minOccurs="0" name="${anItemId}" type="${CB_NODE_ATT("UP_CNT_DEF." + method + ".Up." + aBlockId, "xs:element", anItemId, "type")}"/>
</#list>
<!-- FMCB UP_CNT_DEF.${method}.Up.${aBlockId} END -->
						</xs:sequence>
					</xs:extension>
				</xs:complexContent>
			</xs:complexType>
			 
</#list>
			<!--下り電文(${method}Response)-->
			<xs:complexType name="${method}Response">
				<xs:sequence>

<#assign downBlockList=CB_COMMENT_LIST("DOWN_BLOCK_LIST." + method)/>
<!-- FMCB DOWN_BLOCK_LIST.${method} START -->
<#list downBlockList as aBlockId>
<!-- ${aBlockId} -->
</#list>
<!-- FMCB DOWN_BLOCK_LIST.${method} END -->

					<xs:element minOccurs="0" name="down" type="tns:MCWSDownParam"/>
<!-- FMCB DOWN_DEF.${method} START -->
<#assign udIndexList=CB_NODE_NAME_LIST("DOWN_DEF." + method, "xs:element")/>
<#list udIndexList as udIndex>
					<xs:element <#if CB_NODE_ATT("DOWN_DEF." + method, "xs:element", udIndex, "maxOccurs")!="">maxOccurs="unbounded" </#if>minOccurs="0" name="${udIndex}" <#if CB_NODE_ATT("DOWN_DEF." + method, "xs:element", udIndex, "nillable")!="">nillable="true" </#if>type="${CB_NODE_ATT("DOWN_DEF." + method, "xs:element", udIndex, "type")}"/>
</#list>
<!-- FMCB DOWN_DEF.${method} END -->
				</xs:sequence>
			</xs:complexType>

<#list downBlockList as aBlockId>
			<!--下り電文コンテナヘッダー(${method}Response)-->
			<xs:complexType name="${method}Down${aBlockId_index}">
				<xs:complexContent>
					<xs:extension base="tns:MCWSContainer">
						<xs:sequence>
<!-- FMCB DOWN_CNT_DEF.${method}.Down.${aBlockId} START -->
<#assign contNameList=CB_NODE_NAME_LIST("DOWN_CNT_DEF." + method + ".Down." + aBlockId, "xs:element")/>
<#list contNameList as anItemId>
							<xs:element minOccurs="0" name="${anItemId}" type="${CB_NODE_ATT("DOWN_CNT_DEF." + method + ".Down." + aBlockId, "xs:element", anItemId, "type")}"/>
</#list>
<!-- FMCB DOWN_CNT_DEF.${method}.Down.${aBlockId} END -->
						</xs:sequence>
					</xs:extension>
				</xs:complexContent>
			</xs:complexType>

</#list>