package mcframe.serverPFBB.PFBBB0010;

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
 * ブロック"GaBatch_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class GaBatch_DtlR_MC_A extends MCConstRow {

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
	 * Date FROM 年月日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $tgt_dt_fr = "tgt_dt_fr";
	/**
	 * Date, TO 年月日ＴＯ.<p>
	 *
	 */
	public static final String $tgt_dt_to = "tgt_dt_to";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Budget cd. 予算コード.<p>
	 *
	 */
	public static final String $budgetcode = "budgetcode";


	public static final MCMeta if_proc_typ_META = createCommonMeta($if_proc_typ, mcframe.commonMA.meta.MA_META.IF_PROC_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta tgt_dt_fr_META = createCommonMeta($tgt_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta tgt_dt_to_META = createCommonMeta($tgt_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta budgetcode_META = createStringMeta($budgetcode, 20);

	protected static final ConstMetaList<GaBatch_DtlR> constMetas = new ConstMetaList<GaBatch_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			if_proc_typ_META,
			ext_sys_cd_META,
			tgt_dt_fr_META,
			tgt_dt_to_META,
			calc_ctg_cd_META,
			budgetcode_META
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
	protected GaBatch_DtlR_MC_A(ConstMetaList<? extends GaBatch_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public GaBatch_DtlR clone() {
		return (GaBatch_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public GaBatch_DtlR createInstance() {
		return (GaBatch_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public GaBatch_DtlR getValues(String... names) {
		return (GaBatch_DtlR) super.getValues(names);
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
	 * Date FROM 年月日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate tgt_dt_fr() {
		return getConstDate(offset + 2, $tgt_dt_fr);
	}

	/**
	 * Date FROM 年月日ＦＲＯＭ.<p>
	 *
	 */
	public void tgt_dt_fr(MCDate value) {
		setConstDate(offset + 2, $tgt_dt_fr, value);
	}


	/**
	 * Date, TO 年月日ＴＯ.<p>
	 *
	 */
	public MCDate tgt_dt_to() {
		return getConstDate(offset + 3, $tgt_dt_to);
	}

	/**
	 * Date, TO 年月日ＴＯ.<p>
	 *
	 */
	public void tgt_dt_to(MCDate value) {
		setConstDate(offset + 3, $tgt_dt_to, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 4, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 4, $calc_ctg_cd, value);
	}


	/**
	 * Budget cd. 予算コード.<p>
	 *
	 */
	public String budgetcode() {
		return getConstString(offset + 5, $budgetcode);
	}

	/**
	 * Budget cd. 予算コード.<p>
	 *
	 */
	public void budgetcode(String value) {
		setConstString(offset + 5, $budgetcode, value);
	}


	public String getString(String name) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($budgetcode.equalsIgnoreCase(name)) {
			return budgetcode();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($tgt_dt_fr.equalsIgnoreCase(name)) {
			return tgt_dt_fr();
		}
		if ($tgt_dt_to.equalsIgnoreCase(name)) {
			return tgt_dt_to();
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
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($budgetcode.equalsIgnoreCase(name)) {
			return budgetcode();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($tgt_dt_fr.equalsIgnoreCase(name)) {
			return tgt_dt_fr();
		}
		if ($tgt_dt_to.equalsIgnoreCase(name)) {
			return tgt_dt_to();
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
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($budgetcode.equalsIgnoreCase(name)) {
			budgetcode(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($tgt_dt_fr.equalsIgnoreCase(name)) {
			tgt_dt_fr(value);
			return;
		}
		if ($tgt_dt_to.equalsIgnoreCase(name)) {
			tgt_dt_to(value);
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
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($budgetcode.equalsIgnoreCase(name)) {
			budgetcode(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($tgt_dt_fr.equalsIgnoreCase(name)) {
			tgt_dt_fr(value);
			return;
		}
		if ($tgt_dt_to.equalsIgnoreCase(name)) {
			tgt_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

