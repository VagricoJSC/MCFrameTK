package mcframe.serverMABS.MABSL1060;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public static final String $set_grp_cd = "set_grp_cd";
	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public static final String $set_grp_nm_lcl = "set_grp_nm_lcl";
	/**
	 * Representative item cd. 代表品目ＣＤ.<p>
	 *
	 */
	public static final String $main_itm_cd = "main_itm_cd";
	/**
	 * Representative branch No. 1 代表枝番１.<p>
	 *
	 */
	public static final String $main_itm_sub1 = "main_itm_sub1";
	/**
	 * Representative branch No. 2 代表枝番２.<p>
	 *
	 */
	public static final String $main_itm_sub2 = "main_itm_sub2";
	/**
	 * Representative branch No. 3 代表枝番３.<p>
	 *
	 */
	public static final String $main_itm_sub3 = "main_itm_sub3";
	/**
	 * Representative item name 代表品名.<p>
	 *
	 */
	public static final String $main_itm_nm = "main_itm_nm";
	/**
	 * Assortment item cd. 品揃品目ＣＤ.<p>
	 *
	 */
	public static final String $set_itm_cd = "set_itm_cd";
	/**
	 * Assortment branch No. 1 品揃枝番１.<p>
	 *
	 */
	public static final String $set_itm_sub1 = "set_itm_sub1";
	/**
	 * Assortment branch No. 2 品揃枝番２.<p>
	 *
	 */
	public static final String $set_itm_sub2 = "set_itm_sub2";
	/**
	 * Assortment branch No. 3 品揃枝番３.<p>
	 *
	 */
	public static final String $set_itm_sub3 = "set_itm_sub3";
	/**
	 * Assortment item name 品揃品名.<p>
	 *
	 */
	public static final String $set_itm_nm = "set_itm_nm";
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public static final String $off_del_flg = "off_del_flg";
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public static final String $on_del_flg = "on_del_flg";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";


	public static final MCMeta set_grp_cd_META = createCommonMeta($set_grp_cd, mcframe.commonMA.meta.MA_META.SET_GRP_CD);
	public static final MCMeta set_grp_nm_lcl_META = createCommonMeta($set_grp_nm_lcl, mcframe.commonMA.meta.MA_META.SET_GRP_NM);
	public static final MCMeta main_itm_cd_META = createCommonMeta($main_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta main_itm_sub1_META = createCommonMeta($main_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta main_itm_sub2_META = createCommonMeta($main_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta main_itm_sub3_META = createCommonMeta($main_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta main_itm_nm_META = createCommonMeta($main_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta set_itm_cd_META = createCommonMeta($set_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta set_itm_sub1_META = createCommonMeta($set_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta set_itm_sub2_META = createCommonMeta($set_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta set_itm_sub3_META = createCommonMeta($set_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta set_itm_nm_META = createCommonMeta($set_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			set_grp_cd_META,
			set_grp_nm_lcl_META,
			main_itm_cd_META,
			main_itm_sub1_META,
			main_itm_sub2_META,
			main_itm_sub3_META,
			main_itm_nm_META,
			set_itm_cd_META,
			set_itm_sub1_META,
			set_itm_sub2_META,
			set_itm_sub3_META,
			set_itm_nm_META,
			off_del_flg_META,
			on_del_flg_META,
			memo1_META,
			memo2_META,
			memo3_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public String set_grp_cd() {
		return getConstString(offset + 0, $set_grp_cd);
	}

	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public void set_grp_cd(String value) {
		setConstString(offset + 0, $set_grp_cd, value);
	}


	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public String set_grp_nm_lcl() {
		return getConstString(offset + 1, $set_grp_nm_lcl);
	}

	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public void set_grp_nm_lcl(String value) {
		setConstString(offset + 1, $set_grp_nm_lcl, value);
	}


	/**
	 * Representative item cd. 代表品目ＣＤ.<p>
	 *
	 */
	public String main_itm_cd() {
		return getConstString(offset + 2, $main_itm_cd);
	}

	/**
	 * Representative item cd. 代表品目ＣＤ.<p>
	 *
	 */
	public void main_itm_cd(String value) {
		setConstString(offset + 2, $main_itm_cd, value);
	}


	/**
	 * Representative branch No. 1 代表枝番１.<p>
	 *
	 */
	public String main_itm_sub1() {
		return getConstString(offset + 3, $main_itm_sub1);
	}

	/**
	 * Representative branch No. 1 代表枝番１.<p>
	 *
	 */
	public void main_itm_sub1(String value) {
		setConstString(offset + 3, $main_itm_sub1, value);
	}


	/**
	 * Representative branch No. 2 代表枝番２.<p>
	 *
	 */
	public String main_itm_sub2() {
		return getConstString(offset + 4, $main_itm_sub2);
	}

	/**
	 * Representative branch No. 2 代表枝番２.<p>
	 *
	 */
	public void main_itm_sub2(String value) {
		setConstString(offset + 4, $main_itm_sub2, value);
	}


	/**
	 * Representative branch No. 3 代表枝番３.<p>
	 *
	 */
	public String main_itm_sub3() {
		return getConstString(offset + 5, $main_itm_sub3);
	}

	/**
	 * Representative branch No. 3 代表枝番３.<p>
	 *
	 */
	public void main_itm_sub3(String value) {
		setConstString(offset + 5, $main_itm_sub3, value);
	}


	/**
	 * Representative item name 代表品名.<p>
	 *
	 */
	public String main_itm_nm() {
		return getConstString(offset + 6, $main_itm_nm);
	}

	/**
	 * Representative item name 代表品名.<p>
	 *
	 */
	public void main_itm_nm(String value) {
		setConstString(offset + 6, $main_itm_nm, value);
	}


	/**
	 * Assortment item cd. 品揃品目ＣＤ.<p>
	 *
	 */
	public String set_itm_cd() {
		return getConstString(offset + 7, $set_itm_cd);
	}

	/**
	 * Assortment item cd. 品揃品目ＣＤ.<p>
	 *
	 */
	public void set_itm_cd(String value) {
		setConstString(offset + 7, $set_itm_cd, value);
	}


	/**
	 * Assortment branch No. 1 品揃枝番１.<p>
	 *
	 */
	public String set_itm_sub1() {
		return getConstString(offset + 8, $set_itm_sub1);
	}

	/**
	 * Assortment branch No. 1 品揃枝番１.<p>
	 *
	 */
	public void set_itm_sub1(String value) {
		setConstString(offset + 8, $set_itm_sub1, value);
	}


	/**
	 * Assortment branch No. 2 品揃枝番２.<p>
	 *
	 */
	public String set_itm_sub2() {
		return getConstString(offset + 9, $set_itm_sub2);
	}

	/**
	 * Assortment branch No. 2 品揃枝番２.<p>
	 *
	 */
	public void set_itm_sub2(String value) {
		setConstString(offset + 9, $set_itm_sub2, value);
	}


	/**
	 * Assortment branch No. 3 品揃枝番３.<p>
	 *
	 */
	public String set_itm_sub3() {
		return getConstString(offset + 10, $set_itm_sub3);
	}

	/**
	 * Assortment branch No. 3 品揃枝番３.<p>
	 *
	 */
	public void set_itm_sub3(String value) {
		setConstString(offset + 10, $set_itm_sub3, value);
	}


	/**
	 * Assortment item name 品揃品名.<p>
	 *
	 */
	public String set_itm_nm() {
		return getConstString(offset + 11, $set_itm_nm);
	}

	/**
	 * Assortment item name 品揃品名.<p>
	 *
	 */
	public void set_itm_nm(String value) {
		setConstString(offset + 11, $set_itm_nm, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 12, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 12, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 13, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 13, $on_del_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 14, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 14, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 15, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 15, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 16, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 16, $memo3, value);
	}


	public String getString(String name) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($set_grp_nm_lcl.equalsIgnoreCase(name)) {
			return set_grp_nm_lcl();
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			return main_itm_cd();
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			return main_itm_sub1();
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			return main_itm_sub2();
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			return main_itm_sub3();
		}
		if ($main_itm_nm.equalsIgnoreCase(name)) {
			return main_itm_nm();
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			return set_itm_cd();
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			return set_itm_sub1();
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			return set_itm_sub2();
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			return set_itm_sub3();
		}
		if ($set_itm_nm.equalsIgnoreCase(name)) {
			return set_itm_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($set_grp_nm_lcl.equalsIgnoreCase(name)) {
			return set_grp_nm_lcl();
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			return main_itm_cd();
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			return main_itm_sub1();
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			return main_itm_sub2();
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			return main_itm_sub3();
		}
		if ($main_itm_nm.equalsIgnoreCase(name)) {
			return main_itm_nm();
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			return set_itm_cd();
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			return set_itm_sub1();
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			return set_itm_sub2();
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			return set_itm_sub3();
		}
		if ($set_itm_nm.equalsIgnoreCase(name)) {
			return set_itm_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($set_grp_nm_lcl.equalsIgnoreCase(name)) {
			set_grp_nm_lcl(value);
			return;
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			main_itm_cd(value);
			return;
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			main_itm_sub1(value);
			return;
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			main_itm_sub2(value);
			return;
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			main_itm_sub3(value);
			return;
		}
		if ($main_itm_nm.equalsIgnoreCase(name)) {
			main_itm_nm(value);
			return;
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			set_itm_cd(value);
			return;
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			set_itm_sub1(value);
			return;
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			set_itm_sub2(value);
			return;
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			set_itm_sub3(value);
			return;
		}
		if ($set_itm_nm.equalsIgnoreCase(name)) {
			set_itm_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($set_grp_nm_lcl.equalsIgnoreCase(name)) {
			set_grp_nm_lcl(value);
			return;
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			main_itm_cd(value);
			return;
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			main_itm_sub1(value);
			return;
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			main_itm_sub2(value);
			return;
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			main_itm_sub3(value);
			return;
		}
		if ($main_itm_nm.equalsIgnoreCase(name)) {
			main_itm_nm(value);
			return;
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			set_itm_cd(value);
			return;
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			set_itm_sub1(value);
			return;
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			set_itm_sub2(value);
			return;
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			set_itm_sub3(value);
			return;
		}
		if ($set_itm_nm.equalsIgnoreCase(name)) {
			set_itm_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

