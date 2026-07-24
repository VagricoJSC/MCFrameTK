package mcframe.serverMSLA.MSLAB2210;

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
 * ブロック"OrdRecvIfImp_Upd01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OrdRecvIfImp_Upd01_CndR_MC_A extends MCConstRow {

	/**
	 * External system cd. 1 外部システムＣＤ１.<p>
	 *
	 */
	public static final String $ext_sys_cd1 = "ext_sys_cd1";
	/**
	 * External system cd. 2 外部システムＣＤ２.<p>
	 *
	 */
	public static final String $ext_sys_cd2 = "ext_sys_cd2";
	/**
	 * External system cd. 3 外部システムＣＤ３.<p>
	 *
	 */
	public static final String $ext_sys_cd3 = "ext_sys_cd3";
	/**
	 * External system cd. 4 外部システムＣＤ４.<p>
	 *
	 */
	public static final String $ext_sys_cd4 = "ext_sys_cd4";
	/**
	 * External system cd. 5 外部システムＣＤ５.<p>
	 *
	 */
	public static final String $ext_sys_cd5 = "ext_sys_cd5";
	/**
	 * External system cd. 6 外部システムＣＤ６.<p>
	 *
	 */
	public static final String $ext_sys_cd6 = "ext_sys_cd6";
	/**
	 * External system cd. 7 外部システムＣＤ７.<p>
	 *
	 */
	public static final String $ext_sys_cd7 = "ext_sys_cd7";
	/**
	 * External system cd. 8 外部システムＣＤ８.<p>
	 *
	 */
	public static final String $ext_sys_cd8 = "ext_sys_cd8";
	/**
	 * External system cd. 9 外部システムＣＤ９.<p>
	 *
	 */
	public static final String $ext_sys_cd9 = "ext_sys_cd9";
	/**
	 * External system cd. 10 外部システムＣＤ１０.<p>
	 *
	 */
	public static final String $ext_sys_cd10 = "ext_sys_cd10";
	/**
	 * Planned order refresh flg. オーダ洗い替えＦＬＧ.<p>
	 *
	 */
	public static final String $ord_rep_flg = "ord_rep_flg";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Linkage scheduler type 連携スケジューラ区分.<p>
	 *
	 */
	public static final String $if_scheduler_typ = "if_scheduler_typ";
	/**
	 * Allow subcontracting scheduling flg. 外注スケジューリング許可ＦＬＧ.<p>
	 *
	 */
	public static final String $allow_outsrc_schd_flg = "allow_outsrc_schd_flg";


	public static final MCMeta ext_sys_cd1_META = createCommonMeta($ext_sys_cd1, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_cd2_META = createCommonMeta($ext_sys_cd2, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_cd3_META = createCommonMeta($ext_sys_cd3, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_cd4_META = createCommonMeta($ext_sys_cd4, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_cd5_META = createCommonMeta($ext_sys_cd5, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_cd6_META = createCommonMeta($ext_sys_cd6, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_cd7_META = createCommonMeta($ext_sys_cd7, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_cd8_META = createCommonMeta($ext_sys_cd8, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_cd9_META = createCommonMeta($ext_sys_cd9, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_cd10_META = createCommonMeta($ext_sys_cd10, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ord_rep_flg_META = createCommonMeta($ord_rep_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta if_scheduler_typ_META = createCommonMeta($if_scheduler_typ, mcframe.commonMS.meta.MS_META.IF_SCHEDULER_TYP);
	public static final MCMeta allow_outsrc_schd_flg_META = createCommonMeta($allow_outsrc_schd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<OrdRecvIfImp_Upd01_CndR> constMetas = new ConstMetaList<OrdRecvIfImp_Upd01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ext_sys_cd1_META,
			ext_sys_cd2_META,
			ext_sys_cd3_META,
			ext_sys_cd4_META,
			ext_sys_cd5_META,
			ext_sys_cd6_META,
			ext_sys_cd7_META,
			ext_sys_cd8_META,
			ext_sys_cd9_META,
			ext_sys_cd10_META,
			ord_rep_flg_META,
			loc_cd_META,
			if_scheduler_typ_META,
			allow_outsrc_schd_flg_META
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
	protected OrdRecvIfImp_Upd01_CndR_MC_A(ConstMetaList<? extends OrdRecvIfImp_Upd01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdRecvIfImp_Upd01_CndR clone() {
		return (OrdRecvIfImp_Upd01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdRecvIfImp_Upd01_CndR createInstance() {
		return (OrdRecvIfImp_Upd01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdRecvIfImp_Upd01_CndR getValues(String... names) {
		return (OrdRecvIfImp_Upd01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * External system cd. 1 外部システムＣＤ１.<p>
	 *
	 */
	public String ext_sys_cd1() {
		return getConstString(offset + 0, $ext_sys_cd1);
	}

	/**
	 * External system cd. 1 外部システムＣＤ１.<p>
	 *
	 */
	public void ext_sys_cd1(String value) {
		setConstString(offset + 0, $ext_sys_cd1, value);
	}


	/**
	 * External system cd. 2 外部システムＣＤ２.<p>
	 *
	 */
	public String ext_sys_cd2() {
		return getConstString(offset + 1, $ext_sys_cd2);
	}

	/**
	 * External system cd. 2 外部システムＣＤ２.<p>
	 *
	 */
	public void ext_sys_cd2(String value) {
		setConstString(offset + 1, $ext_sys_cd2, value);
	}


	/**
	 * External system cd. 3 外部システムＣＤ３.<p>
	 *
	 */
	public String ext_sys_cd3() {
		return getConstString(offset + 2, $ext_sys_cd3);
	}

	/**
	 * External system cd. 3 外部システムＣＤ３.<p>
	 *
	 */
	public void ext_sys_cd3(String value) {
		setConstString(offset + 2, $ext_sys_cd3, value);
	}


	/**
	 * External system cd. 4 外部システムＣＤ４.<p>
	 *
	 */
	public String ext_sys_cd4() {
		return getConstString(offset + 3, $ext_sys_cd4);
	}

	/**
	 * External system cd. 4 外部システムＣＤ４.<p>
	 *
	 */
	public void ext_sys_cd4(String value) {
		setConstString(offset + 3, $ext_sys_cd4, value);
	}


	/**
	 * External system cd. 5 外部システムＣＤ５.<p>
	 *
	 */
	public String ext_sys_cd5() {
		return getConstString(offset + 4, $ext_sys_cd5);
	}

	/**
	 * External system cd. 5 外部システムＣＤ５.<p>
	 *
	 */
	public void ext_sys_cd5(String value) {
		setConstString(offset + 4, $ext_sys_cd5, value);
	}


	/**
	 * External system cd. 6 外部システムＣＤ６.<p>
	 *
	 */
	public String ext_sys_cd6() {
		return getConstString(offset + 5, $ext_sys_cd6);
	}

	/**
	 * External system cd. 6 外部システムＣＤ６.<p>
	 *
	 */
	public void ext_sys_cd6(String value) {
		setConstString(offset + 5, $ext_sys_cd6, value);
	}


	/**
	 * External system cd. 7 外部システムＣＤ７.<p>
	 *
	 */
	public String ext_sys_cd7() {
		return getConstString(offset + 6, $ext_sys_cd7);
	}

	/**
	 * External system cd. 7 外部システムＣＤ７.<p>
	 *
	 */
	public void ext_sys_cd7(String value) {
		setConstString(offset + 6, $ext_sys_cd7, value);
	}


	/**
	 * External system cd. 8 外部システムＣＤ８.<p>
	 *
	 */
	public String ext_sys_cd8() {
		return getConstString(offset + 7, $ext_sys_cd8);
	}

	/**
	 * External system cd. 8 外部システムＣＤ８.<p>
	 *
	 */
	public void ext_sys_cd8(String value) {
		setConstString(offset + 7, $ext_sys_cd8, value);
	}


	/**
	 * External system cd. 9 外部システムＣＤ９.<p>
	 *
	 */
	public String ext_sys_cd9() {
		return getConstString(offset + 8, $ext_sys_cd9);
	}

	/**
	 * External system cd. 9 外部システムＣＤ９.<p>
	 *
	 */
	public void ext_sys_cd9(String value) {
		setConstString(offset + 8, $ext_sys_cd9, value);
	}


	/**
	 * External system cd. 10 外部システムＣＤ１０.<p>
	 *
	 */
	public String ext_sys_cd10() {
		return getConstString(offset + 9, $ext_sys_cd10);
	}

	/**
	 * External system cd. 10 外部システムＣＤ１０.<p>
	 *
	 */
	public void ext_sys_cd10(String value) {
		setConstString(offset + 9, $ext_sys_cd10, value);
	}


	/**
	 * Planned order refresh flg. オーダ洗い替えＦＬＧ.<p>
	 *
	 */
	public boolean ord_rep_flg() {
		return getConstBoolean(offset + 10, $ord_rep_flg);
	}

	/**
	 * Planned order refresh flg. オーダ洗い替えＦＬＧ.<p>
	 *
	 */
	public void ord_rep_flg(boolean value) {
		setConstBoolean(offset + 10, $ord_rep_flg, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 11, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 11, $loc_cd, value);
	}


	/**
	 * Linkage scheduler type 連携スケジューラ区分.<p>
	 *
	 */
	public String if_scheduler_typ() {
		return getConstString(offset + 12, $if_scheduler_typ);
	}

	/**
	 * Linkage scheduler type 連携スケジューラ区分.<p>
	 *
	 */
	public void if_scheduler_typ(String value) {
		setConstString(offset + 12, $if_scheduler_typ, value);
	}


	/**
	 * Allow subcontracting scheduling flg. 外注スケジューリング許可ＦＬＧ.<p>
	 *
	 */
	public boolean allow_outsrc_schd_flg() {
		return getConstBoolean(offset + 13, $allow_outsrc_schd_flg);
	}

	/**
	 * Allow subcontracting scheduling flg. 外注スケジューリング許可ＦＬＧ.<p>
	 *
	 */
	public void allow_outsrc_schd_flg(boolean value) {
		setConstBoolean(offset + 13, $allow_outsrc_schd_flg, value);
	}


	public String getString(String name) {
		if ($ext_sys_cd1.equalsIgnoreCase(name)) {
			return ext_sys_cd1();
		}
		if ($ext_sys_cd2.equalsIgnoreCase(name)) {
			return ext_sys_cd2();
		}
		if ($ext_sys_cd3.equalsIgnoreCase(name)) {
			return ext_sys_cd3();
		}
		if ($ext_sys_cd4.equalsIgnoreCase(name)) {
			return ext_sys_cd4();
		}
		if ($ext_sys_cd5.equalsIgnoreCase(name)) {
			return ext_sys_cd5();
		}
		if ($ext_sys_cd6.equalsIgnoreCase(name)) {
			return ext_sys_cd6();
		}
		if ($ext_sys_cd7.equalsIgnoreCase(name)) {
			return ext_sys_cd7();
		}
		if ($ext_sys_cd8.equalsIgnoreCase(name)) {
			return ext_sys_cd8();
		}
		if ($ext_sys_cd9.equalsIgnoreCase(name)) {
			return ext_sys_cd9();
		}
		if ($ext_sys_cd10.equalsIgnoreCase(name)) {
			return ext_sys_cd10();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			return if_scheduler_typ();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($ord_rep_flg.equalsIgnoreCase(name)) {
			return ord_rep_flg();
		}
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			return allow_outsrc_schd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ext_sys_cd1.equalsIgnoreCase(name)) {
			return ext_sys_cd1();
		}
		if ($ext_sys_cd2.equalsIgnoreCase(name)) {
			return ext_sys_cd2();
		}
		if ($ext_sys_cd3.equalsIgnoreCase(name)) {
			return ext_sys_cd3();
		}
		if ($ext_sys_cd4.equalsIgnoreCase(name)) {
			return ext_sys_cd4();
		}
		if ($ext_sys_cd5.equalsIgnoreCase(name)) {
			return ext_sys_cd5();
		}
		if ($ext_sys_cd6.equalsIgnoreCase(name)) {
			return ext_sys_cd6();
		}
		if ($ext_sys_cd7.equalsIgnoreCase(name)) {
			return ext_sys_cd7();
		}
		if ($ext_sys_cd8.equalsIgnoreCase(name)) {
			return ext_sys_cd8();
		}
		if ($ext_sys_cd9.equalsIgnoreCase(name)) {
			return ext_sys_cd9();
		}
		if ($ext_sys_cd10.equalsIgnoreCase(name)) {
			return ext_sys_cd10();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			return if_scheduler_typ();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ord_rep_flg.equalsIgnoreCase(name)) {
			return ord_rep_flg();
		}
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			return allow_outsrc_schd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ext_sys_cd1.equalsIgnoreCase(name)) {
			ext_sys_cd1(value);
			return;
		}
		if ($ext_sys_cd2.equalsIgnoreCase(name)) {
			ext_sys_cd2(value);
			return;
		}
		if ($ext_sys_cd3.equalsIgnoreCase(name)) {
			ext_sys_cd3(value);
			return;
		}
		if ($ext_sys_cd4.equalsIgnoreCase(name)) {
			ext_sys_cd4(value);
			return;
		}
		if ($ext_sys_cd5.equalsIgnoreCase(name)) {
			ext_sys_cd5(value);
			return;
		}
		if ($ext_sys_cd6.equalsIgnoreCase(name)) {
			ext_sys_cd6(value);
			return;
		}
		if ($ext_sys_cd7.equalsIgnoreCase(name)) {
			ext_sys_cd7(value);
			return;
		}
		if ($ext_sys_cd8.equalsIgnoreCase(name)) {
			ext_sys_cd8(value);
			return;
		}
		if ($ext_sys_cd9.equalsIgnoreCase(name)) {
			ext_sys_cd9(value);
			return;
		}
		if ($ext_sys_cd10.equalsIgnoreCase(name)) {
			ext_sys_cd10(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			if_scheduler_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ord_rep_flg.equalsIgnoreCase(name)) {
			ord_rep_flg(value);
			return;
		}
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			allow_outsrc_schd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ext_sys_cd1.equalsIgnoreCase(name)) {
			ext_sys_cd1(value);
			return;
		}
		if ($ext_sys_cd2.equalsIgnoreCase(name)) {
			ext_sys_cd2(value);
			return;
		}
		if ($ext_sys_cd3.equalsIgnoreCase(name)) {
			ext_sys_cd3(value);
			return;
		}
		if ($ext_sys_cd4.equalsIgnoreCase(name)) {
			ext_sys_cd4(value);
			return;
		}
		if ($ext_sys_cd5.equalsIgnoreCase(name)) {
			ext_sys_cd5(value);
			return;
		}
		if ($ext_sys_cd6.equalsIgnoreCase(name)) {
			ext_sys_cd6(value);
			return;
		}
		if ($ext_sys_cd7.equalsIgnoreCase(name)) {
			ext_sys_cd7(value);
			return;
		}
		if ($ext_sys_cd8.equalsIgnoreCase(name)) {
			ext_sys_cd8(value);
			return;
		}
		if ($ext_sys_cd9.equalsIgnoreCase(name)) {
			ext_sys_cd9(value);
			return;
		}
		if ($ext_sys_cd10.equalsIgnoreCase(name)) {
			ext_sys_cd10(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			if_scheduler_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ord_rep_flg.equalsIgnoreCase(name)) {
			ord_rep_flg(value);
			return;
		}
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			allow_outsrc_schd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

