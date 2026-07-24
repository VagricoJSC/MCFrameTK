<?xml version='1.0' encoding='UTF-8'?>
<definitions name="${S("ID")}"
	targetNamespace="urn:Services.MCFrame"
	xmlns="http://schemas.xmlsoap.org/wsdl/"
	xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
	xmlns:tns="urn:Services.MCFrame"
	xmlns:xs="http://www.w3.org/2001/XMLSchema">

	<!--types-->
	<types>
		<xs:schema elementFormDefault="qualified" targetNamespace="urn:Services.MCFrame" xmlns:tns="urn:Services.MCFrame" xmlns:xsd="http://www.w3.org/2001/XMLSchema">

<!-- FMCB OPE_LIST START -->
<#assign methodList=CB_COMMENT_LIST("OPE_LIST")/>
<#list methodList as method>
<#if method!=S("METHOD")>
<!-- ${method} -->
</#if>
</#list>
<!-- ${S("METHOD")} -->
<!-- FMCB OPE_LIST END -->

			<!--ロジック定義-->
			<xs:element name="MCWSFault" type="tns:MCWSFault"/>
<#list methodList as method>
	<#if method!=S("METHOD")>
			<xs:element name="${method}" type="tns:${method}"/>
			<xs:element name="${method}Response" type="tns:${method}Response"/>
	</#if>
