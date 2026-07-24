package mcframe.serverMSBE.MSBEB0020;

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
 * ブロック"StkRealloc_Upd01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class StkRealloc_Upd01_CndR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Item cd. 品目ＣＤ.<p>
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
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public static final String $ship_loc_cd = "ship_loc_cd";
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_lg_grp_cd = "ship_lg_grp_cd";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Sort by scheduled shipping date and time 出荷予定日時順.<p>
	 *
	 */
	public static final String $ship_schd_tm_prio_flg = "ship_schd_tm_prio_flg";
	/**
	 * Search result count 検索結果件数.<p>
	 *
	 */
	public static final String $cnt = "cnt";
	/**
	 * Per thread スレッド単位.<p>
	 *
	 */
	public static final String $thread_unit = "thread_unit";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ship_loc_cd_META = createCommonMeta($ship_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ship_lg_grp_cd_META = createCommonMeta($ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta ship_schd_tm_prio_flg_META = createCommonMeta($ship_schd_tm_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cnt_META = createCommonMeta($cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta thread_unit_META = createCommonMeta($thread_unit, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<StkRealloc_Upd01_CndR> constMetas = new ConstMetaList<StkRealloc_Upd01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			ship_loc_cd_META,
			ship_lg_grp_cd_META,
			alloc_grp_cd_META,
			ship_schd_tm_prio_flg_META,
			cnt_META,
			thread_unit_META
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
	protected StkRealloc_Upd01_CndR_MC_A(ConstMetaList<? extends StkRealloc_Upd01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkRealloc_Upd01_CndR clone() {
		return (StkRealloc_Upd01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkRealloc_Upd01_CndR createInstance() {
		return (StkRealloc_Upd01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkRealloc_Upd01_CndR getValues(String... names) {
		return (StkRealloc_Upd01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public String ship_loc_cd() {
		return getConstString(offset + 5, $ship_loc_cd);
	}

	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public void ship_loc_cd(String value) {
		setConstString(offset + 5, $ship_loc_cd, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return getConstString(offset + 6, $ship_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		setConstString(offset + 6, $ship_lg_grp_cd, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 7, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 7, $alloc_grp_cd, value);
	}


	/**
	 * Sort by scheduled shipping date and time 出荷予定日時順.<p>
	 *
	 */
	public boolean ship_schd_tm_prio_flg() {
		return getConstBoolean(offset + 8, $ship_schd_tm_prio_flg);
	}

	/**
	 * Sort by scheduled shipping date and time 出荷予定日時順.<p>
	 *
	 */
	public void ship_schd_tm_prio_flg(boolean value) {
		setConstBoolean(offset + 8, $ship_schd_tm_prio_flg, value);
	}


	/**
	 * Search result count 検索結果件数.<p>
	 *
	 */
	public MCNumber cnt() {
		return getConstNumber(offset + 9, $cnt);
	}

	/**
	 * Search result count 検索結果件数.<p>
	 *
	 */
	public void cnt(MCNumber value) {
		setConstNumber(offset + 9, $cnt, value);
	}

	/**
	 * Search result count 検索結果件数.<p>
	 *
	 */
	public void cnt(int value) {
		setConstNumber(offset + 9, $cnt, value);
	}

	/**
	 * Search result count 検索結果件数.<p>
	 *
	 */
	public void cnt(long value) {
		setConstNumber(offset + 9, $cnt, value);
	}

	/**
	 * Search result count 検索結果件数.<p>
	 *
	 */
	public void cnt(float value) {
		setConstNumber(offset + 9, $cnt, value);
	}

	/**
	 * Search result count 検索結果件数.<p>
	 *
	 */
	public void cnt(double value) {
		setConstNumber(offset + 9, $cnt, value);
	}


	/**
	 * Per thread スレッド単位.<p>
	 *
	 */
	public MCNumber thread_unit() {
		return getConstNumber(offset + 10, $thread_unit);
	}

	/**
	 * Per thread スレッド単位.<p>
	 *
	 */
	public void thread_unit(MCNumber value) {
		setConstNumber(offset + 10, $thread_unit, value);
	}

	/**
	 * Per thread スレッド単位.<p>
	 *
	 */
	public void thread_unit(int value) {
		setConstNumber(offset + 10, $thread_unit, value);
	}

	/**
	 * Per thread スレッド単位.<p>
	 *
	 */
	public void thread_unit(long value) {
		setConstNumber(offset + 10, $thread_unit, value);
	}

	/**
	 * Per thread スレッド単位.<p>
	 *
	 */
	public void thread_unit(float value) {
		setConstNumber(offset + 10, $thread_unit, value);
	}

	/**
	 * Per thread スレッド単位.<p>
	 *
	 */
	public void thread_unit(double value) {
		setConstNumber(offset + 10, $thread_unit, value);
	}


	public String getString(String name) {
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
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($cnt.equalsIgnoreCase(name)) {
			return cnt();
		}
		if ($thread_unit.equalsIgnoreCase(name)) {
			return thread_unit();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($ship_schd_tm_prio_flg.equalsIgnoreCase(name)) {
			return ship_schd_tm_prio_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($cnt.equalsIgnoreCase(name)) {
			return cnt();
		}
		if ($thread_unit.equalsIgnoreCase(name)) {
			return thread_unit();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ship_schd_tm_prio_flg.equalsIgnoreCase(name)) {
			return ship_schd_tm_prio_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($thread_unit.equalsIgnoreCase(name)) {
			thread_unit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($thread_unit.equalsIgnoreCase(name)) {
			thread_unit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($thread_unit.equalsIgnoreCase(name)) {
			thread_unit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($thread_unit.equalsIgnoreCase(name)) {
			thread_unit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($thread_unit.equalsIgnoreCase(name)) {
			thread_unit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ship_schd_tm_prio_flg.equalsIgnoreCase(name)) {
			ship_schd_tm_prio_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($thread_unit.equalsIgnoreCase(name)) {
			thread_unit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($thread_unit.equalsIgnoreCase(name)) {
			thread_unit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($thread_unit.equalsIgnoreCase(name)) {
			thread_unit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($thread_unit.equalsIgnoreCase(name)) {
			thread_unit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($thread_unit.equalsIgnoreCase(name)) {
			thread_unit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ship_schd_tm_prio_flg.equalsIgnoreCase(name)) {
			ship_schd_tm_prio_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

