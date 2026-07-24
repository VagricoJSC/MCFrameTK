package mcframe.clientMABC.MABCP0900;

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
	 * General purpose classification cd. 汎用分類ＣＤ.<p>
	 *
	 */
	public static final String $gp_grp_cd = "gp_grp_cd";
	/**
	 * General purpose classification name 汎用分類名.<p>
	 *
	 */
	public static final String $gp_grp_nm = "gp_grp_nm";
	/**
	 * Key 1 キー１.<p>
	 *
	 */
	public static final String $key1 = "key1";
	/**
	 * Key 2 キー２.<p>
	 *
	 */
	public static final String $key2 = "key2";
	/**
	 * Key 3 キー３.<p>
	 *
	 */
	public static final String $key3 = "key3";
	/**
	 * Key 4 キー４.<p>
	 *
	 */
	public static final String $key4 = "key4";
	/**
	 * Key 5 キー５.<p>
	 *
	 */
	public static final String $key5 = "key5";
	/**
	 * Key 6 キー６.<p>
	 *
	 */
	public static final String $key6 = "key6";
	/**
	 * Key 7 キー７.<p>
	 *
	 */
	public static final String $key7 = "key7";
	/**
	 * Key 8 キー８.<p>
	 *
	 */
	public static final String $key8 = "key8";
	/**
	 * Key 9 キー９.<p>
	 *
	 */
	public static final String $key9 = "key9";
	/**
	 * Key 10 キー１０.<p>
	 *
	 */
	public static final String $key10 = "key10";
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


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta gp_grp_cd_META = createCommonMeta($gp_grp_cd, mcframe.commonMA.meta.MA_META.GP_GRP_CD);
	public static final MCMeta gp_grp_nm_META = createCommonMeta($gp_grp_nm, mcframe.commonMA.meta.MA_META.GP_GRP_NM);
	public static final MCMeta key1_META = createCommonMeta($key1, mcframe.commonMA.meta.MA_META.GP_KEY1);
	public static final MCMeta key2_META = createCommonMeta($key2, mcframe.commonMA.meta.MA_META.GP_KEY2);
	public static final MCMeta key3_META = createCommonMeta($key3, mcframe.commonMA.meta.MA_META.GP_KEY3);
	public static final MCMeta key4_META = createCommonMeta($key4, mcframe.commonMA.meta.MA_META.GP_KEY4);
	public static final MCMeta key5_META = createCommonMeta($key5, mcframe.commonMA.meta.MA_META.GP_KEY5);
	public static final MCMeta key6_META = createCommonMeta($key6, mcframe.commonMA.meta.MA_META.GP_KEY6);
	public static final MCMeta key7_META = createCommonMeta($key7, mcframe.commonMA.meta.MA_META.GP_KEY7);
	public static final MCMeta key8_META = createCommonMeta($key8, mcframe.commonMA.meta.MA_META.GP_KEY8);
	public static final MCMeta key9_META = createCommonMeta($key9, mcframe.commonMA.meta.MA_META.GP_KEY9);
	public static final MCMeta key10_META = createCommonMeta($key10, mcframe.commonMA.meta.MA_META.GP_KEY10);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			gp_grp_cd_META,
			gp_grp_nm_META,
			key1_META,
			key2_META,
			key3_META,
			key4_META,
			key5_META,
			key6_META,
			key7_META,
			key8_META,
			key9_META,
			key10_META,
			memo1_META,
			memo2_META,
			memo3_META,
			off_del_flg_META,
			on_del_flg_META
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
	 * General purpose classification cd. 汎用分類ＣＤ.<p>
	 *
	 */
	public String gp_grp_cd() {
		return getConstString(offset + 1, $gp_grp_cd);
	}

	/**
	 * General purpose classification cd. 汎用分類ＣＤ.<p>
	 *
	 */
	public void gp_grp_cd(String value) {
		setConstString(offset + 1, $gp_grp_cd, value);
	}


	/**
	 * General purpose classification name 汎用分類名.<p>
	 *
	 */
	public String gp_grp_nm() {
		return getConstString(offset + 2, $gp_grp_nm);
	}

	/**
	 * General purpose classification name 汎用分類名.<p>
	 *
	 */
	public void gp_grp_nm(String value) {
		setConstString(offset + 2, $gp_grp_nm, value);
	}


	/**
	 * Key 1 キー１.<p>
	 *
	 */
	public String key1() {
		return getConstString(offset + 3, $key1);
	}

	/**
	 * Key 1 キー１.<p>
	 *
	 */
	public void key1(String value) {
		setConstString(offset + 3, $key1, value);
	}


	/**
	 * Key 2 キー２.<p>
	 *
	 */
	public String key2() {
		return getConstString(offset + 4, $key2);
	}

	/**
	 * Key 2 キー２.<p>
	 *
	 */
	public void key2(String value) {
		setConstString(offset + 4, $key2, value);
	}


	/**
	 * Key 3 キー３.<p>
	 *
	 */
	public String key3() {
		return getConstString(offset + 5, $key3);
	}

	/**
	 * Key 3 キー３.<p>
	 *
	 */
	public void key3(String value) {
		setConstString(offset + 5, $key3, value);
	}


	/**
	 * Key 4 キー４.<p>
	 *
	 */
	public String key4() {
		return getConstString(offset + 6, $key4);
	}

	/**
	 * Key 4 キー４.<p>
	 *
	 */
	public void key4(String value) {
		setConstString(offset + 6, $key4, value);
	}


	/**
	 * Key 5 キー５.<p>
	 *
	 */
	public String key5() {
		return getConstString(offset + 7, $key5);
	}

	/**
	 * Key 5 キー５.<p>
	 *
	 */
	public void key5(String value) {
		setConstString(offset + 7, $key5, value);
	}


	/**
	 * Key 6 キー６.<p>
	 *
	 */
	public String key6() {
		return getConstString(offset + 8, $key6);
	}

	/**
	 * Key 6 キー６.<p>
	 *
	 */
	public void key6(String value) {
		setConstString(offset + 8, $key6, value);
	}


	/**
	 * Key 7 キー７.<p>
	 *
	 */
	public String key7() {
		return getConstString(offset + 9, $key7);
	}

	/**
	 * Key 7 キー７.<p>
	 *
	 */
	public void key7(String value) {
		setConstString(offset + 9, $key7, value);
	}


	/**
	 * Key 8 キー８.<p>
	 *
	 */
	public String key8() {
		return getConstString(offset + 10, $key8);
	}

	/**
	 * Key 8 キー８.<p>
	 *
	 */
	public void key8(String value) {
		setConstString(offset + 10, $key8, value);
	}


	/**
	 * Key 9 キー９.<p>
	 *
	 */
	public String key9() {
		return getConstString(offset + 11, $key9);
	}

	/**
	 * Key 9 キー９.<p>
	 *
	 */
	public void key9(String value) {
		setConstString(offset + 11, $key9, value);
	}


	/**
	 * Key 10 キー１０.<p>
	 *
	 */
	public String key10() {
		return getConstString(offset + 12, $key10);
	}

	/**
	 * Key 10 キー１０.<p>
	 *
	 */
	public void key10(String value) {
		setConstString(offset + 12, $key10, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 13, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 13, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 14, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 14, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 15, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 15, $memo3, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 16, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 16, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 17, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 17, $on_del_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			return gp_grp_cd();
		}
		if ($gp_grp_nm.equalsIgnoreCase(name)) {
			return gp_grp_nm();
		}
		if ($key1.equalsIgnoreCase(name)) {
			return key1();
		}
		if ($key2.equalsIgnoreCase(name)) {
			return key2();
		}
		if ($key3.equalsIgnoreCase(name)) {
			return key3();
		}
		if ($key4.equalsIgnoreCase(name)) {
			return key4();
		}
		if ($key5.equalsIgnoreCase(name)) {
			return key5();
		}
		if ($key6.equalsIgnoreCase(name)) {
			return key6();
		}
		if ($key7.equalsIgnoreCase(name)) {
			return key7();
		}
		if ($key8.equalsIgnoreCase(name)) {
			return key8();
		}
		if ($key9.equalsIgnoreCase(name)) {
			return key9();
		}
		if ($key10.equalsIgnoreCase(name)) {
			return key10();
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
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			return gp_grp_cd();
		}
		if ($gp_grp_nm.equalsIgnoreCase(name)) {
			return gp_grp_nm();
		}
		if ($key1.equalsIgnoreCase(name)) {
			return key1();
		}
		if ($key2.equalsIgnoreCase(name)) {
			return key2();
		}
		if ($key3.equalsIgnoreCase(name)) {
			return key3();
		}
		if ($key4.equalsIgnoreCase(name)) {
			return key4();
		}
		if ($key5.equalsIgnoreCase(name)) {
			return key5();
		}
		if ($key6.equalsIgnoreCase(name)) {
			return key6();
		}
		if ($key7.equalsIgnoreCase(name)) {
			return key7();
		}
		if ($key8.equalsIgnoreCase(name)) {
			return key8();
		}
		if ($key9.equalsIgnoreCase(name)) {
			return key9();
		}
		if ($key10.equalsIgnoreCase(name)) {
			return key10();
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
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			gp_grp_cd(value);
			return;
		}
		if ($gp_grp_nm.equalsIgnoreCase(name)) {
			gp_grp_nm(value);
			return;
		}
		if ($key1.equalsIgnoreCase(name)) {
			key1(value);
			return;
		}
		if ($key2.equalsIgnoreCase(name)) {
			key2(value);
			return;
		}
		if ($key3.equalsIgnoreCase(name)) {
			key3(value);
			return;
		}
		if ($key4.equalsIgnoreCase(name)) {
			key4(value);
			return;
		}
		if ($key5.equalsIgnoreCase(name)) {
			key5(value);
			return;
		}
		if ($key6.equalsIgnoreCase(name)) {
			key6(value);
			return;
		}
		if ($key7.equalsIgnoreCase(name)) {
			key7(value);
			return;
		}
		if ($key8.equalsIgnoreCase(name)) {
			key8(value);
			return;
		}
		if ($key9.equalsIgnoreCase(name)) {
			key9(value);
			return;
		}
		if ($key10.equalsIgnoreCase(name)) {
			key10(value);
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
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			gp_grp_cd(value);
			return;
		}
		if ($gp_grp_nm.equalsIgnoreCase(name)) {
			gp_grp_nm(value);
			return;
		}
		if ($key1.equalsIgnoreCase(name)) {
			key1(value);
			return;
		}
		if ($key2.equalsIgnoreCase(name)) {
			key2(value);
			return;
		}
		if ($key3.equalsIgnoreCase(name)) {
			key3(value);
			return;
		}
		if ($key4.equalsIgnoreCase(name)) {
			key4(value);
			return;
		}
		if ($key5.equalsIgnoreCase(name)) {
			key5(value);
			return;
		}
		if ($key6.equalsIgnoreCase(name)) {
			key6(value);
			return;
		}
		if ($key7.equalsIgnoreCase(name)) {
			key7(value);
			return;
		}
		if ($key8.equalsIgnoreCase(name)) {
			key8(value);
			return;
		}
		if ($key9.equalsIgnoreCase(name)) {
			key9(value);
			return;
		}
		if ($key10.equalsIgnoreCase(name)) {
			key10(value);
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