</#list>
			<xs:element name="${S("METHOD")}" type="tns:${S("METHOD")}"/>
			<xs:element name="${S("METHOD")}Response" type="tns:${S("METHOD")}Response"/>

			<!--エラーコンテナ(固定値)-->
			<xs:complexType name="MCWSFault">
				<xs:sequence>
					<xs:element maxOccurs="unbounded" minOccurs="0" name="causeWsMessageArray" nillable="true" type="tns:MCWSMessage"/>
					<xs:element minOccurs="0" name="message" type="xs:string"/>
					<xs:element minOccurs="0" name="wsMessage" type="tns:MCWSMessage"/>
				</xs:sequence>
			</xs:complexType>
			 
			<!--エラーメッセージコンテナ(固定値)-->
			<xs:complexType name="MCWSMessage">
				<xs:sequence>
					<xs:element minOccurs="0" name="ID" type="xs:string"/>
					<xs:element minOccurs="0" name="level" type="xs:string"/>
					<xs:element minOccurs="0" name="message" type="xs:string"/>
					<xs:element minOccurs="0" name="blk_idx" type="xsd:decimal"/>
					<xs:element minOccurs="0" name="row_idx" type="xsd:decimal"/>
				</xs:sequence>
			</xs:complexType>
			 
			<!--ロウパラメータコンテナ(固定値)-->
			<xs:complexType name="MCWSContainer">
				<xs:sequence>
					<xs:element minOccurs="0" name="row_refdt" type="xs:dateTime"/>
					<xs:element minOccurs="0" name="row_status" type="xs:string"/>
					<xs:element minOccurs="0" name="blk_idx" type="xsd:decimal"/>
					<xs:element minOccurs="0" name="row_idx" type="xsd:decimal"/>
				</xs:sequence>
			</xs:complexType>
			 
			<!--MCBinary(固定値)-->
			<xs:complexType name="MCWSBinary">
				<xs:sequence>
					<xs:element minOccurs="0" name="bid" type="xs:decimal"/>
				</xs:sequence>
			</xs:complexType>
			
			<!--共通パラメータ(ページング・音声認識)-->
			<xs:complexType name="MCWSCommonParam">
				<xs:sequence>
					<xs:element minOccurs="0" name="pagingParam" type="tns:MCWSPagingParam"/>
					<xs:element minOccurs="0" name="speechParam" type="tns:MCWSSpeechParam"/>
				</xs:sequence>
			</xs:complexType>
			 
			<!--共通パラメータ(上りヘッダー)-->
			<xs:complexType name="MCWSUpHeaderParam">
				<xs:sequence>
					<xs:element minOccurs="0" name="loginSequence" type="xs:string"/>
					<xs:element minOccurs="0" name="identifier" type="xs:string"/>
					<xs:element minOccurs="0" name="dlVersion" type="xs:string"/>
					<xs:element minOccurs="0" name="dlBuild" type="xs:string"/>
					<xs:element minOccurs="0" name="clientRequestNo" type="xsd:decimal"/>
					<xs:element minOccurs="0" name="clientId" type="xs:string"/>
					<xs:element minOccurs="0" name="createdTime" type="xsd:dateTime"/>
					<xs:element minOccurs="0" name="userId" type="xs:string"/>
					<xs:element minOccurs="0" name="clientLocale" type="xs:string"/>
					<xs:element minOccurs="0" name="clientTimeZone" type="xs:string"/>
					<xs:element minOccurs="0" name="reqSrcId" type="xs:string"/>
				</xs:sequence>
			</xs:complexType>
			 
			<!--共通パラメータ(下りヘッダー)-->
			<xs:complexType name="MCWSDownHeaderParam">
				<xs:sequence>
					<xs:element minOccurs="0" name="ref_dt" type="xsd:dateTime"/>
				</xs:sequence>
			</xs:complexType>
			 
			<!--共通パラメータ(メッセージ)-->
			<xs:complexType name="MCWSMessageParam">
				<xs:sequence>
					<xs:element maxOccurs="unbounded" minOccurs="0" name="messageArray" nillable="true" type="tns:MCWSMessage"/>
				</xs:sequence>
			</xs:complexType>
			 
			<!--共通パラメータ(ページング)-->
			<xs:complexType name="MCWSPagingData">
				<xs:sequence>
					<xs:element name="blockIdx" type="xs:decimal" minOccurs="0"/>
					<xs:element name="cacheId" type="xs:string" minOccurs="0"/>
					<xs:element name="fromIdx" type="xs:decimal" minOccurs="0"/>
					<xs:element name="pagingSize" type="xs:decimal" minOccurs="0"/>
					<xs:element name="totalSize" type="xs:decimal" minOccurs="0"/>
				</xs:sequence>
			</xs:complexType>
			<xs:complexType name="MCWSPagingSort">
				<xs:sequence>
					<xs:element name="blockIdx" type="xs:decimal" minOccurs="0"/>
					<xs:element name="key" type="xs:string" minOccurs="0"/>
					<xs:element name="type" type="xs:decimal" minOccurs="0"/>
				</xs:sequence>
			</xs:complexType>
			<xs:complexType name="MCWSPagingParam">
				<xs:sequence>
					<xs:element maxOccurs="unbounded" minOccurs="0" name="pagingArray" nillable="true" type="tns:MCWSPagingData"/>
					<xs:element maxOccurs="unbounded" minOccurs="0" name="sortArray" nillable="true" type="tns:MCWSPagingSort"/>
				</xs:sequence>
			</xs:complexType>
			 
			<!--共通パラメータ(音声認識)-->
			<xs:complexType name="MCWSSpeechParam">
				<xs:sequence>
					<xs:element minOccurs="0" name="rtn" type="xs:string"/>
					<xs:element minOccurs="0" name="speechStr" type="xs:string"/>
					<xs:element maxOccurs="unbounded" minOccurs="0" name="similarResults" nillable="true" type="xs:string"/>
					<xs:element minOccurs="0" name="fixedResult" type="xs:string"/>
					<xs:element minOccurs="0" name="analysis" type="xs:string"/>
				</xs:sequence>
			</xs:complexType>
			 
			<!--上り電文パラメータ(固定値)-->
			<xs:complexType name="MCWSUpParam">
				<xs:complexContent>
					<xs:extension base="tns:MCWSCommonParam">
						<xs:sequence>
							<xs:element minOccurs="0" name="upHeaderParam" type="tns:MCWSUpHeaderParam"/>
						</xs:sequence>
					</xs:extension>
				</xs:complexContent>
			</xs:complexType>
			 
			<!--下り電文パラメータ(固定値)-->
			<xs:complexType name="MCWSDownParam">
				<xs:complexContent>
					<xs:extension base="tns:MCWSCommonParam">
						<xs:sequence>
							<xs:element minOccurs="0" name="downHeaderParam" type="tns:MCWSDownHeaderParam"/>
							<xs:element minOccurs="0" name="messageParam" type="tns:MCWSMessageParam"/>
						</xs:sequence>
					</xs:extension>
				</xs:complexContent>
			</xs:complexType>

