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
	public static final String $cst_frcst_no = "cst_frcst_no";
	/**
	 * Deal cd. 商談ＣＤ.<p>
	 *
	 */
	public static final String $cst_frcst_prnt_dt = "cst_frcst_prnt_dt";
	/**
	 * Deal name 商談名.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public static final String $frcst_dpt_cd = "frcst_dpt_cd";
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
	 * Receiving date 製品ＣＤ.<p>
	 *
	 */
	public static final String $rcpt_dt = "rcpt_dt";
	/**
	 * Customer forecast list No. 製品名.<p>
	 *
	 */
	public static final String $cst_frcst_slip_no = "cst_frcst_slip_no";
	/**
	 * Cancel 注文書納期.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * Canceling reason cd. 装備後売上日.<p>
	 *
	 */
	public static final String $can_rsn_cd = "can_rsn_cd";


	public static final MCMeta cst_frcst_no_META = createCommonMeta($cst_frcst_no, mcframe.commonMA.meta.MA_META.CST_FRCST_NO);
	public static final MCMeta cst_frcst_prnt_dt_META = createCommonMeta($cst_frcst_prnt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta frcst_dpt_cd_META = createCommonMeta($frcst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta frcst_usr_cd_META = createCommonMeta($frcst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta frcst_usr_nm_META = createCommonMeta($frcst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta rcpt_dt_META = createCommonMeta($rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cst_frcst_slip_no_META = createCommonMeta($cst_frcst_slip_no, mcframe.commonMA.meta.MA_META.CST_FRCST_SLIP_NO);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_rsn_cd_META = createCommonMeta($can_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cst_frcst_no_META,
			cst_frcst_prnt_dt_META,
			cst_cd_META,
			cst_nm_META,
			dlv_cd_META,
			dlv_nm_META,
			frcst_dpt_cd_META,
			frcst_usr_cd_META,
			frcst_usr_nm_META,
			wrk_no_META,
			wrk_nm_META,
			rcpt_dt_META,
			cst_frcst_slip_no_META,
			can_flg_META,
			can_rsn_cd_META
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
	public String cst_frcst_no() {
		return getConstString(offset + 0, $cst_frcst_no);
	}

	/**
	 * Zoho sales schedule No. ＺＯＨＯ販売予定ＮＯ.<p>
	 *
	 */
	public void cst_frcst_no(String value) {
		setConstString(offset + 0, $cst_frcst_no, value);
	}


	/**
	 * Deal cd. 商談ＣＤ.<p>
	 *
	 */
	public MCDate cst_frcst_prnt_dt() {
		return getConstDate(offset + 1, $cst_frcst_prnt_dt);
	}

	/**
	 * Deal cd. 商談ＣＤ.<p>
	 *
	 */
	public void cst_frcst_prnt_dt(MCDate value) {
		setConstDate(offset + 1, $cst_frcst_prnt_dt, value);
	}


	/**
	 * Deal name 商談名.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 2, $cst_cd);
	}

	/**
	 * Deal name 商談名.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 2, $cst_cd, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 3, $cst_nm);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 3, $cst_nm, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 4, $dlv_cd);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 4, $dlv_cd, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 5, $dlv_nm);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 5, $dlv_nm, value);
	}


	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String frcst_dpt_cd() {
		return getConstString(offset + 6, $frcst_dpt_cd);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void frcst_dpt_cd(String value) {
		setConstString(offset + 6, $frcst_dpt_cd, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String frcst_usr_cd() {
		return getConstString(offset + 7, $frcst_usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void frcst_usr_cd(String value) {
		setConstString(offset + 7, $frcst_usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String frcst_usr_nm() {
		return getConstString(offset + 8, $frcst_usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void frcst_usr_nm(String value) {
		setConstString(offset + 8, $frcst_usr_nm, value);
	}


	/**
	 * Market cd. 市場ＣＤ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 9, $wrk_no);
	}

	/**
	 * Market cd. 市場ＣＤ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 9, $wrk_no, value);
	}


	/**
	 * Market name 市場名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 10, $wrk_nm);
	}

	/**
	 * Market name 市場名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 10, $wrk_nm, value);
	}


	/**
	 * Receiving date 製品ＣＤ.<p>
	 *
	 */
	public MCDate rcpt_dt() {
		return getConstDate(offset + 11, $rcpt_dt);
	}

	/**
	 * Receiving date 製品ＣＤ.<p>
	 *
	 */
	public void rcpt_dt(MCDate value) {
		setConstDate(offset + 11, $rcpt_dt, value);
	}


	/**
	 * Customer forecast list No. 製品名.<p>
	 *
	 */
	public String cst_frcst_slip_no() {
		return getConstString(offset + 12, $cst_frcst_slip_no);
	}

	/**
	 * Customer forecast list No. 製品名.<p>
	 *
	 */
	public void cst_frcst_slip_no(String value) {
		setConstString(offset + 12, $cst_frcst_slip_no, value);
	}


	/**
	 * Cancel 注文書納期.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 13, $can_flg);
	}

	/**
	 * Cancel 注文書納期.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 13, $can_flg, value);
	}


	/**
	 * Canceling reason cd. 装備後売上日.<p>
	 *
	 */
	public String can_rsn_cd() {
		return getConstString(offset + 14, $can_rsn_cd);
	}

	/**
	 * Canceling reason cd. 装備後売上日.<p>
	 *
	 */
	public void can_rsn_cd(String value) {
		setConstString(offset + 14, $can_rsn_cd, value);
	}


	public String getString(String name) {
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			return cst_frcst_no();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($frcst_dpt_cd.equalsIgnoreCase(name)) {
			return frcst_dpt_cd();
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
		if ($cst_frcst_slip_no.equalsIgnoreCase(name)) {
			return cst_frcst_slip_no();
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			return cst_frcst_prnt_dt();
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			return cst_frcst_no();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($frcst_dpt_cd.equalsIgnoreCase(name)) {
			return frcst_dpt_cd();
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
		if ($cst_frcst_slip_no.equalsIgnoreCase(name)) {
			return cst_frcst_slip_no();
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			return cst_frcst_prnt_dt();
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			cst_frcst_no(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($frcst_dpt_cd.equalsIgnoreCase(name)) {
			frcst_dpt_cd(value);
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
		if ($cst_frcst_slip_no.equalsIgnoreCase(name)) {
			cst_frcst_slip_no(value);
			return;
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			cst_frcst_prnt_dt(value);
			return;
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			cst_frcst_no(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($frcst_dpt_cd.equalsIgnoreCase(name)) {
			frcst_dpt_cd(value);
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
		if ($cst_frcst_slip_no.equalsIgnoreCase(name)) {
			cst_frcst_slip_no(value);
			return;
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			cst_frcst_prnt_dt(value);
			return;
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

