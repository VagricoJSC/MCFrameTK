package mcframe.serverMSBC.MSBCB1020;

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
 * ブロック"InptAlloc_Upd01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InptAlloc_Upd01_CndR_MC_A extends MCConstRow {

	/**
	 * Re-allocation mode 再引当モード.<p>
	 *
	 */
	public static final String $re_alloc_mode_flg = "re_alloc_mode_flg";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_grp_cd = "mfg_loc_grp_cd";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Scheduled start date FROM 着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $st_schd_dt_fr = "st_schd_dt_fr";
	/**
	 * Scheduled start date TO 着手予定日ＴＯ.<p>
	 *
	 */
	public static final String $st_schd_dt_to = "st_schd_dt_to";
	/**
	 * Internal 社内.<p>
	 *
	 */
	public static final String $int_flg = "int_flg";
	/**
	 * External 社外.<p>
	 *
	 */
	public static final String $ext_flg = "ext_flg";
	/**
	 * Allocation error abnormal termination 引当エラー異常終了.<p>
	 *
	 */
	public static final String $err_alloc_flg = "err_alloc_flg";


	public static final MCMeta re_alloc_mode_flg_META = createCommonMeta($re_alloc_mode_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta mfg_loc_grp_cd_META = createCommonMeta($mfg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta st_schd_dt_fr_META = createCommonMeta($st_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_schd_dt_to_META = createCommonMeta($st_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta int_flg_META = createCommonMeta($int_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_flg_META = createCommonMeta($ext_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_alloc_flg_META = createCommonMeta($err_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<InptAlloc_Upd01_CndR> constMetas = new ConstMetaList<InptAlloc_Upd01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			re_alloc_mode_flg_META,
			wg_cd_META,
			mfg_loc_grp_cd_META,
			mfg_loc_cd_META,
			st_schd_dt_fr_META,
			st_schd_dt_to_META,
			int_flg_META,
			ext_flg_META,
			err_alloc_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected InptAlloc_Upd01_CndR_MC_A(ConstMetaList<? extends InptAlloc_Upd01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InptAlloc_Upd01_CndR clone() {
		return (InptAlloc_Upd01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InptAlloc_Upd01_CndR createInstance() {
		return (InptAlloc_Upd01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InptAlloc_Upd01_CndR getValues(String... names) {
		return (InptAlloc_Upd01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Re-allocation mode 再引当モード.<p>
	 *
	 */
	public boolean re_alloc_mode_flg() {
		return getConstBoolean(offset + 0, $re_alloc_mode_flg);
	}

	/**
	 * Re-allocation mode 再引当モード.<p>
	 *
	 */
	public void re_alloc_mode_flg(boolean value) {
		setConstBoolean(offset + 0, $re_alloc_mode_flg, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String mfg_loc_grp_cd() {
		return getConstString(offset + 2, $mfg_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void mfg_loc_grp_cd(String value) {
		setConstString(offset + 2, $mfg_loc_grp_cd, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 3, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 3, $mfg_loc_cd, value);
	}


	/**
	 * Scheduled start date FROM 着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_schd_dt_fr() {
		return getConstDate(offset + 4, $st_schd_dt_fr);
	}

	/**
	 * Scheduled start date FROM 着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public void st_schd_dt_fr(MCDate value) {
		setConstDate(offset + 4, $st_schd_dt_fr, value);
	}


	/**
	 * Scheduled start date TO 着手予定日ＴＯ.<p>
	 *
	 */
	public MCDate st_schd_dt_to() {
		return getConstDate(offset + 5, $st_schd_dt_to);
	}

	/**
	 * Scheduled start date TO 着手予定日ＴＯ.<p>
	 *
	 */
	public void st_schd_dt_to(MCDate value) {
		setConstDate(offset + 5, $st_schd_dt_to, value);
	}


	/**
	 * Internal 社内.<p>
	 *
	 */
	public boolean int_flg() {
		return getConstBoolean(offset + 6, $int_flg);
	}

	/**
	 * Internal 社内.<p>
	 *
	 */
	public void int_flg(boolean value) {
		setConstBoolean(offset + 6, $int_flg, value);
	}


	/**
	 * External 社外.<p>
	 *
	 */
	public boolean ext_flg() {
		return getConstBoolean(offset + 7, $ext_flg);
	}

	/**
	 * External 社外.<p>
	 *
	 */
	public void ext_flg(boolean value) {
		setConstBoolean(offset + 7, $ext_flg, value);
	}


	/**
	 * Allocation error abnormal termination 引当エラー異常終了.<p>
	 *
	 */
	public boolean err_alloc_flg() {
		return getConstBoolean(offset + 8, $err_alloc_flg);
	}

	/**
	 * Allocation error abnormal termination 引当エラー異常終了.<p>
	 *
	 */
	public void err_alloc_flg(boolean value) {
		setConstBoolean(offset + 8, $err_alloc_flg, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($st_schd_dt_fr.equalsIgnoreCase(name)) {
			return st_schd_dt_fr();
		}
		if ($st_schd_dt_to.equalsIgnoreCase(name)) {
			return st_schd_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			return re_alloc_mode_flg();
		}
		if ($int_flg.equalsIgnoreCase(name)) {
			return int_flg();
		}
		if ($ext_flg.equalsIgnoreCase(name)) {
			return ext_flg();
		}
		if ($err_alloc_flg.equalsIgnoreCase(name)) {
			return err_alloc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_schd_dt_fr.equalsIgnoreCase(name)) {
			return st_schd_dt_fr();
		}
		if ($st_schd_dt_to.equalsIgnoreCase(name)) {
			return st_schd_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			return re_alloc_mode_flg();
		}
		if ($int_flg.equalsIgnoreCase(name)) {
			return int_flg();
		}
		if ($ext_flg.equalsIgnoreCase(name)) {
			return ext_flg();
		}
		if ($err_alloc_flg.equalsIgnoreCase(name)) {
			return err_alloc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			mfg_loc_grp_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_schd_dt_fr.equalsIgnoreCase(name)) {
			st_schd_dt_fr(value);
			return;
		}
		if ($st_schd_dt_to.equalsIgnoreCase(name)) {
			st_schd_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			re_alloc_mode_flg(value);
			return;
		}
		if ($int_flg.equalsIgnoreCase(name)) {
			int_flg(value);
			return;
		}
		if ($ext_flg.equalsIgnoreCase(name)) {
			ext_flg(value);
			return;
		}
		if ($err_alloc_flg.equalsIgnoreCase(name)) {
			err_alloc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			mfg_loc_grp_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_schd_dt_fr.equalsIgnoreCase(name)) {
			st_schd_dt_fr(value);
			return;
		}
		if ($st_schd_dt_to.equalsIgnoreCase(name)) {
			st_schd_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			re_alloc_mode_flg(value);
			return;
		}
		if ($int_flg.equalsIgnoreCase(name)) {
			int_flg(value);
			return;
		}
		if ($ext_flg.equalsIgnoreCase(name)) {
			ext_flg(value);
			return;
		}
		if ($err_alloc_flg.equalsIgnoreCase(name)) {
			err_alloc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

