package mcframe.serverMSLC.MSLCB0010;

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
 * ブロック"SendIf_Upd01_Dtl_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SendIf_Upd01_Dtl_CndR_MC_A extends MCConstRow {

	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public static final String $if_proc_typ = "if_proc_typ";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * Extraction date FROM 抽出年月日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dt_fr = "dt_fr";
	/**
	 * Extraction date TO 抽出年月日ＴＯ.<p>
	 *
	 */
	public static final String $dt_to = "dt_to";
	/**
	 * Non-moving comparison date 滞留比較日.<p>
	 *
	 */
	public static final String $non_mov_cmp_dt = "non_mov_cmp_dt";
	/**
	 * Number of non-moving base days 滞留基準日数.<p>
	 *
	 */
	public static final String $non_mov_base_days = "non_mov_base_days";
	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";


	public static final MCMeta if_proc_typ_META = createCommonMeta($if_proc_typ, mcframe.commonMA.meta.MA_META.IF_PROC_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta dt_fr_META = createCommonMeta($dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt_to_META = createCommonMeta($dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta non_mov_cmp_dt_META = createCommonMeta($non_mov_cmp_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta non_mov_base_days_META = createCommonMeta($non_mov_base_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);

	protected static final ConstMetaList<SendIf_Upd01_Dtl_CndR> constMetas = new ConstMetaList<SendIf_Upd01_Dtl_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			if_proc_typ_META,
			ext_sys_cd_META,
			dt_fr_META,
			dt_to_META,
			non_mov_cmp_dt_META,
			non_mov_base_days_META,
			co_cd_META
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
	protected SendIf_Upd01_Dtl_CndR_MC_A(ConstMetaList<? extends SendIf_Upd01_Dtl_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SendIf_Upd01_Dtl_CndR clone() {
		return (SendIf_Upd01_Dtl_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SendIf_Upd01_Dtl_CndR createInstance() {
		return (SendIf_Upd01_Dtl_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SendIf_Upd01_Dtl_CndR getValues(String... names) {
		return (SendIf_Upd01_Dtl_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public String if_proc_typ() {
		return getConstString(offset + 0, $if_proc_typ);
	}

	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public void if_proc_typ(String value) {
		setConstString(offset + 0, $if_proc_typ, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 1, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 1, $ext_sys_cd, value);
	}


	/**
	 * Extraction date FROM 抽出年月日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dt_fr() {
		return getConstDate(offset + 2, $dt_fr);
	}

	/**
	 * Extraction date FROM 抽出年月日ＦＲＯＭ.<p>
	 *
	 */
	public void dt_fr(MCDate value) {
		setConstDate(offset + 2, $dt_fr, value);
	}


	/**
	 * Extraction date TO 抽出年月日ＴＯ.<p>
	 *
	 */
	public MCDate dt_to() {
		return getConstDate(offset + 3, $dt_to);
	}

	/**
	 * Extraction date TO 抽出年月日ＴＯ.<p>
	 *
	 */
	public void dt_to(MCDate value) {
		setConstDate(offset + 3, $dt_to, value);
	}


	/**
	 * Non-moving comparison date 滞留比較日.<p>
	 *
	 */
	public MCDate non_mov_cmp_dt() {
		return getConstDate(offset + 4, $non_mov_cmp_dt);
	}

	/**
	 * Non-moving comparison date 滞留比較日.<p>
	 *
	 */
	public void non_mov_cmp_dt(MCDate value) {
		setConstDate(offset + 4, $non_mov_cmp_dt, value);
	}


	/**
	 * Number of non-moving base days 滞留基準日数.<p>
	 *
	 */
	public MCNumber non_mov_base_days() {
		return getConstNumber(offset + 5, $non_mov_base_days);
	}

	/**
	 * Number of non-moving base days 滞留基準日数.<p>
	 *
	 */
	public void non_mov_base_days(MCNumber value) {
		setConstNumber(offset + 5, $non_mov_base_days, value);
	}

	/**
	 * Number of non-moving base days 滞留基準日数.<p>
	 *
	 */
	public void non_mov_base_days(int value) {
		setConstNumber(offset + 5, $non_mov_base_days, value);
	}

	/**
	 * Number of non-moving base days 滞留基準日数.<p>
	 *
	 */
	public void non_mov_base_days(long value) {
		setConstNumber(offset + 5, $non_mov_base_days, value);
	}

	/**
	 * Number of non-moving base days 滞留基準日数.<p>
	 *
	 */
	public void non_mov_base_days(float value) {
		setConstNumber(offset + 5, $non_mov_base_days, value);
	}

	/**
	 * Number of non-moving base days 滞留基準日数.<p>
	 *
	 */
	public void non_mov_base_days(double value) {
		setConstNumber(offset + 5, $non_mov_base_days, value);
	}


	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 6, $co_cd);
	}

	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 6, $co_cd, value);
	}


	public String getString(String name) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			return non_mov_base_days();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		if ($non_mov_cmp_dt.equalsIgnoreCase(name)) {
			return non_mov_cmp_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			return non_mov_base_days();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		if ($non_mov_cmp_dt.equalsIgnoreCase(name)) {
			return non_mov_cmp_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		if ($non_mov_cmp_dt.equalsIgnoreCase(name)) {
			non_mov_cmp_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		if ($non_mov_cmp_dt.equalsIgnoreCase(name)) {
			non_mov_cmp_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

