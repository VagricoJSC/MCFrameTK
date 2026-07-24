package mcframe.clientMBBB.MBBBP0100;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * Month 対象年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Term FROM 対象期間ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dt_fr = "dt_fr";
	/**
	 * Term TO 対象期間ＴＯ.<p>
	 *
	 */
	public static final String $dt_to = "dt_to";
	/**
	 * Accounting slip date 会計伝票日付.<p>
	 *
	 */
	public static final String $ac_slip_dt = "ac_slip_dt";
	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public static final String $jnl_act_cd = "jnl_act_cd";
	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public static final String $jnl_act_nm = "jnl_act_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Re-journalize 再仕訳処理.<p>
	 *
	 */
	public static final String $rerun_flg = "rerun_flg";
	/**
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public static final String $jnl_rmrks = "jnl_rmrks";


	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta dt_fr_META = createCommonMeta($dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt_to_META = createCommonMeta($dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_slip_dt_META = createCommonMeta($ac_slip_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta jnl_act_cd_META = createCommonMeta($jnl_act_cd, mcframe.commonMA.meta.MA_META.JNL_ACT_CD);
	public static final MCMeta jnl_act_nm_META = createCommonMeta($jnl_act_nm, mcframe.commonMA.meta.MA_META.JNL_ACT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta rerun_flg_META = createCommonMeta($rerun_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta jnl_rmrks_META = createCommonMeta($jnl_rmrks, mcframe.commonMA.meta.MA_META.JNL_RMRKS);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_ym_META,
			dt_fr_META,
			dt_to_META,
			ac_slip_dt_META,
			jnl_act_cd_META,
			jnl_act_nm_META,
			wg_cd_META,
			wg_nm_META,
			rerun_flg_META,
			jnl_rmrks_META
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
				{$wg_cd, "true"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "wr_flg"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * Month 対象年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 0, $ac_ym);
	}

	/**
	 * Month 対象年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 0, $ac_ym, value);
	}


	/**
	 * Term FROM 対象期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dt_fr() {
		return getConstDate(offset + 1, $dt_fr);
	}

	/**
	 * Term FROM 対象期間ＦＲＯＭ.<p>
	 *
	 */
	public void dt_fr(MCDate value) {
		setConstDate(offset + 1, $dt_fr, value);
	}


	/**
	 * Term TO 対象期間ＴＯ.<p>
	 *
	 */
	public MCDate dt_to() {
		return getConstDate(offset + 2, $dt_to);
	}

	/**
	 * Term TO 対象期間ＴＯ.<p>
	 *
	 */
	public void dt_to(MCDate value) {
		setConstDate(offset + 2, $dt_to, value);
	}


	/**
	 * Accounting slip date 会計伝票日付.<p>
	 *
	 */
	public MCDate ac_slip_dt() {
		return getConstDate(offset + 3, $ac_slip_dt);
	}

	/**
	 * Accounting slip date 会計伝票日付.<p>
	 *
	 */
	public void ac_slip_dt(MCDate value) {
		setConstDate(offset + 3, $ac_slip_dt, value);
	}


	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public String jnl_act_cd() {
		return getConstString(offset + 4, $jnl_act_cd);
	}

	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public void jnl_act_cd(String value) {
		setConstString(offset + 4, $jnl_act_cd, value);
	}


	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public String jnl_act_nm() {
		return getConstString(offset + 5, $jnl_act_nm);
	}

	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public void jnl_act_nm(String value) {
		setConstString(offset + 5, $jnl_act_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 6, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 6, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 7, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 7, $wg_nm, value);
	}


	/**
	 * Re-journalize 再仕訳処理.<p>
	 *
	 */
	public boolean rerun_flg() {
		return getConstBoolean(offset + 8, $rerun_flg);
	}

	/**
	 * Re-journalize 再仕訳処理.<p>
	 *
	 */
	public void rerun_flg(boolean value) {
		setConstBoolean(offset + 8, $rerun_flg, value);
	}


	/**
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public String jnl_rmrks() {
		return getConstString(offset + 9, $jnl_rmrks);
	}

	/**
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public void jnl_rmrks(String value) {
		setConstString(offset + 9, $jnl_rmrks, value);
	}


	public String getString(String name) {
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			return jnl_act_cd();
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			return jnl_act_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			return jnl_rmrks();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			return ac_slip_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($rerun_flg.equalsIgnoreCase(name)) {
			return rerun_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			return jnl_act_cd();
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			return jnl_act_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			return jnl_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			return ac_slip_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($rerun_flg.equalsIgnoreCase(name)) {
			return rerun_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			jnl_act_cd(value);
			return;
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			jnl_act_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			jnl_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			ac_slip_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($rerun_flg.equalsIgnoreCase(name)) {
			rerun_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			jnl_act_cd(value);
			return;
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			jnl_act_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			jnl_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			ac_slip_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($rerun_flg.equalsIgnoreCase(name)) {
			rerun_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

