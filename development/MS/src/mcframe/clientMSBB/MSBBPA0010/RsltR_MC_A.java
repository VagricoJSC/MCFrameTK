package mcframe.clientMSBB.MSBBPA0010;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

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
	public static final String $bill_cst_cd = "bill_cst_cd";
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public static final String $bill_cst_nm = "bill_cst_nm";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public static final String $sls_dpt_nm = "sls_dpt_nm";
	/**
	 * Project manager user cd. 案件担当者ＣＤ.<p>
	 *
	 */
	public static final String $frcst_usr_cd = "frcst_usr_cd";
	/**
	 * Project manager user name 案件担当者名.<p>
	 *
	 */
	public static final String $frcst_usr_nm = "frcst_usr_nm";
	/**
	 * Market cd. 市場ＣＤ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Market name 市場名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Product item cd. 製品ＣＤ.<p>
	 *
	 */
	public static final String $prd_itm_cd = "prd_itm_cd";
	/**
	 * Product item name 製品名.<p>
	 *
	 */
	public static final String $prd_itm_nm = "prd_itm_nm";
	/**
	 * Order delivery date 注文書納期.<p>
	 *
	 */
	public static final String $order_dlv_dt = "order_dlv_dt";
	/**
	 * Post-installation sales date 装備後売上日.<p>
	 *
	 */
	public static final String $pst_inst_sls_dt = "pst_inst_sls_dt";


	public static final MCMeta zoho_sls_schd_no_META = createCommonMeta($zoho_sls_schd_no, mcframe.commonMA.meta.MA_META.ZOHO_SLS_SCHD_NO);
	public static final MCMeta deal_cd_META = createCommonMeta($deal_cd, mcframe.commonMA.meta.MA_META.DEAL_CD);
	public static final MCMeta deal_nm_META = createCommonMeta($deal_nm, mcframe.commonMA.meta.MA_META.DEAL_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bill_cst_cd_META = createCommonMeta($bill_cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_cst_nm_META = createCommonMeta($bill_cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta frcst_usr_cd_META = createCommonMeta($frcst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta frcst_usr_nm_META = createCommonMeta($frcst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.MRKT_CD);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta prd_itm_cd_META = createCommonMeta($prd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta prd_itm_nm_META = createCommonMeta($prd_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta order_dlv_dt_META = createCommonMeta($order_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pst_inst_sls_dt_META = createCommonMeta($pst_inst_sls_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			zoho_sls_schd_no_META,
			deal_cd_META,
			deal_nm_META,
			cst_cd_META,
			cst_nm_META,
			bill_cst_cd_META,
			bill_cst_nm_META,
			sls_dpt_cd_META,
			sls_dpt_nm_META,
			frcst_usr_cd_META,
			frcst_usr_nm_META,
			wrk_no_META,
			wrk_nm_META,
			prd_itm_cd_META,
			prd_itm_nm_META,
			order_dlv_dt_META,
			pst_inst_sls_dt_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wrk_no, "WRK"},	// wrk_no
				{$wrk_nm, "WRK"}	// wrk_nm
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
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
	public String bill_cst_cd() {
		return getConstString(offset + 5, $bill_cst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bill_cst_cd(String value) {
		setConstString(offset + 5, $bill_cst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bill_cst_nm() {
		return getConstString(offset + 6, $bill_cst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bill_cst_nm(String value) {
		setConstString(offset + 6, $bill_cst_nm, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 7, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 7, $sls_dpt_cd, value);
	}


	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 8, $sls_dpt_nm);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 8, $sls_dpt_nm, value);
	}


	/**
	 * Project manager user cd. 案件担当者ＣＤ.<p>
	 *
	 */
	public String frcst_usr_cd() {
		return getConstString(offset + 9, $frcst_usr_cd);
	}

	/**
	 * Project manager user cd. 案件担当者ＣＤ.<p>
	 *
	 */
	public void frcst_usr_cd(String value) {
		setConstString(offset + 9, $frcst_usr_cd, value);
	}


	/**
	 * Project manager user name 案件担当者名.<p>
	 *
	 */
	public String frcst_usr_nm() {
		return getConstString(offset + 10, $frcst_usr_nm);
	}

	/**
	 * Project manager user name 案件担当者名.<p>
	 *
	 */
	public void frcst_usr_nm(String value) {
		setConstString(offset + 10, $frcst_usr_nm, value);
	}


	/**
	 * Market cd. 市場ＣＤ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 11, $wrk_no);
	}

	/**
	 * Market cd. 市場ＣＤ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 11, $wrk_no, value);
	}


	/**
	 * Market name 市場名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 12, $wrk_nm);
	}

	/**
	 * Market name 市場名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 12, $wrk_nm, value);
	}


	/**
	 * Product item cd. 製品ＣＤ.<p>
	 *
	 */
	public String prd_itm_cd() {
		return getConstString(offset + 13, $prd_itm_cd);
	}

	/**
	 * Product item cd. 製品ＣＤ.<p>
	 *
	 */
	public void prd_itm_cd(String value) {
		setConstString(offset + 13, $prd_itm_cd, value);
	}


	/**
	 * Product item name 製品名.<p>
	 *
	 */
	public String prd_itm_nm() {
		return getConstString(offset + 14, $prd_itm_nm);
	}

	/**
	 * Product item name 製品名.<p>
	 *
	 */
	public void prd_itm_nm(String value) {
		setConstString(offset + 14, $prd_itm_nm, value);
	}


	/**
	 * Order delivery date 注文書納期.<p>
	 *
	 */
	public MCDate order_dlv_dt() {
		return getConstDate(offset + 15, $order_dlv_dt);
	}

	/**
	 * Order delivery date 注文書納期.<p>
	 *
	 */
	public void order_dlv_dt(MCDate value) {
		setConstDate(offset + 15, $order_dlv_dt, value);
	}


	/**
	 * Post-installation sales date 装備後売上日.<p>
	 *
	 */
	public MCDate pst_inst_sls_dt() {
		return getConstDate(offset + 16, $pst_inst_sls_dt);
	}

	/**
	 * Post-installation sales date 装備後売上日.<p>
	 *
	 */
	public void pst_inst_sls_dt(MCDate value) {
		setConstDate(offset + 16, $pst_inst_sls_dt, value);
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
		if ($bill_cst_cd.equalsIgnoreCase(name)) {
			return bill_cst_cd();
		}
		if ($bill_cst_nm.equalsIgnoreCase(name)) {
			return bill_cst_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
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
		if ($prd_itm_cd.equalsIgnoreCase(name)) {
			return prd_itm_cd();
		}
		if ($prd_itm_nm.equalsIgnoreCase(name)) {
			return prd_itm_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($order_dlv_dt.equalsIgnoreCase(name)) {
			return order_dlv_dt();
		}
		if ($pst_inst_sls_dt.equalsIgnoreCase(name)) {
			return pst_inst_sls_dt();
		}
		return super.getDate(name);
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
		if ($bill_cst_cd.equalsIgnoreCase(name)) {
			return bill_cst_cd();
		}
		if ($bill_cst_nm.equalsIgnoreCase(name)) {
			return bill_cst_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
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
		if ($prd_itm_cd.equalsIgnoreCase(name)) {
			return prd_itm_cd();
		}
		if ($prd_itm_nm.equalsIgnoreCase(name)) {
			return prd_itm_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($order_dlv_dt.equalsIgnoreCase(name)) {
			return order_dlv_dt();
		}
		if ($pst_inst_sls_dt.equalsIgnoreCase(name)) {
			return pst_inst_sls_dt();
		}
		return super.getDateNE(name);
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
		if ($bill_cst_cd.equalsIgnoreCase(name)) {
			bill_cst_cd(value);
			return;
		}
		if ($bill_cst_nm.equalsIgnoreCase(name)) {
			bill_cst_nm(value);
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
		if ($prd_itm_cd.equalsIgnoreCase(name)) {
			prd_itm_cd(value);
			return;
		}
		if ($prd_itm_nm.equalsIgnoreCase(name)) {
			prd_itm_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($order_dlv_dt.equalsIgnoreCase(name)) {
			order_dlv_dt(value);
			return;
		}
		if ($pst_inst_sls_dt.equalsIgnoreCase(name)) {
			pst_inst_sls_dt(value);
			return;
		}
		super.setDate(name, value);
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
		if ($bill_cst_cd.equalsIgnoreCase(name)) {
			bill_cst_cd(value);
			return;
		}
		if ($bill_cst_nm.equalsIgnoreCase(name)) {
			bill_cst_nm(value);
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
		if ($prd_itm_cd.equalsIgnoreCase(name)) {
			prd_itm_cd(value);
			return;
		}
		if ($prd_itm_nm.equalsIgnoreCase(name)) {
			prd_itm_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($order_dlv_dt.equalsIgnoreCase(name)) {
			order_dlv_dt(value);
			return;
		}
		if ($pst_inst_sls_dt.equalsIgnoreCase(name)) {
			pst_inst_sls_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

