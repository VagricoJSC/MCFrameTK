package mcframe.commonPFBB.PFBBR5030;

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
	 *  .<p>
	 *
	 * 計上日
	 */
	public static final String $inpDate = "inpDate";
	/**
	 *  .<p>
	 *
	 * 伝票No.
	 */
	public static final String $voucherNo = "voucherNo";
	/**
	 *  .<p>
	 *
	 * 取引先
	 */
	public static final String $customerCode = "customerCode";
	/**
	 *  .<p>
	 *
	 * 納品先/納入元
	 */
	public static final String $delivToCode = "delivToCode";
	/**
	 *  .<p>
	 *
	 * 部門
	 */
	public static final String $deptCode = "deptCode";
	/**
	 *  .<p>
	 *
	 * 担当者
	 */
	public static final String $inchargeCode = "inchargeCode";
	/**
	 *  .<p>
	 *
	 * 取引パターン
	 */
	public static final String $ar_PatternCode = "ar_PatternCode";
	/**
	 *  .<p>
	 *
	 * 通貨
	 */
	public static final String $currencyCode = "currencyCode";
	/**
	 *  .<p>
	 *
	 * レートタイプ
	 */
	public static final String $rateTypeCode = "rateTypeCode";
	/**
	 *  .<p>
	 *
	 * レート
	 */
	public static final String $rate = "rate";
	/**
	 *  .<p>
	 *
	 * ヘッダ課税区分
	 */
	public static final String $taxableCode = "taxableCode";
	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public static final String $taxType = "taxType";
	/**
	 *  .<p>
	 *
	 * 伝票摘要コード
	 */
	public static final String $header_DescriptCode = "header_DescriptCode";
	/**
	 *  .<p>
	 *
	 * 伝票摘要内容
	 */
	public static final String $header_DescriptName = "header_DescriptName";
	/**
	 *  .<p>
	 *
	 * 付箋紙コード
	 */
	public static final String $postpadColor = "postpadColor";
	/**
	 *  .<p>
	 *
	 * 付箋紙内容
	 */
	public static final String $postpadText = "postpadText";
	/**
	 *  .<p>
	 *
	 * 決済方法
	 */
	public static final String $settleMethod = "settleMethod";
	/**
	 *  .<p>
	 *
	 * 自社口座
	 */
	public static final String $bankAcct_Own = "bankAcct_Own";
	/**
	 *  .<p>
	 *
	 * 相手口座
	 */
	public static final String $bankAcct_Corresp = "bankAcct_Corresp";
	/**
	 *  .<p>
	 *
	 * 支払条件
	 */
	public static final String $paymentTerms = "paymentTerms";
	/**
	 *  .<p>
	 *
	 * 決済予定日
	 */
	public static final String $dueDate = "dueDate";
	/**
	 *  .<p>
	 *
	 * ファイル名
	 */
	public static final String $fileName = "fileName";
	/**
	 *  .<p>
	 *
	 * 仕訳対象外
	 */
	public static final String $journalType = "journalType";
	/**
	 *  .<p>
	 *
	 * Invoice No.
	 */
	public static final String $invoiceNo = "invoiceNo";
	/**
	 *  .<p>
	 *
	 * 承認グループ
	 */
	public static final String $approveGroupCode = "approveGroupCode";
	/**
	 *  .<p>
	 *
	 * 振込依頼人
	 */
	public static final String $iraiCode = "iraiCode";
	/**
	 *  .<p>
	 *
	 * ヘッダユーザマスタ
	 */
	public static final String $header_UserMaster = "header_UserMaster";
	/**
	 *  .<p>
	 *
	 * ヘッダユーザテキスト
	 */
	public static final String $header_UserText = "header_UserText";
	/**
	 *  .<p>
	 *
	 * ヘッダフレックスマスタ1
	 */
	public static final String $header_FlexMaster1 = "header_FlexMaster1";
	/**
	 *  .<p>
	 *
	 * ヘッダフレックスマスタ2
	 */
	public static final String $header_FlexMaster2 = "header_FlexMaster2";
	/**
	 *  .<p>
	 *
	 * ヘッダフレックスコード1
	 */
	public static final String $header_FlexCode1 = "header_FlexCode1";
	/**
	 *  .<p>
	 *
	 * ヘッダフレックスコード2
	 */
	public static final String $header_FlexCode2 = "header_FlexCode2";
	/**
	 *  .<p>
	 *
	 * ヘッダフレックステキスト1
	 */
	public static final String $header_FlexText1 = "header_FlexText1";
	/**
	 *  .<p>
	 *
	 * ヘッダフレックステキスト2
	 */
	public static final String $header_FlexText2 = "header_FlexText2";
	/**
	 *  .<p>
	 *
	 * ヘッダフレックステキスト3
	 */
	public static final String $header_FlexText3 = "header_FlexText3";
	/**
	 *  .<p>
	 *
	 * ヘッダフレックステキスト4
	 */
	public static final String $header_FlexText4 = "header_FlexText4";
	/**
	 *  .<p>
	 *
	 * ヘッダフレックステキスト5
	 */
	public static final String $header_FlexText5 = "header_FlexText5";
	/**
	 *  .<p>
	 *
	 * ヘッダフレックス日付
	 */
	public static final String $header_FlexDate = "header_FlexDate";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報1
	 */
	public static final String $remarks1 = "remarks1";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報2
	 */
	public static final String $remarks2 = "remarks2";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報3
	 */
	public static final String $remarks3 = "remarks3";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報4
	 */
	public static final String $remarks4 = "remarks4";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報5
	 */
	public static final String $remarks5 = "remarks5";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報6
	 */
	public static final String $remarks6 = "remarks6";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報7
	 */
	public static final String $remarks7 = "remarks7";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報8
	 */
	public static final String $remarks8 = "remarks8";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報9
	 */
	public static final String $remarks9 = "remarks9";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報10
	 */
	public static final String $remarks10 = "remarks10";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報11
	 */
	public static final String $remarks11 = "remarks11";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報12
	 */
	public static final String $remarks12 = "remarks12";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報13
	 */
	public static final String $remarks13 = "remarks13";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報14
	 */
	public static final String $remarks14 = "remarks14";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報15
	 */
	public static final String $remarks15 = "remarks15";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報16
	 */
	public static final String $remarks16 = "remarks16";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報17
	 */
	public static final String $remarks17 = "remarks17";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報18
	 */
	public static final String $remarks18 = "remarks18";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報19
	 */
	public static final String $remarks19 = "remarks19";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報20
	 */
	public static final String $remarks20 = "remarks20";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報21
	 */
	public static final String $remarks21 = "remarks21";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報22
	 */
	public static final String $remarks22 = "remarks22";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報23
	 */
	public static final String $remarks23 = "remarks23";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報24
	 */
	public static final String $remarks24 = "remarks24";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報25
	 */
	public static final String $remarks25 = "remarks25";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報26
	 */
	public static final String $remarks26 = "remarks26";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報27
	 */
	public static final String $remarks27 = "remarks27";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報28
	 */
	public static final String $remarks28 = "remarks28";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報29
	 */
	public static final String $remarks29 = "remarks29";
	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報30
	 */
	public static final String $remarks30 = "remarks30";
	/**
	 *  .<p>
	 *
	 * 行No.
	 */
	public static final String $rowNo = "rowNo";
	/**
	 *  .<p>
	 *
	 * 客先注文No
	 */
	public static final String $customerNo = "customerNo";
	/**
	 *  .<p>
	 *
	 * 明細区分（品目・諸掛）
	 */
	public static final String $detailType = "detailType";
	/**
	 *  .<p>
	 *
	 * 部門
	 */
	public static final String $detail_DeptCode = "detail_DeptCode";
	/**
	 *  .<p>
	 *
	 * 倉庫
	 */
	public static final String $warehouse = "warehouse";
	/**
	 *  .<p>
	 *
	 * ロケーション
	 */
	public static final String $locationCode = "locationCode";
	/**
	 *  .<p>
	 *
	 * ロット№
	 */
	public static final String $lotNo = "lotNo";
	/**
	 *  .<p>
	 *
	 * 品目グループ
	 */
	public static final String $goodsGroup = "goodsGroup";
	/**
	 *  .<p>
	 *
	 * 品目
	 */
	public static final String $goodsCode = "goodsCode";
	/**
	 *  .<p>
	 *
	 * 諸掛
	 */
	public static final String $chargesCode = "chargesCode";
	/**
	 *  .<p>
	 *
	 * 取引先品番
	 */
	public static final String $corresp_Goods = "corresp_Goods";
	/**
	 *  .<p>
	 *
	 * 単位計上/荷姿単位計上
	 */
	public static final String $unitType = "unitType";
	/**
	 *  .<p>
	 *
	 * 課税区分
	 */
	public static final String $detail_TaxableCode = "detail_TaxableCode";
	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public static final String $detail_TaxType = "detail_TaxType";
	/**
	 *  .<p>
	 *
	 * 単価
	 */
	public static final String $unitPrice = "unitPrice";
	/**
	 *  .<p>
	 *
	 * 数量
	 */
	public static final String $qty_Plus = "qty_Plus";
	/**
	 *  .<p>
	 *
	 * 入力金額
	 */
	public static final String $inpAmount_Fc = "inpAmount_Fc";
	/**
	 *  .<p>
	 *
	 * 入力税額
	 */
	public static final String $taxAmount_Fc = "taxAmount_Fc";
	/**
	 *  .<p>
	 *
	 * 入力税対象金額
	 */
	public static final String $taxableAmount_Fc = "taxableAmount_Fc";
	/**
	 *  .<p>
	 *
	 * 基準金額
	 */
	public static final String $inpAmount_Sc = "inpAmount_Sc";
	/**
	 *  .<p>
	 *
	 * 基準税額
	 */
	public static final String $taxAmount_Sc = "taxAmount_Sc";
	/**
	 *  .<p>
	 *
	 * 基準税対象金額
	 */
	public static final String $taxableAmount_Sc = "taxableAmount_Sc";
	/**
	 *  .<p>
	 *
	 * 荷姿コード
	 */
	public static final String $packingUnitCode = "packingUnitCode";
	/**
	 *  .<p>
	 *
	 * 荷姿単価
	 */
	public static final String $packingUnitPrice = "packingUnitPrice";
	/**
	 *  .<p>
	 *
	 * 荷姿数量
	 */
	public static final String $packingUnitQty = "packingUnitQty";
	/**
	 *  .<p>
	 *
	 * 明細摘要コード
	 */
	public static final String $detail_Descript_Code = "detail_Descript_Code";
	/**
	 *  .<p>
	 *
	 * 明細摘要内容
	 */
	public static final String $detail_Descript_Name = "detail_Descript_Name";
	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ1
	 */
	public static final String $detail_UserMaster1 = "detail_UserMaster1";
	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ2
	 */
	public static final String $detail_UserMaster2 = "detail_UserMaster2";
	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ3
	 */
	public static final String $detail_UserMaster3 = "detail_UserMaster3";
	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ4
	 */
	public static final String $detail_UserMaster4 = "detail_UserMaster4";
	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ5
	 */
	public static final String $detail_UserMaster5 = "detail_UserMaster5";
	/**
	 *  .<p>
	 *
	 * 明細ユーザコード
	 */
	public static final String $detail_UserCode = "detail_UserCode";
	/**
	 *  .<p>
	 *
	 * 明細ユーザテキスト
	 */
	public static final String $detail_UserText = "detail_UserText";
	/**
	 *  .<p>
	 *
	 * 明細ユーザ日付
	 */
	public static final String $detail_UserDate = "detail_UserDate";
	/**
	 *  .<p>
	 *
	 * 明細ユーザ数量
	 */
	public static final String $detail_UserQty = "detail_UserQty";
	/**
	 *  .<p>
	 *
	 * 明細フレックスマスタ
	 */
	public static final String $detail_FlexMaster = "detail_FlexMaster";
	/**
	 *  .<p>
	 *
	 * 明細フレックスコード
	 */
	public static final String $detail_FlexCode = "detail_FlexCode";
	/**
	 *  .<p>
	 *
	 * 明細フレックステキスト1
	 */
	public static final String $detail_FlexText1 = "detail_FlexText1";
	/**
	 *  .<p>
	 *
	 * 明細フレックステキスト2
	 */
	public static final String $detail_FlexText2 = "detail_FlexText2";
	/**
	 *  .<p>
	 *
	 * 明細フレックス日付
	 */
	public static final String $detail_FlexDate = "detail_FlexDate";
	/**
	 *  .<p>
	 *
	 * 明細摘要コード
	 */
	public static final String $sub_Descript_Code = "sub_Descript_Code";
	/**
	 *  .<p>
	 *
	 * 明細摘要内容
	 */
	public static final String $sub_Descript_Name = "sub_Descript_Name";
	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ1
	 */
	public static final String $sub_UserMaster1 = "sub_UserMaster1";
	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ2
	 */
	public static final String $sub_UserMaster2 = "sub_UserMaster2";
	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ3
	 */
	public static final String $sub_UserMaster3 = "sub_UserMaster3";
	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ4
	 */
	public static final String $sub_UserMaster4 = "sub_UserMaster4";
	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ5
	 */
	public static final String $sub_UserMaster5 = "sub_UserMaster5";
	/**
	 *  .<p>
	 *
	 * 明細ユーザコード
	 */
	public static final String $sub_UserCode = "sub_UserCode";
	/**
	 *  .<p>
	 *
	 * 明細ユーザテキスト
	 */
	public static final String $sub_UserText = "sub_UserText";
	/**
	 *  .<p>
	 *
	 * 明細ユーザ日付
	 */
	public static final String $sub_UserDate = "sub_UserDate";
	/**
	 *  .<p>
	 *
	 * 明細ユーザ数量
	 */
	public static final String $sub_UserQty = "sub_UserQty";
	/**
	 *  .<p>
	 *
	 * LOTフレックスマスタ
	 */
	public static final String $lot_FlexMaster = "lot_FlexMaster";
	/**
	 *  .<p>
	 *
	 * LOTフレックステキスト1
	 */
	public static final String $lot_FlexText1 = "lot_FlexText1";
	/**
	 *  .<p>
	 *
	 * LOTフレックステキスト2
	 */
	public static final String $lot_FlexText2 = "lot_FlexText2";
	/**
	 *  .<p>
	 *
	 * LOTフレックス日付
	 */
	public static final String $lot_FlexDate = "lot_FlexDate";
	/**
	 *  .<p>
	 *
	 * 顧客
	 */
	public static final String $billtocode = "billtocode";
	/**
	 *  .<p>
	 *
	 * ｴﾝﾄﾞﾕｰｻﾞ
	 */
	public static final String $endusercode = "endusercode";
	/**
	 *  .<p>
	 *
	 * 引継元№
	 */
	public static final String $succeedVoucherNo = "succeedVoucherNo";


	public static final MCMeta inpDate_META = createStringMeta($inpDate, 10);
	public static final MCMeta voucherNo_META = createStringMeta($voucherNo, 20);
	public static final MCMeta customerCode_META = createStringMeta($customerCode, 20);
	public static final MCMeta delivToCode_META = createStringMeta($delivToCode, 20);
	public static final MCMeta deptCode_META = createStringMeta($deptCode, 20);
	public static final MCMeta inchargeCode_META = createStringMeta($inchargeCode, 20);
	public static final MCMeta ar_PatternCode_META = createStringMeta($ar_PatternCode, 20);
	public static final MCMeta currencyCode_META = createStringMeta($currencyCode, 20);
	public static final MCMeta rateTypeCode_META = createStringMeta($rateTypeCode, 20);
	public static final MCMeta rate_META = createNumberMeta($rate, 14, 9, false);
	public static final MCMeta taxableCode_META = createStringMeta($taxableCode, 20);
	public static final MCMeta taxType_META = createNumberMeta($taxType, 1, 0, false);
	public static final MCMeta header_DescriptCode_META = createStringMeta($header_DescriptCode, 20);
	public static final MCMeta header_DescriptName_META = createStringMeta($header_DescriptName, 100);
	public static final MCMeta postpadColor_META = createStringMeta($postpadColor, 8);
	public static final MCMeta postpadText_META = createStringMeta($postpadText, 50);
	public static final MCMeta settleMethod_META = createStringMeta($settleMethod, 20);
	public static final MCMeta bankAcct_Own_META = createStringMeta($bankAcct_Own, 20);
	public static final MCMeta bankAcct_Corresp_META = createStringMeta($bankAcct_Corresp, 20);
	public static final MCMeta paymentTerms_META = createStringMeta($paymentTerms, 100);
	public static final MCMeta dueDate_META = createStringMeta($dueDate, 10);
	public static final MCMeta fileName_META = createStringMeta($fileName, 100);
	public static final MCMeta journalType_META = createNumberMeta($journalType, 1, 0, false);
	public static final MCMeta invoiceNo_META = createStringMeta($invoiceNo, 20);
	public static final MCMeta approveGroupCode_META = createStringMeta($approveGroupCode, 20);
	public static final MCMeta iraiCode_META = createStringMeta($iraiCode, 20);
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
	public static final MCMeta rowNo_META = createNumberMeta($rowNo, 4, 0, false);
	public static final MCMeta customerNo_META = createStringMeta($customerNo, 50);
	public static final MCMeta detailType_META = createNumberMeta($detailType, 1, 0, false);
	public static final MCMeta detail_DeptCode_META = createStringMeta($detail_DeptCode, 20);
	public static final MCMeta warehouse_META = createStringMeta($warehouse, 20);
	public static final MCMeta locationCode_META = createStringMeta($locationCode, 20);
	public static final MCMeta lotNo_META = createStringMeta($lotNo, 20);
	public static final MCMeta goodsGroup_META = createStringMeta($goodsGroup, 20);
	public static final MCMeta goodsCode_META = createStringMeta($goodsCode, 100);
	public static final MCMeta chargesCode_META = createStringMeta($chargesCode, 20);
	public static final MCMeta corresp_Goods_META = createStringMeta($corresp_Goods, 100);
	public static final MCMeta unitType_META = createNumberMeta($unitType, 1, 0, false);
	public static final MCMeta detail_TaxableCode_META = createStringMeta($detail_TaxableCode, 20);
	public static final MCMeta detail_TaxType_META = createNumberMeta($detail_TaxType, 1, 0, false);
	public static final MCMeta unitPrice_META = createNumberMeta($unitPrice, 20, 6, false);
	public static final MCMeta qty_Plus_META = createNumberMeta($qty_Plus, 14, 4, false);
	public static final MCMeta inpAmount_Fc_META = createNumberMeta($inpAmount_Fc, 16, 2, false);
	public static final MCMeta taxAmount_Fc_META = createNumberMeta($taxAmount_Fc, 16, 2, false);
	public static final MCMeta taxableAmount_Fc_META = createNumberMeta($taxableAmount_Fc, 16, 2, false);
	public static final MCMeta inpAmount_Sc_META = createNumberMeta($inpAmount_Sc, 16, 2, false);
	public static final MCMeta taxAmount_Sc_META = createNumberMeta($taxAmount_Sc, 16, 2, false);
	public static final MCMeta taxableAmount_Sc_META = createNumberMeta($taxableAmount_Sc, 16, 2, false);
	public static final MCMeta packingUnitCode_META = createStringMeta($packingUnitCode, 20);
	public static final MCMeta packingUnitPrice_META = createNumberMeta($packingUnitPrice, 20, 6, false);
	public static final MCMeta packingUnitQty_META = createNumberMeta($packingUnitQty, 10, 0, false);
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
	public static final MCMeta detail_UserQty_META = createNumberMeta($detail_UserQty, 14, 4, false);
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
	public static final MCMeta sub_UserQty_META = createNumberMeta($sub_UserQty, 14, 4, false);
	public static final MCMeta lot_FlexMaster_META = createStringMeta($lot_FlexMaster, 20);
	public static final MCMeta lot_FlexText1_META = createStringMeta($lot_FlexText1, 100);
	public static final MCMeta lot_FlexText2_META = createStringMeta($lot_FlexText2, 100);
	public static final MCMeta lot_FlexDate_META = createStringMeta($lot_FlexDate, 10);
	public static final MCMeta billtocode_META = createStringMeta($billtocode, 20);
	public static final MCMeta endusercode_META = createStringMeta($endusercode, 20);
	public static final MCMeta succeedVoucherNo_META = createStringMeta($succeedVoucherNo, 20);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inpDate_META,
			voucherNo_META,
			customerCode_META,
			delivToCode_META,
			deptCode_META,
			inchargeCode_META,
			ar_PatternCode_META,
			currencyCode_META,
			rateTypeCode_META,
			rate_META,
			taxableCode_META,
			taxType_META,
			header_DescriptCode_META,
			header_DescriptName_META,
			postpadColor_META,
			postpadText_META,
			settleMethod_META,
			bankAcct_Own_META,
			bankAcct_Corresp_META,
			paymentTerms_META,
			dueDate_META,
			fileName_META,
			journalType_META,
			invoiceNo_META,
			approveGroupCode_META,
			iraiCode_META,
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
			customerNo_META,
			detailType_META,
			detail_DeptCode_META,
			warehouse_META,
			locationCode_META,
			lotNo_META,
			goodsGroup_META,
			goodsCode_META,
			chargesCode_META,
			corresp_Goods_META,
			unitType_META,
			detail_TaxableCode_META,
			detail_TaxType_META,
			unitPrice_META,
			qty_Plus_META,
			inpAmount_Fc_META,
			taxAmount_Fc_META,
			taxableAmount_Fc_META,
			inpAmount_Sc_META,
			taxAmount_Sc_META,
			taxableAmount_Sc_META,
			packingUnitCode_META,
			packingUnitPrice_META,
			packingUnitQty_META,
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
			lot_FlexMaster_META,
			lot_FlexText1_META,
			lot_FlexText2_META,
			lot_FlexDate_META,
			billtocode_META,
			endusercode_META,
			succeedVoucherNo_META
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
	 *  .<p>
	 *
	 * 計上日
	 */
	public String inpDate() {
		return getConstString(offset + 0, $inpDate);
	}

	/**
	 *  .<p>
	 *
	 * 計上日
	 */
	public void inpDate(String value) {
		setConstString(offset + 0, $inpDate, value);
	}


	/**
	 *  .<p>
	 *
	 * 伝票No.
	 */
	public String voucherNo() {
		return getConstString(offset + 1, $voucherNo);
	}

	/**
	 *  .<p>
	 *
	 * 伝票No.
	 */
	public void voucherNo(String value) {
		setConstString(offset + 1, $voucherNo, value);
	}


	/**
	 *  .<p>
	 *
	 * 取引先
	 */
	public String customerCode() {
		return getConstString(offset + 2, $customerCode);
	}

	/**
	 *  .<p>
	 *
	 * 取引先
	 */
	public void customerCode(String value) {
		setConstString(offset + 2, $customerCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 納品先/納入元
	 */
	public String delivToCode() {
		return getConstString(offset + 3, $delivToCode);
	}

	/**
	 *  .<p>
	 *
	 * 納品先/納入元
	 */
	public void delivToCode(String value) {
		setConstString(offset + 3, $delivToCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 部門
	 */
	public String deptCode() {
		return getConstString(offset + 4, $deptCode);
	}

	/**
	 *  .<p>
	 *
	 * 部門
	 */
	public void deptCode(String value) {
		setConstString(offset + 4, $deptCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 担当者
	 */
	public String inchargeCode() {
		return getConstString(offset + 5, $inchargeCode);
	}

	/**
	 *  .<p>
	 *
	 * 担当者
	 */
	public void inchargeCode(String value) {
		setConstString(offset + 5, $inchargeCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 取引パターン
	 */
	public String ar_PatternCode() {
		return getConstString(offset + 6, $ar_PatternCode);
	}

	/**
	 *  .<p>
	 *
	 * 取引パターン
	 */
	public void ar_PatternCode(String value) {
		setConstString(offset + 6, $ar_PatternCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 通貨
	 */
	public String currencyCode() {
		return getConstString(offset + 7, $currencyCode);
	}

	/**
	 *  .<p>
	 *
	 * 通貨
	 */
	public void currencyCode(String value) {
		setConstString(offset + 7, $currencyCode, value);
	}


	/**
	 *  .<p>
	 *
	 * レートタイプ
	 */
	public String rateTypeCode() {
		return getConstString(offset + 8, $rateTypeCode);
	}

	/**
	 *  .<p>
	 *
	 * レートタイプ
	 */
	public void rateTypeCode(String value) {
		setConstString(offset + 8, $rateTypeCode, value);
	}


	/**
	 *  .<p>
	 *
	 * レート
	 */
	public MCNumber rate() {
		return getConstNumber(offset + 9, $rate);
	}

	/**
	 *  .<p>
	 *
	 * レート
	 */
	public void rate(MCNumber value) {
		setConstNumber(offset + 9, $rate, value);
	}

	/**
	 *  .<p>
	 *
	 * レート
	 */
	public void rate(int value) {
		setConstNumber(offset + 9, $rate, value);
	}

	/**
	 *  .<p>
	 *
	 * レート
	 */
	public void rate(long value) {
		setConstNumber(offset + 9, $rate, value);
	}

	/**
	 *  .<p>
	 *
	 * レート
	 */
	public void rate(float value) {
		setConstNumber(offset + 9, $rate, value);
	}

	/**
	 *  .<p>
	 *
	 * レート
	 */
	public void rate(double value) {
		setConstNumber(offset + 9, $rate, value);
	}


	/**
	 *  .<p>
	 *
	 * ヘッダ課税区分
	 */
	public String taxableCode() {
		return getConstString(offset + 10, $taxableCode);
	}

	/**
	 *  .<p>
	 *
	 * ヘッダ課税区分
	 */
	public void taxableCode(String value) {
		setConstString(offset + 10, $taxableCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public MCNumber taxType() {
		return getConstNumber(offset + 11, $taxType);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void taxType(MCNumber value) {
		setConstNumber(offset + 11, $taxType, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void taxType(int value) {
		setConstNumber(offset + 11, $taxType, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void taxType(long value) {
		setConstNumber(offset + 11, $taxType, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void taxType(float value) {
		setConstNumber(offset + 11, $taxType, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void taxType(double value) {
		setConstNumber(offset + 11, $taxType, value);
	}


	/**
	 *  .<p>
	 *
	 * 伝票摘要コード
	 */
	public String header_DescriptCode() {
		return getConstString(offset + 12, $header_DescriptCode);
	}

	/**
	 *  .<p>
	 *
	 * 伝票摘要コード
	 */
	public void header_DescriptCode(String value) {
		setConstString(offset + 12, $header_DescriptCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 伝票摘要内容
	 */
	public String header_DescriptName() {
		return getConstString(offset + 13, $header_DescriptName);
	}

	/**
	 *  .<p>
	 *
	 * 伝票摘要内容
	 */
	public void header_DescriptName(String value) {
		setConstString(offset + 13, $header_DescriptName, value);
	}


	/**
	 *  .<p>
	 *
	 * 付箋紙コード
	 */
	public String postpadColor() {
		return getConstString(offset + 14, $postpadColor);
	}

	/**
	 *  .<p>
	 *
	 * 付箋紙コード
	 */
	public void postpadColor(String value) {
		setConstString(offset + 14, $postpadColor, value);
	}


	/**
	 *  .<p>
	 *
	 * 付箋紙内容
	 */
	public String postpadText() {
		return getConstString(offset + 15, $postpadText);
	}

	/**
	 *  .<p>
	 *
	 * 付箋紙内容
	 */
	public void postpadText(String value) {
		setConstString(offset + 15, $postpadText, value);
	}


	/**
	 *  .<p>
	 *
	 * 決済方法
	 */
	public String settleMethod() {
		return getConstString(offset + 16, $settleMethod);
	}

	/**
	 *  .<p>
	 *
	 * 決済方法
	 */
	public void settleMethod(String value) {
		setConstString(offset + 16, $settleMethod, value);
	}


	/**
	 *  .<p>
	 *
	 * 自社口座
	 */
	public String bankAcct_Own() {
		return getConstString(offset + 17, $bankAcct_Own);
	}

	/**
	 *  .<p>
	 *
	 * 自社口座
	 */
	public void bankAcct_Own(String value) {
		setConstString(offset + 17, $bankAcct_Own, value);
	}


	/**
	 *  .<p>
	 *
	 * 相手口座
	 */
	public String bankAcct_Corresp() {
		return getConstString(offset + 18, $bankAcct_Corresp);
	}

	/**
	 *  .<p>
	 *
	 * 相手口座
	 */
	public void bankAcct_Corresp(String value) {
		setConstString(offset + 18, $bankAcct_Corresp, value);
	}


	/**
	 *  .<p>
	 *
	 * 支払条件
	 */
	public String paymentTerms() {
		return getConstString(offset + 19, $paymentTerms);
	}

	/**
	 *  .<p>
	 *
	 * 支払条件
	 */
	public void paymentTerms(String value) {
		setConstString(offset + 19, $paymentTerms, value);
	}


	/**
	 *  .<p>
	 *
	 * 決済予定日
	 */
	public String dueDate() {
		return getConstString(offset + 20, $dueDate);
	}

	/**
	 *  .<p>
	 *
	 * 決済予定日
	 */
	public void dueDate(String value) {
		setConstString(offset + 20, $dueDate, value);
	}


	/**
	 *  .<p>
	 *
	 * ファイル名
	 */
	public String fileName() {
		return getConstString(offset + 21, $fileName);
	}

	/**
	 *  .<p>
	 *
	 * ファイル名
	 */
	public void fileName(String value) {
		setConstString(offset + 21, $fileName, value);
	}


	/**
	 *  .<p>
	 *
	 * 仕訳対象外
	 */
	public MCNumber journalType() {
		return getConstNumber(offset + 22, $journalType);
	}

	/**
	 *  .<p>
	 *
	 * 仕訳対象外
	 */
	public void journalType(MCNumber value) {
		setConstNumber(offset + 22, $journalType, value);
	}

	/**
	 *  .<p>
	 *
	 * 仕訳対象外
	 */
	public void journalType(int value) {
		setConstNumber(offset + 22, $journalType, value);
	}

	/**
	 *  .<p>
	 *
	 * 仕訳対象外
	 */
	public void journalType(long value) {
		setConstNumber(offset + 22, $journalType, value);
	}

	/**
	 *  .<p>
	 *
	 * 仕訳対象外
	 */
	public void journalType(float value) {
		setConstNumber(offset + 22, $journalType, value);
	}

	/**
	 *  .<p>
	 *
	 * 仕訳対象外
	 */
	public void journalType(double value) {
		setConstNumber(offset + 22, $journalType, value);
	}


	/**
	 *  .<p>
	 *
	 * Invoice No.
	 */
	public String invoiceNo() {
		return getConstString(offset + 23, $invoiceNo);
	}

	/**
	 *  .<p>
	 *
	 * Invoice No.
	 */
	public void invoiceNo(String value) {
		setConstString(offset + 23, $invoiceNo, value);
	}


	/**
	 *  .<p>
	 *
	 * 承認グループ
	 */
	public String approveGroupCode() {
		return getConstString(offset + 24, $approveGroupCode);
	}

	/**
	 *  .<p>
	 *
	 * 承認グループ
	 */
	public void approveGroupCode(String value) {
		setConstString(offset + 24, $approveGroupCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 振込依頼人
	 */
	public String iraiCode() {
		return getConstString(offset + 25, $iraiCode);
	}

	/**
	 *  .<p>
	 *
	 * 振込依頼人
	 */
	public void iraiCode(String value) {
		setConstString(offset + 25, $iraiCode, value);
	}


	/**
	 *  .<p>
	 *
	 * ヘッダユーザマスタ
	 */
	public String header_UserMaster() {
		return getConstString(offset + 26, $header_UserMaster);
	}

	/**
	 *  .<p>
	 *
	 * ヘッダユーザマスタ
	 */
	public void header_UserMaster(String value) {
		setConstString(offset + 26, $header_UserMaster, value);
	}


	/**
	 *  .<p>
	 *
	 * ヘッダユーザテキスト
	 */
	public String header_UserText() {
		return getConstString(offset + 27, $header_UserText);
	}

	/**
	 *  .<p>
	 *
	 * ヘッダユーザテキスト
	 */
	public void header_UserText(String value) {
		setConstString(offset + 27, $header_UserText, value);
	}


	/**
	 *  .<p>
	 *
	 * ヘッダフレックスマスタ1
	 */
	public String header_FlexMaster1() {
		return getConstString(offset + 28, $header_FlexMaster1);
	}

	/**
	 *  .<p>
	 *
	 * ヘッダフレックスマスタ1
	 */
	public void header_FlexMaster1(String value) {
		setConstString(offset + 28, $header_FlexMaster1, value);
	}


	/**
	 *  .<p>
	 *
	 * ヘッダフレックスマスタ2
	 */
	public String header_FlexMaster2() {
		return getConstString(offset + 29, $header_FlexMaster2);
	}

	/**
	 *  .<p>
	 *
	 * ヘッダフレックスマスタ2
	 */
	public void header_FlexMaster2(String value) {
		setConstString(offset + 29, $header_FlexMaster2, value);
	}


	/**
	 *  .<p>
	 *
	 * ヘッダフレックスコード1
	 */
	public String header_FlexCode1() {
		return getConstString(offset + 30, $header_FlexCode1);
	}

	/**
	 *  .<p>
	 *
	 * ヘッダフレックスコード1
	 */
	public void header_FlexCode1(String value) {
		setConstString(offset + 30, $header_FlexCode1, value);
	}


	/**
	 *  .<p>
	 *
	 * ヘッダフレックスコード2
	 */
	public String header_FlexCode2() {
		return getConstString(offset + 31, $header_FlexCode2);
	}

	/**
	 *  .<p>
	 *
	 * ヘッダフレックスコード2
	 */
	public void header_FlexCode2(String value) {
		setConstString(offset + 31, $header_FlexCode2, value);
	}


	/**
	 *  .<p>
	 *
	 * ヘッダフレックステキスト1
	 */
	public String header_FlexText1() {
		return getConstString(offset + 32, $header_FlexText1);
	}

	/**
	 *  .<p>
	 *
	 * ヘッダフレックステキスト1
	 */
	public void header_FlexText1(String value) {
		setConstString(offset + 32, $header_FlexText1, value);
	}


	/**
	 *  .<p>
	 *
	 * ヘッダフレックステキスト2
	 */
	public String header_FlexText2() {
		return getConstString(offset + 33, $header_FlexText2);
	}

	/**
	 *  .<p>
	 *
	 * ヘッダフレックステキスト2
	 */
	public void header_FlexText2(String value) {
		setConstString(offset + 33, $header_FlexText2, value);
	}


	/**
	 *  .<p>
	 *
	 * ヘッダフレックステキスト3
	 */
	public String header_FlexText3() {
		return getConstString(offset + 34, $header_FlexText3);
	}

	/**
	 *  .<p>
	 *
	 * ヘッダフレックステキスト3
	 */
	public void header_FlexText3(String value) {
		setConstString(offset + 34, $header_FlexText3, value);
	}


	/**
	 *  .<p>
	 *
	 * ヘッダフレックステキスト4
	 */
	public String header_FlexText4() {
		return getConstString(offset + 35, $header_FlexText4);
	}

	/**
	 *  .<p>
	 *
	 * ヘッダフレックステキスト4
	 */
	public void header_FlexText4(String value) {
		setConstString(offset + 35, $header_FlexText4, value);
	}


	/**
	 *  .<p>
	 *
	 * ヘッダフレックステキスト5
	 */
	public String header_FlexText5() {
		return getConstString(offset + 36, $header_FlexText5);
	}

	/**
	 *  .<p>
	 *
	 * ヘッダフレックステキスト5
	 */
	public void header_FlexText5(String value) {
		setConstString(offset + 36, $header_FlexText5, value);
	}


	/**
	 *  .<p>
	 *
	 * ヘッダフレックス日付
	 */
	public String header_FlexDate() {
		return getConstString(offset + 37, $header_FlexDate);
	}

	/**
	 *  .<p>
	 *
	 * ヘッダフレックス日付
	 */
	public void header_FlexDate(String value) {
		setConstString(offset + 37, $header_FlexDate, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報1
	 */
	public String remarks1() {
		return getConstString(offset + 38, $remarks1);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報1
	 */
	public void remarks1(String value) {
		setConstString(offset + 38, $remarks1, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報2
	 */
	public String remarks2() {
		return getConstString(offset + 39, $remarks2);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報2
	 */
	public void remarks2(String value) {
		setConstString(offset + 39, $remarks2, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報3
	 */
	public String remarks3() {
		return getConstString(offset + 40, $remarks3);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報3
	 */
	public void remarks3(String value) {
		setConstString(offset + 40, $remarks3, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報4
	 */
	public String remarks4() {
		return getConstString(offset + 41, $remarks4);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報4
	 */
	public void remarks4(String value) {
		setConstString(offset + 41, $remarks4, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報5
	 */
	public String remarks5() {
		return getConstString(offset + 42, $remarks5);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報5
	 */
	public void remarks5(String value) {
		setConstString(offset + 42, $remarks5, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報6
	 */
	public String remarks6() {
		return getConstString(offset + 43, $remarks6);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報6
	 */
	public void remarks6(String value) {
		setConstString(offset + 43, $remarks6, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報7
	 */
	public String remarks7() {
		return getConstString(offset + 44, $remarks7);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報7
	 */
	public void remarks7(String value) {
		setConstString(offset + 44, $remarks7, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報8
	 */
	public String remarks8() {
		return getConstString(offset + 45, $remarks8);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報8
	 */
	public void remarks8(String value) {
		setConstString(offset + 45, $remarks8, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報9
	 */
	public String remarks9() {
		return getConstString(offset + 46, $remarks9);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報9
	 */
	public void remarks9(String value) {
		setConstString(offset + 46, $remarks9, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報10
	 */
	public String remarks10() {
		return getConstString(offset + 47, $remarks10);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報10
	 */
	public void remarks10(String value) {
		setConstString(offset + 47, $remarks10, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報11
	 */
	public String remarks11() {
		return getConstString(offset + 48, $remarks11);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報11
	 */
	public void remarks11(String value) {
		setConstString(offset + 48, $remarks11, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報12
	 */
	public String remarks12() {
		return getConstString(offset + 49, $remarks12);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報12
	 */
	public void remarks12(String value) {
		setConstString(offset + 49, $remarks12, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報13
	 */
	public String remarks13() {
		return getConstString(offset + 50, $remarks13);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報13
	 */
	public void remarks13(String value) {
		setConstString(offset + 50, $remarks13, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報14
	 */
	public String remarks14() {
		return getConstString(offset + 51, $remarks14);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報14
	 */
	public void remarks14(String value) {
		setConstString(offset + 51, $remarks14, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報15
	 */
	public String remarks15() {
		return getConstString(offset + 52, $remarks15);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報15
	 */
	public void remarks15(String value) {
		setConstString(offset + 52, $remarks15, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報16
	 */
	public String remarks16() {
		return getConstString(offset + 53, $remarks16);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報16
	 */
	public void remarks16(String value) {
		setConstString(offset + 53, $remarks16, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報17
	 */
	public String remarks17() {
		return getConstString(offset + 54, $remarks17);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報17
	 */
	public void remarks17(String value) {
		setConstString(offset + 54, $remarks17, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報18
	 */
	public String remarks18() {
		return getConstString(offset + 55, $remarks18);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報18
	 */
	public void remarks18(String value) {
		setConstString(offset + 55, $remarks18, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報19
	 */
	public String remarks19() {
		return getConstString(offset + 56, $remarks19);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報19
	 */
	public void remarks19(String value) {
		setConstString(offset + 56, $remarks19, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報20
	 */
	public String remarks20() {
		return getConstString(offset + 57, $remarks20);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報20
	 */
	public void remarks20(String value) {
		setConstString(offset + 57, $remarks20, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報21
	 */
	public String remarks21() {
		return getConstString(offset + 58, $remarks21);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報21
	 */
	public void remarks21(String value) {
		setConstString(offset + 58, $remarks21, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報22
	 */
	public String remarks22() {
		return getConstString(offset + 59, $remarks22);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報22
	 */
	public void remarks22(String value) {
		setConstString(offset + 59, $remarks22, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報23
	 */
	public String remarks23() {
		return getConstString(offset + 60, $remarks23);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報23
	 */
	public void remarks23(String value) {
		setConstString(offset + 60, $remarks23, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報24
	 */
	public String remarks24() {
		return getConstString(offset + 61, $remarks24);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報24
	 */
	public void remarks24(String value) {
		setConstString(offset + 61, $remarks24, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報25
	 */
	public String remarks25() {
		return getConstString(offset + 62, $remarks25);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報25
	 */
	public void remarks25(String value) {
		setConstString(offset + 62, $remarks25, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報26
	 */
	public String remarks26() {
		return getConstString(offset + 63, $remarks26);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報26
	 */
	public void remarks26(String value) {
		setConstString(offset + 63, $remarks26, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報27
	 */
	public String remarks27() {
		return getConstString(offset + 64, $remarks27);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報27
	 */
	public void remarks27(String value) {
		setConstString(offset + 64, $remarks27, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報28
	 */
	public String remarks28() {
		return getConstString(offset + 65, $remarks28);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報28
	 */
	public void remarks28(String value) {
		setConstString(offset + 65, $remarks28, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報29
	 */
	public String remarks29() {
		return getConstString(offset + 66, $remarks29);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報29
	 */
	public void remarks29(String value) {
		setConstString(offset + 66, $remarks29, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報30
	 */
	public String remarks30() {
		return getConstString(offset + 67, $remarks30);
	}

	/**
	 *  .<p>
	 *
	 * ﾒﾓ情報30
	 */
	public void remarks30(String value) {
		setConstString(offset + 67, $remarks30, value);
	}


	/**
	 *  .<p>
	 *
	 * 行No.
	 */
	public MCNumber rowNo() {
		return getConstNumber(offset + 68, $rowNo);
	}

	/**
	 *  .<p>
	 *
	 * 行No.
	 */
	public void rowNo(MCNumber value) {
		setConstNumber(offset + 68, $rowNo, value);
	}

	/**
	 *  .<p>
	 *
	 * 行No.
	 */
	public void rowNo(int value) {
		setConstNumber(offset + 68, $rowNo, value);
	}

	/**
	 *  .<p>
	 *
	 * 行No.
	 */
	public void rowNo(long value) {
		setConstNumber(offset + 68, $rowNo, value);
	}

	/**
	 *  .<p>
	 *
	 * 行No.
	 */
	public void rowNo(float value) {
		setConstNumber(offset + 68, $rowNo, value);
	}

	/**
	 *  .<p>
	 *
	 * 行No.
	 */
	public void rowNo(double value) {
		setConstNumber(offset + 68, $rowNo, value);
	}


	/**
	 *  .<p>
	 *
	 * 客先注文No
	 */
	public String customerNo() {
		return getConstString(offset + 69, $customerNo);
	}

	/**
	 *  .<p>
	 *
	 * 客先注文No
	 */
	public void customerNo(String value) {
		setConstString(offset + 69, $customerNo, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細区分（品目・諸掛）
	 */
	public MCNumber detailType() {
		return getConstNumber(offset + 70, $detailType);
	}

	/**
	 *  .<p>
	 *
	 * 明細区分（品目・諸掛）
	 */
	public void detailType(MCNumber value) {
		setConstNumber(offset + 70, $detailType, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細区分（品目・諸掛）
	 */
	public void detailType(int value) {
		setConstNumber(offset + 70, $detailType, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細区分（品目・諸掛）
	 */
	public void detailType(long value) {
		setConstNumber(offset + 70, $detailType, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細区分（品目・諸掛）
	 */
	public void detailType(float value) {
		setConstNumber(offset + 70, $detailType, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細区分（品目・諸掛）
	 */
	public void detailType(double value) {
		setConstNumber(offset + 70, $detailType, value);
	}


	/**
	 *  .<p>
	 *
	 * 部門
	 */
	public String detail_DeptCode() {
		return getConstString(offset + 71, $detail_DeptCode);
	}

	/**
	 *  .<p>
	 *
	 * 部門
	 */
	public void detail_DeptCode(String value) {
		setConstString(offset + 71, $detail_DeptCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 倉庫
	 */
	public String warehouse() {
		return getConstString(offset + 72, $warehouse);
	}

	/**
	 *  .<p>
	 *
	 * 倉庫
	 */
	public void warehouse(String value) {
		setConstString(offset + 72, $warehouse, value);
	}


	/**
	 *  .<p>
	 *
	 * ロケーション
	 */
	public String locationCode() {
		return getConstString(offset + 73, $locationCode);
	}

	/**
	 *  .<p>
	 *
	 * ロケーション
	 */
	public void locationCode(String value) {
		setConstString(offset + 73, $locationCode, value);
	}


	/**
	 *  .<p>
	 *
	 * ロット№
	 */
	public String lotNo() {
		return getConstString(offset + 74, $lotNo);
	}

	/**
	 *  .<p>
	 *
	 * ロット№
	 */
	public void lotNo(String value) {
		setConstString(offset + 74, $lotNo, value);
	}


	/**
	 *  .<p>
	 *
	 * 品目グループ
	 */
	public String goodsGroup() {
		return getConstString(offset + 75, $goodsGroup);
	}

	/**
	 *  .<p>
	 *
	 * 品目グループ
	 */
	public void goodsGroup(String value) {
		setConstString(offset + 75, $goodsGroup, value);
	}


	/**
	 *  .<p>
	 *
	 * 品目
	 */
	public String goodsCode() {
		return getConstString(offset + 76, $goodsCode);
	}

	/**
	 *  .<p>
	 *
	 * 品目
	 */
	public void goodsCode(String value) {
		setConstString(offset + 76, $goodsCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 諸掛
	 */
	public String chargesCode() {
		return getConstString(offset + 77, $chargesCode);
	}

	/**
	 *  .<p>
	 *
	 * 諸掛
	 */
	public void chargesCode(String value) {
		setConstString(offset + 77, $chargesCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 取引先品番
	 */
	public String corresp_Goods() {
		return getConstString(offset + 78, $corresp_Goods);
	}

	/**
	 *  .<p>
	 *
	 * 取引先品番
	 */
	public void corresp_Goods(String value) {
		setConstString(offset + 78, $corresp_Goods, value);
	}


	/**
	 *  .<p>
	 *
	 * 単位計上/荷姿単位計上
	 */
	public MCNumber unitType() {
		return getConstNumber(offset + 79, $unitType);
	}

	/**
	 *  .<p>
	 *
	 * 単位計上/荷姿単位計上
	 */
	public void unitType(MCNumber value) {
		setConstNumber(offset + 79, $unitType, value);
	}

	/**
	 *  .<p>
	 *
	 * 単位計上/荷姿単位計上
	 */
	public void unitType(int value) {
		setConstNumber(offset + 79, $unitType, value);
	}

	/**
	 *  .<p>
	 *
	 * 単位計上/荷姿単位計上
	 */
	public void unitType(long value) {
		setConstNumber(offset + 79, $unitType, value);
	}

	/**
	 *  .<p>
	 *
	 * 単位計上/荷姿単位計上
	 */
	public void unitType(float value) {
		setConstNumber(offset + 79, $unitType, value);
	}

	/**
	 *  .<p>
	 *
	 * 単位計上/荷姿単位計上
	 */
	public void unitType(double value) {
		setConstNumber(offset + 79, $unitType, value);
	}


	/**
	 *  .<p>
	 *
	 * 課税区分
	 */
	public String detail_TaxableCode() {
		return getConstString(offset + 80, $detail_TaxableCode);
	}

	/**
	 *  .<p>
	 *
	 * 課税区分
	 */
	public void detail_TaxableCode(String value) {
		setConstString(offset + 80, $detail_TaxableCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public MCNumber detail_TaxType() {
		return getConstNumber(offset + 81, $detail_TaxType);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void detail_TaxType(MCNumber value) {
		setConstNumber(offset + 81, $detail_TaxType, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void detail_TaxType(int value) {
		setConstNumber(offset + 81, $detail_TaxType, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void detail_TaxType(long value) {
		setConstNumber(offset + 81, $detail_TaxType, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void detail_TaxType(float value) {
		setConstNumber(offset + 81, $detail_TaxType, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void detail_TaxType(double value) {
		setConstNumber(offset + 81, $detail_TaxType, value);
	}


	/**
	 *  .<p>
	 *
	 * 単価
	 */
	public MCNumber unitPrice() {
		return getConstNumber(offset + 82, $unitPrice);
	}

	/**
	 *  .<p>
	 *
	 * 単価
	 */
	public void unitPrice(MCNumber value) {
		setConstNumber(offset + 82, $unitPrice, value);
	}

	/**
	 *  .<p>
	 *
	 * 単価
	 */
	public void unitPrice(int value) {
		setConstNumber(offset + 82, $unitPrice, value);
	}

	/**
	 *  .<p>
	 *
	 * 単価
	 */
	public void unitPrice(long value) {
		setConstNumber(offset + 82, $unitPrice, value);
	}

	/**
	 *  .<p>
	 *
	 * 単価
	 */
	public void unitPrice(float value) {
		setConstNumber(offset + 82, $unitPrice, value);
	}

	/**
	 *  .<p>
	 *
	 * 単価
	 */
	public void unitPrice(double value) {
		setConstNumber(offset + 82, $unitPrice, value);
	}


	/**
	 *  .<p>
	 *
	 * 数量
	 */
	public MCNumber qty_Plus() {
		return getConstNumber(offset + 83, $qty_Plus);
	}

	/**
	 *  .<p>
	 *
	 * 数量
	 */
	public void qty_Plus(MCNumber value) {
		setConstNumber(offset + 83, $qty_Plus, value);
	}

	/**
	 *  .<p>
	 *
	 * 数量
	 */
	public void qty_Plus(int value) {
		setConstNumber(offset + 83, $qty_Plus, value);
	}

	/**
	 *  .<p>
	 *
	 * 数量
	 */
	public void qty_Plus(long value) {
		setConstNumber(offset + 83, $qty_Plus, value);
	}

	/**
	 *  .<p>
	 *
	 * 数量
	 */
	public void qty_Plus(float value) {
		setConstNumber(offset + 83, $qty_Plus, value);
	}

	/**
	 *  .<p>
	 *
	 * 数量
	 */
	public void qty_Plus(double value) {
		setConstNumber(offset + 83, $qty_Plus, value);
	}


	/**
	 *  .<p>
	 *
	 * 入力金額
	 */
	public MCNumber inpAmount_Fc() {
		return getConstNumber(offset + 84, $inpAmount_Fc);
	}

	/**
	 *  .<p>
	 *
	 * 入力金額
	 */
	public void inpAmount_Fc(MCNumber value) {
		setConstNumber(offset + 84, $inpAmount_Fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力金額
	 */
	public void inpAmount_Fc(int value) {
		setConstNumber(offset + 84, $inpAmount_Fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力金額
	 */
	public void inpAmount_Fc(long value) {
		setConstNumber(offset + 84, $inpAmount_Fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力金額
	 */
	public void inpAmount_Fc(float value) {
		setConstNumber(offset + 84, $inpAmount_Fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力金額
	 */
	public void inpAmount_Fc(double value) {
		setConstNumber(offset + 84, $inpAmount_Fc, value);
	}


	/**
	 *  .<p>
	 *
	 * 入力税額
	 */
	public MCNumber taxAmount_Fc() {
		return getConstNumber(offset + 85, $taxAmount_Fc);
	}

	/**
	 *  .<p>
	 *
	 * 入力税額
	 */
	public void taxAmount_Fc(MCNumber value) {
		setConstNumber(offset + 85, $taxAmount_Fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税額
	 */
	public void taxAmount_Fc(int value) {
		setConstNumber(offset + 85, $taxAmount_Fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税額
	 */
	public void taxAmount_Fc(long value) {
		setConstNumber(offset + 85, $taxAmount_Fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税額
	 */
	public void taxAmount_Fc(float value) {
		setConstNumber(offset + 85, $taxAmount_Fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税額
	 */
	public void taxAmount_Fc(double value) {
		setConstNumber(offset + 85, $taxAmount_Fc, value);
	}


	/**
	 *  .<p>
	 *
	 * 入力税対象金額
	 */
	public MCNumber taxableAmount_Fc() {
		return getConstNumber(offset + 86, $taxableAmount_Fc);
	}

	/**
	 *  .<p>
	 *
	 * 入力税対象金額
	 */
	public void taxableAmount_Fc(MCNumber value) {
		setConstNumber(offset + 86, $taxableAmount_Fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税対象金額
	 */
	public void taxableAmount_Fc(int value) {
		setConstNumber(offset + 86, $taxableAmount_Fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税対象金額
	 */
	public void taxableAmount_Fc(long value) {
		setConstNumber(offset + 86, $taxableAmount_Fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税対象金額
	 */
	public void taxableAmount_Fc(float value) {
		setConstNumber(offset + 86, $taxableAmount_Fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税対象金額
	 */
	public void taxableAmount_Fc(double value) {
		setConstNumber(offset + 86, $taxableAmount_Fc, value);
	}


	/**
	 *  .<p>
	 *
	 * 基準金額
	 */
	public MCNumber inpAmount_Sc() {
		return getConstNumber(offset + 87, $inpAmount_Sc);
	}

	/**
	 *  .<p>
	 *
	 * 基準金額
	 */
	public void inpAmount_Sc(MCNumber value) {
		setConstNumber(offset + 87, $inpAmount_Sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準金額
	 */
	public void inpAmount_Sc(int value) {
		setConstNumber(offset + 87, $inpAmount_Sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準金額
	 */
	public void inpAmount_Sc(long value) {
		setConstNumber(offset + 87, $inpAmount_Sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準金額
	 */
	public void inpAmount_Sc(float value) {
		setConstNumber(offset + 87, $inpAmount_Sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準金額
	 */
	public void inpAmount_Sc(double value) {
		setConstNumber(offset + 87, $inpAmount_Sc, value);
	}


	/**
	 *  .<p>
	 *
	 * 基準税額
	 */
	public MCNumber taxAmount_Sc() {
		return getConstNumber(offset + 88, $taxAmount_Sc);
	}

	/**
	 *  .<p>
	 *
	 * 基準税額
	 */
	public void taxAmount_Sc(MCNumber value) {
		setConstNumber(offset + 88, $taxAmount_Sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税額
	 */
	public void taxAmount_Sc(int value) {
		setConstNumber(offset + 88, $taxAmount_Sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税額
	 */
	public void taxAmount_Sc(long value) {
		setConstNumber(offset + 88, $taxAmount_Sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税額
	 */
	public void taxAmount_Sc(float value) {
		setConstNumber(offset + 88, $taxAmount_Sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税額
	 */
	public void taxAmount_Sc(double value) {
		setConstNumber(offset + 88, $taxAmount_Sc, value);
	}


	/**
	 *  .<p>
	 *
	 * 基準税対象金額
	 */
	public MCNumber taxableAmount_Sc() {
		return getConstNumber(offset + 89, $taxableAmount_Sc);
	}

	/**
	 *  .<p>
	 *
	 * 基準税対象金額
	 */
	public void taxableAmount_Sc(MCNumber value) {
		setConstNumber(offset + 89, $taxableAmount_Sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税対象金額
	 */
	public void taxableAmount_Sc(int value) {
		setConstNumber(offset + 89, $taxableAmount_Sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税対象金額
	 */
	public void taxableAmount_Sc(long value) {
		setConstNumber(offset + 89, $taxableAmount_Sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税対象金額
	 */
	public void taxableAmount_Sc(float value) {
		setConstNumber(offset + 89, $taxableAmount_Sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税対象金額
	 */
	public void taxableAmount_Sc(double value) {
		setConstNumber(offset + 89, $taxableAmount_Sc, value);
	}


	/**
	 *  .<p>
	 *
	 * 荷姿コード
	 */
	public String packingUnitCode() {
		return getConstString(offset + 90, $packingUnitCode);
	}

	/**
	 *  .<p>
	 *
	 * 荷姿コード
	 */
	public void packingUnitCode(String value) {
		setConstString(offset + 90, $packingUnitCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 荷姿単価
	 */
	public MCNumber packingUnitPrice() {
		return getConstNumber(offset + 91, $packingUnitPrice);
	}

	/**
	 *  .<p>
	 *
	 * 荷姿単価
	 */
	public void packingUnitPrice(MCNumber value) {
		setConstNumber(offset + 91, $packingUnitPrice, value);
	}

	/**
	 *  .<p>
	 *
	 * 荷姿単価
	 */
	public void packingUnitPrice(int value) {
		setConstNumber(offset + 91, $packingUnitPrice, value);
	}

	/**
	 *  .<p>
	 *
	 * 荷姿単価
	 */
	public void packingUnitPrice(long value) {
		setConstNumber(offset + 91, $packingUnitPrice, value);
	}

	/**
	 *  .<p>
	 *
	 * 荷姿単価
	 */
	public void packingUnitPrice(float value) {
		setConstNumber(offset + 91, $packingUnitPrice, value);
	}

	/**
	 *  .<p>
	 *
	 * 荷姿単価
	 */
	public void packingUnitPrice(double value) {
		setConstNumber(offset + 91, $packingUnitPrice, value);
	}


	/**
	 *  .<p>
	 *
	 * 荷姿数量
	 */
	public MCNumber packingUnitQty() {
		return getConstNumber(offset + 92, $packingUnitQty);
	}

	/**
	 *  .<p>
	 *
	 * 荷姿数量
	 */
	public void packingUnitQty(MCNumber value) {
		setConstNumber(offset + 92, $packingUnitQty, value);
	}

	/**
	 *  .<p>
	 *
	 * 荷姿数量
	 */
	public void packingUnitQty(int value) {
		setConstNumber(offset + 92, $packingUnitQty, value);
	}

	/**
	 *  .<p>
	 *
	 * 荷姿数量
	 */
	public void packingUnitQty(long value) {
		setConstNumber(offset + 92, $packingUnitQty, value);
	}

	/**
	 *  .<p>
	 *
	 * 荷姿数量
	 */
	public void packingUnitQty(float value) {
		setConstNumber(offset + 92, $packingUnitQty, value);
	}

	/**
	 *  .<p>
	 *
	 * 荷姿数量
	 */
	public void packingUnitQty(double value) {
		setConstNumber(offset + 92, $packingUnitQty, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細摘要コード
	 */
	public String detail_Descript_Code() {
		return getConstString(offset + 93, $detail_Descript_Code);
	}

	/**
	 *  .<p>
	 *
	 * 明細摘要コード
	 */
	public void detail_Descript_Code(String value) {
		setConstString(offset + 93, $detail_Descript_Code, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細摘要内容
	 */
	public String detail_Descript_Name() {
		return getConstString(offset + 94, $detail_Descript_Name);
	}

	/**
	 *  .<p>
	 *
	 * 明細摘要内容
	 */
	public void detail_Descript_Name(String value) {
		setConstString(offset + 94, $detail_Descript_Name, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ1
	 */
	public String detail_UserMaster1() {
		return getConstString(offset + 95, $detail_UserMaster1);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ1
	 */
	public void detail_UserMaster1(String value) {
		setConstString(offset + 95, $detail_UserMaster1, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ2
	 */
	public String detail_UserMaster2() {
		return getConstString(offset + 96, $detail_UserMaster2);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ2
	 */
	public void detail_UserMaster2(String value) {
		setConstString(offset + 96, $detail_UserMaster2, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ3
	 */
	public String detail_UserMaster3() {
		return getConstString(offset + 97, $detail_UserMaster3);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ3
	 */
	public void detail_UserMaster3(String value) {
		setConstString(offset + 97, $detail_UserMaster3, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ4
	 */
	public String detail_UserMaster4() {
		return getConstString(offset + 98, $detail_UserMaster4);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ4
	 */
	public void detail_UserMaster4(String value) {
		setConstString(offset + 98, $detail_UserMaster4, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ5
	 */
	public String detail_UserMaster5() {
		return getConstString(offset + 99, $detail_UserMaster5);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ5
	 */
	public void detail_UserMaster5(String value) {
		setConstString(offset + 99, $detail_UserMaster5, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザコード
	 */
	public String detail_UserCode() {
		return getConstString(offset + 100, $detail_UserCode);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザコード
	 */
	public void detail_UserCode(String value) {
		setConstString(offset + 100, $detail_UserCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザテキスト
	 */
	public String detail_UserText() {
		return getConstString(offset + 101, $detail_UserText);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザテキスト
	 */
	public void detail_UserText(String value) {
		setConstString(offset + 101, $detail_UserText, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザ日付
	 */
	public String detail_UserDate() {
		return getConstString(offset + 102, $detail_UserDate);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザ日付
	 */
	public void detail_UserDate(String value) {
		setConstString(offset + 102, $detail_UserDate, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザ数量
	 */
	public MCNumber detail_UserQty() {
		return getConstNumber(offset + 103, $detail_UserQty);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザ数量
	 */
	public void detail_UserQty(MCNumber value) {
		setConstNumber(offset + 103, $detail_UserQty, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザ数量
	 */
	public void detail_UserQty(int value) {
		setConstNumber(offset + 103, $detail_UserQty, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザ数量
	 */
	public void detail_UserQty(long value) {
		setConstNumber(offset + 103, $detail_UserQty, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザ数量
	 */
	public void detail_UserQty(float value) {
		setConstNumber(offset + 103, $detail_UserQty, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザ数量
	 */
	public void detail_UserQty(double value) {
		setConstNumber(offset + 103, $detail_UserQty, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細フレックスマスタ
	 */
	public String detail_FlexMaster() {
		return getConstString(offset + 104, $detail_FlexMaster);
	}

	/**
	 *  .<p>
	 *
	 * 明細フレックスマスタ
	 */
	public void detail_FlexMaster(String value) {
		setConstString(offset + 104, $detail_FlexMaster, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細フレックスコード
	 */
	public String detail_FlexCode() {
		return getConstString(offset + 105, $detail_FlexCode);
	}

	/**
	 *  .<p>
	 *
	 * 明細フレックスコード
	 */
	public void detail_FlexCode(String value) {
		setConstString(offset + 105, $detail_FlexCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細フレックステキスト1
	 */
	public String detail_FlexText1() {
		return getConstString(offset + 106, $detail_FlexText1);
	}

	/**
	 *  .<p>
	 *
	 * 明細フレックステキスト1
	 */
	public void detail_FlexText1(String value) {
		setConstString(offset + 106, $detail_FlexText1, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細フレックステキスト2
	 */
	public String detail_FlexText2() {
		return getConstString(offset + 107, $detail_FlexText2);
	}

	/**
	 *  .<p>
	 *
	 * 明細フレックステキスト2
	 */
	public void detail_FlexText2(String value) {
		setConstString(offset + 107, $detail_FlexText2, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細フレックス日付
	 */
	public String detail_FlexDate() {
		return getConstString(offset + 108, $detail_FlexDate);
	}

	/**
	 *  .<p>
	 *
	 * 明細フレックス日付
	 */
	public void detail_FlexDate(String value) {
		setConstString(offset + 108, $detail_FlexDate, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細摘要コード
	 */
	public String sub_Descript_Code() {
		return getConstString(offset + 109, $sub_Descript_Code);
	}

	/**
	 *  .<p>
	 *
	 * 明細摘要コード
	 */
	public void sub_Descript_Code(String value) {
		setConstString(offset + 109, $sub_Descript_Code, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細摘要内容
	 */
	public String sub_Descript_Name() {
		return getConstString(offset + 110, $sub_Descript_Name);
	}

	/**
	 *  .<p>
	 *
	 * 明細摘要内容
	 */
	public void sub_Descript_Name(String value) {
		setConstString(offset + 110, $sub_Descript_Name, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ1
	 */
	public String sub_UserMaster1() {
		return getConstString(offset + 111, $sub_UserMaster1);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ1
	 */
	public void sub_UserMaster1(String value) {
		setConstString(offset + 111, $sub_UserMaster1, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ2
	 */
	public String sub_UserMaster2() {
		return getConstString(offset + 112, $sub_UserMaster2);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ2
	 */
	public void sub_UserMaster2(String value) {
		setConstString(offset + 112, $sub_UserMaster2, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ3
	 */
	public String sub_UserMaster3() {
		return getConstString(offset + 113, $sub_UserMaster3);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ3
	 */
	public void sub_UserMaster3(String value) {
		setConstString(offset + 113, $sub_UserMaster3, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ4
	 */
	public String sub_UserMaster4() {
		return getConstString(offset + 114, $sub_UserMaster4);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ4
	 */
	public void sub_UserMaster4(String value) {
		setConstString(offset + 114, $sub_UserMaster4, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ5
	 */
	public String sub_UserMaster5() {
		return getConstString(offset + 115, $sub_UserMaster5);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザマスタ5
	 */
	public void sub_UserMaster5(String value) {
		setConstString(offset + 115, $sub_UserMaster5, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザコード
	 */
	public String sub_UserCode() {
		return getConstString(offset + 116, $sub_UserCode);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザコード
	 */
	public void sub_UserCode(String value) {
		setConstString(offset + 116, $sub_UserCode, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザテキスト
	 */
	public String sub_UserText() {
		return getConstString(offset + 117, $sub_UserText);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザテキスト
	 */
	public void sub_UserText(String value) {
		setConstString(offset + 117, $sub_UserText, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザ日付
	 */
	public String sub_UserDate() {
		return getConstString(offset + 118, $sub_UserDate);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザ日付
	 */
	public void sub_UserDate(String value) {
		setConstString(offset + 118, $sub_UserDate, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ユーザ数量
	 */
	public MCNumber sub_UserQty() {
		return getConstNumber(offset + 119, $sub_UserQty);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザ数量
	 */
	public void sub_UserQty(MCNumber value) {
		setConstNumber(offset + 119, $sub_UserQty, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザ数量
	 */
	public void sub_UserQty(int value) {
		setConstNumber(offset + 119, $sub_UserQty, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザ数量
	 */
	public void sub_UserQty(long value) {
		setConstNumber(offset + 119, $sub_UserQty, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザ数量
	 */
	public void sub_UserQty(float value) {
		setConstNumber(offset + 119, $sub_UserQty, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細ユーザ数量
	 */
	public void sub_UserQty(double value) {
		setConstNumber(offset + 119, $sub_UserQty, value);
	}


	/**
	 *  .<p>
	 *
	 * LOTフレックスマスタ
	 */
	public String lot_FlexMaster() {
		return getConstString(offset + 120, $lot_FlexMaster);
	}

	/**
	 *  .<p>
	 *
	 * LOTフレックスマスタ
	 */
	public void lot_FlexMaster(String value) {
		setConstString(offset + 120, $lot_FlexMaster, value);
	}


	/**
	 *  .<p>
	 *
	 * LOTフレックステキスト1
	 */
	public String lot_FlexText1() {
		return getConstString(offset + 121, $lot_FlexText1);
	}

	/**
	 *  .<p>
	 *
	 * LOTフレックステキスト1
	 */
	public void lot_FlexText1(String value) {
		setConstString(offset + 121, $lot_FlexText1, value);
	}


	/**
	 *  .<p>
	 *
	 * LOTフレックステキスト2
	 */
	public String lot_FlexText2() {
		return getConstString(offset + 122, $lot_FlexText2);
	}

	/**
	 *  .<p>
	 *
	 * LOTフレックステキスト2
	 */
	public void lot_FlexText2(String value) {
		setConstString(offset + 122, $lot_FlexText2, value);
	}


	/**
	 *  .<p>
	 *
	 * LOTフレックス日付
	 */
	public String lot_FlexDate() {
		return getConstString(offset + 123, $lot_FlexDate);
	}

	/**
	 *  .<p>
	 *
	 * LOTフレックス日付
	 */
	public void lot_FlexDate(String value) {
		setConstString(offset + 123, $lot_FlexDate, value);
	}


	/**
	 *  .<p>
	 *
	 * 顧客
	 */
	public String billtocode() {
		return getConstString(offset + 124, $billtocode);
	}

	/**
	 *  .<p>
	 *
	 * 顧客
	 */
	public void billtocode(String value) {
		setConstString(offset + 124, $billtocode, value);
	}


	/**
	 *  .<p>
	 *
	 * ｴﾝﾄﾞﾕｰｻﾞ
	 */
	public String endusercode() {
		return getConstString(offset + 125, $endusercode);
	}

	/**
	 *  .<p>
	 *
	 * ｴﾝﾄﾞﾕｰｻﾞ
	 */
	public void endusercode(String value) {
		setConstString(offset + 125, $endusercode, value);
	}


	/**
	 *  .<p>
	 *
	 * 引継元№
	 */
	public String succeedVoucherNo() {
		return getConstString(offset + 126, $succeedVoucherNo);
	}

	/**
	 *  .<p>
	 *
	 * 引継元№
	 */
	public void succeedVoucherNo(String value) {
		setConstString(offset + 126, $succeedVoucherNo, value);
	}


	public String getString(String name) {
		if ($inpDate.equalsIgnoreCase(name)) {
			return inpDate();
		}
		if ($voucherNo.equalsIgnoreCase(name)) {
			return voucherNo();
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
		if ($bankAcct_Corresp.equalsIgnoreCase(name)) {
			return bankAcct_Corresp();
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
		if ($invoiceNo.equalsIgnoreCase(name)) {
			return invoiceNo();
		}
		if ($approveGroupCode.equalsIgnoreCase(name)) {
			return approveGroupCode();
		}
		if ($iraiCode.equalsIgnoreCase(name)) {
			return iraiCode();
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
		if ($customerNo.equalsIgnoreCase(name)) {
			return customerNo();
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
		if ($lotNo.equalsIgnoreCase(name)) {
			return lotNo();
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
		if ($lot_FlexMaster.equalsIgnoreCase(name)) {
			return lot_FlexMaster();
		}
		if ($lot_FlexText1.equalsIgnoreCase(name)) {
			return lot_FlexText1();
		}
		if ($lot_FlexText2.equalsIgnoreCase(name)) {
			return lot_FlexText2();
		}
		if ($lot_FlexDate.equalsIgnoreCase(name)) {
			return lot_FlexDate();
		}
		if ($billtocode.equalsIgnoreCase(name)) {
			return billtocode();
		}
		if ($endusercode.equalsIgnoreCase(name)) {
			return endusercode();
		}
		if ($succeedVoucherNo.equalsIgnoreCase(name)) {
			return succeedVoucherNo();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rate.equalsIgnoreCase(name)) {
			return rate();
		}
		if ($taxType.equalsIgnoreCase(name)) {
			return taxType();
		}
		if ($journalType.equalsIgnoreCase(name)) {
			return journalType();
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
		if ($qty_Plus.equalsIgnoreCase(name)) {
			return qty_Plus();
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
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($inpDate.equalsIgnoreCase(name)) {
			return inpDate();
		}
		if ($voucherNo.equalsIgnoreCase(name)) {
			return voucherNo();
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
		if ($bankAcct_Corresp.equalsIgnoreCase(name)) {
			return bankAcct_Corresp();
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
		if ($invoiceNo.equalsIgnoreCase(name)) {
			return invoiceNo();
		}
		if ($approveGroupCode.equalsIgnoreCase(name)) {
			return approveGroupCode();
		}
		if ($iraiCode.equalsIgnoreCase(name)) {
			return iraiCode();
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
		if ($customerNo.equalsIgnoreCase(name)) {
			return customerNo();
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
		if ($lotNo.equalsIgnoreCase(name)) {
			return lotNo();
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
		if ($lot_FlexMaster.equalsIgnoreCase(name)) {
			return lot_FlexMaster();
		}
		if ($lot_FlexText1.equalsIgnoreCase(name)) {
			return lot_FlexText1();
		}
		if ($lot_FlexText2.equalsIgnoreCase(name)) {
			return lot_FlexText2();
		}
		if ($lot_FlexDate.equalsIgnoreCase(name)) {
			return lot_FlexDate();
		}
		if ($billtocode.equalsIgnoreCase(name)) {
			return billtocode();
		}
		if ($endusercode.equalsIgnoreCase(name)) {
			return endusercode();
		}
		if ($succeedVoucherNo.equalsIgnoreCase(name)) {
			return succeedVoucherNo();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rate.equalsIgnoreCase(name)) {
			return rate();
		}
		if ($taxType.equalsIgnoreCase(name)) {
			return taxType();
		}
		if ($journalType.equalsIgnoreCase(name)) {
			return journalType();
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
		if ($qty_Plus.equalsIgnoreCase(name)) {
			return qty_Plus();
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
		if ($bankAcct_Corresp.equalsIgnoreCase(name)) {
			bankAcct_Corresp(value);
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
		if ($invoiceNo.equalsIgnoreCase(name)) {
			invoiceNo(value);
			return;
		}
		if ($approveGroupCode.equalsIgnoreCase(name)) {
			approveGroupCode(value);
			return;
		}
		if ($iraiCode.equalsIgnoreCase(name)) {
			iraiCode(value);
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
		if ($customerNo.equalsIgnoreCase(name)) {
			customerNo(value);
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
		if ($lotNo.equalsIgnoreCase(name)) {
			lotNo(value);
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
		if ($lot_FlexMaster.equalsIgnoreCase(name)) {
			lot_FlexMaster(value);
			return;
		}
		if ($lot_FlexText1.equalsIgnoreCase(name)) {
			lot_FlexText1(value);
			return;
		}
		if ($lot_FlexText2.equalsIgnoreCase(name)) {
			lot_FlexText2(value);
			return;
		}
		if ($lot_FlexDate.equalsIgnoreCase(name)) {
			lot_FlexDate(value);
			return;
		}
		if ($billtocode.equalsIgnoreCase(name)) {
			billtocode(value);
			return;
		}
		if ($endusercode.equalsIgnoreCase(name)) {
			endusercode(value);
			return;
		}
		if ($succeedVoucherNo.equalsIgnoreCase(name)) {
			succeedVoucherNo(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($journalType.equalsIgnoreCase(name)) {
			journalType(value);
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
		if ($qty_Plus.equalsIgnoreCase(name)) {
			qty_Plus(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($journalType.equalsIgnoreCase(name)) {
			journalType(value);
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
		if ($qty_Plus.equalsIgnoreCase(name)) {
			qty_Plus(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($journalType.equalsIgnoreCase(name)) {
			journalType(value);
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
		if ($qty_Plus.equalsIgnoreCase(name)) {
			qty_Plus(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($journalType.equalsIgnoreCase(name)) {
			journalType(value);
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
		if ($qty_Plus.equalsIgnoreCase(name)) {
			qty_Plus(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($journalType.equalsIgnoreCase(name)) {
			journalType(value);
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
		if ($qty_Plus.equalsIgnoreCase(name)) {
			qty_Plus(value);
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
		if ($bankAcct_Corresp.equalsIgnoreCase(name)) {
			bankAcct_Corresp(value);
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
		if ($invoiceNo.equalsIgnoreCase(name)) {
			invoiceNo(value);
			return;
		}
		if ($approveGroupCode.equalsIgnoreCase(name)) {
			approveGroupCode(value);
			return;
		}
		if ($iraiCode.equalsIgnoreCase(name)) {
			iraiCode(value);
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
		if ($customerNo.equalsIgnoreCase(name)) {
			customerNo(value);
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
		if ($lotNo.equalsIgnoreCase(name)) {
			lotNo(value);
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
		if ($lot_FlexMaster.equalsIgnoreCase(name)) {
			lot_FlexMaster(value);
			return;
		}
		if ($lot_FlexText1.equalsIgnoreCase(name)) {
			lot_FlexText1(value);
			return;
		}
		if ($lot_FlexText2.equalsIgnoreCase(name)) {
			lot_FlexText2(value);
			return;
		}
		if ($lot_FlexDate.equalsIgnoreCase(name)) {
			lot_FlexDate(value);
			return;
		}
		if ($billtocode.equalsIgnoreCase(name)) {
			billtocode(value);
			return;
		}
		if ($endusercode.equalsIgnoreCase(name)) {
			endusercode(value);
			return;
		}
		if ($succeedVoucherNo.equalsIgnoreCase(name)) {
			succeedVoucherNo(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($journalType.equalsIgnoreCase(name)) {
			journalType(value);
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
		if ($qty_Plus.equalsIgnoreCase(name)) {
			qty_Plus(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($journalType.equalsIgnoreCase(name)) {
			journalType(value);
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
		if ($qty_Plus.equalsIgnoreCase(name)) {
			qty_Plus(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($journalType.equalsIgnoreCase(name)) {
			journalType(value);
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
		if ($qty_Plus.equalsIgnoreCase(name)) {
			qty_Plus(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($journalType.equalsIgnoreCase(name)) {
			journalType(value);
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
		if ($qty_Plus.equalsIgnoreCase(name)) {
			qty_Plus(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($taxType.equalsIgnoreCase(name)) {
			taxType(value);
			return;
		}
		if ($journalType.equalsIgnoreCase(name)) {
			journalType(value);
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
		if ($qty_Plus.equalsIgnoreCase(name)) {
			qty_Plus(value);
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
		super.setNumberNE(name, value);
	}



}

