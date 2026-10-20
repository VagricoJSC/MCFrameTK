package mcframe.serverMSBB.MSBBLA0010;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Zoho sales schedule No. ＺＯＨＯ販売予定ＮＯ.<p>
	 *
	 */
	public static final String $zoho_sls_schd_no = "zoho_sls_schd_no";
	/**
	 * Deal cd. 商談ＣＤ.<p>
	 *
	 */
	public static final String $deal_cd = "deal_cd";
	/**
	 * Deal name 商談名.<p>
	 *
	 */
	public static final String $deal_nm = "deal_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $sls_dpt_nm = "sls_dpt_nm";
	/**
	 * Dept. in charge cd. 担当部門ＣＤ.<p>
	 *
	 */
	public static final String $frcst_dpt_cd = "frcst_dpt_cd";
	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public static final String $frcst_dpt_nm = "frcst_dpt_nm";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $frcst_usr_cd = "frcst_usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $frcst_usr_nm = "frcst_usr_nm";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Product item cd. 製品ＣＤ.<p>
	 *
	 */
	public static final String $prod_itm_cd = "prod_itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $prod_itm_sub1 = "prod_itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $prod_itm_sub2 = "prod_itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $prod_itm_sub3 = "prod_itm_sub3";
	/**
	 * Product item name 製品名.<p>
	 *
	 */
	public static final String $prod_itm_nm = "prod_itm_nm";
	/**
	 * Order delivery date 注文書納期.<p>
	 *
	 */
	public static final String $ord_dlv_dt = "ord_dlv_dt";
	/**
	 * Post-installation sales date 装備後売上日.<p>
	 *
	 */
	public static final String $post_inst_sls_dt = "post_inst_sls_dt";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $prd_amt = "prd_amt";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $prd_qty = "prd_qty";
	/**
	 * Currency cd. 外貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Item cd. 品目CD.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri = "upri";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";


	public static final MCMeta zoho_sls_schd_no_META = createCommonMeta($zoho_sls_schd_no, mcframe.commonMA.meta.MA_META.ZOHO_SLS_SCHD_NO);
	public static final MCMeta deal_cd_META = createCommonMeta($deal_cd, mcframe.commonMA.meta.MA_META.DEAL_CD);
	public static final MCMeta deal_nm_META = createCommonMeta($deal_nm, mcframe.commonMA.meta.MA_META.DEAL_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta frcst_dpt_cd_META = createCommonMeta($frcst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta frcst_dpt_nm_META = createCommonMeta($frcst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta frcst_usr_cd_META = createCommonMeta($frcst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta frcst_usr_nm_META = createCommonMeta($frcst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta prod_itm_cd_META = createCommonMeta($prod_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta prod_itm_sub1_META = createCommonMeta($prod_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta prod_itm_sub2_META = createCommonMeta($prod_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta prod_itm_sub3_META = createCommonMeta($prod_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta prod_itm_nm_META = createCommonMeta($prod_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ord_dlv_dt_META = createCommonMeta($ord_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta post_inst_sls_dt_META = createCommonMeta($post_inst_sls_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prd_amt_META = createCommonMeta($prd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prd_qty_META = createCommonMeta($prd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta upri_META = createCommonMeta($upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			zoho_sls_schd_no_META,
			deal_cd_META,
			deal_nm_META,
			cst_cd_META,
			cst_nm_META,
			bcst_cd_META,
			bcst_nm_META,
			sls_dpt_cd_META,
			sls_dpt_nm_META,
			frcst_dpt_cd_META,
			frcst_dpt_nm_META,
			frcst_usr_cd_META,
			frcst_usr_nm_META,
			wrk_no_META,
			wrk_nm_META,
			prod_itm_cd_META,
			prod_itm_sub1_META,
			prod_itm_sub2_META,
			prod_itm_sub3_META,
			prod_itm_nm_META,
			ord_dlv_dt_META,
			post_inst_sls_dt_META,
			prd_amt_META,
			prd_qty_META,
			cur_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			qty_META,
			upri_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		))
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Zoho sales schedule No. ＺＯＨＯ販売予定ＮＯ.<p>
	 *
	 */
	public String zoho_sls_schd_no() {
		return getConstString(offset + 0, $zoho_sls_schd_no);
	}

	/**
	 * Zoho sales schedule No. ＺＯＨＯ販売予定ＮＯ.<p>
	 *
	 */
	public void zoho_sls_schd_no(String value) {
		setConstString(offset + 0, $zoho_sls_schd_no, value);
	}


	/**
	 * Deal cd. 商談ＣＤ.<p>
	 *
	 */
	public String deal_cd() {
		return getConstString(offset + 1, $deal_cd);
	}

	/**
	 * Deal cd. 商談ＣＤ.<p>
	 *
	 */
	public void deal_cd(String value) {
		setConstString(offset + 1, $deal_cd, value);
	}


	/**
	 * Deal name 商談名.<p>
	 *
	 */
	public String deal_nm() {
		return getConstString(offset + 2, $deal_nm);
	}

	/**
	 * Deal name 商談名.<p>
	 *
	 */
	public void deal_nm(String value) {
		setConstString(offset + 2, $deal_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 3, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 3, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 4, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 4, $cst_nm, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 5, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 5, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 6, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 6, $bcst_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 7, $sls_dpt_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 7, $sls_dpt_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 8, $sls_dpt_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 8, $sls_dpt_nm, value);
	}


	/**
	 * Dept. in charge cd. 担当部門ＣＤ.<p>
	 *
	 */
	public String frcst_dpt_cd() {
		return getConstString(offset + 9, $frcst_dpt_cd);
	}

	/**
	 * Dept. in charge cd. 担当部門ＣＤ.<p>
	 *
	 */
	public void frcst_dpt_cd(String value) {
		setConstString(offset + 9, $frcst_dpt_cd, value);
	}


	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public String frcst_dpt_nm() {
		return getConstString(offset + 10, $frcst_dpt_nm);
	}

	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public void frcst_dpt_nm(String value) {
		setConstString(offset + 10, $frcst_dpt_nm, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String frcst_usr_cd() {
		return getConstString(offset + 11, $frcst_usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void frcst_usr_cd(String value) {
		setConstString(offset + 11, $frcst_usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String frcst_usr_nm() {
		return getConstString(offset + 12, $frcst_usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void frcst_usr_nm(String value) {
		setConstString(offset + 12, $frcst_usr_nm, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 13, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 13, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 14, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 14, $wrk_nm, value);
	}


	/**
	 * Product item cd. 製品ＣＤ.<p>
	 *
	 */
	public String prod_itm_cd() {
		return getConstString(offset + 15, $prod_itm_cd);
	}

	/**
	 * Product item cd. 製品ＣＤ.<p>
	 *
	 */
	public void prod_itm_cd(String value) {
		setConstString(offset + 15, $prod_itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String prod_itm_sub1() {
		return getConstString(offset + 16, $prod_itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void prod_itm_sub1(String value) {
		setConstString(offset + 16, $prod_itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String prod_itm_sub2() {
		return getConstString(offset + 17, $prod_itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void prod_itm_sub2(String value) {
		setConstString(offset + 17, $prod_itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String prod_itm_sub3() {
		return getConstString(offset + 18, $prod_itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void prod_itm_sub3(String value) {
		setConstString(offset + 18, $prod_itm_sub3, value);
	}


	/**
	 * Product item name 製品名.<p>
	 *
	 */
	public String prod_itm_nm() {
		return getConstString(offset + 19, $prod_itm_nm);
	}

	/**
	 * Product item name 製品名.<p>
	 *
	 */
	public void prod_itm_nm(String value) {
		setConstString(offset + 19, $prod_itm_nm, value);
	}


	/**
	 * Order delivery date 注文書納期.<p>
	 *
	 */
	public MCDate ord_dlv_dt() {
		return getConstDate(offset + 20, $ord_dlv_dt);
	}

	/**
	 * Order delivery date 注文書納期.<p>
	 *
	 */
	public void ord_dlv_dt(MCDate value) {
		setConstDate(offset + 20, $ord_dlv_dt, value);
	}


	/**
	 * Post-installation sales date 装備後売上日.<p>
	 *
	 */
	public MCDate post_inst_sls_dt() {
		return getConstDate(offset + 21, $post_inst_sls_dt);
	}

	/**
	 * Post-installation sales date 装備後売上日.<p>
	 *
	 */
	public void post_inst_sls_dt(MCDate value) {
		setConstDate(offset + 21, $post_inst_sls_dt, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber prd_amt() {
		return getConstNumber(offset + 22, $prd_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void prd_amt(MCNumber value) {
		setConstNumber(offset + 22, $prd_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void prd_amt(int value) {
		setConstNumber(offset + 22, $prd_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void prd_amt(long value) {
		setConstNumber(offset + 22, $prd_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void prd_amt(float value) {
		setConstNumber(offset + 22, $prd_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void prd_amt(double value) {
		setConstNumber(offset + 22, $prd_amt, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber prd_qty() {
		return getConstNumber(offset + 23, $prd_qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void prd_qty(MCNumber value) {
		setConstNumber(offset + 23, $prd_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void prd_qty(int value) {
		setConstNumber(offset + 23, $prd_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void prd_qty(long value) {
		setConstNumber(offset + 23, $prd_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void prd_qty(float value) {
		setConstNumber(offset + 23, $prd_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void prd_qty(double value) {
		setConstNumber(offset + 23, $prd_qty, value);
	}


	/**
	 * Currency cd. 外貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 24, $cur_cd);
	}

	/**
	 * Currency cd. 外貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 24, $cur_cd, value);
	}


	/**
	 * Item cd. 品目CD.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 25, $itm_cd);
	}

	/**
	 * Item cd. 品目CD.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 25, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 26, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 26, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 27, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 27, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 28, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 28, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 29, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 29, $itm_nm, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 30, $qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 30, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 30, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 30, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 30, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 30, $qty, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri() {
		return getConstNumber(offset + 31, $upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(MCNumber value) {
		setConstNumber(offset + 31, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(int value) {
		setConstNumber(offset + 31, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(long value) {
		setConstNumber(offset + 31, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(float value) {
		setConstNumber(offset + 31, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(double value) {
		setConstNumber(offset + 31, $upri, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 32, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 32, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 33, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 33, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 34, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 34, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 35, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 35, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 36, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 36, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 37, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 37, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 38, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 38, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 39, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 39, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 40, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 40, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 41, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 41, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 42, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 42, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			return zoho_sls_schd_no();
		}
		if ($deal_cd.equalsIgnoreCase(name)) {
			return deal_cd();
		}
		if ($deal_nm.equalsIgnoreCase(name)) {
			return deal_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($frcst_dpt_cd.equalsIgnoreCase(name)) {
			return frcst_dpt_cd();
		}
		if ($frcst_dpt_nm.equalsIgnoreCase(name)) {
			return frcst_dpt_nm();
		}
		if ($frcst_usr_cd.equalsIgnoreCase(name)) {
			return frcst_usr_cd();
		}
		if ($frcst_usr_nm.equalsIgnoreCase(name)) {
			return frcst_usr_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			return prod_itm_cd();
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			return prod_itm_sub1();
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			return prod_itm_sub2();
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			return prod_itm_sub3();
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			return prod_itm_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($prd_amt.equalsIgnoreCase(name)) {
			return prd_amt();
		}
		if ($prd_qty.equalsIgnoreCase(name)) {
			return prd_qty();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($upri.equalsIgnoreCase(name)) {
			return upri();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ord_dlv_dt.equalsIgnoreCase(name)) {
			return ord_dlv_dt();
		}
		if ($post_inst_sls_dt.equalsIgnoreCase(name)) {
			return post_inst_sls_dt();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public String getStringNE(String name) {
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			return zoho_sls_schd_no();
		}
		if ($deal_cd.equalsIgnoreCase(name)) {
			return deal_cd();
		}
		if ($deal_nm.equalsIgnoreCase(name)) {
			return deal_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($frcst_dpt_cd.equalsIgnoreCase(name)) {
			return frcst_dpt_cd();
		}
		if ($frcst_dpt_nm.equalsIgnoreCase(name)) {
			return frcst_dpt_nm();
		}
		if ($frcst_usr_cd.equalsIgnoreCase(name)) {
			return frcst_usr_cd();
		}
		if ($frcst_usr_nm.equalsIgnoreCase(name)) {
			return frcst_usr_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			return prod_itm_cd();
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			return prod_itm_sub1();
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			return prod_itm_sub2();
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			return prod_itm_sub3();
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			return prod_itm_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($prd_amt.equalsIgnoreCase(name)) {
			return prd_amt();
		}
		if ($prd_qty.equalsIgnoreCase(name)) {
			return prd_qty();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($upri.equalsIgnoreCase(name)) {
			return upri();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ord_dlv_dt.equalsIgnoreCase(name)) {
			return ord_dlv_dt();
		}
		if ($post_inst_sls_dt.equalsIgnoreCase(name)) {
			return post_inst_sls_dt();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public void setString(String name, String value) {
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			zoho_sls_schd_no(value);
			return;
		}
		if ($deal_cd.equalsIgnoreCase(name)) {
			deal_cd(value);
			return;
		}
		if ($deal_nm.equalsIgnoreCase(name)) {
			deal_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
			return;
		}
		if ($frcst_dpt_cd.equalsIgnoreCase(name)) {
			frcst_dpt_cd(value);
			return;
		}
		if ($frcst_dpt_nm.equalsIgnoreCase(name)) {
			frcst_dpt_nm(value);
			return;
		}
		if ($frcst_usr_cd.equalsIgnoreCase(name)) {
			frcst_usr_cd(value);
			return;
		}
		if ($frcst_usr_nm.equalsIgnoreCase(name)) {
			frcst_usr_nm(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			prod_itm_cd(value);
			return;
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			prod_itm_sub1(value);
			return;
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			prod_itm_sub2(value);
			return;
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			prod_itm_sub3(value);
			return;
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			prod_itm_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($prd_amt.equalsIgnoreCase(name)) {
			prd_amt(value);
			return;
		}
		if ($prd_qty.equalsIgnoreCase(name)) {
			prd_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($prd_amt.equalsIgnoreCase(name)) {
			prd_amt(value);
			return;
		}
		if ($prd_qty.equalsIgnoreCase(name)) {
			prd_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($prd_amt.equalsIgnoreCase(name)) {
			prd_amt(value);
			return;
		}
		if ($prd_qty.equalsIgnoreCase(name)) {
			prd_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($prd_amt.equalsIgnoreCase(name)) {
			prd_amt(value);
			return;
		}
		if ($prd_qty.equalsIgnoreCase(name)) {
			prd_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($prd_amt.equalsIgnoreCase(name)) {
			prd_amt(value);
			return;
		}
		if ($prd_qty.equalsIgnoreCase(name)) {
			prd_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ord_dlv_dt.equalsIgnoreCase(name)) {
			ord_dlv_dt(value);
			return;
		}
		if ($post_inst_sls_dt.equalsIgnoreCase(name)) {
			post_inst_sls_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			zoho_sls_schd_no(value);
			return;
		}
		if ($deal_cd.equalsIgnoreCase(name)) {
			deal_cd(value);
			return;
		}
		if ($deal_nm.equalsIgnoreCase(name)) {
			deal_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
			return;
		}
		if ($frcst_dpt_cd.equalsIgnoreCase(name)) {
			frcst_dpt_cd(value);
			return;
		}
		if ($frcst_dpt_nm.equalsIgnoreCase(name)) {
			frcst_dpt_nm(value);
			return;
		}
		if ($frcst_usr_cd.equalsIgnoreCase(name)) {
			frcst_usr_cd(value);
			return;
		}
		if ($frcst_usr_nm.equalsIgnoreCase(name)) {
			frcst_usr_nm(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			prod_itm_cd(value);
			return;
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			prod_itm_sub1(value);
			return;
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			prod_itm_sub2(value);
			return;
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			prod_itm_sub3(value);
			return;
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			prod_itm_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($prd_amt.equalsIgnoreCase(name)) {
			prd_amt(value);
			return;
		}
		if ($prd_qty.equalsIgnoreCase(name)) {
			prd_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($prd_amt.equalsIgnoreCase(name)) {
			prd_amt(value);
			return;
		}
		if ($prd_qty.equalsIgnoreCase(name)) {
			prd_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($prd_amt.equalsIgnoreCase(name)) {
			prd_amt(value);
			return;
		}
		if ($prd_qty.equalsIgnoreCase(name)) {
			prd_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($prd_amt.equalsIgnoreCase(name)) {
			prd_amt(value);
			return;
		}
		if ($prd_qty.equalsIgnoreCase(name)) {
			prd_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($prd_amt.equalsIgnoreCase(name)) {
			prd_amt(value);
			return;
		}
		if ($prd_qty.equalsIgnoreCase(name)) {
			prd_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ord_dlv_dt.equalsIgnoreCase(name)) {
			ord_dlv_dt(value);
			return;
		}
		if ($post_inst_sls_dt.equalsIgnoreCase(name)) {
			post_inst_sls_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}



}