<#list methodList as method>
<#include F("FTL.WS.SD_WSDL_UD_DEF")/>
</#list>

			<!--上り電文(${S("METHOD")})-->
			<xs:complexType name="${S("METHOD")}">
				<xs:sequence>
<#assign TEL_UP_BS=A("TELEGRAM_UP_L_BLOCK_IDS")>

<!-- FMCB UP_BLOCK_LIST.${S("METHOD")} START -->
<#list TEL_UP_BS as aBlockId>
<!-- ${aBlockId} -->
</#list>
<!-- FMCB UP_BLOCK_LIST.${S("METHOD")} END -->

					<xs:element minOccurs="0" name="up" type="tns:MCWSUpParam"/>
<!-- FMCB UP_DEF.${S("METHOD")} START -->
<#list TEL_UP_BS as aBlockId>
					<xs:element <#if B(aBlockId + "_IS_LIST")>maxOccurs="unbounded" </#if>minOccurs="0" name="up${aBlockId_index}" <#if B(aBlockId + "_IS_LIST")>nillable="true" </#if>type="tns:${S("METHOD")}Up${aBlockId_index}"/>
</#list>
<!-- FMCB UP_DEF.${S("METHOD")} END -->
				</xs:sequence>
			</xs:complexType>

<#list TEL_UP_BS as aBlockId>
			<!--上り電文コンテナヘッダー(${S("METHOD")})-->
			<xs:complexType name="${S("METHOD")}Up${aBlockId_index}">
				<xs:complexContent>
					<xs:extension base="tns:MCWSContainer">
						<xs:sequence>
<!-- FMCB UP_CNT_DEF.${S("METHOD")}.Up.${aBlockId} START -->
<#list A("TELEGRAM_UP_${aBlockId_index}_ITEM_IDS") as anItemId>
							<xs:element minOccurs="0" name=<@R_ITEM_OPE UD="UP" BLK=aBlockId_index ITM=anItemId/> type="<@XS_TYPE bId=aBlockId iId=anItemId/>"/>
</#list>
<!-- FMCB UP_CNT_DEF.${S("METHOD")}.Up.${aBlockId} END -->
						</xs:sequence>
					</xs:extension>
				</xs:complexContent>
			</xs:complexType>
			 
</#list>
			<!--下り電文(${S("METHOD")}Response)-->
			<xs:complexType name="${S("METHOD")}Response">
				<xs:sequence>

<#assign TEL_DOWN_BS=A("TELEGRAM_DOWN_L_BLOCK_IDS")>
<!-- FMCB DOWN_BLOCK_LIST.${S("METHOD")} START -->
<#list TEL_DOWN_BS as aBlockId>
<!-- ${aBlockId} -->
</#list>
<!-- FMCB DOWN_BLOCK_LIST.${S("METHOD")} END -->

					<xs:element minOccurs="0" name="down" type="tns:MCWSDownParam"/>
<!-- FMCB DOWN_DEF.${S("METHOD")} START -->
<#list TEL_DOWN_BS as aBlockId>
					<xs:element <#if B(aBlockId + "_IS_LIST")>maxOccurs="unbounded" </#if>minOccurs="0" name="down${aBlockId_index}" <#if B(aBlockId + "_IS_LIST")>nillable="true" </#if>type="tns:${S("METHOD")}Down${aBlockId_index}"/>
</#list>
<!-- FMCB DOWN_DEF.${S("METHOD")} END -->
				</xs:sequence>
			</xs:complexType>

<#list TEL_DOWN_BS as aBlockId>
			<!--下り電文コンテナヘッダー(${S("METHOD")}Response)-->
			<xs:complexType name="${S("METHOD")}Down${aBlockId_index}">
				<xs:complexContent>
					<xs:extension base="tns:MCWSContainer">
						<xs:sequence>
