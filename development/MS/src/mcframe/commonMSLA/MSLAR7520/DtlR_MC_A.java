package mcframe.commonMSLA.MSLAR7520;

import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 *  計上日.<p>
	 *
	 */
	public static final String $inpDate = "inpDate";
	/**
	 *  伝票ＮＯ.<p>
	 *
	 */
	public static final String $voucherNo = "voucherNo";
	/**
	 *  客先注文ＮＯ.<p>
	 *
	 */
	public static final String $customerNo = "customerNo";
	/**
	 *  引継元ＮＯ.<p>
	 *
	 */
	public static final String $succeedVoucherNo = "succeedVoucherNo";
	/**
	 *  取引先区分.<p>
	 *
	 */
	public static final String $correspType = "correspType";
	/**
	 *  取引先.<p>
	 *
	 */
	public static final String $customerCode = "customerCode";
	/**
	 *  納品先/納入元.<p>
	 *
	 */
	public static final String $delivToCode = "delivToCode";
	/**
	 *  部門.<p>
	 *
	 */
	public static final String $deptCode = "deptCode";
	/**
	 *  担当者.<p>
	 *
	 */
	public static final String $inchargeCode = "inchargeCode";
	/**
	 *  取引パターン.<p>
	 *
	 */
	public static final String $ar_PatternCode = "ar_PatternCode";
	/**
	 *  通貨.<p>
	 *
	 */
	public static final String $currencyCode = "currencyCode";
	/**
	 *  レートタイプ.<p>
	 *
	 */
	public static final String $rateTypeCode = "rateTypeCode";
	/**
	 *  レート.<p>
	 *
	 */
	public static final String $rate = "rate";
	/**
	 *  ヘッダ課税区分.<p>
	 *
	 */
	public static final String $taxableCode = "taxableCode";
	/**
	 *  出荷数量条件.<p>
	 *
	 */
	public static final String $forCondition = "forCondition";
	/**
	 *  内税/外税区分.<p>
	 *
	 */
	public static final String $taxType = "taxType";
	/**
	 *  伝票摘要コード.<p>
	 *
	 */
	public static final String $header_DescriptCode = "header_DescriptCode";
	/**
	 *  伝票摘要内容.<p>
	 *
	 */
	public static final String $header_DescriptName = "header_DescriptName";
	/**
	 *  付箋紙色.<p>
	 *
	 */
	public static final String $postpadColor = "postpadColor";
	/**
	 *  付箋紙内容.<p>
	 *
	 */
	public static final String $postpadText = "postpadText";
	/**
	 *  決済方法.<p>
	 *
	 */
	public static final String $settleMethod = "settleMethod";
	/**
	 *  自社口座.<p>
	 *
	 */
	public static final String $bankAcct_Own = "bankAcct_Own";
	/**
	 *  回収条件.<p>
	 *
	 */
	public static final String $paymentTerms = "paymentTerms";
	/**
	 *  決済予定日.<p>
	 *
	 */
	public static final String $dueDate = "dueDate";
	/**
	 *  ファイル名.<p>
	 *
	 */
	public static final String $fileName = "fileName";
	/**
	 *  ヘッダユーザマスタ.<p>
	 *
	 */
	public static final String $header_UserMaster = "header_UserMaster";
	/**
	 *  ヘッダユーザテキスト.<p>
	 *
	 */
	public static final String $header_UserText = "header_UserText";
	/**
	 *  ヘッダフレックスマスタ1.<p>
	 *
	 */
	public static final String $header_FlexMaster1 = "header_FlexMaster1";
	/**
	 *  ヘッダフレックスマスタ2.<p>
	 *
	 */
	public static final String $header_FlexMaster2 = "header_FlexMaster2";
	/**
	 *  ヘッダフレックスコード1.<p>
	 *
	 */
	public static final String $header_FlexCode1 = "header_FlexCode1";
	/**
	 *  ヘッダフレックスコード2.<p>
	 *
	 */
	public static final String $header_FlexCode2 = "header_FlexCode2";
	/**
	 *  ヘッダフレックステキスト1.<p>
	 *
	 */
	public static final String $header_FlexText1 = "header_FlexText1";
	/**
	 *  ヘッダフレックステキスト2.<p>
	 *
	 */
	public static final String $header_FlexText2 = "header_FlexText2";
	/**
	 *  ヘッダフレックステキスト3.<p>
	 *
	 */
	public static final String $header_FlexText3 = "header_FlexText3";
	/**
	 *  ヘッダフレックステキスト4.<p>
	 *
	 */
	public static final String $header_FlexText4 = "header_FlexText4";
	/**
	 *  ヘッダフレックステキスト5.<p>
	 *
	 */
	public static final String $header_FlexText5 = "header_FlexText5";
	/**
	 *  ヘッダフレックス日付.<p>
	 *
	 */
	public static final String $header_FlexDate = "header_FlexDate";
	/**
	 *  ﾒﾓ情報1.<p>
	 *
	 */
	public static final String $remarks1 = "remarks1";
	/**
	 *  ﾒﾓ情報2.<p>
	 *
	 */
	public static final String $remarks2 = "remarks2";
	/**
	 *  ﾒﾓ情報3.<p>
	 *
	 */
	public static final String $remarks3 = "remarks3";
	/**
	 *  ﾒﾓ情報4.<p>
	 *
	 */
	public static final String $remarks4 = "remarks4";
	/**
	 *  ﾒﾓ情報5.<p>
	 *
	 */
	public static final String $remarks5 = "remarks5";
	/**
	 *  ﾒﾓ情報6.<p>
	 *
	 */
	public static final String $remarks6 = "remarks6";
	/**
	 *  ﾒﾓ情報7.<p>
	 *
	 */
	public static final String $remarks7 = "remarks7";
	/**
	 *  ﾒﾓ情報8.<p>
	 *
	 */
	public static final String $remarks8 = "remarks8";
	/**
	 *  ﾒﾓ情報9.<p>
	 *
	 */
	public static final String $remarks9 = "remarks9";
	/**
	 *  ﾒﾓ情報10.<p>
	 *
	 */
	public static final String $remarks10 = "remarks10";
	/**
	 *  ﾒﾓ情報11.<p>
	 *
	 */
	public static final String $remarks11 = "remarks11";
	/**
	 *  ﾒﾓ情報12.<p>
	 *
	 */
	public static final String $remarks12 = "remarks12";
	/**
	 *  ﾒﾓ情報13.<p>
	 *
	 */
	public static final String $remarks13 = "remarks13";
	/**
	 *  ﾒﾓ情報14.<p>
	 *
	 */
	public static final String $remarks14 = "remarks14";
	/**
	 *  ﾒﾓ情報15.<p>
	 *
	 */
	public static final String $remarks15 = "remarks15";
	/**
	 *  ﾒﾓ情報16.<p>
	 *
	 */
	public static final String $remarks16 = "remarks16";
	/**
	 *  ﾒﾓ情報17.<p>
	 *
	 */
	public static final String $remarks17 = "remarks17";
	/**
	 *  ﾒﾓ情報18.<p>
	 *
	 */
	public static final String $remarks18 = "remarks18";
	/**
	 *  ﾒﾓ情報19.<p>
	 *
	 */
	public static final String $remarks19 = "remarks19";
	/**
	 *  ﾒﾓ情報20.<p>
	 *
	 */
	public static final String $remarks20 = "remarks20";
	/**
	 *  ﾒﾓ情報21.<p>
	 *
	 */
	public static final String $remarks21 = "remarks21";
	/**
	 *  ﾒﾓ情報22.<p>
	 *
	 */
	public static final String $remarks22 = "remarks22";
	/**
	 *  ﾒﾓ情報23.<p>
	 *
	 */
	public static final String $remarks23 = "remarks23";
	/**
	 *  ﾒﾓ情報24.<p>
	 *
	 */
	public static final String $remarks24 = "remarks24";
	/**
	 *  ﾒﾓ情報25.<p>
	 *
	 */
	public static final String $remarks25 = "remarks25";
	/**
	 *  ﾒﾓ情報26.<p>
	 *
	 */
	public static final String $remarks26 = "remarks26";
	/**
	 *  ﾒﾓ情報27.<p>
	 *
	 */
	public static final String $remarks27 = "remarks27";
	/**
	 *  ﾒﾓ情報28.<p>
	 *
	 */
	public static final String $remarks28 = "remarks28";
	/**
	 *  ﾒﾓ情報29.<p>
	 *
	 */
	public static final String $remarks29 = "remarks29";
	/**
	 *  ﾒﾓ情報30.<p>
	 *
	 */
	public static final String $remarks30 = "remarks30";
	/**
	 *  行ＮＯ.<p>
	 *
	 */
	public static final String $rowNo = "rowNo";
	/**
	 *  明細区分（品目・諸掛）.<p>
	 *
	 */
	public static final String $detailType = "detailType";
	/**
	 *  部門.<p>
	 *
	 */
	public static final String $detail_DeptCode = "detail_DeptCode";
	/**
	 *  倉庫.<p>
	 *
	 */
	public static final String $warehouse = "warehouse";
	/**
	 *  ロケーション.<p>
	 *
	 */
	public static final String $locationCode = "locationCode";
	/**
	 *  品目グループ.<p>
	 *
	 */
	public static final String $goodsGroup = "goodsGroup";
	/**
	 *  品目.<p>
	 *
	 */
	public static final String $goodsCode = "goodsCode";
	/**
	 *  諸掛.<p>
	 *
	 */
	public static final String $chargesCode = "chargesCode";
	/**
	 *  取引先品番.<p>
	 *
	 */
	public static final String $corresp_Goods = "corresp_Goods";
	/**
	 *  単位計上/荷姿単位計上.<p>
	 *
	 */
	public static final String $unitType = "unitType";
	/**
	 *  課税区分.<p>
	 *
	 */
	public static final String $detail_TaxableCode = "detail_TaxableCode";
	/**
	 *  内税/外税区分.<p>
	 *
	 */
	public static final String $detail_TaxType = "detail_TaxType";
	/**
	 *  単価.<p>
	 *
	 */
	public static final String $unitPrice = "unitPrice";
	/**
	 *  数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 *  入力金額.<p>
	 *
	 */
	public static final String $inpAmount_Fc = "inpAmount_Fc";
	/**
	 *  入力税額.<p>
	 *
	 */
	public static final String $taxAmount_Fc = "taxAmount_Fc";
	/**
	 *  入力税対象金額.<p>
	 *
	 */
	public static final String $taxableAmount_Fc = "taxableAmount_Fc";
	/**
	 *  基準金額.<p>
	 *
	 */
	public static final String $inpAmount_Sc = "inpAmount_Sc";
	/**
	 *  基準税額.<p>
	 *
	 */
	public static final String $taxAmount_Sc = "taxAmount_Sc";
	/**
	 *  基準税対象金額.<p>
	 *
	 */
	public static final String $taxableAmount_Sc = "taxableAmount_Sc";
	/**
	 *  荷姿コード.<p>
	 *
	 */
	public static final String $packingUnitCode = "packingUnitCode";
	/**
	 *  荷姿単価.<p>
	 *
	 */
	public static final String $packingUnitPrice = "packingUnitPrice";
	/**
	 *  荷姿数量.<p>
	 *
	 */
	public static final String $packingUnitQty = "packingUnitQty";
	/**
	 *  出荷予定日.<p>
	 *
	 */
	public static final String $preshippingDate = "preshippingDate";
	/**
	 *  納入期日.<p>
	 *
	 */
	public static final String $delivDate = "delivDate";
	/**
	 *  明細摘要コード.<p>
	 *
	 */
	public static final String $detail_Descript_Code = "detail_Descript_Code";
	/**
	 *  明細摘要内容.<p>
	 *
	 */
	public static final String $detail_Descript_Name = "detail_Descript_Name";
	/**
	 *  明細ユーザマスタ1.<p>
	 *
	 */
	public static final String $detail_UserMaster1 = "detail_UserMaster1";
	/**
	 *  明細ユーザマスタ2.<p>
	 *
	 */
	public static final String $detail_UserMaster2 = "detail_UserMaster2";
	/**
	 *  明細ユーザマスタ3.<p>
	 *
	 */
	public static final String $detail_UserMaster3 = "detail_UserMaster3";
	/**
	 *  明細ユーザマスタ4.<p>
	 *
	 */
	public static final String $detail_UserMaster4 = "detail_UserMaster4";
	/**
	 *  明細ユーザマスタ5.<p>
	 *
	 */
	public static final String $detail_UserMaster5 = "detail_UserMaster5";
	/**
	 *  明細ユーザコード.<p>
	 *
	 */
	public static final String $detail_UserCode = "detail_UserCode";
	/**
	 *  明細ユーザテキスト.<p>
	 *
	 */
	public static final String $detail_UserText = "detail_UserText";
	/**
	 *  明細ユーザ日付.<p>
	 *
	 */
	public static final String $detail_UserDate = "detail_UserDate";
	/**
	 *  明細ユーザ数量.<p>
	 *
	 */
	public static final String $detail_UserQty = "detail_UserQty";
	/**
	 *  明細フレックスマスタ.<p>
	 *
	 */
	public static final String $detail_FlexMaster = "detail_FlexMaster";
	/**
	 *  明細フレックスコード.<p>
	 *
	 */
	public static final String $detail_FlexCode = "detail_FlexCode";
	/**
	 *  明細フレックステキスト1.<p>
	 *
	 */
	public static final String $detail_FlexText1 = "detail_FlexText1";
	/**
	 *  明細フレックステキスト2.<p>
	 *
	 */
	public static final String $detail_FlexText2 = "detail_FlexText2";
	/**
	 *  明細フレックス日付.<p>
	 *
	 */
	public static final String $detail_FlexDate = "detail_FlexDate";
	/**
	 *  明細摘要コード.<p>
	 *
	 */
	public static final String $sub_Descript_Code = "sub_Descript_Code";
	/**
	 *  明細摘要内容.<p>
	 *
	 */
	public static final String $sub_Descript_Name = "sub_Descript_Name";
	/**
	 *  明細ユーザマスタ1.<p>
	 *
	 */
	public static final String $sub_UserMaster1 = "sub_UserMaster1";
	/**
	 *  明細ユーザマスタ2.<p>
	 *
	 */
	public static final String $sub_UserMaster2 = "sub_UserMaster2";
	/**
	 *  明細ユーザマスタ3.<p>
	 *
	 */
	public static final String $sub_UserMaster3 = "sub_UserMaster3";
	/**
	 *  明細ユーザマスタ4.<p>
	 *
	 */
	public static final String $sub_UserMaster4 = "sub_UserMaster4";
	/**
	 *  明細ユーザマスタ5.<p>
	 *
	 */
	public static final String $sub_UserMaster5 = "sub_UserMaster5";
	/**
	 *  明細ユーザコード.<p>
	 *
	 */
	public static final String $sub_UserCode = "sub_UserCode";
	/**
	 *  明細ユーザテキスト.<p>
	 *
	 */
	public static final String $sub_UserText = "sub_UserText";
	/**
	 *  明細ユーザ日付.<p>
	 *
	 */
	public static final String $sub_UserDate = "sub_UserDate";
	/**
	 *  明細ユーザ数量.<p>
	 *
	 */
	public static final String $sub_UserQty = "sub_UserQty";
	/**
	 *  特値コード.<p>
	 *
	 */
	public static final String $spriceCode = "spriceCode";
	/**
	 *  特値枝番.<p>
	 *
	 */
	public static final String $spriceIndex = "spriceIndex";


	public static final MCMeta inpDate_META = createStringMeta($inpDate, 10);
	public static final MCMeta voucherNo_META = createStringMeta($voucherNo, 20);
	public static final MCMeta customerNo_META = createStringMeta($customerNo, 50);
	public static final MCMeta succeedVoucherNo_META = createStringMeta($succeedVoucherNo, 20);
	public static final MCMeta correspType_META = createNumberMeta($correspType);
	public static final MCMeta customerCode_META = createStringMeta($customerCode, 20);
	public static final MCMeta delivToCode_META = createStringMeta($delivToCode, 20);
	public static final MCMeta deptCode_META = createStringMeta($deptCode, 20);
	public static final MCMeta inchargeCode_META = createStringMeta($inchargeCode, 20);
	public static final MCMeta ar_PatternCode_META = createStringMeta($ar_PatternCode, 20);
	public static final MCMeta currencyCode_META = createStringMeta($currencyCode, 20);
	public static final MCMeta rateTypeCode_META = createStringMeta($rateTypeCode, 20);
	public static final MCMeta rate_META = createNumberMeta($rate, 14, 9, false);
	public static final MCMeta taxableCode_META = createStringMeta($taxableCode, 20);
	public static final MCMeta forCondition_META = createNumberMeta($forCondition);
	public static final MCMeta taxType_META = createNumberMeta($taxType);
	public static final MCMeta header_DescriptCode_META = createStringMeta($header_DescriptCode, 20);
	public static final MCMeta header_DescriptName_META = createStringMeta($header_DescriptName, 20);
	public static final MCMeta postpadColor_META = createStringMeta($postpadColor, 20);
	public static final MCMeta postpadText_META = createStringMeta($postpadText, 20);
	public static final MCMeta settleMethod_META = createStringMeta($settleMethod, 20);
	public static final MCMeta bankAcct_Own_META = createStringMeta($bankAcct_Own, 20);
	public static final MCMeta paymentTerms_META = createStringMeta($paymentTerms, 20);
	public static final MCMeta dueDate_META = createStringMeta($dueDate, 10);
	public static final MCMeta fileName_META = createStringMeta($fileName, 100);
	public static final MCMeta header_UserMaster_META = createStringMeta($header_UserMaster, 20);
	public static final MCMeta header_UserText_META = createStringMeta($header_UserText, 100);
	public static final MCMeta header_FlexMaster1_META = createStringMeta($header_FlexMaster1, 20);
	public static final MCMeta header_FlexMaster2_META = createStringMeta($header_FlexMaster2, 20);
	public static final MCMeta header_FlexCode1_META = createStringMeta($header_FlexCode1, 20);
	public static final MCMeta header_FlexCode2_META = createStringMeta($header_FlexCode2, 20);
	public static final MCMeta header_FlexText1_META = createStringMeta($header_FlexText1, 100);
	public static final MCMeta header_FlexText2_META = createStringMeta($header_FlexText2, 100);
	public static final MCMeta header_FlexText3_META = createStringMeta($header_FlexText3, 100);
	public static final MCMeta header_FlexText4_META = createStringMeta($header_FlexText4, 100);
	public static final MCMeta header_FlexText5_META = createStringMeta($header_FlexText5, 100);
	public static final MCMeta header_FlexDate_META = createStringMeta($header_FlexDate, 10);
	public static final MCMeta remarks1_META = createStringMeta($remarks1, 100);
	public static final MCMeta remarks2_META = createStringMeta($remarks2, 100);
	public static final MCMeta remarks3_META = createStringMeta($remarks3, 100);
	public static final MCMeta remarks4_META = createStringMeta($remarks4, 100);
	public static final MCMeta remarks5_META = createStringMeta($remarks5, 100);
	public static final MCMeta remarks6_META = createStringMeta($remarks6, 100);
	public static final MCMeta remarks7_META = createStringMeta($remarks7, 100);
	public static final MCMeta remarks8_META = createStringMeta($remarks8, 100);
	public static final MCMeta remarks9_META = createStringMeta($remarks9, 100);
	public static final MCMeta remarks10_META = createStringMeta($remarks10, 100);
	public static final MCMeta remarks11_META = createStringMeta($remarks11, 100);
	public static final MCMeta remarks12_META = createStringMeta($remarks12, 100);
	public static final MCMeta remarks13_META = createStringMeta($remarks13, 100);
	public static final MCMeta remarks14_META = createStringMeta($remarks14, 100);
	public static final MCMeta remarks15_META = createStringMeta($remarks15, 100);
	public static final MCMeta remarks16_META = createStringMeta($remarks16, 100);
	public static final MCMeta remarks17_META = createStringMeta($remarks17, 100);
	public static final MCMeta remarks18_META = createStringMeta($remarks18, 100);
	public static final MCMeta remarks19_META = createStringMeta($remarks19, 100);
	public static final MCMeta remarks20_META = createStringMeta($remarks20, 100);
	public static final MCMeta remarks21_META = createStringMeta($remarks21, 100);
	public static final MCMeta remarks22_META = createStringMeta($remarks22, 100);
	public static final MCMeta remarks23_META = createStringMeta($remarks23, 100);
	public static final MCMeta remarks24_META = createStringMeta($remarks24, 100);
	public static final MCMeta remarks25_META = createStringMeta($remarks25, 100);
	public static final MCMeta remarks26_META = createStringMeta($remarks26, 100);
	public static final MCMeta remarks27_META = createStringMeta($remarks27, 100);
	public static final MCMeta remarks28_META = createStringMeta($remarks28, 100);
	public static final MCMeta remarks29_META = createStringMeta($remarks29, 100);
	public static final MCMeta remarks30_META = createStringMeta($remarks30, 100);
	public static final MCMeta rowNo_META = createNumberMeta($rowNo);
	public static final MCMeta detailType_META = createNumberMeta($detailType);
	public static final MCMeta detail_DeptCode_META = createStringMeta($detail_DeptCode, 20);
	public static final MCMeta warehouse_META = createStringMeta($warehouse, 20);
	public static final MCMeta locationCode_META = createStringMeta($locationCode, 20);
	public static final MCMeta goodsGroup_META = createStringMeta($goodsGroup, 20);
	public static final MCMeta goodsCode_META = createStringMeta($goodsCode, 100);
	public static final MCMeta chargesCode_META = createStringMeta($chargesCode, 20);
	public static final MCMeta corresp_Goods_META = createStringMeta($corresp_Goods, 50);
	public static final MCMeta unitType_META = createNumberMeta($unitType);
	public static final MCMeta detail_TaxableCode_META = createStringMeta($detail_TaxableCode, 20);
	public static final MCMeta detail_TaxType_META = createNumberMeta($detail_TaxType);
	public static final MCMeta unitPrice_META = createNumberMeta($unitPrice, 14, 0, false);
	public static final MCMeta qty_META = createNumberMeta($qty, 10, 0, false);
	public static final MCMeta inpAmount_Fc_META = createNumberMeta($inpAmount_Fc, 14, 0, false);
	public static final MCMeta taxAmount_Fc_META = createNumberMeta($taxAmount_Fc, 14, 0, false);
	public static final MCMeta taxableAmount_Fc_META = createNumberMeta($taxableAmount_Fc, 14, 0, false);
	public static final MCMeta inpAmount_Sc_META = createNumberMeta($inpAmount_Sc, 14, 0, false);
	public static final MCMeta taxAmount_Sc_META = createNumberMeta($taxAmount_Sc, 14, 0, false);
	public static final MCMeta taxableAmount_Sc_META = createNumberMeta($taxableAmount_Sc, 14, 0, false);
	public static final MCMeta packingUnitCode_META = createStringMeta($packingUnitCode, 20);
	public static final MCMeta packingUnitPrice_META = createNumberMeta($packingUnitPrice, 14, 0, false);
	public static final MCMeta packingUnitQty_META = createNumberMeta($packingUnitQty, 10, 0, false);
	public static final MCMeta preshippingDate_META = createStringMeta($preshippingDate, 10);
	public static final MCMeta delivDate_META = createStringMeta($delivDate, 10);
	public static final MCMeta detail_Descript_Code_META = createStringMeta($detail_Descript_Code, 20);
	public static final MCMeta detail_Descript_Name_META = createStringMeta($detail_Descript_Name, 100);
	public static final MCMeta detail_UserMaster1_META = createStringMeta($detail_UserMaster1, 20);
	public static final MCMeta detail_UserMaster2_META = createStringMeta($detail_UserMaster2, 20);
	public static final MCMeta detail_UserMaster3_META = createStringMeta($detail_UserMaster3, 20);
	public static final MCMeta detail_UserMaster4_META = createStringMeta($detail_UserMaster4, 20);
	public static final MCMeta detail_UserMaster5_META = createStringMeta($detail_UserMaster5, 20);
	public static final MCMeta detail_UserCode_META = createStringMeta($detail_UserCode, 20);
	public static final MCMeta detail_UserText_META = createStringMeta($detail_UserText, 100);
	public static final MCMeta detail_UserDate_META = createStringMeta($detail_UserDate, 10);
	public static final MCMeta detail_UserQty_META = createNumberMeta($detail_UserQty, 14, 0, false);
	public static final MCMeta detail_FlexMaster_META = createStringMeta($detail_FlexMaster, 20);
	public static final MCMeta detail_FlexCode_META = createStringMeta($detail_FlexCode, 20);
	public static final MCMeta detail_FlexText1_META = createStringMeta($detail_FlexText1, 100);
	public static final MCMeta detail_FlexText2_META = createStringMeta($detail_FlexText2, 100);
	public static final MCMeta detail_FlexDate_META = createStringMeta($detail_FlexDate, 10);
	public static final MCMeta sub_Descript_Code_META = createStringMeta($sub_Descript_Code, 20);
	public static final MCMeta sub_Descript_Name_META = createStringMeta($sub_Descript_Name, 100);
	public static final MCMeta sub_UserMaster1_META = createStringMeta($sub_UserMaster1, 20);
	public static final MCMeta sub_UserMaster2_META = createStringMeta($sub_UserMaster2, 20);
	public static final MCMeta sub_UserMaster3_META = createStringMeta($sub_UserMaster3, 20);
	public static final MCMeta sub_UserMaster4_META = createStringMeta($sub_UserMaster4, 20);
	public static final MCMeta sub_UserMaster5_META = createStringMeta($sub_UserMaster5, 20);
	public static final MCMeta sub_UserCode_META = createStringMeta($sub_UserCode, 20);
	public static final MCMeta sub_UserText_META = createStringMeta($sub_UserText, 100);
	public static final MCMeta sub_UserDate_META = createStringMeta($sub_UserDate, 10);
	public static final MCMeta sub_UserQty_META = createNumberMeta($sub_UserQty, 14, 0, false);
	public static final MCMeta spriceCode_META = createStringMeta($spriceCode, 20);
	public static final MCMeta spriceIndex_META = createNumberMeta($spriceIndex);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inpDate_META,
			voucherNo_META,
			customerNo_META,
			succeedVoucherNo_META,
			correspType_META,
			customerCode_META,
			delivToCode_META,
			deptCode_META,
			inchargeCode_META,
			ar_PatternCode_META,
			currencyCode_META,
			rateTypeCode_META,
			rate_META,
			taxableCode_META,
			forCondition_META,
			taxType_META,
			header_DescriptCode_META,
			header_DescriptName_META,
			postpadColor_META,
			postpadText_META,
			settleMethod_META,
			bankAcct_Own_META,
			paymentTerms_META,
			dueDate_META,
			fileName_META,
			header_UserMaster_META,
			header_UserText_META,
			header_FlexMaster1_META,
			header_FlexMaster2_META,
			header_FlexCode1_META,
			header_FlexCode2_META,
			header_FlexText1_META,
			header_FlexText2_META,
			header_FlexText3_META,
			header_FlexText4_META,
			header_FlexText5_META,
			header_FlexDate_META,
			remarks1_META,
			remarks2_META,
			remarks3_META,
			remarks4_META,
			remarks5_META,
			remarks6_META,
			remarks7_META,
			remarks8_META,
			remarks9_META,
			remarks10_META,
			remarks11_META,
			remarks12_META,
			remarks13_META,
			remarks14_META,
			remarks15_META,
			remarks16_META,
			remarks17_META,
			remarks18_META,
			remarks19_META,
			remarks20_META,
			remarks21_META,
			remarks22_META,
			remarks23_META,
			remarks24_META,
			remarks25_META,
			remarks26_META,
			remarks27_META,
			remarks28_META,
			remarks29_META,
			remarks30_META,
			rowNo_META,
			detailType_META,
			detail_DeptCode_META,
			warehouse_META,
			locationCode_META,
			goodsGroup_META,
			goodsCode_META,
			chargesCode_META,
			corresp_Goods_META,
			unitType_META,
			detail_TaxableCode_META,
			detail_TaxType_META,
			unitPrice_META,
			qty_META,
			inpAmount_Fc_META,
			taxAmount_Fc_META,
			taxableAmount_Fc_META,
			inpAmount_Sc_META,
			taxAmount_Sc_META,
			taxableAmount_Sc_META,
			packingUnitCode_META,
			packingUnitPrice_META,
			packingUnitQty_META,
			preshippingDate_META,
			delivDate_META,
			detail_Descript_Code_META,
			detail_Descript_Name_META,
			detail_UserMaster1_META,
			detail_UserMaster2_META,
			detail_UserMaster3_META,
			detail_UserMaster4_META,
			detail_UserMaster5_META,
			detail_UserCode_META,
			detail_UserText_META,
			detail_UserDate_META,
			detail_UserQty_META,
			detail_FlexMaster_META,
			detail_FlexCode_META,
			detail_FlexText1_META,
			detail_FlexText2_META,
			detail_FlexDate_META,
			sub_Descript_Code_META,
			sub_Descript_Name_META,
			sub_UserMaster1_META,
			sub_UserMaster2_META,
			sub_UserMaster3_META,
			sub_UserMaster4_META,
			sub_UserMaster5_META,
			sub_UserCode_META,
			sub_UserText_META,
			sub_UserDate_META,
			sub_UserQty_META,
			spriceCode_META,
			spriceIndex_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * コンストラクタです。
	 */
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  計上日.<p>
	 *
	 */
	public String inpDate() {
		return getConstString(offset + 0, $inpDate);
	}

	/**
	 *  計上日.<p>
	 *
	 */
	public void inpDate(String value) {
		setConstString(offset + 0, $inpDate, value);
	}


	/**
	 *  伝票ＮＯ.<p>
	 *
	 */
	public String voucherNo() {
		return getConstString(offset + 1, $voucherNo);
	}

	/**
	 *  伝票ＮＯ.<p>
	 *
	 */
	public void voucherNo(String value) {
		setConstString(offset + 1, $voucherNo, value);
	}


	/**
	 *  客先注文ＮＯ.<p>
	 *
	 */
	public String customerNo() {
		return getConstString(offset + 2, $customerNo);
	}

	/**
	 *  客先注文ＮＯ.<p>
	 *
	 */
	public void customerNo(String value) {
		setConstString(offset + 2, $customerNo, value);
	}


	/**
	 *  引継元ＮＯ.<p>
	 *
	 */
	public String succeedVoucherNo() {
		return getConstString(offset + 3, $succeedVoucherNo);
	}

	/**
	 *  引継元ＮＯ.<p>
	 *
	 */
	public void succeedVoucherNo(String value) {
		setConstString(offset + 3, $succeedVoucherNo, value);
	}


	/**
	 *  取引先区分.<p>
	 *
	 */
	public MCNumber correspType() {
		return getConstNumber(offset + 4, $correspType);
	}

	/**
	 *  取引先区分.<p>
	 *
	 */
	public void correspType(MCNumber value) {
		setConstNumber(offset + 4, $correspType, value);
	}

	/**
	 *  取引先区分.<p>
	 *
	 */
	public void correspType(int value) {
		setConstNumber(offset + 4, $correspType, value);
	}

	/**
	 *  取引先区分.<p>
	 *
	 */
	public void correspType(long value) {
		setConstNumber(offset + 4, $correspType, value);
	}

	/**
	 *  取引先区分.<p>
	 *
	 */
	public void correspType(float value) {
		setConstNumber(offset + 4, $correspType, value);
	}

	/**
	 *  取引先区分.<p>
	 *
	 */
	public void correspType(double value) {
		setConstNumber(offset + 4, $correspType, value);
	}


	/**
	 *  取引先.<p>
	 *
	 */
	public String customerCode() {
		return getConstString(offset + 5, $customerCode);
	}

	/**
	 *  取引先.<p>
	 *
	 */
	public void customerCode(String value) {
		setConstString(offset + 5, $customerCode, value);
	}


	/**
	 *  納品先/納入元.<p>
	 *
	 */
	public String delivToCode() {
		return getConstString(offset + 6, $delivToCode);
	}

	/**
	 *  納品先/納入元.<p>
	 *
	 */
	public void delivToCode(String value) {
		setConstString(offset + 6, $delivToCode, value);
	}


	/**
	 *  部門.<p>
	 *
	 */
	public String deptCode() {
		return getConstString(offset + 7, $deptCode);
	}

	/**
	 *  部門.<p>
	 *
	 */
	public void deptCode(String value) {
		setConstString(offset + 7, $deptCode, value);
	}


	/**
	 *  担当者.<p>
	 *
	 */
	public String inchargeCode() {
		return getConstString(offset + 8, $inchargeCode);
	}

	/**
	 *  担当者.<p>
	 *
	 */
	public void inchargeCode(String value) {
		setConstString(offset + 8, $inchargeCode, value);
	}


	/**
	 *  取引パターン.<p>
	 *
	 */
	public String ar_PatternCode() {
		return getConstString(offset + 9, $ar_PatternCode);
	}

	/**
	 *  取引パターン.<p>
	 *
	 */
	public void ar_PatternCode(String value) {
		setConstString(offset + 9, $ar_PatternCode, value);
	}


	/**
	 *  通貨.<p>
	 *
	 */
	public String currencyCode() {
		return getConstString(offset + 10, $currencyCode);
	}

	/**
	 *  通貨.<p>
	 *
	 */
	public void currencyCode(String value) {
		setConstString(offset + 10, $currencyCode, value);
	}


	/**
	 *  レートタイプ.<p>
	 *
	 */
	public String rateTypeCode() {
		return getConstString(offset + 11, $rateTypeCode);
	}

	/**
	 *  レートタイプ.<p>
	 *
	 */
	public void rateTypeCode(String value) {
		setConstString(offset + 11, $rateTypeCode, value);
	}


	/**
	 *  レート.<p>
	 *
	 */
	public MCNumber rate() {
		return getConstNumber(offset + 12, $rate);
	}

	/**
	 *  レート.<p>
	 *
	 */
	public void rate(MCNumber value) {
		setConstNumber(offset + 12, $rate, value);
	}

	/**
	 *  レート.<p>
	 *
	 */
	public void rate(int value) {
		setConstNumber(offset + 12, $rate, value);
	}

	/**
	 *  レート.<p>
	 *
	 */
	public void rate(long value) {
		setConstNumber(offset + 12, $rate, value);
	}

	/**
	 *  レート.<p>
	 *
	 */
	public void rate(float value) {
		setConstNumber(offset + 12, $rate, value);
	}

	/**
	 *  レート.<p>
	 *
	 */
	public void rate(double value) {
		setConstNumber(offset + 12, $rate, value);
	}


	/**
	 *  ヘッダ課税区分.<p>
	 *
	 */
	public String taxableCode() {
		return getConstString(offset + 13, $taxableCode);
	}

	/**
	 *  ヘッダ課税区分.<p>
	 *
	 */
	public void taxableCode(String value) {
		setConstString(offset + 13, $taxableCode, value);
	}


	/**
	 *  出荷数量条件.<p>
	 *
	 */
	public MCNumber forCondition() {
		return getConstNumber(offset + 14, $forCondition);
	}

	/**
	 *  出荷数量条件.<p>
	 *
	 */
	public void forCondition(MCNumber value) {
		setConstNumber(offset + 14, $forCondition, value);
	}

	/**
	 *  出荷数量条件.<p>
	 *
	 */
	public void forCondition(int value) {
		setConstNumber(offset + 14, $forCondition, value);
	}

	/**
	 *  出荷数量条件.<p>
	 *
	 */
	public void forCondition(long value) {
		setConstNumber(offset + 14, $forCondition, value);
	}

	/**
	 *  出荷数量条件.<p>
	 *
	 */
	public void forCondition(float value) {
		setConstNumber(offset + 14, $forCondition, value);
	}

	/**
	 *  出荷数量条件.<p>
	 *
	 */
	public void forCondition(double value) {
		setConstNumber(offset + 14, $forCondition, value);
	}


	/**
	 *  内税/外税区分.<p>
	 *
	 */
	public MCNumber taxType() {
		return getConstNumber(offset + 15, $taxType);
	}

	/**
	 *  内税/外税区分.<p>
	 *
	 */
	public void taxType(MCNumber value) {
		setConstNumber(offset + 15, $taxType, value);
	}

	/**
	 *  内税/外税区分.<p>
	 *
	 */
	public void taxType(int value) {
		setConstNumber(offset + 15, $taxType, value);
	}

	/**
	 *  内税/外税区分.<p>
	 *
	 */
	public void taxType(long value) {
		setConstNumber(offset + 15, $taxType, value);
	}

	/**
	 *  内税/外税区分.<p>
	 *
	 */
	public void taxType(float value) {
		setConstNumber(offset + 15, $taxType, value);
	}

	/**
	 *  内税/外税区分.<p>
	 *
	 */
	public void taxType(double value) {
		setConstNumber(offset + 15, $taxType, value);
	}


	/**
	 *  伝票摘要コード.<p>
	 *
	 */
	public String header_DescriptCode() {
		return getConstString(offset + 16, $header_DescriptCode);
	}

	/**
	 *  伝票摘要コード.<p>
	 *
	 */
	public void header_DescriptCode(String value) {
		setConstString(offset + 16, $header_DescriptCode, value);
	}


	/**
	 *  伝票摘要内容.<p>
	 *
	 */
	public String header_DescriptName() {
		return getConstString(offset + 17, $header_DescriptName);
	}

	/**
	 *  伝票摘要内容.<p>
	 *
	 */
	public void header_DescriptName(String value) {
		setConstString(offset + 17, $header_DescriptName, value);
	}


	/**
	 *  付箋紙色.<p>
	 *
	 */
	public String postpadColor() {
		return getConstString(offset + 18, $postpadColor);
	}

	/**
	 *  付箋紙色.<p>
	 *
	 */
	public void postpadColor(String value) {
		setConstString(offset + 18, $postpadColor, value);
	}


	/**
	 *  付箋紙内容.<p>
	 *
	 */
	public String postpadText() {
		return getConstString(offset + 19, $postpadText);
	}

	/**
	 *  付箋紙内容.<p>
	 *
	 */
	public void postpadText(String value) {
		setConstString(offset + 19, $postpadText, value);
	}


	/**
	 *  決済方法.<p>
	 *
	 */
	public String settleMethod() {
		return getConstString(offset + 20, $settleMethod);
	}

	/**
	 *  決済方法.<p>
	 *
	 */
	public void settleMethod(String value) {
		setConstString(offset + 20, $settleMethod, value);
	}


	/**
	 *  自社口座.<p>
	 *
	 */
	public String bankAcct_Own() {
		return getConstString(offset + 21, $bankAcct_Own);
	}

	/**
	 *  自社口座.<p>
	 *
	 */
	public void bankAcct_Own(String value) {
		setConstString(offset + 21, $bankAcct_Own, value);
	}


	/**
	 *  回収条件.<p>
	 *
	 */
	public String paymentTerms() {
		return getConstString(offset + 22, $paymentTerms);
	}

	/**
	 *  回収条件.<p>
	 *
	 */
	public void paymentTerms(String value) {
		setConstString(offset + 22, $paymentTerms, value);
	}


	/**
	 *  決済予定日.<p>
	 *
	 */
	public String dueDate() {
		return getConstString(offset + 23, $dueDate);
	}

	/**
	 *  決済予定日.<p>
	 *
	 */
	public void dueDate(String value) {
		setConstString(offset + 23, $dueDate, value);
	}


	/**
	 *  ファイル名.<p>
	 *
	 */
	public String fileName() {
		return getConstString(offset + 24, $fileName);
	}

	/**
	 *  ファイル名.<p>
	 *
	 */
	public void fileName(String value) {
		setConstString(offset + 24, $fileName, value);
	}


	/**
	 *  ヘッダユーザマスタ.<p>
	 *
	 */
	public String header_UserMaster() {
		return getConstString(offset + 25, $header_UserMaster);
	}

	/**
	 *  ヘッダユーザマスタ.<p>
	 *
	 */
	public void header_UserMaster(String value) {
		setConstString(offset + 25, $header_UserMaster, value);
	}


	/**
	 *  ヘッダユーザテキスト.<p>
	 *
	 */
	public String header_UserText() {
		return getConstString(offset + 26, $header_UserText);
	}

	/**
	 *  ヘッダユーザテキスト.<p>
	 *
	 */
	public void header_UserText(String value) {
		setConstString(offset + 26, $header_UserText, value);
	}


	/**
	 *  ヘッダフレックスマスタ1.<p>
	 *
	 */
	public String header_FlexMaster1() {
		return getConstString(offset + 27, $header_FlexMaster1);
	}

	/**
	 *  ヘッダフレックスマスタ1.<p>
	 *
	 */
	public void header_FlexMaster1(String value) {
		setConstString(offset + 27, $header_FlexMaster1, value);
	}


	/**
	 *  ヘッダフレックスマスタ2.<p>
	 *
	 */
	public String header_FlexMaster2() {
		return getConstString(offset + 28, $header_FlexMaster2);
	}

	/**
	 *  ヘッダフレックスマスタ2.<p>
	 *
	 */
	public void header_FlexMaster2(String value) {
		setConstString(offset + 28, $header_FlexMaster2, value);
	}


	/**
	 *  ヘッダフレックスコード1.<p>
	 *
	 */
	public String header_FlexCode1() {
		return getConstString(offset + 29, $header_FlexCode1);
	}

	/**
	 *  ヘッダフレックスコード1.<p>
	 *
	 */
	public void header_FlexCode1(String value) {
		setConstString(offset + 29, $header_FlexCode1, value);
	}


	/**
	 *  ヘッダフレックスコード2.<p>
	 *
	 */
	public String header_FlexCode2() {
		return getConstString(offset + 30, $header_FlexCode2);
	}

	/**
	 *  ヘッダフレックスコード2.<p>
	 *
	 */
	public void header_FlexCode2(String value) {
		setConstString(offset + 30, $header_FlexCode2, value);
	}


	/**
	 *  ヘッダフレックステキスト1.<p>
	 *
	 */
	public String header_FlexText1() {
		return getConstString(offset + 31, $header_FlexText1);
	}

	/**
	 *  ヘッダフレックステキスト1.<p>
	 *
	 */
	public void header_FlexText1(String value) {
		setConstString(offset + 31, $header_FlexText1, value);
	}


	/**
	 *  ヘッダフレックステキスト2.<p>
	 *
	 */
	public String header_FlexText2() {
		return getConstString(offset + 32, $header_FlexText2);
	}

	/**
	 *  ヘッダフレックステキスト2.<p>
	 *
	 */
	public void header_FlexText2(String value) {
		setConstString(offset + 32, $header_FlexText2, value);
	}


	/**
	 *  ヘッダフレックステキスト3.<p>
	 *
	 */
	public String header_FlexText3() {
		return getConstString(offset + 33, $header_FlexText3);
	}

	/**
	 *  ヘッダフレックステキスト3.<p>
	 *
	 */
	public void header_FlexText3(String value) {
		setConstString(offset + 33, $header_FlexText3, value);
	}


	/**
	 *  ヘッダフレックステキスト4.<p>
	 *
	 */
	public String header_FlexText4() {
		return getConstString(offset + 34, $header_FlexText4);
	}

	/**
	 *  ヘッダフレックステキスト4.<p>
	 *
	 */
	public void header_FlexText4(String value) {
		setConstString(offset + 34, $header_FlexText4, value);
	}


	/**
	 *  ヘッダフレックステキスト5.<p>
	 *
	 */
	public String header_FlexText5() {
		return getConstString(offset + 35, $header_FlexText5);
	}

	/**
	 *  ヘッダフレックステキスト5.<p>
	 *
	 */
	public void header_FlexText5(String value) {
		setConstString(offset + 35, $header_FlexText5, value);
	}


	/**
	 *  ヘッダフレックス日付.<p>
	 *
	 */
	public String header_FlexDate() {
		return getConstString(offset + 36, $header_FlexDate);
	}

	/**
	 *  ヘッダフレックス日付.<p>
	 *
	 */
	public void header_FlexDate(String value) {
		setConstString(offset + 36, $header_FlexDate, value);
	}


	/**
	 *  ﾒﾓ情報1.<p>
	 *
	 */
	public String remarks1() {
		return getConstString(offset + 37, $remarks1);
	}

	/**
	 *  ﾒﾓ情報1.<p>
	 *
	 */
	public void remarks1(String value) {
		setConstString(offset + 37, $remarks1, value);
	}


	/**
	 *  ﾒﾓ情報2.<p>
	 *
	 */
	public String remarks2() {
		return getConstString(offset + 38, $remarks2);
	}

	/**
	 *  ﾒﾓ情報2.<p>
	 *
	 */
	public void remarks2(String value) {
		setConstString(offset + 38, $remarks2, value);
	}


	/**
	 *  ﾒﾓ情報3.<p>
	 *
	 */
	public String remarks3() {
		return getConstString(offset + 39, $remarks3);
	}

	/**
	 *  ﾒﾓ情報3.<p>
	 *
	 */
	public void remarks3(String value) {
		setConstString(offset + 39, $remarks3, value);
	}


	/**
	 *  ﾒﾓ情報4.<p>
	 *
	 */
	public String remarks4() {
		return getConstString(offset + 40, $remarks4);
	}

	/**
	 *  ﾒﾓ情報4.<p>
	 *
	 */
	public void remarks4(String value) {
		setConstString(offset + 40, $remarks4, value);
	}


	/**
	 *  ﾒﾓ情報5.<p>
	 *
	 */
	public String remarks5() {
		return getConstString(offset + 41, $remarks5);
	}

	/**
	 *  ﾒﾓ情報5.<p>
	 *
	 */
	public void remarks5(String value) {
		setConstString(offset + 41, $remarks5, value);
	}


	/**
	 *  ﾒﾓ情報6.<p>
	 *
	 */
	public String remarks6() {
		return getConstString(offset + 42, $remarks6);
	}

	/**
	 *  ﾒﾓ情報6.<p>
	 *
	 */
	public void remarks6(String value) {
		setConstString(offset + 42, $remarks6, value);
	}


	/**
	 *  ﾒﾓ情報7.<p>
	 *
	 */
	public String remarks7() {
		return getConstString(offset + 43, $remarks7);
	}

	/**
	 *  ﾒﾓ情報7.<p>
	 *
	 */
	public void remarks7(String value) {
		setConstString(offset + 43, $remarks7, value);
	}


	/**
	 *  ﾒﾓ情報8.<p>
	 *
	 */
	public String remarks8() {
		return getConstString(offset + 44, $remarks8);
	}

	/**
	 *  ﾒﾓ情報8.<p>
	 *
	 */
	public void remarks8(String value) {
		setConstString(offset + 44, $remarks8, value);
	}


	/**
	 *  ﾒﾓ情報9.<p>
	 *
	 */
	public String remarks9() {
		return getConstString(offset + 45, $remarks9);
	}

	/**
	 *  ﾒﾓ情報9.<p>
	 *
	 */
	public void remarks9(String value) {
		setConstString(offset + 45, $remarks9, value);
	}


	/**
	 *  ﾒﾓ情報10.<p>
	 *
	 */
	public String remarks10() {
		return getConstString(offset + 46, $remarks10);
	}

	/**
	 *  ﾒﾓ情報10.<p>
	 *
	 */
	public void remarks10(String value) {
		setConstString(offset + 46, $remarks10, value);
	}


	/**
	 *  ﾒﾓ情報11.<p>
	 *
	 */
	public String remarks11() {
		return getConstString(offset + 47, $remarks11);
	}

	/**
	 *  ﾒﾓ情報11.<p>
	 *
	 */
	public void remarks11(String value) {
		setConstString(offset + 47, $remarks11, value);
	}


	/**
	 *  ﾒﾓ情報12.<p>
	 *
	 */
	public String remarks12() {
		return getConstString(offset + 48, $remarks12);
	}

	/**
	 *  ﾒﾓ情報12.<p>
	 *
	 */
	public void remarks12(String value) {
		setConstString(offset + 48, $remarks12, value);
	}


	/**
	 *  ﾒﾓ情報13.<p>
	 *
	 */
	public String remarks13() {
		return getConstString(offset + 49, $remarks13);
	}

	/**
	 *  ﾒﾓ情報13.<p>
	 *
	 */
	public void remarks13(String value) {
		setConstString(offset + 49, $remarks13, value);
	}


	/**
	 *  ﾒﾓ情報14.<p>
	 *
	 */
	public String remarks14() {
		return getConstString(offset + 50, $remarks14);
	}

	/**
	 *  ﾒﾓ情報14.<p>
	 *
	 */
	public void remarks14(String value) {
		setConstString(offset + 50, $remarks14, value);
	}


	/**
	 *  ﾒﾓ情報15.<p>
	 *
	 */
	public String remarks15() {
		return getConstString(offset + 51, $remarks15);
	}

	/**
	 *  ﾒﾓ情報15.<p>
	 *
	 */
	public void remarks15(String value) {
		setConstString(offset + 51, $remarks15, value);
	}


	/**
	 *  ﾒﾓ情報16.<p>
	 *
	 */
	public String remarks16() {
		return getConstString(offset + 52, $remarks16);
	}

	/**
	 *  ﾒﾓ情報16.<p>
	 *
	 */
	public void remarks16(String value) {
		setConstString(offset + 52, $remarks16, value);
	}


	/**
	 *  ﾒﾓ情報17.<p>
	 *
	 */
	public String remarks17() {
		return getConstString(offset + 53, $remarks17);
	}

	/**
	 *  ﾒﾓ情報17.<p>
	 *
	 */
	public void remarks17(String value) {
		setConstString(offset + 53, $remarks17, value);
	}


	/**
	 *  ﾒﾓ情報18.<p>
	 *
	 */
	public String remarks18() {
		return getConstString(offset + 54, $remarks18);
	}

	/**
	 *  ﾒﾓ情報18.<p>
	 *
	 */
	public void remarks18(String value) {
		setConstString(offset + 54, $remarks18, value);
	}


	/**
	 *  ﾒﾓ情報19.<p>
	 *
	 */
	public String remarks19() {
		return getConstString(offset + 55, $remarks19);
	}

	/**
	 *  ﾒﾓ情報19.<p>
	 *
	 */
	public void remarks19(String value) {
		setConstString(offset + 55, $remarks19, value);
	}


	/**
	 *  ﾒﾓ情報20.<p>
	 *
	 */
	public String remarks20() {
		return getConstString(offset + 56, $remarks20);
	}

	/**
	 *  ﾒﾓ情報20.<p>
	 *
	 */
	public void remarks20(String value) {
		setConstString(offset + 56, $remarks20, value);
	}


	/**
	 *  ﾒﾓ情報21.<p>
	 *
	 */
	public String remarks21() {
		return getConstString(offset + 57, $remarks21);
	}

	/**
	 *  ﾒﾓ情報21.<p>
	 *
	 */
	public void remarks21(String value) {
		setConstString(offset + 57, $remarks21, value);
	}


	/**
	 *  ﾒﾓ情報22.<p>
	 *
	 */
	public String remarks22() {
		return getConstString(offset + 58, $remarks22);
	}

	/**
	 *  ﾒﾓ情報22.<p>
	 *
	 */
	public void remarks22(String value) {
		setConstString(offset + 58, $remarks22, value);
	}


	/**
	 *  ﾒﾓ情報23.<p>
	 *
	 */
	public String remarks23() {
		return getConstString(offset + 59, $remarks23);
	}

	/**
	 *  ﾒﾓ情報23.<p>
	 *
	 */
	public void remarks23(String value) {
		setConstString(offset + 59, $remarks23, value);
	}


	/**
	 *  ﾒﾓ情報24.<p>
	 *
	 */
	public String remarks24() {
		return getConstString(offset + 60, $remarks24);
	}

	/**
	 *  ﾒﾓ情報24.<p>
	 *
	 */
	public void remarks24(String value) {
		setConstString(offset + 60, $remarks24, value);
	}


	/**
	 *  ﾒﾓ情報25.<p>
	 *
	 */
	public String remarks25() {
		return getConstString(offset + 61, $remarks25);
	}

	/**
	 *  ﾒﾓ情報25.<p>
	 *
	 */
	public void remarks25(String value) {
		setConstString(offset + 61, $remarks25, value);
	}


	/**
	 *  ﾒﾓ情報26.<p>
	 *
	 */
	public String remarks26() {
		return getConstString(offset + 62, $remarks26);
	}

	/**
	 *  ﾒﾓ情報26.<p>
	 *
	 */
	public void remarks26(String value) {
		setConstString(offset + 62, $remarks26, value);
	}


	/**
	 *  ﾒﾓ情報27.<p>
	 *
	 */
	public String remarks27() {
		return getConstString(offset + 63, $remarks27);
	}

	/**
	 *  ﾒﾓ情報27.<p>
	 *
	 */
	public void remarks27(String value) {
		setConstString(offset + 63, $remarks27, value);
	}


	/**
	 *  ﾒﾓ情報28.<p>
	 *
	 */
	public String remarks28() {
		return getConstString(offset + 64, $remarks28);
	}

	/**
	 *  ﾒﾓ情報28.<p>
	 *
	 */
	public void remarks28(String value) {
		setConstString(offset + 64, $remarks28, value);
	}


	/**
	 *  ﾒﾓ情報29.<p>
	 *
	 */
	public String remarks29() {
		return getConstString(offset + 65, $remarks29);
	}

	/**
	 *  ﾒﾓ情報29.<p>
	 *
	 */
	public void remarks29(String value) {
		setConstString(offset + 65, $remarks29, value);
	}


	/**
	 *  ﾒﾓ情報30.<p>
	 *
	 */
	public String remarks30() {
		return getConstString(offset + 66, $remarks30);
	}

	/**
	 *  ﾒﾓ情報30.<p>
	 *
	 */
	public void remarks30(String value) {
		setConstString(offset + 66, $remarks30, value);
	}


	/**
	 *  行ＮＯ.<p>
	 *
	 */
	public MCNumber rowNo() {
		return getConstNumber(offset + 67, $rowNo);
	}

	/**
	 *  行ＮＯ.<p>
	 *
	 */
	public void rowNo(MCNumber value) {
		setConstNumber(offset + 67, $rowNo, value);
	}

	/**
	 *  行ＮＯ.<p>
	 *
	 */
	public void rowNo(int value) {
		setConstNumber(offset + 67, $rowNo, value);
	}

	/**
	 *  行ＮＯ.<p>
	 *
	 */
	public void rowNo(long value) {
		setConstNumber(offset + 67, $rowNo, value);
	}

	/**
	 *  行ＮＯ.<p>
	 *
	 */
	public void rowNo(float value) {
		setConstNumber(offset + 67, $rowNo, value);
	}

	/**
	 *  行ＮＯ.<p>
	 *
	 */
	public void rowNo(double value) {
		setConstNumber(offset + 67, $rowNo, value);
	}


	/**
	 *  明細区分（品目・諸掛）.<p>
	 *
	 */
	public MCNumber detailType() {
		return getConstNumber(offset + 68, $detailType);
	}

	/**
	 *  明細区分（品目・諸掛）.<p>
	 *
	 */
	public void detailType(MCNumber value) {
		setConstNumber(offset + 68, $detailType, value);
	}

	/**
	 *  明細区分（品目・諸掛）.<p>
	 *
	 */
	public void detailType(int value) {
		setConstNumber(offset + 68, $detailType, value);
	}

	/**
	 *  明細区分（品目・諸掛）.<p>
	 *
	 */
	public void detailType(long value) {
		setConstNumber(offset + 68, $detailType, value);
	}

	/**
	 *  明細区分（品目・諸掛）.<p>
	 *
	 */
	public void detailType(float value) {
		setConstNumber(offset + 68, $detailType, value);
	}

	/**
	 *  明細区分（品目・諸掛）.<p>
	 *
	 */
	public void detailType(double value) {
		setConstNumber(offset + 68, $detailType, value);
	}


	/**
	 *  部門.<p>
	 *
	 */
	public String detail_DeptCode() {
		return getConstString(offset + 69, $detail_DeptCode);
	}

	/**
	 *  部門.<p>
	 *
	 */
	public void detail_DeptCode(String value) {
		setConstString(offset + 69, $detail_DeptCode, value);
	}


	/**
	 *  倉庫.<p>
	 *
	 */
	public String warehouse() {
		return getConstString(offset + 70, $warehouse);
	}

	/**
	 *  倉庫.<p>
	 *
	 */
	public void warehouse(String value) {
		setConstString(offset + 70, $warehouse, value);
	}


	/**
	 *  ロケーション.<p>
	 *
	 */
	public String locationCode() {
		return getConstString(offset + 71, $locationCode);
	}

	/**
	 *  ロケーション.<p>
	 *
	 */
	public void locationCode(String value) {
		setConstString(offset + 71, $locationCode, value);
	}


	/**
	 *  品目グループ.<p>
	 *
	 */
	public String goodsGroup() {
		return getConstString(offset + 72, $goodsGroup);
	}

	/**
	 *  品目グループ.<p>
	 *
	 */
	public void goodsGroup(String value) {
		setConstString(offset + 72, $goodsGroup, value);
	}


	/**
	 *  品目.<p>
	 *
	 */
	public String goodsCode() {
		return getConstString(offset + 73, $goodsCode);
	}

	/**
	 *  品目.<p>
	 *
	 */
	public void goodsCode(String value) {
		setConstString(offset + 73, $goodsCode, value);
	}


	/**
	 *  諸掛.<p>
	 *
	 */
	public String chargesCode() {
		return getConstString(offset + 74, $chargesCode);
	}

	/**
	 *  諸掛.<p>
	 *
	 */
	public void chargesCode(String value) {
		setConstString(offset + 74, $chargesCode, value);
	}


	/**
	 *  取引先品番.<p>
	 *
	 */
	public String corresp_Goods() {
		return getConstString(offset + 75, $corresp_Goods);
	}

	/**
	 *  取引先品番.<p>
	 *
	 */
	public void corresp_Goods(String value) {
		setConstString(offset + 75, $corresp_Goods, value);
	}


	/**
	 *  単位計上/荷姿単位計上.<p>
	 *
	 */
	public MCNumber unitType() {
		return getConstNumber(offset + 76, $unitType);
	}

	/**
	 *  単位計上/荷姿単位計上.<p>
	 *
	 */
	public void unitType(MCNumber value) {
		setConstNumber(offset + 76, $unitType, value);
	}

	/**
	 *  単位計上/荷姿単位計上.<p>
	 *
	 */
	public void unitType(int value) {
		setConstNumber(offset + 76, $unitType, value);
	}

	/**
	 *  単位計上/荷姿単位計上.<p>
	 *
	 */
	public void unitType(long value) {
		setConstNumber(offset + 76, $unitType, value);
	}

	/**
	 *  単位計上/荷姿単位計上.<p>
	 *
	 */
	public void unitType(float value) {
		setConstNumber(offset + 76, $unitType, value);
	}

	/**
	 *  単位計上/荷姿単位計上.<p>
	 *
	 */
	public void unitType(double value) {
		setConstNumber(offset + 76, $unitType, value);
	}


	/**
	 *  課税区分.<p>
	 *
	 */
	public String detail_TaxableCode() {
		return getConstString(offset + 77, $detail_TaxableCode);
	}

	/**
	 *  課税区分.<p>
	 *
	 */
	public void detail_TaxableCode(String value) {
		setConstString(offset + 77, $detail_TaxableCode, value);
	}


	/**
	 *  内税/外税区分.<p>
	 *
	 */
	public MCNumber detail_TaxType() {
		return getConstNumber(offset + 78, $detail_TaxType);
	}

	/**
	 *  内税/外税区分.<p>
	 *
	 */
	public void detail_TaxType(MCNumber value) {
		setConstNumber(offset + 78, $detail_TaxType, value);
	}

	/**
	 *  内税/外税区分.<p>
	 *
	 */
	public void detail_TaxType(int value) {
		setConstNumber(offset + 78, $detail_TaxType, value);
	}

	/**
	 *  内税/外税区分.<p>
	 *
	 */
	public void detail_TaxType(long value) {
		setConstNumber(offset + 78, $detail_TaxType, value);
	}

	/**
	 *  内税/外税区分.<p>
	 *
	 */
	public void detail_TaxType(float value) {
		setConstNumber(offset + 78, $detail_TaxType, value);
	}

	/**
	 *  内税/外税区分.<p>
	 *
	 */
	public void detail_TaxType(double value) {
		setConstNumber(offset + 78, $detail_TaxType, value);
	}


	/**
	 *  単価.<p>
	 *
	 */
	public MCNumber unitPrice() {
		return getConstNumber(offset + 79, $unitPrice);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void unitPrice(MCNumber value) {
		setConstNumber(offset + 79, $unitPrice, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void unitPrice(int value) {
		setConstNumber(offset + 79, $unitPrice, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void unitPrice(long value) {
		setConstNumber(offset + 79, $unitPrice, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void unitPrice(float value) {
		setConstNumber(offset + 79, $unitPrice, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void unitPrice(double value) {
		setConstNumber(offset + 79, $unitPrice, value);
	}


	/**
	 *  数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 80, $qty);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 80, $qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 80, $qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 80, $qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 80, $qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 80, $qty, value);
	}


	/**
	 *  入力金額.<p>
	 *
	 */
	public MCNumber inpAmount_Fc() {
		return getConstNumber(offset + 81, $inpAmount_Fc);
	}

	/**
	 *  入力金額.<p>
	 *
	 */
	public void inpAmount_Fc(MCNumber value) {
		setConstNumber(offset + 81, $inpAmount_Fc, value);
	}

	/**
	 *  入力金額.<p>
	 *
	 */
	public void inpAmount_Fc(int value) {
		setConstNumber(offset + 81, $inpAmount_Fc, value);
	}

	/**
	 *  入力金額.<p>
	 *
	 */
	public void inpAmount_Fc(long value) {
		setConstNumber(offset + 81, $inpAmount_Fc, value);
	}

	/**
	 *  入力金額.<p>
	 *
	 */
	public void inpAmount_Fc(float value) {
		setConstNumber(offset + 81, $inpAmount_Fc, value);
	}

	/**
	 *  入力金額.<p>
	 *
	 */
	public void inpAmount_Fc(double value) {
		setConstNumber(offset + 81, $inpAmount_Fc, value);
	}


	/**
	 *  入力税額.<p>
	 *
	 */
	public MCNumber taxAmount_Fc() {
		return getConstNumber(offset + 82, $taxAmount_Fc);
	}

	/**
	 *  入力税額.<p>
	 *
	 */
	public void taxAmount_Fc(MCNumber value) {
		setConstNumber(offset + 82, $taxAmount_Fc, value);
	}

	/**
	 *  入力税額.<p>
	 *
	 */
	public void taxAmount_Fc(int value) {
		setConstNumber(offset + 82, $taxAmount_Fc, value);
	}

	/**
	 *  入力税額.<p>
	 *
	 */
	public void taxAmount_Fc(long value) {
		setConstNumber(offset + 82, $taxAmount_Fc, value);
	}

	/**
	 *  入力税額.<p>
	 *
	 */
	public void taxAmount_Fc(float value) {
		setConstNumber(offset + 82, $taxAmount_Fc, value);
	}

	/**
	 *  入力税額.<p>
	 *
	 */
	public void taxAmount_Fc(double value) {
		setConstNumber(offset + 82, $taxAmount_Fc, value);
	}


	/**
	 *  入力税対象金額.<p>
	 *
	 */
	public MCNumber taxableAmount_Fc() {
		return getConstNumber(offset + 83, $taxableAmount_Fc);
	}

	/**
	 *  入力税対象金額.<p>
	 *
	 */
	public void taxableAmount_Fc(MCNumber value) {
		setConstNumber(offset + 83, $taxableAmount_Fc, value);
	}

	/**
	 *  入力税対象金額.<p>
	 *
	 */
	public void taxableAmount_Fc(int value) {
		setConstNumber(offset + 83, $taxableAmount_Fc, value);
	}

	/**
	 *  入力税対象金額.<p>
	 *
	 */
	public void taxableAmount_Fc(long value) {
		setConstNumber(offset + 83, $taxableAmount_Fc, value);
	}

	/**
	 *  入力税対象金額.<p>
	 *
	 */
	public void taxableAmount_Fc(float value) {
		setConstNumber(offset + 83, $taxableAmount_Fc, value);
	}

	/**
	 *  入力税対象金額.<p>
	 *
	 */
	public void taxableAmount_Fc(double value) {
		setConstNumber(offset + 83, $taxableAmount_Fc, value);
	}


	/**
	 *  基準金額.<p>
	 *
	 */
	public MCNumber inpAmount_Sc() {
		return getConstNumber(offset + 84, $inpAmount_Sc);
	}

	/**
	 *  基準金額.<p>
	 *
	 */
	public void inpAmount_Sc(MCNumber value) {
		setConstNumber(offset + 84, $inpAmount_Sc, value);
	}

	/**
	 *  基準金額.<p>
	 *
	 */
	public void inpAmount_Sc(int value) {
		setConstNumber(offset + 84, $inpAmount_Sc, value);
	}

	/**
	 *  基準金額.<p>
	 *
	 */
	public void inpAmount_Sc(long value) {
		setConstNumber(offset + 84, $inpAmount_Sc, value);
	}

	/**
	 *  基準金額.<p>
	 *
	 */
	public void inpAmount_Sc(float value) {
		setConstNumber(offset + 84, $inpAmount_Sc, value);
	}

	/**
	 *  基準金額.<p>
	 *
	 */
	public void inpAmount_Sc(double value) {
		setConstNumber(offset + 84, $inpAmount_Sc, value);
	}


	/**
	 *  基準税額.<p>
	 *
	 */
	public MCNumber taxAmount_Sc() {
		return getConstNumber(offset + 85, $taxAmount_Sc);
	}

	/**
	 *  基準税額.<p>
	 *
	 */
	public void taxAmount_Sc(MCNumber value) {
		setConstNumber(offset + 85, $taxAmount_Sc, value);
	}

	/**
	 *  基準税額.<p>
	 *
	 */
	public void taxAmount_Sc(int value) {
		setConstNumber(offset + 85, $taxAmount_Sc, value);
	}

	/**
	 *  基準税額.<p>
	 *
	 */
	public void taxAmount_Sc(long value) {
		setConstNumber(offset + 85, $taxAmount_Sc, value);
	}

	/**
	 *  基準税額.<p>
	 *
	 */
	public void taxAmount_Sc(float value) {
		setConstNumber(offset + 85, $taxAmount_Sc, value);
	}

	/**
	 *  基準税額.<p>
	 *
	 */
	public void taxAmount_Sc(double value) {
		setConstNumber(offset + 85, $taxAmount_Sc, value);
	}


	/**
	 *  基準税対象金額.<p>
	 *
	 */
	public MCNumber taxableAmount_Sc() {
		return getConstNumber(offset + 86, $taxableAmount_Sc);
	}

	/**
	 *  基準税対象金額.<p>
	 *
	 */
	public void taxableAmount_Sc(MCNumber value) {
		setConstNumber(offset + 86, $taxableAmount_Sc, value);
	}

	/**
	 *  基準税対象金額.<p>
	 *
	 */
	public void taxableAmount_Sc(int value) {
		setConstNumber(offset + 86, $taxableAmount_Sc, value);
	}

	/**
	 *  基準税対象金額.<p>
	 *
	 */
	public void taxableAmount_Sc(long value) {
		setConstNumber(offset + 86, $taxableAmount_Sc, value);
	}

	/**
	 *  基準税対象金額.<p>
	 *
	 */
	public void taxableAmount_Sc(float value) {
		setConstNumber(offset + 86, $taxableAmount_Sc, value);
	}

	/**
	 *  基準税対象金額.<p>
	 *
	 */
	public void taxableAmount_Sc(double value) {
		setConstNumber(offset + 86, $taxableAmount_Sc, value);
	}


	/**
	 *  荷姿コード.<p>
	 *
	 */
	public String packingUnitCode() {
		return getConstString(offset + 87, $packingUnitCode);
	}

	/**
	 *  荷姿コード.<p>
	 *
	 */
	public void packingUnitCode(String value) {
		setConstString(offset + 87, $packingUnitCode, value);
	}


	/**
	 *  荷姿単価.<p>
	 *
	 */
	public MCNumber packingUnitPrice() {
		return getConstNumber(offset + 88, $packingUnitPrice);
	}

	/**
	 *  荷姿単価.<p>
	 *
	 */
	public void packingUnitPrice(MCNumber value) {
		setConstNumber(offset + 88, $packingUnitPrice, value);
	}

	/**
	 *  荷姿単価.<p>
	 *
	 */
	public void packingUnitPrice(int value) {
		setConstNumber(offset + 88, $packingUnitPrice, value);
	}

	/**
	 *  荷姿単価.<p>
	 *
	 */
	public void packingUnitPrice(long value) {
		setConstNumber(offset + 88, $packingUnitPrice, value);
	}

	/**
	 *  荷姿単価.<p>
	 *
	 */
	public void packingUnitPrice(float value) {
		setConstNumber(offset + 88, $packingUnitPrice, value);
	}

	/**
	 *  荷姿単価.<p>
	 *
	 */
	public void packingUnitPrice(double value) {
		setConstNumber(offset + 88, $packingUnitPrice, value);
	}


	/**
	 *  荷姿数量.<p>
	 *
	 */
	public MCNumber packingUnitQty() {
		return getConstNumber(offset + 89, $packingUnitQty);
	}

	/**
	 *  荷姿数量.<p>
	 *
	 */
	public void packingUnitQty(MCNumber value) {
		setConstNumber(offset + 89, $packingUnitQty, value);
	}

	/**
	 *  荷姿数量.<p>
	 *
	 */
	public void packingUnitQty(int value) {
		setConstNumber(offset + 89, $packingUnitQty, value);
	}

	/**
	 *  荷姿数量.<p>
	 *
	 */
	public void packingUnitQty(long value) {
		setConstNumber(offset + 89, $packingUnitQty, value);
	}

	/**
	 *  荷姿数量.<p>
	 *
	 */
	public void packingUnitQty(float value) {
		setConstNumber(offset + 89, $packingUnitQty, value);
	}

	/**
	 *  荷姿数量.<p>
	 *
	 */
	public void packingUnitQty(double value) {
		setConstNumber(offset + 89, $packingUnitQty, value);
	}


	/**
	 *  出荷予定日.<p>
	 *
	 */
	public String preshippingDate() {
		return getConstString(offset + 90, $preshippingDate);
	}

	/**
	 *  出荷予定日.<p>
	 *
	 */
	public void preshippingDate(String value) {
		setConstString(offset + 90, $preshippingDate, value);
	}


	/**
	 *  納入期日.<p>
	 *
	 */
	public String delivDate() {
		return getConstString(offset + 91, $delivDate);
	}

	/**
	 *  納入期日.<p>
	 *
	 */
	public void delivDate(String value) {
		setConstString(offset + 91, $delivDate, value);
	}


	/**
	 *  明細摘要コード.<p>
	 *
	 */
	public String detail_Descript_Code() {
		return getConstString(offset + 92, $detail_Descript_Code);
	}

	/**
	 *  明細摘要コード.<p>
	 *
	 */
	public void detail_Descript_Code(String value) {
		setConstString(offset + 92, $detail_Descript_Code, value);
	}


	/**
	 *  明細摘要内容.<p>
	 *
	 */
	public String detail_Descript_Name() {
		return getConstString(offset + 93, $detail_Descript_Name);
	}

	/**
	 *  明細摘要内容.<p>
	 *
	 */
	public void detail_Descript_Name(String value) {
		setConstString(offset + 93, $detail_Descript_Name, value);
	}


	/**
	 *  明細ユーザマスタ1.<p>
	 *
	 */
	public String detail_UserMaster1() {
		return getConstString(offset + 94, $detail_UserMaster1);
	}

	/**
	 *  明細ユーザマスタ1.<p>
	 *
	 */
	public void detail_UserMaster1(String value) {
		setConstString(offset + 94, $detail_UserMaster1, value);
	}


	/**
	 *  明細ユーザマスタ2.<p>
	 *
	 */
	public String detail_UserMaster2() {
		return getConstString(offset + 95, $detail_UserMaster2);
	}

	/**
	 *  明細ユーザマスタ2.<p>
	 *
	 */
	public void detail_UserMaster2(String value) {
		setConstString(offset + 95, $detail_UserMaster2, value);
	}


	/**
	 *  明細ユーザマスタ3.<p>
	 *
	 */
	public String detail_UserMaster3() {
		return getConstString(offset + 96, $detail_UserMaster3);
	}

	/**
	 *  明細ユーザマスタ3.<p>
	 *
	 */
	public void detail_UserMaster3(String value) {
		setConstString(offset + 96, $detail_UserMaster3, value);
	}


	/**
	 *  明細ユーザマスタ4.<p>
	 *
	 */
	public String detail_UserMaster4() {
		return getConstString(offset + 97, $detail_UserMaster4);
	}

	/**
	 *  明細ユーザマスタ4.<p>
	 *
	 */
	public void detail_UserMaster4(String value) {
		setConstString(offset + 97, $detail_UserMaster4, value);
	}


	/**
	 *  明細ユーザマスタ5.<p>
	 *
	 */
	public String detail_UserMaster5() {
		return getConstString(offset + 98, $detail_UserMaster5);
	}

	/**
	 *  明細ユーザマスタ5.<p>
	 *
	 */
	public void detail_UserMaster5(String value) {
		setConstString(offset + 98, $detail_UserMaster5, value);
	}


	/**
	 *  明細ユーザコード.<p>
	 *
	 */
	public String detail_UserCode() {
		return getConstString(offset + 99, $detail_UserCode);
	}

	/**
	 *  明細ユーザコード.<p>
	 *
	 */
	public void detail_UserCode(String value) {
		setConstString(offset + 99, $detail_UserCode, value);
	}


	/**
	 *  明細ユーザテキスト.<p>
	 *
	 */
	public String detail_UserText() {
		return getConstString(offset + 100, $detail_UserText);
	}

	/**
	 *  明細ユーザテキスト.<p>
	 *
	 */
	public void detail_UserText(String value) {
		setConstString(offset + 100, $detail_UserText, value);
	}


	/**
	 *  明細ユーザ日付.<p>
	 *
	 */
	public String detail_UserDate() {
		return getConstString(offset + 101, $detail_UserDate);
	}

	/**
	 *  明細ユーザ日付.<p>
	 *
	 */
	public void detail_UserDate(String value) {
		setConstString(offset + 101, $detail_UserDate, value);
	}


	/**
	 *  明細ユーザ数量.<p>
	 *
	 */
	public MCNumber detail_UserQty() {
		return getConstNumber(offset + 102, $detail_UserQty);
	}

	/**
	 *  明細ユーザ数量.<p>
	 *
	 */
	public void detail_UserQty(MCNumber value) {
		setConstNumber(offset + 102, $detail_UserQty, value);
	}

	/**
	 *  明細ユーザ数量.<p>
	 *
	 */
	public void detail_UserQty(int value) {
		setConstNumber(offset + 102, $detail_UserQty, value);
	}

	/**
	 *  明細ユーザ数量.<p>
	 *
	 */
	public void detail_UserQty(long value) {
		setConstNumber(offset + 102, $detail_UserQty, value);
	}

	/**
	 *  明細ユーザ数量.<p>
	 *
	 */
	public void detail_UserQty(float value) {
		setConstNumber(offset + 102, $detail_UserQty, value);
	}

	/**
	 *  明細ユーザ数量.<p>
	 *
	 */
	public void detail_UserQty(double value) {
		setConstNumber(offset + 102, $detail_UserQty, value);
	}


	/**
	 *  明細フレックスマスタ.<p>
	 *
	 */
	public String detail_FlexMaster() {
		return getConstString(offset + 103, $detail_FlexMaster);
	}

	/**
	 *  明細フレックスマスタ.<p>
	 *
	 */
	public void detail_FlexMaster(String value) {
		setConstString(offset + 103, $detail_FlexMaster, value);
	}


	/**
	 *  明細フレックスコード.<p>
	 *
	 */
	public String detail_FlexCode() {
		return getConstString(offset + 104, $detail_FlexCode);
	}

	/**
	 *  明細フレックスコード.<p>
	 *
	 */
	public void detail_FlexCode(String value) {
		setConstString(offset + 104, $detail_FlexCode, value);
	}


	/**
	 *  明細フレックステキスト1.<p>
	 *
	 */
	public String detail_FlexText1() {
		return getConstString(offset + 105, $detail_FlexText1);
	}

	/**
	 *  明細フレックステキスト1.<p>
	 *
	 */
	public void detail_FlexText1(String value) {
		setConstString(offset + 105, $detail_FlexText1, value);
	}


	/**
	 *  明細フレックステキスト2.<p>
	 *
	 */
	public String detail_FlexText2() {
		return getConstString(offset + 106, $detail_FlexText2);
	}

	/**
	 *  明細フレックステキスト2.<p>
	 *
	 */
	public void detail_FlexText2(String value) {
		setConstString(offset + 106, $detail_FlexText2, value);
	}


	/**
	 *  明細フレックス日付.<p>
	 *
	 */
	public String detail_FlexDate() {
		return getConstString(offset + 107, $detail_FlexDate);
	}

	/**
	 *  明細フレックス日付.<p>
	 *
	 */
	public void detail_FlexDate(String value) {
		setConstString(offset + 107, $detail_FlexDate, value);
	}


	/**
	 *  明細摘要コード.<p>
	 *
	 */
	public String sub_Descript_Code() {
		return getConstString(offset + 108, $sub_Descript_Code);
	}

	/**
	 *  明細摘要コード.<p>
	 *
	 */
	public void sub_Descript_Code(String value) {
		setConstString(offset + 108, $sub_Descript_Code, value);
	}


	/**
	 *  明細摘要内容.<p>
	 *
	 */
	public String sub_Descript_Name() {
		return getConstString(offset + 109, $sub_Descript_Name);
	}

	/**
	 *  明細摘要内容.<p>
	 *
	 */
	public void sub_Descript_Name(String value) {
		setConstString(offset + 109, $sub_Descript_Name, value);
	}


	/**
	 *  明細ユーザマスタ1.<p>
	 *
	 */
	public String sub_UserMaster1() {
		return getConstString(offset + 110, $sub_UserMaster1);
	}

	/**
	 *  明細ユーザマスタ1.<p>
	 *
	 */
	public void sub_UserMaster1(String value) {
		setConstString(offset + 110, $sub_UserMaster1, value);
	}


	/**
	 *  明細ユーザマスタ2.<p>
	 *
	 */
	public String sub_UserMaster2() {
		return getConstString(offset + 111, $sub_UserMaster2);
	}

	/**
	 *  明細ユーザマスタ2.<p>
	 *
	 */
	public void sub_UserMaster2(String value) {
		setConstString(offset + 111, $sub_UserMaster2, value);
	}


	/**
	 *  明細ユーザマスタ3.<p>
	 *
	 */
	public String sub_UserMaster3() {
		return getConstString(offset + 112, $sub_UserMaster3);
	}

	/**
	 *  明細ユーザマスタ3.<p>
	 *
	 */
	public void sub_UserMaster3(String value) {
		setConstString(offset + 112, $sub_UserMaster3, value);
	}


	/**
	 *  明細ユーザマスタ4.<p>
	 *
	 */
	public String sub_UserMaster4() {
		return getConstString(offset + 113, $sub_UserMaster4);
	}

	/**
	 *  明細ユーザマスタ4.<p>
	 *
	 */
	public void sub_UserMaster4(String value) {
		setConstString(offset + 113, $sub_UserMaster4, value);
	}


	/**
	 *  明細ユーザマスタ5.<p>
	 *
	 */
	public String sub_UserMaster5() {
		return getConstString(offset + 114, $sub_UserMaster5);
	}

	/**
	 *  明細ユーザマスタ5.<p>
	 *
	 */
	public void sub_UserMaster5(String value) {
		setConstString(offset + 114, $sub_UserMaster5, value);
	}


	/**
	 *  明細ユーザコード.<p>
	 *
	 */
	public String sub_UserCode() {
		return getConstString(offset + 115, $sub_UserCode);
	}

	/**
	 *  明細ユーザコード.<p>
	 *
	 */
	public void sub_UserCode(String value) {
		setConstString(offset + 115, $sub_UserCode, value);
	}


	/**
	 *  明細ユーザテキスト.<p>
	 *
	 */
	public String sub_UserText() {
		return getConstString(offset + 116, $sub_UserText);
	}

	/**
	 *  明細ユーザテキスト.<p>
	 *
	 */
	public void sub_UserText(String value) {
		setConstString(offset + 116, $sub_UserText, value);
	}


	/**
	 *  明細ユーザ日付.<p>
	 *
	 */
	public String sub_UserDate() {
		return getConstString(offset + 117, $sub_UserDate);
	}

	/**
	 *  明細ユーザ日付.<p>
	 *
	 */
	public void sub_UserDate(String value) {
		setConstString(offset + 117, $sub_UserDate, value);
	}


	/**
	 *  明細ユーザ数量.<p>
	 *
	 */
	public MCNumber sub_UserQty() {
		return getConstNumber(offset + 118, $sub_UserQty);
	}

	/**
	 *  明細ユーザ数量.<p>
	 *
	 */
	public void sub_UserQty(MCNumber value) {
		setConstNumber(offset + 118, $sub_UserQty, value);
	}

	/**
	 *  明細ユーザ数量.<p>
	 *
	 */
	public void sub_UserQty(int value) {
		setConstNumber(offset + 118, $sub_UserQty, value);
	}

	/**
	 *  明細ユーザ数量.<p>
	 *
	 */
	public void sub_UserQty(long value) {
		setConstNumber(offset + 118, $sub_UserQty, value);
	}

	/**
	 *  明細ユーザ数量.<p>
	 *
	 */
	public void sub_UserQty(float value) {
		setConstNumber(offset + 118, $sub_UserQty, value);
	}

	/**
	 *  明細ユーザ数量.<p>
	 *
	 */
	public void sub_UserQty(double value) {
		setConstNumber(offset + 118, $sub_UserQty, value);
	}


	/**
	 *  特値コード.<p>
	 *
	 */
	public String spriceCode() {
		return getConstString(offset + 119, $spriceCode);
	}

	/**
	 *  特値コード.<p>
	 *
	 */
	public void spriceCode(String value) {
		setConstString(offset + 119, $spriceCode, value);
	}


	/**
	 *  特値枝番.<p>
	 *
	 */
	public MCNumber spriceIndex() {
		return getConstNumber(offset + 120, $spriceIndex);
	}

	/**
	 *  特値枝番.<p>
	 *
	 */
	public void spriceIndex(MCNumber value) {
		setConstNumber(offset + 120, $spriceIndex, value);
	}

	/**
	 *  特値枝番.<p>
	 *
	 */
	public void spriceIndex(int value) {
		setConstNumber(offset + 120, $spriceIndex, value);
	}

	/**
	 *  特値枝番.<p>
	 *
	 */
	public void spriceIndex(long value) {
		setConstNumber(offset + 120, $spriceIndex, value);
	}

	/**
	 *  特値枝番.<p>
	 *
	 */
	public void spriceIndex(float value) {
		setConstNumber(offset + 120, $spriceIndex, value);
	}

	/**
	 *  特値枝番.<p>
	 *
	 */
	public void spriceIndex(double value) {
		setConstNumber(offset + 120, $spriceIndex, value);
	}


	public String getString(String name) {
		if ($inpDate.equalsIgnoreCase(name)) {
			return inpDate();
		}
		if ($voucherNo.equalsIgnoreCase(name)) {
			return voucherNo();
		}
		if ($customerNo.equalsIgnoreCase(name)) {
			return customerNo();
		}
		if ($succeedVoucherNo.equalsIgnoreCase(name)) {
			return succeedVoucherNo();
		}
		if ($customerCode.equalsIgnoreCase(name)) {
			return customerCode();
		}
		if ($delivToCode.equalsIgnoreCase(name)) {
			return delivToCode();
		}
		if ($deptCode.equalsIgnoreCase(name)) {
			return deptCode();
		}
		if ($inchargeCode.equalsIgnoreCase(name)) {
			return inchargeCode();
		}
		if ($ar_PatternCode.equalsIgnoreCase(name)) {
			return ar_PatternCode();
		}
		if ($currencyCode.equalsIgnoreCase(name)) {
			return currencyCode();
		}
		if ($rateTypeCode.equalsIgnoreCase(name)) {
			return rateTypeCode();
		}
		if ($taxableCode.equalsIgnoreCase(name)) {
			return taxableCode();
		}
		if ($header_DescriptCode.equalsIgnoreCase(name)) {
			return header_DescriptCode();
		}
		if ($header_DescriptName.equalsIgnoreCase(name)) {
			return header_DescriptName();
		}
		if ($postpadColor.equalsIgnoreCase(name)) {
			return postpadColor();
		}
		if ($postpadText.equalsIgnoreCase(name)) {
			return postpadText();
		}
		if ($settleMethod.equalsIgnoreCase(name)) {
			return settleMethod();
		}
		if ($bankAcct_Own.equalsIgnoreCase(name)) {
			return bankAcct_Own();
		}
		if ($paymentTerms.equalsIgnoreCase(name)) {
			return paymentTerms();
		}
		if ($dueDate.equalsIgnoreCase(name)) {
			return dueDate();
		}
		if ($fileName.equalsIgnoreCase(name)) {
			return fileName();
		}
		if ($header_UserMaster.equalsIgnoreCase(name)) {
			return header_UserMaster();
		}
		if ($header_UserText.equalsIgnoreCase(name)) {
			return header_UserText();
		}
		if ($header_FlexMaster1.equalsIgnoreCase(name)) {
			return header_FlexMaster1();
		}
		if ($header_FlexMaster2.equalsIgnoreCase(name)) {
			return header_FlexMaster2();
		}
		if ($header_FlexCode1.equalsIgnoreCase(name)) {
			return header_FlexCode1();
		}
		if ($header_FlexCode2.equalsIgnoreCase(name)) {
			return header_FlexCode2();
		}
		if ($header_FlexText1.equalsIgnoreCase(name)) {
			return header_FlexText1();
		}
		if ($header_FlexText2.equalsIgnoreCase(name)) {
			return header_FlexText2();
		}
		if ($header_FlexText3.equalsIgnoreCase(name)) {
			return header_FlexText3();
		}
		if ($header_FlexText4.equalsIgnoreCase(name)) {
			return header_FlexText4();
		}
		if ($header_FlexText5.equalsIgnoreCase(name)) {
			return header_FlexText5();
		}
		if ($header_FlexDate.equalsIgnoreCase(name)) {
			return header_FlexDate();
		}
		if ($remarks1.equalsIgnoreCase(name)) {
			return remarks1();
		}
		if ($remarks2.equalsIgnoreCase(name)) {
			return remarks2();
		}
		if ($remarks3.equalsIgnoreCase(name)) {
			return remarks3();
		}
		if ($remarks4.equalsIgnoreCase(name)) {
			return remarks4();
		}
		if ($remarks5.equalsIgnoreCase(name)) {
			return remarks5();
		}
		if ($remarks6.equalsIgnoreCase(name)) {
			return remarks6();
		}
		if ($remarks7.equalsIgnoreCase(name)) {
			return remarks7();
		}
		if ($remarks8.equalsIgnoreCase(name)) {
			return remarks8();
		}
		if ($remarks9.equalsIgnoreCase(name)) {
			return remarks9();
		}
		if ($remarks10.equalsIgnoreCase(name)) {
			return remarks10();
		}
		if ($remarks11.equalsIgnoreCase(name)) {
			return remarks11();
		}
		if ($remarks12.equalsIgnoreCase(name)) {
			return remarks12();
		}
		if ($remarks13.equalsIgnoreCase(name)) {
			return remarks13();
		}
		if ($remarks14.equalsIgnoreCase(name)) {
			return remarks14();
		}
		if ($remarks15.equalsIgnoreCase(name)) {
			return remarks15();
		}
		if ($remarks16.equalsIgnoreCase(name)) {
			return remarks16();
		}
		if ($remarks17.equalsIgnoreCase(name)) {
			return remarks17();
		}
		if ($remarks18.equalsIgnoreCase(name)) {
			return remarks18();
		}
		if ($remarks19.equalsIgnoreCase(name)) {
			return remarks19();
		}
		if ($remarks20.equalsIgnoreCase(name)) {
			return remarks20();
		}
		if ($remarks21.equalsIgnoreCase(name)) {
			return remarks21();
		}
		if ($remarks22.equalsIgnoreCase(name)) {
			return remarks22();
		}
		if ($remarks23.equalsIgnoreCase(name)) {
			return remarks23();
		}
		if ($remarks24.equalsIgnoreCase(name)) {
			return remarks24();
		}
		if ($remarks25.equalsIgnoreCase(name)) {
			return remarks25();
		}
		if ($remarks26.equalsIgnoreCase(name)) {
			return remarks26();
		}
		if ($remarks27.equalsIgnoreCase(name)) {
			return remarks27();
		}
		if ($remarks28.equalsIgnoreCase(name)) {
			return remarks28();
		}
		if ($remarks29.equalsIgnoreCase(name)) {
			return remarks29();
		}
		if ($remarks30.equalsIgnoreCase(name)) {
			return remarks30();
		}
		if ($detail_DeptCode.equalsIgnoreCase(name)) {
			return detail_DeptCode();
		}
		if ($warehouse.equalsIgnoreCase(name)) {
			return warehouse();
		}
		if ($locationCode.equalsIgnoreCase(name)) {
			return locationCode();
		}
		if ($goodsGroup.equalsIgnoreCase(name)) {
			return goodsGroup();
		}
		if ($goodsCode.equalsIgnoreCase(name)) {
			return goodsCode();
		}
		if ($chargesCode.equalsIgnoreCase(name)) {
			return chargesCode();
		}
		if ($corresp_Goods.equalsIgnoreCase(name)) {
			return corresp_Goods();
		}
		if ($detail_TaxableCode.equalsIgnoreCase(name)) {
			return detail_TaxableCode();
		}
		if ($packingUnitCode.equalsIgnoreCase(name)) {
			return packingUnitCode();
		}
		if ($preshippingDate.equalsIgnoreCase(name)) {
			return preshippingDate();
		}
		if ($delivDate.equalsIgnoreCase(name)) {
			return delivDate();
		}
		if ($detail_Descript_Code.equalsIgnoreCase(name)) {
			return detail_Descript_Code();
		}
		if ($detail_Descript_Name.equalsIgnoreCase(name)) {
			return detail_Descript_Name();
		}
		if ($detail_UserMaster1.equalsIgnoreCase(name)) {
			return detail_UserMaster1();
		}
		if ($detail_UserMaster2.equalsIgnoreCase(name)) {
			return detail_UserMaster2();
		}
		if ($detail_UserMaster3.equalsIgnoreCase(name)) {
			return detail_UserMaster3();
		}
		if ($detail_UserMaster4.equalsIgnoreCase(name)) {
			return detail_UserMaster4();
		}
		if ($detail_UserMaster5.equalsIgnoreCase(name)) {
			return detail_UserMaster5();
		}
		if ($detail_UserCode.equalsIgnoreCase(name)) {
			return detail_UserCode();
		}
		if ($detail_UserText.equalsIgnoreCase(name)) {
			return detail_UserText();
		}
		if ($detail_UserDate.equalsIgnoreCase(name)) {
			return detail_UserDate();
		}
		if ($detail_FlexMaster.equalsIgnoreCase(name)) {
			return detail_FlexMaster();
		}
		if ($detail_FlexCode.equalsIgnoreCase(name)) {
			return detail_FlexCode();
		}
		if ($detail_FlexText1.equalsIgnoreCase(name)) {
			return detail_FlexText1();
		}
		if ($detail_FlexText2.equalsIgnoreCase(name)) {
			return detail_FlexText2();
		}
		if ($detail_FlexDate.equalsIgnoreCase(name)) {
			return detail_FlexDate();
		}
		if ($sub_Descript_Code.equalsIgnoreCase(name)) {
			return sub_Descript_Code();
		}
		if ($sub_Descript_Name.equalsIgnoreCase(name)) {
			return sub_Descript_Name();
		}
		if ($sub_UserMaster1.equalsIgnoreCase(name)) {
			return sub_UserMaster1();
		}
		if ($sub_UserMaster2.equalsIgnoreCase(name)) {
			return sub_UserMaster2();
		}
		if ($sub_UserMaster3.equalsIgnoreCase(name)) {
			return sub_UserMaster3();
		}
		if ($sub_UserMaster4.equalsIgnoreCase(name)) {
			return sub_UserMaster4();
		}
		if ($sub_UserMaster5.equalsIgnoreCase(name)) {
			return sub_UserMaster5();
		}
		if ($sub_UserCode.equalsIgnoreCase(name)) {
			return sub_UserCode();
		}
		if ($sub_UserText.equalsIgnoreCase(name)) {
			return sub_UserText();
		}
		if ($sub_UserDate.equalsIgnoreCase(name)) {
			return sub_UserDate();
		}
		if ($spriceCode.equalsIgnoreCase(name)) {
			return spriceCode();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($correspType.equalsIgnoreCase(name)) {
			return correspType();
		}
		if ($rate.equalsIgnoreCase(name)) {
			return rate();
		}
		if ($forCondition.equalsIgnoreCase(name)) {
			return forCondition();
		}
		if ($taxType.equalsIgnoreCase(name)) {
			return taxType();
		}
		if ($rowNo.equalsIgnoreCase(name)) {
			return rowNo();
		}
		if ($detailType.equalsIgnoreCase(name)) {
			return detailType();
		}
		if ($unitType.equalsIgnoreCase(name)) {
			return unitType();
		}
		if ($detail_TaxType.equalsIgnoreCase(name)) {
			return detail_TaxType();
		}
		if ($unitPrice.equalsIgnoreCase(name)) {
			return unitPrice();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($inpAmount_Fc.equalsIgnoreCase(name)) {
			return inpAmount_Fc();
		}
		if ($taxAmount_Fc.equalsIgnoreCase(name)) {
			return taxAmount_Fc();
		}
		if ($taxableAmount_Fc.equalsIgnoreCase(name)) {
			return taxableAmount_Fc();
		}
		if ($inpAmount_Sc.equalsIgnoreCase(name)) {
			return inpAmount_Sc();
		}
		if ($taxAmount_Sc.equalsIgnoreCase(name)) {
			return taxAmount_Sc();
		}
		if ($taxableAmount_Sc.equalsIgnoreCase(name)) {
			return taxableAmount_Sc();
		}
		if ($packingUnitPrice.equalsIgnoreCase(name)) {
			return packingUnitPrice();
		}
		if ($packingUnitQty.equalsIgnoreCase(name)) {
			return packingUnitQty();
		}
		if ($detail_UserQty.equalsIgnoreCase(name)) {
			return detail_UserQty();
		}
		if ($sub_UserQty.equalsIgnoreCase(name)) {
			return sub_UserQty();
		}
		if ($spriceIndex.equalsIgnoreCase(name)) {
			return spriceIndex();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($inpDate.equalsIgnoreCase(name)) {
			return inpDate();
		}
		if ($voucherNo.equalsIgnoreCase(name)) {
			return voucherNo();
		}
		if ($customerNo.equalsIgnoreCase(name)) {
			return customerNo();
		}
		if ($succeedVoucherNo.equalsIgnoreCase(name)) {
			return succeedVoucherNo();
		}
		if ($customerCode.equalsIgnoreCase(name)) {
			return customerCode();
		}
		if ($delivToCode.equalsIgnoreCase(name)) {
			return delivToCode();
		}
		if ($deptCode.equalsIgnoreCase(name)) {
			return deptCode();
		}
		if ($inchargeCode.equalsIgnoreCase(name)) {
			return inchargeCode();
		}
		if ($ar_PatternCode.equalsIgnoreCase(name)) {
			return ar_PatternCode();
		}
		if ($currencyCode.equalsIgnoreCase(name)) {
			return currencyCode();
		}
		if ($rateTypeCode.equalsIgnoreCase(name)) {
			return rateTypeCode();
		}
		if ($taxableCode.equalsIgnoreCase(name)) {
			return taxableCode();
		}
		if ($header_DescriptCode.equalsIgnoreCase(name)) {
			return header_DescriptCode();
		}
		if ($header_DescriptName.equalsIgnoreCase(name)) {
			return header_DescriptName();
		}
		if ($postpadColor.equalsIgnoreCase(name)) {
			return postpadColor();
		}
		if ($postpadText.equalsIgnoreCase(name)) {
			return postpadText();
		}
		if ($settleMethod.equalsIgnoreCase(name)) {
			return settleMethod();
		}
		if ($bankAcct_Own.equalsIgnoreCase(name)) {
			return bankAcct_Own();
		}
		if ($paymentTerms.equalsIgnoreCase(name)) {
			return paymentTerms();
		}
		if ($dueDate.equalsIgnoreCase(name)) {
			return dueDate();
		}
		if ($fileName.equalsIgnoreCase(name)) {
			return fileName();
		}
		if ($header_UserMaster.equalsIgnoreCase(name)) {
			return header_UserMaster();
		}
		if ($header_UserText.equalsIgnoreCase(name)) {
			return header_UserText();
		}
		if ($header_FlexMaster1.equalsIgnoreCase(name)) {
			return header_FlexMaster1();
		}
		if ($header_FlexMaster2.equalsIgnoreCase(name)) {
			return header_FlexMaster2();
		}
		if ($header_FlexCode1.equalsIgnoreCase(name)) {
			return header_FlexCode1();
		}
		if ($header_FlexCode2.equalsIgnoreCase(name)) {
			return header_FlexCode2();
		}
		if ($header_FlexText1.equalsIgnoreCase(name)) {
			return header_FlexText1();
		}
		if ($header_FlexText2.equalsIgnoreCase(name)) {
			return header_FlexText2();
		}
		if ($header_FlexText3.equalsIgnoreCase(name)) {
			return header_FlexText3();
		}
		if ($header_FlexText4.equalsIgnoreCase(name)) {
			return header_FlexText4();
		}
		if ($header_FlexText5.equalsIgnoreCase(name)) {
			return header_FlexText5();
		}
		if ($header_FlexDate.equalsIgnoreCase(name)) {
			return header_FlexDate();
		}
		if ($remarks1.equalsIgnoreCase(name)) {
			return remarks1();
		}
		if ($remarks2.equalsIgnoreCase(name)) {
			return remarks2();
		}
		if ($remarks3.equalsIgnoreCase(name)) {
			return remarks3();
		}
		if ($remarks4.equalsIgnoreCase(name)) {
			return remarks4();
		}
		if ($remarks5.equalsIgnoreCase(name)) {
			return remarks5();
		}
		if ($remarks6.equalsIgnoreCase(name)) {
			return remarks6();
		}
		if ($remarks7.equalsIgnoreCase(name)) {
			return remarks7();
		}
		if ($remarks8.equalsIgnoreCase(name)) {
			return remarks8();
		}
		if ($remarks9.equalsIgnoreCase(name)) {
			return remarks9();
		}
		if ($remarks10.equalsIgnoreCase(name)) {
			return remarks10();
		}
		if ($remarks11.equalsIgnoreCase(name)) {
			return remarks11();
		}
		if ($remarks12.equalsIgnoreCase(name)) {
			return remarks12();
		}
		if ($remarks13.equalsIgnoreCase(name)) {
			return remarks13();
		}
		if ($remarks14.equalsIgnoreCase(name)) {
			return remarks14();
		}
		if ($remarks15.equalsIgnoreCase(name)) {
			return remarks15();
		}
		if ($remarks16.equalsIgnoreCase(name)) {
			return remarks16();
		}
		if ($remarks17.equalsIgnoreCase(name)) {
			return remarks17();
		}
		if ($remarks18.equalsIgnoreCase(name)) {
			return remarks18();
		}
		if ($remarks19.equalsIgnoreCase(name)) {
			return remarks19();
		}
		if ($remarks20.equalsIgnoreCase(name)) {
			return remarks20();
		}
		if ($remarks21.equalsIgnoreCase(name)) {
			return remarks21();
		}
		if ($remarks22.equalsIgnoreCase(name)) {
			return remarks22();
		}
		if ($remarks23.equalsIgnoreCase(name)) {
			return remarks23();
		}
		if ($remarks24.equalsIgnoreCase(name)) {
			return remarks24();
		}
		if ($remarks25.equalsIgnoreCase(name)) {
			return remarks25();
		}
		if ($remarks26.equalsIgnoreCase(name)) {
			return remarks26();
		}
		if ($remarks27.equalsIgnoreCase(name)) {
			return remarks27();
		}
		if ($remarks28.equalsIgnoreCase(name)) {
			return remarks28();
		}
		if ($remarks29.equalsIgnoreCase(name)) {
			return remarks29();
		}
		if ($remarks30.equalsIgnoreCase(name)) {
			return remarks30();
		}
		if ($detail_DeptCode.equalsIgnoreCase(name)) {
			return detail_DeptCode();
		}
		if ($warehouse.equalsIgnoreCase(name)) {
			return warehouse();
		}
		if ($locationCode.equalsIgnoreCase(name)) {
			return locationCode();
		}
		if ($goodsGroup.equalsIgnoreCase(name)) {
			return goodsGroup();
		}
		if ($goodsCode.equalsIgnoreCase(name)) {
			return goodsCode();
		}
		if ($chargesCode.equalsIgnoreCase(name)) {
			return chargesCode();
		}
		if ($corresp_Goods.equalsIgnoreCase(name)) {
			return corresp_Goods();
		}
		if ($detail_TaxableCode.equalsIgnoreCase(name)) {
			return detail_TaxableCode();
		}
		if ($packingUnitCode.equalsIgnoreCase(name)) {
			return packingUnitCode();
		}
		if ($preshippingDate.equalsIgnoreCase(name)) {
			return preshippingDate();
		}
		if ($delivDate.equalsIgnoreCase(name)) {
			return delivDate();
		}
		if ($detail_Descript_Code.equalsIgnoreCase(name)) {
			return detail_Descript_Code();
		}
		if ($detail_Descript_Name.equalsIgnoreCase(name)) {
			return detail_Descript_Name();
		}
		if ($detail_UserMaster1.equalsIgnoreCase(name)) {
			return detail_UserMaster1();
		}
		if ($detail_UserMaster2.equalsIgnoreCase(name)) {
			return detail_UserMaster2();
		}
		if ($detail_UserMaster3.equalsIgnoreCase(name)) {
			return detail_UserMaster3();
		}
		if ($detail_UserMaster4.equalsIgnoreCase(name)) {
			return detail_UserMaster4();
		}
		if ($detail_UserMaster5.equalsIgnoreCase(name)) {
			return detail_UserMaster5();
		}
		if ($detail_UserCode.equalsIgnoreCase(name)) {
			return detail_UserCode();
		}
		if ($detail_UserText.equalsIgnoreCase(name)) {
			return detail_UserText();
		}
		if ($detail_UserDate.equalsIgnoreCase(name)) {
			return detail_UserDate();
		}
		if ($detail_FlexMaster.equalsIgnoreCase(name)) {
			return detail_FlexMaster();
		}
		if ($detail_FlexCode.equalsIgnoreCase(name)) {
			return detail_FlexCode();
		}
		if ($detail_FlexText1.equalsIgnoreCase(name)) {
			return detail_FlexText1();
		}
		if ($detail_FlexText2.equalsIgnoreCase(name)) {
			return detail_FlexText2();
		}
		if ($detail_FlexDate.equalsIgnoreCase(name)) {
			return detail_FlexDate();
		}
		if ($sub_Descript_Code.equalsIgnoreCase(name)) {
			return sub_Descript_Code();
		}
		if ($sub_Descript_Name.equalsIgnoreCase(name)) {
			return sub_Descript_Name();
		}
		if ($sub_UserMaster1.equalsIgnoreCase(name)) {
			return sub_UserMaster1();
		}
		if ($sub_UserMaster2.equalsIgnoreCase(name)) {
			return sub_UserMaster2();
		}
		if ($sub_UserMaster3.equalsIgnoreCase(name)) {
			return sub_UserMaster3();
		}
		if ($sub_UserMaster4.equalsIgnoreCase(name)) {
			return sub_UserMaster4();
		}
		if ($sub_UserMaster5.equalsIgnoreCase(name)) {
			return sub_UserMaster5();
		}
		if ($sub_UserCode.equalsIgnoreCase(name)) {
			return sub_UserCode();
		}
		if ($sub_UserText.equalsIgnoreCase(name)) {
			return sub_UserText();
		}
		if ($sub_UserDate.equalsIgnoreCase(name)) {
			return sub_UserDate();
		}
		if ($spriceCode.equalsIgnoreCase(name)) {
			return spriceCode();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($correspType.equalsIgnoreCase(name)) {
			return correspType();
		}
		if ($rate.equalsIgnoreCase(name)) {
			return rate();
		}
		if ($forCondition.equalsIgnoreCase(name)) {
			return forCondition();
		}
		if ($taxType.equalsIgnoreCase(name)) {
			return taxType();
		}
		if ($rowNo.equalsIgnoreCase(name)) {
			return rowNo();
		}
		if ($detailType.equalsIgnoreCase(name)) {
			return detailType();
		}
		if ($unitType.equalsIgnoreCase(name)) {
			return unitType();
		}
		if ($detail_TaxType.equalsIgnoreCase(name)) {
			return detail_TaxType();
		}
		if ($unitPrice.equalsIgnoreCase(name)) {
			return unitPrice();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($inpAmount_Fc.equalsIgnoreCase(name)) {
			return inpAmount_Fc();
		}
		if ($taxAmount_Fc.equalsIgnoreCase(name)) {
			return taxAmount_Fc();
		}
		if ($taxableAmount_Fc.equalsIgnoreCase(name)) {
			return taxableAmount_Fc();
		}
		if ($inpAmount_Sc.equalsIgnoreCase(name)) {
			return inpAmount_Sc();
		}
		if ($taxAmount_Sc.equalsIgnoreCase(name)) {
			return taxAmount_Sc();
		}
		if ($taxableAmount_Sc.equalsIgnoreCase(name)) {
			return taxableAmount_Sc();
		}
		if ($packingUnitPrice.equalsIgnoreCase(name)) {
			return packingUnitPrice();
		}
		if ($packingUnitQty.equalsIgnoreCase(name)) {
			return packingUnitQty();
		}
		if ($detail_UserQty.equalsIgnoreCase(name)) {
			return detail_UserQty();
		}
		if ($sub_UserQty.equalsIgnoreCase(name)) {
			return sub_UserQty();
		}
		if ($spriceIndex.equalsIgnoreCase(name)) {
			return spriceIndex();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($inpDate.equalsIgnoreCase(name)) {
			inpDate(value);
			return;
		}
		if ($voucherNo.equalsIgnoreCase(name)) {
			voucherNo(value);
			return;
		}
		if ($customerNo.equalsIgnoreCase(name)) {
			customerNo(value);
			return;
		}
		if ($succeedVoucherNo.equalsIgnoreCase(name)) {
			succeedVoucherNo(value);
			return;
		}
		if ($customerCode.equalsIgnoreCase(name)) {
			customerCode(value);
			return;
		}
		if ($delivToCode.equalsIgnoreCase(name)) {
			delivToCode(value);
			return;
		}
		if ($deptCode.equalsIgnoreCase(name)) {
			deptCode(value);
			return;
		}
		if ($inchargeCode.equalsIgnoreCase(name)) {
			inchargeCode(value);
			return;
		}
		if ($ar_PatternCode.equalsIgnoreCase(name)) {
			ar_PatternCode(value);
			return;
		}
		if ($currencyCode.equalsIgnoreCase(name)) {
			currencyCode(value);
			return;
		}
		if ($rateTypeCode.equalsIgnoreCase(name)) {
			rateTypeCode(value);
			return;
		}
		if ($taxableCode.equalsIgnoreCase(name)) {
			taxableCode(value);
			return;
		}
		if ($header_DescriptCode.equalsIgnoreCase(name)) {
			header_DescriptCode(value);
			return;
		}
		if ($header_DescriptName.equalsIgnoreCase(name)) {
			header_DescriptName(value);
			return;
		}
		if ($postpadColor.equalsIgnoreCase(name)) {
			postpadColor(value);
			return;
		}
		if ($postpadText.equalsIgnoreCase(name)) {
			postpadText(value);
			return;
		}
		if ($settleMethod.equalsIgnoreCase(name)) {
			settleMethod(value);
			return;
		}
		if ($bankAcct_Own.equalsIgnoreCase(name)) {
			bankAcct_Own(value);
			return;
		}
		if ($paymentTerms.equalsIgnoreCase(name)) {
			paymentTerms(value);
			return;
		}
		if ($dueDate.equalsIgnoreCase(name)) {
			dueDate(value);
			return;
		}
		if ($fileName.equalsIgnoreCase(name)) {
			fileName(value);
			return;
		}
		if ($header_UserMaster.equalsIgnoreCase(name)) {
			header_UserMaster(value);
			return;
		}
		if ($header_UserText.equalsIgnoreCase(name)) {
			header_UserText(value);
			return;
		}
		if ($header_FlexMaster1.equalsIgnoreCase(name)) {
			header_FlexMaster1(value);
			return;
		}
		if ($header_FlexMaster2.equalsIgnoreCase(name)) {
			header_FlexMaster2(value);
			return;
		}
		if ($header_FlexCode1.equalsIgnoreCase(name)) {
			header_FlexCode1(value);
			return;
		}
		if ($header_FlexCode2.equalsIgnoreCase(name)) {
			header_FlexCode2(value);
			return;
		}
		if ($header_FlexText1.equalsIgnoreCase(name)) {
			header_FlexText1(value);
			return;
		}
		if ($header_FlexText2.equalsIgnoreCase(name)) {
			header_FlexText2(value);
			return;
		}
		if ($header_FlexText3.equalsIgnoreCase(name)) {
			header_FlexText3(value);
			return;
		}
		if ($header_FlexText4.equalsIgnoreCase(name)) {
			header_FlexText4(value);
			return;
		}
		if ($header_FlexText5.equalsIgnoreCase(name)) {
			header_FlexText5(value);
			return;
		}
		if ($header_FlexDate.equalsIgnoreCase(name)) {
			header_FlexDate(value);
			return;
		}
		if ($remarks1.equalsIgnoreCase(name)) {
			remarks1(value);
			return;
		}
		if ($remarks2.equalsIgnoreCase(name)) {
			remarks2(value);
			return;
		}
		if ($remarks3.equalsIgnoreCase(name)) {
			remarks3(value);
			return;
		}
		if ($remarks4.equalsIgnoreCase(name)) {
			remarks4(value);
			return;
		}
		if ($remarks5.equalsIgnoreCase(name)) {
			remarks5(value);
			return;
		}
		if ($remarks6.equalsIgnoreCase(name)) {
			remarks6(value);
			return;
		}
		if ($remarks7.equalsIgnoreCase(name)) {
			remarks7(value);
			return;
		}
		if ($remarks8.equalsIgnoreCase(name)) {
			remarks8(value);
			return;
		}
		if ($remarks9.equalsIgnoreCase(name)) {
			remarks9(value);
			return;
		}
		if ($remarks10.equalsIgnoreCase(name)) {
			remarks10(value);
			return;
		}
		if ($remarks11.equalsIgnoreCase(name)) {
			remarks11(value);
			return;
		}
		if ($remarks12.equalsIgnoreCase(name)) {
			remarks12(value);
			return;
		}
		if ($remarks13.equalsIgnoreCase(name)) {
			remarks13(value);
			return;
		}
		if ($remarks14.equalsIgnoreCase(name)) {
			remarks14(value);
			return;
		}
		if ($remarks15.equalsIgnoreCase(name)) {
			remarks15(value);
			return;
		}
		if ($remarks16.equalsIgnoreCase(name)) {
			remarks16(value);
			return;
		}
		if ($remarks17.equalsIgnoreCase(name)) {
			remarks17(value);
			return;
		}
		if ($remarks18.equalsIgnoreCase(name)) {
			remarks18(value);
			return;
		}
		if ($remarks19.equalsIgnoreCase(name)) {
			remarks19(value);
			return;
		}
		if ($remarks20.equalsIgnoreCase(name)) {
			remarks20(value);
			return;
		}
		if ($remarks21.equalsIgnoreCase(name)) {
			remarks21(value);
			return;
		}
		if ($remarks22.equalsIgnoreCase(name)) {
			remarks22(value);
			return;
		}
		if ($remarks23.equalsIgnoreCase(name)) {
			remarks23(value);
			return;
		}
		if ($remarks24.equalsIgnoreCase(name)) {
			remarks24(value);
			return;
		}
		if ($remarks25.equalsIgnoreCase(name)) {
			remarks25(value);
			return;
		}
		if ($remarks26.equalsIgnoreCase(name)) {
			remarks26(value);
			return;
		}
		if ($remarks27.equalsIgnoreCase(name)) {
			remarks27(value);
			return;
		}
		if ($remarks28.equalsIgnoreCase(name)) {
			remarks28(value);
			return;
		}
		if ($remarks29.equalsIgnoreCase(name)) {
			remarks29(value);
			return;
		}
		if ($remarks30.equalsIgnoreCase(name)) {
			remarks30(value);
			return;
		}
		if ($detail_DeptCode.equalsIgnoreCase(name)) {
			detail_DeptCode(value);
			return;
		}
		if ($warehouse.equalsIgnoreCase(name)) {
			warehouse(value);
			return;
		}
		if ($locationCode.equalsIgnoreCase(name)) {
			locationCode(value);
			return;
		}
		if ($goodsGroup.equalsIgnoreCase(name)) {
			goodsGroup(value);
			return;
		}
		if ($goodsCode.equalsIgnoreCase(name)) {
			goodsCode(value);
			return;
		}
		if ($chargesCode.equalsIgnoreCase(name)) {
			chargesCode(value);
			return;
		}
		if ($corresp_Goods.equalsIgnoreCase(name)) {
			corresp_Goods(value);
			return;
		}
		if ($detail_TaxableCode.equalsIgnoreCase(name)) {
			detail_TaxableCode(value);
			return;
		}
		if ($packingUnitCode.equalsIgnoreCase(name)) {
			packingUnitCode(value);
			return;
		}
		if ($preshippingDate.equalsIgnoreCase(name)) {
			preshippingDate(value);
			return;
		}
		if ($delivDate.equalsIgnoreCase(name)) {
			delivDate(value);
			return;
		}
		if ($detail_Descript_Code.equalsIgnoreCase(name)) {
			detail_Descript_Code(value);
			return;
		}
		if ($detail_Descript_Name.equalsIgnoreCase(name)) {
			detail_Descript_Name(value);
			return;
		}
		if ($detail_UserMaster1.equalsIgnoreCase(name)) {
			detail_UserMaster1(value);
			return;
		}
		if ($detail_UserMaster2.equalsIgnoreCase(name)) {
			detail_UserMaster2(value);
			return;
		}
		if ($detail_UserMaster3.equalsIgnoreCase(name)) {
			detail_UserMaster3(value);
			return;
		}
		if ($detail_UserMaster4.equalsIgnoreCase(name)) {
			detail_UserMaster4(value);
			return;
		}
		if ($detail_UserMaster5.equalsIgnoreCase(name)) {
			detail_UserMaster5(value);
			return;
		}
		if ($detail_UserCode.equalsIgnoreCase(name)) {
			detail_UserCode(value);
			return;
		}
		if ($detail_UserText.equalsIgnoreCase(name)) {
			detail_UserText(value);
			return;
		}
		if ($detail_UserDate.equalsIgnoreCase(name)) {
			detail_UserDate(value);
			return;
		}
		if ($detail_FlexMaster.equalsIgnoreCase(name)) {
			detail_FlexMaster(value);
			return;
		}
		if ($detail_FlexCode.equalsIgnoreCase(name)) {
			detail_FlexCode(value);
			return;
		}
		if ($detail_FlexText1.equalsIgnoreCase(name)) {
			detail_FlexText1(value);
			return;
		}
		if ($detail_FlexText2.equalsIgnoreCase(name)) {
			detail_FlexText2(value);
			return;
		}
		if ($detail_FlexDate.equalsIgnoreCase(name)) {
			detail_FlexDate(value);
			return;
		}
		if ($sub_Descript_Code.equalsIgnoreCase(name)) {
			sub_Descript_Code(value);
			return;
		}
		if ($sub_Descript_Name.equalsIgnoreCase(name)) {
			sub_Descript_Name(value);
			return;
		}
		if ($sub_UserMaster1.equalsIgnoreCase(name)) {
			sub_UserMaster1(value);
			return;
		}
		if ($sub_UserMaster2.equalsIgnoreCase(name)) {
			sub_UserMaster2(value);
			return;
		}
		if ($sub_UserMaster3.equalsIgnoreCase(name)) {
			sub_UserMaster3(value);
			return;
		}
		if ($sub_UserMaster4.equalsIgnoreCase(name)) {
			sub_UserMaster4(value);
			return;
		}
		if ($sub_UserMaster5.equalsIgnoreCase(name)) {
			sub_UserMaster5(value);
			return;
		}
		if ($sub_UserCode.equalsIgnoreCase(name)) {
			sub_UserCode(value);
			return;
		}
		if ($sub_UserText.equalsIgnoreCase(name)) {
			sub_UserText(value);
			return;
		}
		if ($sub_UserDate.equalsIgnoreCase(name)) {
			sub_UserDate(value);
			return;
		}
		if ($spriceCode.equalsIgnoreCase(name)) {
			spriceCode(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($correspType.equalsIgnoreCase(name)) {
			correspType(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($forCondition.equalsIgnoreCase(name)) {
			forCondition(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($rowNo.equalsIgnoreCase(name)) {
			rowNo(value);
			return;
		}
		if ($detailType.equalsIgnoreCase(name)) {
			detailType(value);
			return;
		}
		if ($unitType.equalsIgnoreCase(name)) {
			unitType(value);
			return;
		}
		if ($detail_TaxType.equalsIgnoreCase(name)) {
			detail_TaxType(value);
			return;
		}
		if ($unitPrice.equalsIgnoreCase(name)) {
			unitPrice(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inpAmount_Fc.equalsIgnoreCase(name)) {
			inpAmount_Fc(value);
			return;
		}
		if ($taxAmount_Fc.equalsIgnoreCase(name)) {
			taxAmount_Fc(value);
			return;
		}
		if ($taxableAmount_Fc.equalsIgnoreCase(name)) {
			taxableAmount_Fc(value);
			return;
		}
		if ($inpAmount_Sc.equalsIgnoreCase(name)) {
			inpAmount_Sc(value);
			return;
		}
		if ($taxAmount_Sc.equalsIgnoreCase(name)) {
			taxAmount_Sc(value);
			return;
		}
		if ($taxableAmount_Sc.equalsIgnoreCase(name)) {
			taxableAmount_Sc(value);
			return;
		}
		if ($packingUnitPrice.equalsIgnoreCase(name)) {
			packingUnitPrice(value);
			return;
		}
		if ($packingUnitQty.equalsIgnoreCase(name)) {
			packingUnitQty(value);
			return;
		}
		if ($detail_UserQty.equalsIgnoreCase(name)) {
			detail_UserQty(value);
			return;
		}
		if ($sub_UserQty.equalsIgnoreCase(name)) {
			sub_UserQty(value);
			return;
		}
		if ($spriceIndex.equalsIgnoreCase(name)) {
			spriceIndex(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($correspType.equalsIgnoreCase(name)) {
			correspType(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($forCondition.equalsIgnoreCase(name)) {
			forCondition(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($rowNo.equalsIgnoreCase(name)) {
			rowNo(value);
			return;
		}
		if ($detailType.equalsIgnoreCase(name)) {
			detailType(value);
			return;
		}
		if ($unitType.equalsIgnoreCase(name)) {
			unitType(value);
			return;
		}
		if ($detail_TaxType.equalsIgnoreCase(name)) {
			detail_TaxType(value);
			return;
		}
		if ($unitPrice.equalsIgnoreCase(name)) {
			unitPrice(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inpAmount_Fc.equalsIgnoreCase(name)) {
			inpAmount_Fc(value);
			return;
		}
		if ($taxAmount_Fc.equalsIgnoreCase(name)) {
			taxAmount_Fc(value);
			return;
		}
		if ($taxableAmount_Fc.equalsIgnoreCase(name)) {
			taxableAmount_Fc(value);
			return;
		}
		if ($inpAmount_Sc.equalsIgnoreCase(name)) {
			inpAmount_Sc(value);
			return;
		}
		if ($taxAmount_Sc.equalsIgnoreCase(name)) {
			taxAmount_Sc(value);
			return;
		}
		if ($taxableAmount_Sc.equalsIgnoreCase(name)) {
			taxableAmount_Sc(value);
			return;
		}
		if ($packingUnitPrice.equalsIgnoreCase(name)) {
			packingUnitPrice(value);
			return;
		}
		if ($packingUnitQty.equalsIgnoreCase(name)) {
			packingUnitQty(value);
			return;
		}
		if ($detail_UserQty.equalsIgnoreCase(name)) {
			detail_UserQty(value);
			return;
		}
		if ($sub_UserQty.equalsIgnoreCase(name)) {
			sub_UserQty(value);
			return;
		}
		if ($spriceIndex.equalsIgnoreCase(name)) {
			spriceIndex(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($correspType.equalsIgnoreCase(name)) {
			correspType(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($forCondition.equalsIgnoreCase(name)) {
			forCondition(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($rowNo.equalsIgnoreCase(name)) {
			rowNo(value);
			return;
		}
		if ($detailType.equalsIgnoreCase(name)) {
			detailType(value);
			return;
		}
		if ($unitType.equalsIgnoreCase(name)) {
			unitType(value);
			return;
		}
		if ($detail_TaxType.equalsIgnoreCase(name)) {
			detail_TaxType(value);
			return;
		}
		if ($unitPrice.equalsIgnoreCase(name)) {
			unitPrice(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inpAmount_Fc.equalsIgnoreCase(name)) {
			inpAmount_Fc(value);
			return;
		}
		if ($taxAmount_Fc.equalsIgnoreCase(name)) {
			taxAmount_Fc(value);
			return;
		}
		if ($taxableAmount_Fc.equalsIgnoreCase(name)) {
			taxableAmount_Fc(value);
			return;
		}
		if ($inpAmount_Sc.equalsIgnoreCase(name)) {
			inpAmount_Sc(value);
			return;
		}
		if ($taxAmount_Sc.equalsIgnoreCase(name)) {
			taxAmount_Sc(value);
			return;
		}
		if ($taxableAmount_Sc.equalsIgnoreCase(name)) {
			taxableAmount_Sc(value);
			return;
		}
		if ($packingUnitPrice.equalsIgnoreCase(name)) {
			packingUnitPrice(value);
			return;
		}
		if ($packingUnitQty.equalsIgnoreCase(name)) {
			packingUnitQty(value);
			return;
		}
		if ($detail_UserQty.equalsIgnoreCase(name)) {
			detail_UserQty(value);
			return;
		}
		if ($sub_UserQty.equalsIgnoreCase(name)) {
			sub_UserQty(value);
			return;
		}
		if ($spriceIndex.equalsIgnoreCase(name)) {
			spriceIndex(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($correspType.equalsIgnoreCase(name)) {
			correspType(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($forCondition.equalsIgnoreCase(name)) {
			forCondition(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($rowNo.equalsIgnoreCase(name)) {
			rowNo(value);
			return;
		}
		if ($detailType.equalsIgnoreCase(name)) {
			detailType(value);
			return;
		}
		if ($unitType.equalsIgnoreCase(name)) {
			unitType(value);
			return;
		}
		if ($detail_TaxType.equalsIgnoreCase(name)) {
			detail_TaxType(value);
			return;
		}
		if ($unitPrice.equalsIgnoreCase(name)) {
			unitPrice(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inpAmount_Fc.equalsIgnoreCase(name)) {
			inpAmount_Fc(value);
			return;
		}
		if ($taxAmount_Fc.equalsIgnoreCase(name)) {
			taxAmount_Fc(value);
			return;
		}
		if ($taxableAmount_Fc.equalsIgnoreCase(name)) {
			taxableAmount_Fc(value);
			return;
		}
		if ($inpAmount_Sc.equalsIgnoreCase(name)) {
			inpAmount_Sc(value);
			return;
		}
		if ($taxAmount_Sc.equalsIgnoreCase(name)) {
			taxAmount_Sc(value);
			return;
		}
		if ($taxableAmount_Sc.equalsIgnoreCase(name)) {
			taxableAmount_Sc(value);
			return;
		}
		if ($packingUnitPrice.equalsIgnoreCase(name)) {
			packingUnitPrice(value);
			return;
		}
		if ($packingUnitQty.equalsIgnoreCase(name)) {
			packingUnitQty(value);
			return;
		}
		if ($detail_UserQty.equalsIgnoreCase(name)) {
			detail_UserQty(value);
			return;
		}
		if ($sub_UserQty.equalsIgnoreCase(name)) {
			sub_UserQty(value);
			return;
		}
		if ($spriceIndex.equalsIgnoreCase(name)) {
			spriceIndex(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($correspType.equalsIgnoreCase(name)) {
			correspType(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($forCondition.equalsIgnoreCase(name)) {
			forCondition(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($rowNo.equalsIgnoreCase(name)) {
			rowNo(value);
			return;
		}
		if ($detailType.equalsIgnoreCase(name)) {
			detailType(value);
			return;
		}
		if ($unitType.equalsIgnoreCase(name)) {
			unitType(value);
			return;
		}
		if ($detail_TaxType.equalsIgnoreCase(name)) {
			detail_TaxType(value);
			return;
		}
		if ($unitPrice.equalsIgnoreCase(name)) {
			unitPrice(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inpAmount_Fc.equalsIgnoreCase(name)) {
			inpAmount_Fc(value);
			return;
		}
		if ($taxAmount_Fc.equalsIgnoreCase(name)) {
			taxAmount_Fc(value);
			return;
		}
		if ($taxableAmount_Fc.equalsIgnoreCase(name)) {
			taxableAmount_Fc(value);
			return;
		}
		if ($inpAmount_Sc.equalsIgnoreCase(name)) {
			inpAmount_Sc(value);
			return;
		}
		if ($taxAmount_Sc.equalsIgnoreCase(name)) {
			taxAmount_Sc(value);
			return;
		}
		if ($taxableAmount_Sc.equalsIgnoreCase(name)) {
			taxableAmount_Sc(value);
			return;
		}
		if ($packingUnitPrice.equalsIgnoreCase(name)) {
			packingUnitPrice(value);
			return;
		}
		if ($packingUnitQty.equalsIgnoreCase(name)) {
			packingUnitQty(value);
			return;
		}
		if ($detail_UserQty.equalsIgnoreCase(name)) {
			detail_UserQty(value);
			return;
		}
		if ($sub_UserQty.equalsIgnoreCase(name)) {
			sub_UserQty(value);
			return;
		}
		if ($spriceIndex.equalsIgnoreCase(name)) {
			spriceIndex(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($inpDate.equalsIgnoreCase(name)) {
			inpDate(value);
			return;
		}
		if ($voucherNo.equalsIgnoreCase(name)) {
			voucherNo(value);
			return;
		}
		if ($customerNo.equalsIgnoreCase(name)) {
			customerNo(value);
			return;
		}
		if ($succeedVoucherNo.equalsIgnoreCase(name)) {
			succeedVoucherNo(value);
			return;
		}
		if ($customerCode.equalsIgnoreCase(name)) {
			customerCode(value);
			return;
		}
		if ($delivToCode.equalsIgnoreCase(name)) {
			delivToCode(value);
			return;
		}
		if ($deptCode.equalsIgnoreCase(name)) {
			deptCode(value);
			return;
		}
		if ($inchargeCode.equalsIgnoreCase(name)) {
			inchargeCode(value);
			return;
		}
		if ($ar_PatternCode.equalsIgnoreCase(name)) {
			ar_PatternCode(value);
			return;
		}
		if ($currencyCode.equalsIgnoreCase(name)) {
			currencyCode(value);
			return;
		}
		if ($rateTypeCode.equalsIgnoreCase(name)) {
			rateTypeCode(value);
			return;
		}
		if ($taxableCode.equalsIgnoreCase(name)) {
			taxableCode(value);
			return;
		}
		if ($header_DescriptCode.equalsIgnoreCase(name)) {
			header_DescriptCode(value);
			return;
		}
		if ($header_DescriptName.equalsIgnoreCase(name)) {
			header_DescriptName(value);
			return;
		}
		if ($postpadColor.equalsIgnoreCase(name)) {
			postpadColor(value);
			return;
		}
		if ($postpadText.equalsIgnoreCase(name)) {
			postpadText(value);
			return;
		}
		if ($settleMethod.equalsIgnoreCase(name)) {
			settleMethod(value);
			return;
		}
		if ($bankAcct_Own.equalsIgnoreCase(name)) {
			bankAcct_Own(value);
			return;
		}
		if ($paymentTerms.equalsIgnoreCase(name)) {
			paymentTerms(value);
			return;
		}
		if ($dueDate.equalsIgnoreCase(name)) {
			dueDate(value);
			return;
		}
		if ($fileName.equalsIgnoreCase(name)) {
			fileName(value);
			return;
		}
		if ($header_UserMaster.equalsIgnoreCase(name)) {
			header_UserMaster(value);
			return;
		}
		if ($header_UserText.equalsIgnoreCase(name)) {
			header_UserText(value);
			return;
		}
		if ($header_FlexMaster1.equalsIgnoreCase(name)) {
			header_FlexMaster1(value);
			return;
		}
		if ($header_FlexMaster2.equalsIgnoreCase(name)) {
			header_FlexMaster2(value);
			return;
		}
		if ($header_FlexCode1.equalsIgnoreCase(name)) {
			header_FlexCode1(value);
			return;
		}
		if ($header_FlexCode2.equalsIgnoreCase(name)) {
			header_FlexCode2(value);
			return;
		}
		if ($header_FlexText1.equalsIgnoreCase(name)) {
			header_FlexText1(value);
			return;
		}
		if ($header_FlexText2.equalsIgnoreCase(name)) {
			header_FlexText2(value);
			return;
		}
		if ($header_FlexText3.equalsIgnoreCase(name)) {
			header_FlexText3(value);
			return;
		}
		if ($header_FlexText4.equalsIgnoreCase(name)) {
			header_FlexText4(value);
			return;
		}
		if ($header_FlexText5.equalsIgnoreCase(name)) {
			header_FlexText5(value);
			return;
		}
		if ($header_FlexDate.equalsIgnoreCase(name)) {
			header_FlexDate(value);
			return;
		}
		if ($remarks1.equalsIgnoreCase(name)) {
			remarks1(value);
			return;
		}
		if ($remarks2.equalsIgnoreCase(name)) {
			remarks2(value);
			return;
		}
		if ($remarks3.equalsIgnoreCase(name)) {
			remarks3(value);
			return;
		}
		if ($remarks4.equalsIgnoreCase(name)) {
			remarks4(value);
			return;
		}
		if ($remarks5.equalsIgnoreCase(name)) {
			remarks5(value);
			return;
		}
		if ($remarks6.equalsIgnoreCase(name)) {
			remarks6(value);
			return;
		}
		if ($remarks7.equalsIgnoreCase(name)) {
			remarks7(value);
			return;
		}
		if ($remarks8.equalsIgnoreCase(name)) {
			remarks8(value);
			return;
		}
		if ($remarks9.equalsIgnoreCase(name)) {
			remarks9(value);
			return;
		}
		if ($remarks10.equalsIgnoreCase(name)) {
			remarks10(value);
			return;
		}
		if ($remarks11.equalsIgnoreCase(name)) {
			remarks11(value);
			return;
		}
		if ($remarks12.equalsIgnoreCase(name)) {
			remarks12(value);
			return;
		}
		if ($remarks13.equalsIgnoreCase(name)) {
			remarks13(value);
			return;
		}
		if ($remarks14.equalsIgnoreCase(name)) {
			remarks14(value);
			return;
		}
		if ($remarks15.equalsIgnoreCase(name)) {
			remarks15(value);
			return;
		}
		if ($remarks16.equalsIgnoreCase(name)) {
			remarks16(value);
			return;
		}
		if ($remarks17.equalsIgnoreCase(name)) {
			remarks17(value);
			return;
		}
		if ($remarks18.equalsIgnoreCase(name)) {
			remarks18(value);
			return;
		}
		if ($remarks19.equalsIgnoreCase(name)) {
			remarks19(value);
			return;
		}
		if ($remarks20.equalsIgnoreCase(name)) {
			remarks20(value);
			return;
		}
		if ($remarks21.equalsIgnoreCase(name)) {
			remarks21(value);
			return;
		}
		if ($remarks22.equalsIgnoreCase(name)) {
			remarks22(value);
			return;
		}
		if ($remarks23.equalsIgnoreCase(name)) {
			remarks23(value);
			return;
		}
		if ($remarks24.equalsIgnoreCase(name)) {
			remarks24(value);
			return;
		}
		if ($remarks25.equalsIgnoreCase(name)) {
			remarks25(value);
			return;
		}
		if ($remarks26.equalsIgnoreCase(name)) {
			remarks26(value);
			return;
		}
		if ($remarks27.equalsIgnoreCase(name)) {
			remarks27(value);
			return;
		}
		if ($remarks28.equalsIgnoreCase(name)) {
			remarks28(value);
			return;
		}
		if ($remarks29.equalsIgnoreCase(name)) {
			remarks29(value);
			return;
		}
		if ($remarks30.equalsIgnoreCase(name)) {
			remarks30(value);
			return;
		}
		if ($detail_DeptCode.equalsIgnoreCase(name)) {
			detail_DeptCode(value);
			return;
		}
		if ($warehouse.equalsIgnoreCase(name)) {
			warehouse(value);
			return;
		}
		if ($locationCode.equalsIgnoreCase(name)) {
			locationCode(value);
			return;
		}
		if ($goodsGroup.equalsIgnoreCase(name)) {
			goodsGroup(value);
			return;
		}
		if ($goodsCode.equalsIgnoreCase(name)) {
			goodsCode(value);
			return;
		}
		if ($chargesCode.equalsIgnoreCase(name)) {
			chargesCode(value);
			return;
		}
		if ($corresp_Goods.equalsIgnoreCase(name)) {
			corresp_Goods(value);
			return;
		}
		if ($detail_TaxableCode.equalsIgnoreCase(name)) {
			detail_TaxableCode(value);
			return;
		}
		if ($packingUnitCode.equalsIgnoreCase(name)) {
			packingUnitCode(value);
			return;
		}
		if ($preshippingDate.equalsIgnoreCase(name)) {
			preshippingDate(value);
			return;
		}
		if ($delivDate.equalsIgnoreCase(name)) {
			delivDate(value);
			return;
		}
		if ($detail_Descript_Code.equalsIgnoreCase(name)) {
			detail_Descript_Code(value);
			return;
		}
		if ($detail_Descript_Name.equalsIgnoreCase(name)) {
			detail_Descript_Name(value);
			return;
		}
		if ($detail_UserMaster1.equalsIgnoreCase(name)) {
			detail_UserMaster1(value);
			return;
		}
		if ($detail_UserMaster2.equalsIgnoreCase(name)) {
			detail_UserMaster2(value);
			return;
		}
		if ($detail_UserMaster3.equalsIgnoreCase(name)) {
			detail_UserMaster3(value);
			return;
		}
		if ($detail_UserMaster4.equalsIgnoreCase(name)) {
			detail_UserMaster4(value);
			return;
		}
		if ($detail_UserMaster5.equalsIgnoreCase(name)) {
			detail_UserMaster5(value);
			return;
		}
		if ($detail_UserCode.equalsIgnoreCase(name)) {
			detail_UserCode(value);
			return;
		}
		if ($detail_UserText.equalsIgnoreCase(name)) {
			detail_UserText(value);
			return;
		}
		if ($detail_UserDate.equalsIgnoreCase(name)) {
			detail_UserDate(value);
			return;
		}
		if ($detail_FlexMaster.equalsIgnoreCase(name)) {
			detail_FlexMaster(value);
			return;
		}
		if ($detail_FlexCode.equalsIgnoreCase(name)) {
			detail_FlexCode(value);
			return;
		}
		if ($detail_FlexText1.equalsIgnoreCase(name)) {
			detail_FlexText1(value);
			return;
		}
		if ($detail_FlexText2.equalsIgnoreCase(name)) {
			detail_FlexText2(value);
			return;
		}
		if ($detail_FlexDate.equalsIgnoreCase(name)) {
			detail_FlexDate(value);
			return;
		}
		if ($sub_Descript_Code.equalsIgnoreCase(name)) {
			sub_Descript_Code(value);
			return;
		}
		if ($sub_Descript_Name.equalsIgnoreCase(name)) {
			sub_Descript_Name(value);
			return;
		}
		if ($sub_UserMaster1.equalsIgnoreCase(name)) {
			sub_UserMaster1(value);
			return;
		}
		if ($sub_UserMaster2.equalsIgnoreCase(name)) {
			sub_UserMaster2(value);
			return;
		}
		if ($sub_UserMaster3.equalsIgnoreCase(name)) {
			sub_UserMaster3(value);
			return;
		}
		if ($sub_UserMaster4.equalsIgnoreCase(name)) {
			sub_UserMaster4(value);
			return;
		}
		if ($sub_UserMaster5.equalsIgnoreCase(name)) {
			sub_UserMaster5(value);
			return;
		}
		if ($sub_UserCode.equalsIgnoreCase(name)) {
			sub_UserCode(value);
			return;
		}
		if ($sub_UserText.equalsIgnoreCase(name)) {
			sub_UserText(value);
			return;
		}
		if ($sub_UserDate.equalsIgnoreCase(name)) {
			sub_UserDate(value);
			return;
		}
		if ($spriceCode.equalsIgnoreCase(name)) {
			spriceCode(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($correspType.equalsIgnoreCase(name)) {
			correspType(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($forCondition.equalsIgnoreCase(name)) {
			forCondition(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($rowNo.equalsIgnoreCase(name)) {
			rowNo(value);
			return;
		}
		if ($detailType.equalsIgnoreCase(name)) {
			detailType(value);
			return;
		}
		if ($unitType.equalsIgnoreCase(name)) {
			unitType(value);
			return;
		}
		if ($detail_TaxType.equalsIgnoreCase(name)) {
			detail_TaxType(value);
			return;
		}
		if ($unitPrice.equalsIgnoreCase(name)) {
			unitPrice(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inpAmount_Fc.equalsIgnoreCase(name)) {
			inpAmount_Fc(value);
			return;
		}
		if ($taxAmount_Fc.equalsIgnoreCase(name)) {
			taxAmount_Fc(value);
			return;
		}
		if ($taxableAmount_Fc.equalsIgnoreCase(name)) {
			taxableAmount_Fc(value);
			return;
		}
		if ($inpAmount_Sc.equalsIgnoreCase(name)) {
			inpAmount_Sc(value);
			return;
		}
		if ($taxAmount_Sc.equalsIgnoreCase(name)) {
			taxAmount_Sc(value);
			return;
		}
		if ($taxableAmount_Sc.equalsIgnoreCase(name)) {
			taxableAmount_Sc(value);
			return;
		}
		if ($packingUnitPrice.equalsIgnoreCase(name)) {
			packingUnitPrice(value);
			return;
		}
		if ($packingUnitQty.equalsIgnoreCase(name)) {
			packingUnitQty(value);
			return;
		}
		if ($detail_UserQty.equalsIgnoreCase(name)) {
			detail_UserQty(value);
			return;
		}
		if ($sub_UserQty.equalsIgnoreCase(name)) {
			sub_UserQty(value);
			return;
		}
		if ($spriceIndex.equalsIgnoreCase(name)) {
			spriceIndex(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($correspType.equalsIgnoreCase(name)) {
			correspType(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($forCondition.equalsIgnoreCase(name)) {
			forCondition(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($rowNo.equalsIgnoreCase(name)) {
			rowNo(value);
			return;
		}
		if ($detailType.equalsIgnoreCase(name)) {
			detailType(value);
			return;
		}
		if ($unitType.equalsIgnoreCase(name)) {
			unitType(value);
			return;
		}
		if ($detail_TaxType.equalsIgnoreCase(name)) {
			detail_TaxType(value);
			return;
		}
		if ($unitPrice.equalsIgnoreCase(name)) {
			unitPrice(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inpAmount_Fc.equalsIgnoreCase(name)) {
			inpAmount_Fc(value);
			return;
		}
		if ($taxAmount_Fc.equalsIgnoreCase(name)) {
			taxAmount_Fc(value);
			return;
		}
		if ($taxableAmount_Fc.equalsIgnoreCase(name)) {
			taxableAmount_Fc(value);
			return;
		}
		if ($inpAmount_Sc.equalsIgnoreCase(name)) {
			inpAmount_Sc(value);
			return;
		}
		if ($taxAmount_Sc.equalsIgnoreCase(name)) {
			taxAmount_Sc(value);
			return;
		}
		if ($taxableAmount_Sc.equalsIgnoreCase(name)) {
			taxableAmount_Sc(value);
			return;
		}
		if ($packingUnitPrice.equalsIgnoreCase(name)) {
			packingUnitPrice(value);
			return;
		}
		if ($packingUnitQty.equalsIgnoreCase(name)) {
			packingUnitQty(value);
			return;
		}
		if ($detail_UserQty.equalsIgnoreCase(name)) {
			detail_UserQty(value);
			return;
		}
		if ($sub_UserQty.equalsIgnoreCase(name)) {
			sub_UserQty(value);
			return;
		}
		if ($spriceIndex.equalsIgnoreCase(name)) {
			spriceIndex(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($correspType.equalsIgnoreCase(name)) {
			correspType(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($forCondition.equalsIgnoreCase(name)) {
			forCondition(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($rowNo.equalsIgnoreCase(name)) {
			rowNo(value);
			return;
		}
		if ($detailType.equalsIgnoreCase(name)) {
			detailType(value);
			return;
		}
		if ($unitType.equalsIgnoreCase(name)) {
			unitType(value);
			return;
		}
		if ($detail_TaxType.equalsIgnoreCase(name)) {
			detail_TaxType(value);
			return;
		}
		if ($unitPrice.equalsIgnoreCase(name)) {
			unitPrice(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inpAmount_Fc.equalsIgnoreCase(name)) {
			inpAmount_Fc(value);
			return;
		}
		if ($taxAmount_Fc.equalsIgnoreCase(name)) {
			taxAmount_Fc(value);
			return;
		}
		if ($taxableAmount_Fc.equalsIgnoreCase(name)) {
			taxableAmount_Fc(value);
			return;
		}
		if ($inpAmount_Sc.equalsIgnoreCase(name)) {
			inpAmount_Sc(value);
			return;
		}
		if ($taxAmount_Sc.equalsIgnoreCase(name)) {
			taxAmount_Sc(value);
			return;
		}
		if ($taxableAmount_Sc.equalsIgnoreCase(name)) {
			taxableAmount_Sc(value);
			return;
		}
		if ($packingUnitPrice.equalsIgnoreCase(name)) {
			packingUnitPrice(value);
			return;
		}
		if ($packingUnitQty.equalsIgnoreCase(name)) {
			packingUnitQty(value);
			return;
		}
		if ($detail_UserQty.equalsIgnoreCase(name)) {
			detail_UserQty(value);
			return;
		}
		if ($sub_UserQty.equalsIgnoreCase(name)) {
			sub_UserQty(value);
			return;
		}
		if ($spriceIndex.equalsIgnoreCase(name)) {
			spriceIndex(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($correspType.equalsIgnoreCase(name)) {
			correspType(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($forCondition.equalsIgnoreCase(name)) {
			forCondition(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($rowNo.equalsIgnoreCase(name)) {
			rowNo(value);
			return;
		}
		if ($detailType.equalsIgnoreCase(name)) {
			detailType(value);
			return;
		}
		if ($unitType.equalsIgnoreCase(name)) {
			unitType(value);
			return;
		}
		if ($detail_TaxType.equalsIgnoreCase(name)) {
			detail_TaxType(value);
			return;
		}
		if ($unitPrice.equalsIgnoreCase(name)) {
			unitPrice(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inpAmount_Fc.equalsIgnoreCase(name)) {
			inpAmount_Fc(value);
			return;
		}
		if ($taxAmount_Fc.equalsIgnoreCase(name)) {
			taxAmount_Fc(value);
			return;
		}
		if ($taxableAmount_Fc.equalsIgnoreCase(name)) {
			taxableAmount_Fc(value);
			return;
		}
		if ($inpAmount_Sc.equalsIgnoreCase(name)) {
			inpAmount_Sc(value);
			return;
		}
		if ($taxAmount_Sc.equalsIgnoreCase(name)) {
			taxAmount_Sc(value);
			return;
		}
		if ($taxableAmount_Sc.equalsIgnoreCase(name)) {
			taxableAmount_Sc(value);
			return;
		}
		if ($packingUnitPrice.equalsIgnoreCase(name)) {
			packingUnitPrice(value);
			return;
		}
		if ($packingUnitQty.equalsIgnoreCase(name)) {
			packingUnitQty(value);
			return;
		}
		if ($detail_UserQty.equalsIgnoreCase(name)) {
			detail_UserQty(value);
			return;
		}
		if ($sub_UserQty.equalsIgnoreCase(name)) {
			sub_UserQty(value);
			return;
		}
		if ($spriceIndex.equalsIgnoreCase(name)) {
			spriceIndex(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($correspType.equalsIgnoreCase(name)) {
			correspType(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($forCondition.equalsIgnoreCase(name)) {
			forCondition(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($rowNo.equalsIgnoreCase(name)) {
			rowNo(value);
			return;
		}
		if ($detailType.equalsIgnoreCase(name)) {
			detailType(value);
			return;
		}
		if ($unitType.equalsIgnoreCase(name)) {
			unitType(value);
			return;
		}
		if ($detail_TaxType.equalsIgnoreCase(name)) {
			detail_TaxType(value);
			return;
		}
		if ($unitPrice.equalsIgnoreCase(name)) {
			unitPrice(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inpAmount_Fc.equalsIgnoreCase(name)) {
			inpAmount_Fc(value);
			return;
		}
		if ($taxAmount_Fc.equalsIgnoreCase(name)) {
			taxAmount_Fc(value);
			return;
		}
		if ($taxableAmount_Fc.equalsIgnoreCase(name)) {
			taxableAmount_Fc(value);
			return;
		}
		if ($inpAmount_Sc.equalsIgnoreCase(name)) {
			inpAmount_Sc(value);
			return;
		}
		if ($taxAmount_Sc.equalsIgnoreCase(name)) {
			taxAmount_Sc(value);
			return;
		}
		if ($taxableAmount_Sc.equalsIgnoreCase(name)) {
			taxableAmount_Sc(value);
			return;
		}
		if ($packingUnitPrice.equalsIgnoreCase(name)) {
			packingUnitPrice(value);
			return;
		}
		if ($packingUnitQty.equalsIgnoreCase(name)) {
			packingUnitQty(value);
			return;
		}
		if ($detail_UserQty.equalsIgnoreCase(name)) {
			detail_UserQty(value);
			return;
		}
		if ($sub_UserQty.equalsIgnoreCase(name)) {
			sub_UserQty(value);
			return;
		}
		if ($spriceIndex.equalsIgnoreCase(name)) {
			spriceIndex(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

