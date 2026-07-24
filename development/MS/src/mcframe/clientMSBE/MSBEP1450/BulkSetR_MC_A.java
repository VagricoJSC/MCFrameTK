package mcframe.clientMSBE.MSBEP1450;

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
 * ブロック"BulkSet"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BulkSetR_MC_A extends MCConstRow {

	public static final String $sdt_p = "sdt_p";
	public static final String $ddt_p = "ddt_p";
	public static final String $ac_dt_p = "ac_dt_p";
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public static final String $indiv_prnt_flg = "indiv_prnt_flg";
	/**
	 * Target 対象.<p>
	 *
	 */
	public static final String $wms_flg = "wms_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $not_wms_flg = "not_wms_flg";

	public static final String $ship_dt = $sdt_p + ".ymd";
	public static final String $ship_hm = $sdt_p + ".hm";
	public static final String $dlv_dt = $ddt_p + ".ymd";
	public static final String $dlv_hm = $ddt_p + ".hm";
	public static final String $ac_dt = $ac_dt_p + ".ac_dt";
	public static final String $act_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $act_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $act_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $act_dpt_nm = $usr_dpt_p + ".dpt_nm";

	public static final MCMeta sdt_p_META = createInnerRowMeta($sdt_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta ddt_p_META = createInnerRowMeta($ddt_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta ac_dt_p_META = createInnerRowMeta($ac_dt_p, mcframe.clientMAUB.MAUBP0310.AcDtR.class);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta indiv_prnt_flg_META = createCommonMeta($indiv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_wms_flg_META = createCommonMeta($not_wms_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sdt_p_META,
			ddt_p_META,
			ac_dt_p_META,
			usr_dpt_p_META,
			indiv_prnt_flg_META,
			wms_flg_META,
			not_wms_flg_META
		},
		new String[][]{
			{
				"ship_dt",
				"ship_hm",
				"dlv_dt",
				"dlv_hm",
				"ac_dt",
				"act_usr_cd",
				"act_usr_nm",
				"act_dpt_cd",
				"act_dpt_nm"
			},
			{
				$ship_dt,
				$ship_hm,
				$dlv_dt,
				$dlv_hm,
				$ac_dt,
				$act_usr_cd,
				$act_usr_nm,
				$act_dpt_cd,
				$act_dpt_nm
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
				{$usr_dpt_p + ".dpt_cd", "dpt_nm"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "act_usr_cd;MAC_DPT_IS_SRCH_TYP.SHIP"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "usr_cd;dpt_is_srch_typ"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	protected BulkSetR_MC_A(ConstMetaList<? extends BulkSetR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR clone() {
		return (BulkSetR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR createInstance() {
		return (BulkSetR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR getValues(String... names) {
		return (BulkSetR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0110.YmdHmR sdt_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 0, $sdt_p);
	}
	
	public void sdt_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 0, $sdt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0110.YmdHmR ddt_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 1, $ddt_p);
	}
	
	public void ddt_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 1, $ddt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0310.AcDtR ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP0310.AcDtR) getConstInnerRow(offset + 2, $ac_dt_p);
	}
	
	public void ac_dt_p(mcframe.clientMAUB.MAUBP0310.AcDtR row){
		setConstInnerRow(offset + 2, $ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 3, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 3, $usr_dpt_p, row);
	}


	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public boolean indiv_prnt_flg() {
		return getConstBoolean(offset + 4, $indiv_prnt_flg);
	}

	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public void indiv_prnt_flg(boolean value) {
		setConstBoolean(offset + 4, $indiv_prnt_flg, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 5, $wms_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 5, $wms_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean not_wms_flg() {
		return getConstBoolean(offset + 6, $not_wms_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void not_wms_flg(boolean value) {
		setConstBoolean(offset + 6, $not_wms_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			return not_wms_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			return not_wms_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			not_wms_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			not_wms_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($sdt_p.equalsIgnoreCase(name)) {
			return sdt_p();
		}
		if ($ddt_p.equalsIgnoreCase(name)) {
			return ddt_p();
		}
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			return ac_dt_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sdt_p.equalsIgnoreCase(name)) {
			sdt_p(
				((MCContainerMeta) sdt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		if ($ddt_p.equalsIgnoreCase(name)) {
			ddt_p(
				((MCContainerMeta) ddt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			ac_dt_p(
				((MCContainerMeta) ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0310.AcDtR.class, value)
			);
			return;
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Shipping date 出荷日.<p>
	 *
	 */
	public MCDate ship_dt() {
		return sdt_p().ymd();
	}

	/**
	 * Shipping date 出荷日.<p>
	 *
	 */
	public void ship_dt(MCDate value) {
		sdt_p().ymd(value);
	}

	/**
	 * Shipping time 出荷時刻.<p>
	 *
	 */
	public MCDate ship_hm() {
		return sdt_p().hm();
	}

	/**
	 * Shipping time 出荷時刻.<p>
	 *
	 */
	public void ship_hm(MCDate value) {
		sdt_p().hm(value);
	}

	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public MCDate dlv_dt() {
		return ddt_p().ymd();
	}

	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public void dlv_dt(MCDate value) {
		ddt_p().ymd(value);
	}

	/**
	 * Delivery time 納品時刻.<p>
	 *
	 */
	public MCDate dlv_hm() {
		return ddt_p().hm();
	}

	/**
	 * Delivery time 納品時刻.<p>
	 *
	 */
	public void dlv_hm(MCDate value) {
		ddt_p().hm(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return ac_dt_p().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		ac_dt_p().ac_dt(value);
	}

	/**
	 * Shipping PIC cd. 出荷担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Shipping PIC cd. 出荷担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Shipping PIC name 出荷担当者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Shipping PIC name 出荷担当者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Shipping dept. cd. 出荷部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Shipping dept. cd. 出荷部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Shipping dept. name 出荷部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Shipping dept. name 出荷部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

}