<!-- FMCB DOWN_CNT_DEF.${S("METHOD")}.Down.${aBlockId} START -->
<#list A("TELEGRAM_DOWN_${aBlockId_index}_ITEM_IDS") as anItemId>
							<xs:element minOccurs="0" name=<@R_ITEM_OPE UD="DOWN" BLK=aBlockId_index ITM=anItemId/> type="<@XS_TYPE bId=aBlockId iId=anItemId/>"/>
</#list>
<!-- FMCB DOWN_CNT_DEF.${S("METHOD")}.Down.${aBlockId} END -->
						</xs:sequence>
					</xs:extension>
				</xs:complexContent>
			</xs:complexType>

</#list>
		</xs:schema>
	</types>
	 
	<!--message-->
	<!--固定値-->
	<message name="MCWSFault">
		<part element="tns:MCWSFault" name="fault"/>
	</message>
	 
	<!--ロジック-->
<#list methodList as method>
	<#if method!=S("METHOD")>
	<message name="${method}">
		<part element="tns:${method}" name="parameters"/>
	</message>
	<message name="${method}Response">
		<part element="tns:${method}Response" name="parameters"/>
	</message>
	</#if>
</#list>
	<message name="${S("METHOD")}">
		<part element="tns:${S("METHOD")}" name="parameters"/>
	</message>
	<message name="${S("METHOD")}Response">
		<part element="tns:${S("METHOD")}Response" name="parameters"/>
	</message>

	<!--portType-->
	<portType name="${S("ID")}Port">
<#list methodList as method>
	<#if method!=S("METHOD")>
		<operation name="${method}">
			<input message="tns:${method}"/>
			<output message="tns:${method}Response"/>
			<fault message="tns:MCWSFault" name="MCWSFault"/>
		</operation>
	</#if>
</#list>
		<operation name="${S("METHOD")}">
			<input message="tns:${S("METHOD")}"/>
			<output message="tns:${S("METHOD")}Response"/>
			<fault message="tns:MCWSFault" name="MCWSFault"/>
		</operation>
	</portType>
	 
	<!--binding-->
	<binding name="${S("ID")}Binding" type="tns:${S("ID")}Port">
		<soap:binding style="document" transport="http://schemas.xmlsoap.org/soap/http"/>
<#list methodList as method>
	<#if method!=S("METHOD")>
		<operation name="${method}">
			<soap:operation soapAction=""/>
			<input>
				<soap:body use="literal"/>
			</input>
			<output>
				<soap:body use="literal"/>
			</output>
			<fault name="MCWSFault">
				<soap:fault name="MCWSFault" use="literal"/>
			</fault>
		</operation>
	</#if>
</#list>
		<operation name="${S("METHOD")}">
			<soap:operation soapAction=""/>
			<input>
				<soap:body use="literal"/>
			</input>
			<output>
				<soap:body use="literal"/>
			</output>
			<fault name="MCWSFault">
				<soap:fault name="MCWSFault" use="literal"/>
			</fault>
		</operation>
	</binding>
	 
	<!--service-->
	<service name="${S("ID")}">
		<port binding="tns:${S("ID")}Binding" name="${S("ID")}">
			<xs:element name="module_id" fixed="${S("MODULE_ID")}"/>
			<soap:address location="http://localhost:80/${S("ID")}"/>
		</port>
	</service>
</definitions>
<#macro XS_TYPE bId iId>
<#if S("${bId}_${iId}_FACT_TYPE")=="C"||S("${bId}_${iId}_FACT_TYPE")=="CC">xs:string</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="N">xs:decimal</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="D"||S("${bId}_${iId}_FACT_TYPE")=="TS">xs:dateTime</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="F">xs:boolean</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="B">tns:MCWSBinary</#if><#rt>
</#macro>
<#macro R_ITEM_OPE UD BLK ITM>
<#if S(S("TELEGRAM_${UD}_${BLK}_L_BLOCK_ID") + "_${ITM}_TYPE")=="RI"&&(S("TELEGRAM_${UD}_${BLK}_L_BLOCK_ID") + "_${ITM}_CP_ALIAS")!="">
"${S(S("TELEGRAM_${UD}_${BLK}_L_BLOCK_ID") + "_${ITM}_CP_ALIAS")}"<#rt>
<#else>
"${ITM}"<#rt>
</#if>
</#macro>