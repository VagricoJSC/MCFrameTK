package mcframe.clientMABS.MABSP1060;

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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public static final String $set_grp_cd = "set_grp_cd";
	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public static final String $set_grp_nm = "set_grp_nm";
	public static final String $main_itm_p = "main_itm_p";
	public static final String $set_itm_p = "set_itm_p";
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

	public static final String $main_itm_cd = $main_itm_p + ".itm_cd";
	public static final String $main_itm_sub1 = $main_itm_p + ".itm_sub1";
	public static final String $main_itm_sub2 = $main_itm_p + ".itm_sub2";
	public static final String $main_itm_sub3 = $main_itm_p + ".itm_sub3";
	public static final String $main_itm_nm = $main_itm_p + ".itm_nm";
	public static final String $set_itm_cd = $set_itm_p + ".itm_cd";
	public static final String $set_itm_sub1 = $set_itm_p + ".itm_sub1";
	public static final String $set_itm_sub2 = $set_itm_p + ".itm_sub2";
	public static final String $set_itm_sub3 = $set_itm_p + ".itm_sub3";
	public static final String $set_itm_nm = $set_itm_p + ".itm_nm";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta set_grp_cd_META = createCommonMeta($set_grp_cd, mcframe.commonMA.meta.MA_META.SET_GRP_CD);
	public static final MCMeta set_grp_nm_META = createCommonMeta($set_grp_nm, mcframe.commonMA.meta.MA_META.SET_GRP_NM);
	public static final MCMeta main_itm_p_META = createInnerRowMeta($main_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta set_itm_p_META = createInnerRowMeta($set_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			set_grp_cd_META,
			set_grp_nm_META,
			main_itm_p_META,
			set_itm_p_META,
			memo1_META,
			memo2_META,
			memo3_META,
			off_del_flg_META,
			on_del_flg_META
		},
		new String[][]{
			{
				"main_itm_cd",
				"main_itm_sub1",
				"main_itm_sub2",
				"main_itm_sub3",
				"main_itm_nm",
				"set_itm_cd",
				"set_itm_sub1",
				"set_itm_sub2",
				"set_itm_sub3",
				"set_itm_nm"
			},
			{
				$main_itm_cd,
				$main_itm_sub1,
				$main_itm_sub2,
				$main_itm_sub3,
				$main_itm_nm,
				$set_itm_cd,
				$set_itm_sub1,
				$set_itm_sub2,
				$set_itm_sub3,
				$set_itm_nm
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$main_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3"},	// main_itm_p.itm_cd
				{$main_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3"},	// main_itm_p.itm_sub1
				{$main_itm_p + ".itm_sub2", "itm_nm;itm_sub3"},	// main_itm_p.itm_sub2
				{$main_itm_p + ".itm_sub3", "itm_nm"},	// main_itm_p.itm_sub3
				{$set_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3"},	// set_itm_p.itm_cd
				{$set_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3"},	// set_itm_p.itm_sub1
				{$set_itm_p + ".itm_sub2", "itm_nm;itm_sub3"},	// set_itm_p.itm_sub2
				{$set_itm_p + ".itm_sub3", "itm_nm"}	// set_itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$main_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// main_itm_p.itm_cd
				{$main_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;main_itm_cd"},	// main_itm_p.itm_sub1
				{$main_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;main_itm_cd;main_itm_sub1"},	// main_itm_p.itm_sub2
				{$main_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;main_itm_cd;main_itm_sub1;main_itm_sub2"},	// main_itm_p.itm_sub3
				{$set_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// set_itm_p.itm_cd
				{$set_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;set_itm_cd"},	// set_itm_p.itm_sub1
				{$set_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;set_itm_cd;set_itm_sub1"},	// set_itm_p.itm_sub2
				{$set_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;set_itm_cd;set_itm_sub1;set_itm_sub2"}	// set_itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$main_itm_p + ".itm_cd", "itm_is_srch_typ"},	// main_itm_p.itm_cd
				{$main_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// main_itm_p.itm_sub1
				{$main_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// main_itm_p.itm_sub2
				{$main_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// main_itm_p.itm_sub3
				{$set_itm_p + ".itm_cd", "itm_is_srch_typ"},	// set_itm_p.itm_cd
				{$set_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// set_itm_p.itm_sub1
				{$set_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// set_itm_p.itm_sub2
				{$set_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// set_itm_p.itm_sub3
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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public String set_grp_cd() {
		return getConstString(offset + 1, $set_grp_cd);
	}

	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public void set_grp_cd(String value) {
		setConstString(offset + 1, $set_grp_cd, value);
	}


	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public String set_grp_nm() {
		return getConstString(offset + 2, $set_grp_nm);
	}

	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public void set_grp_nm(String value) {
		setConstString(offset + 2, $set_grp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR main_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 3, $main_itm_p);
	}
	
	public void main_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 3, $main_itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR set_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 4, $set_itm_p);
	}
	
	public void set_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 4, $set_itm_p, row);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 5, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 5, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 6, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 6, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 7, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 7, $memo3, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 8, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 8, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 9, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 9, $on_del_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			return set_grp_nm();
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
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			return set_grp_nm();
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
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			set_grp_nm(value);
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
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			set_grp_nm(value);
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

	public MCRow getInnerRow(String name) {
		if ($main_itm_p.equalsIgnoreCase(name)) {
			return main_itm_p();
		}
		if ($set_itm_p.equalsIgnoreCase(name)) {
			return set_itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($main_itm_p.equalsIgnoreCase(name)) {
			main_itm_p(
				((MCContainerMeta) main_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($set_itm_p.equalsIgnoreCase(name)) {
			set_itm_p(
				((MCContainerMeta) set_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Representative item cd. 代表品目ＣＤ.<p>
	 *
	 */
	public String main_itm_cd() {
		return main_itm_p().itm_cd();
	}

	/**
	 * Representative item cd. 代表品目ＣＤ.<p>
	 *
	 */
	public void main_itm_cd(String value) {
		main_itm_p().itm_cd(value);
	}

	/**
	 * Representative branch No. 1 代表枝番１.<p>
	 *
	 */
	public String main_itm_sub1() {
		return main_itm_p().itm_sub1();
	}

	/**
	 * Representative branch No. 1 代表枝番１.<p>
	 *
	 */
	public void main_itm_sub1(String value) {
		main_itm_p().itm_sub1(value);
	}

	/**
	 * Representative branch No. 2 代表枝番２.<p>
	 *
	 */
	public String main_itm_sub2() {
		return main_itm_p().itm_sub2();
	}

	/**
	 * Representative branch No. 2 代表枝番２.<p>
	 *
	 */
	public void main_itm_sub2(String value) {
		main_itm_p().itm_sub2(value);
	}

	/**
	 * Representative branch No. 3 代表枝番３.<p>
	 *
	 */
	public String main_itm_sub3() {
		return main_itm_p().itm_sub3();
	}

	/**
	 * Representative branch No. 3 代表枝番３.<p>
	 *
	 */
	public void main_itm_sub3(String value) {
		main_itm_p().itm_sub3(value);
	}

	/**
	 * Representative item name 代表品名.<p>
	 *
	 */
	public String main_itm_nm() {
		return main_itm_p().itm_nm();
	}

	/**
	 * Representative item name 代表品名.<p>
	 *
	 */
	public void main_itm_nm(String value) {
		main_itm_p().itm_nm(value);
	}

	/**
	 * Assortment item cd. 品揃品目ＣＤ.<p>
	 *
	 */
	public String set_itm_cd() {
		return set_itm_p().itm_cd();
	}

	/**
	 * Assortment item cd. 品揃品目ＣＤ.<p>
	 *
	 */
	public void set_itm_cd(String value) {
		set_itm_p().itm_cd(value);
	}

	/**
	 * Assortment branch No. 1 品揃枝番１.<p>
	 *
	 */
	public String set_itm_sub1() {
		return set_itm_p().itm_sub1();
	}

	/**
	 * Assortment branch No. 1 品揃枝番１.<p>
	 *
	 */
	public void set_itm_sub1(String value) {
		set_itm_p().itm_sub1(value);
	}

	/**
	 * Assortment branch No. 2 品揃枝番２.<p>
	 *
	 */
	public String set_itm_sub2() {
		return set_itm_p().itm_sub2();
	}

	/**
	 * Assortment branch No. 2 品揃枝番２.<p>
	 *
	 */
	public void set_itm_sub2(String value) {
		set_itm_p().itm_sub2(value);
	}

	/**
	 * Assortment branch No. 3 品揃枝番３.<p>
	 *
	 */
	public String set_itm_sub3() {
		return set_itm_p().itm_sub3();
	}

	/**
	 * Assortment branch No. 3 品揃枝番３.<p>
	 *
	 */
	public void set_itm_sub3(String value) {
		set_itm_p().itm_sub3(value);
	}

	/**
	 * Assortment item name 品揃品名.<p>
	 *
	 */
	public String set_itm_nm() {
		return set_itm_p().itm_nm();
	}

	/**
	 * Assortment item name 品揃品名.<p>
	 *
	 */
	public void set_itm_nm(String value) {
		set_itm_p().itm_nm(value);
	}

}

