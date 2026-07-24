package mcframe.serverMABC.MABCL0240;

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
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_nm_lcl = "usr_nm_lcl";
	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public static final String $usr_alt_nm1 = "usr_alt_nm1";
	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public static final String $usr_alt_nm2 = "usr_alt_nm2";
	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public static final String $usr_alt_nm3 = "usr_alt_nm3";
	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public static final String $usr_alt_nm4 = "usr_alt_nm4";
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
	/**
	 * Search image 画像検索.<p>
	 *
	 */
	public static final String $th_image_flg = "th_image_flg";
	/**
	 * Employee type 社員区分.<p>
	 *
	 */
	public static final String $usr_com_typ = "usr_com_typ";
	/**
	 * Affiliation company 所属会社.<p>
	 *
	 */
	public static final String $usr_com = "usr_com";
	/**
	 * PIC info. 1 担当者情報１.<p>
	 *
	 */
	public static final String $usr_info1 = "usr_info1";
	/**
	 * PIC info. 2 担当者情報２.<p>
	 *
	 */
	public static final String $usr_info2 = "usr_info2";
	/**
	 * PIC info. 3 担当者情報３.<p>
	 *
	 */
	public static final String $usr_info3 = "usr_info3";
	/**
	 * PIC info. 4 担当者情報４.<p>
	 *
	 */
	public static final String $usr_info4 = "usr_info4";
	/**
	 * PIC info. 5 担当者情報５.<p>
	 *
	 */
	public static final String $usr_info5 = "usr_info5";
	/**
	 * PIC info. 6 担当者情報６.<p>
	 *
	 */
	public static final String $usr_info6 = "usr_info6";
	/**
	 * PIC info. 7 担当者情報７.<p>
	 *
	 */
	public static final String $usr_info7 = "usr_info7";
	/**
	 * PIC info. 8 担当者情報８.<p>
	 *
	 */
	public static final String $usr_info8 = "usr_info8";
	/**
	 * PIC info. 9 担当者情報９.<p>
	 *
	 */
	public static final String $usr_info9 = "usr_info9";
	/**
	 * PIC info. 10 担当者情報１０.<p>
	 *
	 */
	public static final String $usr_info10 = "usr_info10";
	/**
	 * PIC info. 11 担当者情報１１.<p>
	 *
	 */
	public static final String $usr_info11 = "usr_info11";
	/**
	 * PIC info. 12 担当者情報１２.<p>
	 *
	 */
	public static final String $usr_info12 = "usr_info12";
	/**
	 * PIC info. 13 担当者情報１３.<p>
	 *
	 */
	public static final String $usr_info13 = "usr_info13";
	/**
	 * PIC info. 14 担当者情報１４.<p>
	 *
	 */
	public static final String $usr_info14 = "usr_info14";
	/**
	 * PIC info. 15 担当者情報１５.<p>
	 *
	 */
	public static final String $usr_info15 = "usr_info15";
	/**
	 * PIC info. 16 担当者情報１６.<p>
	 *
	 */
	public static final String $usr_info16 = "usr_info16";
	/**
	 * PIC info. 17 担当者情報１７.<p>
	 *
	 */
	public static final String $usr_info17 = "usr_info17";
	/**
	 * PIC info. 18 担当者情報１８.<p>
	 *
	 */
	public static final String $usr_info18 = "usr_info18";
	/**
	 * PIC info. 19 担当者情報１９.<p>
	 *
	 */
	public static final String $usr_info19 = "usr_info19";
	/**
	 * PIC info. 20 担当者情報２０.<p>
	 *
	 */
	public static final String $usr_info20 = "usr_info20";


	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta usr_nm_lcl_META = createCommonMeta($usr_nm_lcl, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_alt_nm1_META = createCommonMeta($usr_alt_nm1, mcframe.commonMA.meta.MA_META.USR_LNM1);
	public static final MCMeta usr_alt_nm2_META = createCommonMeta($usr_alt_nm2, mcframe.commonMA.meta.MA_META.USR_LNM2);
	public static final MCMeta usr_alt_nm3_META = createCommonMeta($usr_alt_nm3, mcframe.commonMA.meta.MA_META.USR_LNM3);
	public static final MCMeta usr_alt_nm4_META = createCommonMeta($usr_alt_nm4, mcframe.commonMA.meta.MA_META.USR_LNM4);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta th_image_flg_META = createCommonMeta($th_image_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_com_typ_META = createCommonMeta($usr_com_typ, mcframe.commonMA.meta.MA_META.USR_COM_TYP);
	public static final MCMeta usr_com_META = createCommonMeta($usr_com, mcframe.commonMA.meta.MA_META.USR_COM);
	public static final MCMeta usr_info1_META = createCommonMeta($usr_info1, mcframe.commonMA.meta.MA_META.USR_INFO1);
	public static final MCMeta usr_info2_META = createCommonMeta($usr_info2, mcframe.commonMA.meta.MA_META.USR_INFO2);
	public static final MCMeta usr_info3_META = createCommonMeta($usr_info3, mcframe.commonMA.meta.MA_META.USR_INFO3);
	public static final MCMeta usr_info4_META = createCommonMeta($usr_info4, mcframe.commonMA.meta.MA_META.USR_INFO4);
	public static final MCMeta usr_info5_META = createCommonMeta($usr_info5, mcframe.commonMA.meta.MA_META.USR_INFO5);
	public static final MCMeta usr_info6_META = createCommonMeta($usr_info6, mcframe.commonMA.meta.MA_META.USR_INFO6);
	public static final MCMeta usr_info7_META = createCommonMeta($usr_info7, mcframe.commonMA.meta.MA_META.USR_INFO7);
	public static final MCMeta usr_info8_META = createCommonMeta($usr_info8, mcframe.commonMA.meta.MA_META.USR_INFO8);
	public static final MCMeta usr_info9_META = createCommonMeta($usr_info9, mcframe.commonMA.meta.MA_META.USR_INFO9);
	public static final MCMeta usr_info10_META = createCommonMeta($usr_info10, mcframe.commonMA.meta.MA_META.USR_INFO10);
	public static final MCMeta usr_info11_META = createCommonMeta($usr_info11, mcframe.commonMA.meta.MA_META.USR_INFO11);
	public static final MCMeta usr_info12_META = createCommonMeta($usr_info12, mcframe.commonMA.meta.MA_META.USR_INFO12);
	public static final MCMeta usr_info13_META = createCommonMeta($usr_info13, mcframe.commonMA.meta.MA_META.USR_INFO13);
	public static final MCMeta usr_info14_META = createCommonMeta($usr_info14, mcframe.commonMA.meta.MA_META.USR_INFO14);
	public static final MCMeta usr_info15_META = createCommonMeta($usr_info15, mcframe.commonMA.meta.MA_META.USR_INFO15);
	public static final MCMeta usr_info16_META = createCommonMeta($usr_info16, mcframe.commonMA.meta.MA_META.USR_INFO16);
	public static final MCMeta usr_info17_META = createCommonMeta($usr_info17, mcframe.commonMA.meta.MA_META.USR_INFO17);
	public static final MCMeta usr_info18_META = createCommonMeta($usr_info18, mcframe.commonMA.meta.MA_META.USR_INFO18);
	public static final MCMeta usr_info19_META = createCommonMeta($usr_info19, mcframe.commonMA.meta.MA_META.USR_INFO19);
	public static final MCMeta usr_info20_META = createCommonMeta($usr_info20, mcframe.commonMA.meta.MA_META.USR_INFO20);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			usr_cd_META,
			usr_nm_lcl_META,
			usr_alt_nm1_META,
			usr_alt_nm2_META,
			usr_alt_nm3_META,
			usr_alt_nm4_META,
			off_del_flg_META,
			on_del_flg_META,
			memo1_META,
			memo2_META,
			memo3_META,
			th_image_flg_META,
			usr_com_typ_META,
			usr_com_META,
			usr_info1_META,
			usr_info2_META,
			usr_info3_META,
			usr_info4_META,
			usr_info5_META,
			usr_info6_META,
			usr_info7_META,
			usr_info8_META,
			usr_info9_META,
			usr_info10_META,
			usr_info11_META,
			usr_info12_META,
			usr_info13_META,
			usr_info14_META,
			usr_info15_META,
			usr_info16_META,
			usr_info17_META,
			usr_info18_META,
			usr_info19_META,
			usr_info20_META
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
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 0, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 0, $usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_nm_lcl() {
		return getConstString(offset + 1, $usr_nm_lcl);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_nm_lcl(String value) {
		setConstString(offset + 1, $usr_nm_lcl, value);
	}


	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public String usr_alt_nm1() {
		return getConstString(offset + 2, $usr_alt_nm1);
	}

	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public void usr_alt_nm1(String value) {
		setConstString(offset + 2, $usr_alt_nm1, value);
	}


	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public String usr_alt_nm2() {
		return getConstString(offset + 3, $usr_alt_nm2);
	}

	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public void usr_alt_nm2(String value) {
		setConstString(offset + 3, $usr_alt_nm2, value);
	}


	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public String usr_alt_nm3() {
		return getConstString(offset + 4, $usr_alt_nm3);
	}

	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public void usr_alt_nm3(String value) {
		setConstString(offset + 4, $usr_alt_nm3, value);
	}


	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public String usr_alt_nm4() {
		return getConstString(offset + 5, $usr_alt_nm4);
	}

	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public void usr_alt_nm4(String value) {
		setConstString(offset + 5, $usr_alt_nm4, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 6, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 6, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 7, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 7, $on_del_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 8, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 8, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 9, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 9, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 10, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 10, $memo3, value);
	}


	/**
	 * Search image 画像検索.<p>
	 *
	 */
	public boolean th_image_flg() {
		return getConstBoolean(offset + 11, $th_image_flg);
	}

	/**
	 * Search image 画像検索.<p>
	 *
	 */
	public void th_image_flg(boolean value) {
		setConstBoolean(offset + 11, $th_image_flg, value);
	}


	/**
	 * Employee type 社員区分.<p>
	 *
	 */
	public String usr_com_typ() {
		return getConstString(offset + 12, $usr_com_typ);
	}

	/**
	 * Employee type 社員区分.<p>
	 *
	 */
	public void usr_com_typ(String value) {
		setConstString(offset + 12, $usr_com_typ, value);
	}


	/**
	 * Affiliation company 所属会社.<p>
	 *
	 */
	public String usr_com() {
		return getConstString(offset + 13, $usr_com);
	}

	/**
	 * Affiliation company 所属会社.<p>
	 *
	 */
	public void usr_com(String value) {
		setConstString(offset + 13, $usr_com, value);
	}


	/**
	 * PIC info. 1 担当者情報１.<p>
	 *
	 */
	public String usr_info1() {
		return getConstString(offset + 14, $usr_info1);
	}

	/**
	 * PIC info. 1 担当者情報１.<p>
	 *
	 */
	public void usr_info1(String value) {
		setConstString(offset + 14, $usr_info1, value);
	}


	/**
	 * PIC info. 2 担当者情報２.<p>
	 *
	 */
	public String usr_info2() {
		return getConstString(offset + 15, $usr_info2);
	}

	/**
	 * PIC info. 2 担当者情報２.<p>
	 *
	 */
	public void usr_info2(String value) {
		setConstString(offset + 15, $usr_info2, value);
	}


	/**
	 * PIC info. 3 担当者情報３.<p>
	 *
	 */
	public String usr_info3() {
		return getConstString(offset + 16, $usr_info3);
	}

	/**
	 * PIC info. 3 担当者情報３.<p>
	 *
	 */
	public void usr_info3(String value) {
		setConstString(offset + 16, $usr_info3, value);
	}


	/**
	 * PIC info. 4 担当者情報４.<p>
	 *
	 */
	public String usr_info4() {
		return getConstString(offset + 17, $usr_info4);
	}

	/**
	 * PIC info. 4 担当者情報４.<p>
	 *
	 */
	public void usr_info4(String value) {
		setConstString(offset + 17, $usr_info4, value);
	}


	/**
	 * PIC info. 5 担当者情報５.<p>
	 *
	 */
	public String usr_info5() {
		return getConstString(offset + 18, $usr_info5);
	}

	/**
	 * PIC info. 5 担当者情報５.<p>
	 *
	 */
	public void usr_info5(String value) {
		setConstString(offset + 18, $usr_info5, value);
	}


	/**
	 * PIC info. 6 担当者情報６.<p>
	 *
	 */
	public String usr_info6() {
		return getConstString(offset + 19, $usr_info6);
	}

	/**
	 * PIC info. 6 担当者情報６.<p>
	 *
	 */
	public void usr_info6(String value) {
		setConstString(offset + 19, $usr_info6, value);
	}


	/**
	 * PIC info. 7 担当者情報７.<p>
	 *
	 */
	public String usr_info7() {
		return getConstString(offset + 20, $usr_info7);
	}

	/**
	 * PIC info. 7 担当者情報７.<p>
	 *
	 */
	public void usr_info7(String value) {
		setConstString(offset + 20, $usr_info7, value);
	}


	/**
	 * PIC info. 8 担当者情報８.<p>
	 *
	 */
	public String usr_info8() {
		return getConstString(offset + 21, $usr_info8);
	}

	/**
	 * PIC info. 8 担当者情報８.<p>
	 *
	 */
	public void usr_info8(String value) {
		setConstString(offset + 21, $usr_info8, value);
	}


	/**
	 * PIC info. 9 担当者情報９.<p>
	 *
	 */
	public String usr_info9() {
		return getConstString(offset + 22, $usr_info9);
	}

	/**
	 * PIC info. 9 担当者情報９.<p>
	 *
	 */
	public void usr_info9(String value) {
		setConstString(offset + 22, $usr_info9, value);
	}


	/**
	 * PIC info. 10 担当者情報１０.<p>
	 *
	 */
	public String usr_info10() {
		return getConstString(offset + 23, $usr_info10);
	}

	/**
	 * PIC info. 10 担当者情報１０.<p>
	 *
	 */
	public void usr_info10(String value) {
		setConstString(offset + 23, $usr_info10, value);
	}


	/**
	 * PIC info. 11 担当者情報１１.<p>
	 *
	 */
	public String usr_info11() {
		return getConstString(offset + 24, $usr_info11);
	}

	/**
	 * PIC info. 11 担当者情報１１.<p>
	 *
	 */
	public void usr_info11(String value) {
		setConstString(offset + 24, $usr_info11, value);
	}


	/**
	 * PIC info. 12 担当者情報１２.<p>
	 *
	 */
	public String usr_info12() {
		return getConstString(offset + 25, $usr_info12);
	}

	/**
	 * PIC info. 12 担当者情報１２.<p>
	 *
	 */
	public void usr_info12(String value) {
		setConstString(offset + 25, $usr_info12, value);
	}


	/**
	 * PIC info. 13 担当者情報１３.<p>
	 *
	 */
	public String usr_info13() {
		return getConstString(offset + 26, $usr_info13);
	}

	/**
	 * PIC info. 13 担当者情報１３.<p>
	 *
	 */
	public void usr_info13(String value) {
		setConstString(offset + 26, $usr_info13, value);
	}


	/**
	 * PIC info. 14 担当者情報１４.<p>
	 *
	 */
	public String usr_info14() {
		return getConstString(offset + 27, $usr_info14);
	}

	/**
	 * PIC info. 14 担当者情報１４.<p>
	 *
	 */
	public void usr_info14(String value) {
		setConstString(offset + 27, $usr_info14, value);
	}


	/**
	 * PIC info. 15 担当者情報１５.<p>
	 *
	 */
	public String usr_info15() {
		return getConstString(offset + 28, $usr_info15);
	}

	/**
	 * PIC info. 15 担当者情報１５.<p>
	 *
	 */
	public void usr_info15(String value) {
		setConstString(offset + 28, $usr_info15, value);
	}


	/**
	 * PIC info. 16 担当者情報１６.<p>
	 *
	 */
	public String usr_info16() {
		return getConstString(offset + 29, $usr_info16);
	}

	/**
	 * PIC info. 16 担当者情報１６.<p>
	 *
	 */
	public void usr_info16(String value) {
		setConstString(offset + 29, $usr_info16, value);
	}


	/**
	 * PIC info. 17 担当者情報１７.<p>
	 *
	 */
	public String usr_info17() {
		return getConstString(offset + 30, $usr_info17);
	}

	/**
	 * PIC info. 17 担当者情報１７.<p>
	 *
	 */
	public void usr_info17(String value) {
		setConstString(offset + 30, $usr_info17, value);
	}


	/**
	 * PIC info. 18 担当者情報１８.<p>
	 *
	 */
	public String usr_info18() {
		return getConstString(offset + 31, $usr_info18);
	}

	/**
	 * PIC info. 18 担当者情報１８.<p>
	 *
	 */
	public void usr_info18(String value) {
		setConstString(offset + 31, $usr_info18, value);
	}


	/**
	 * PIC info. 19 担当者情報１９.<p>
	 *
	 */
	public String usr_info19() {
		return getConstString(offset + 32, $usr_info19);
	}

	/**
	 * PIC info. 19 担当者情報１９.<p>
	 *
	 */
	public void usr_info19(String value) {
		setConstString(offset + 32, $usr_info19, value);
	}


	/**
	 * PIC info. 20 担当者情報２０.<p>
	 *
	 */
	public String usr_info20() {
		return getConstString(offset + 33, $usr_info20);
	}

	/**
	 * PIC info. 20 担当者情報２０.<p>
	 *
	 */
	public void usr_info20(String value) {
		setConstString(offset + 33, $usr_info20, value);
	}


	public String getString(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm_lcl.equalsIgnoreCase(name)) {
			return usr_nm_lcl();
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			return usr_alt_nm1();
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			return usr_alt_nm2();
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			return usr_alt_nm3();
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			return usr_alt_nm4();
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
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			return usr_com_typ();
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			return usr_com();
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			return usr_info1();
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			return usr_info2();
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			return usr_info3();
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			return usr_info4();
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			return usr_info5();
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			return usr_info6();
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			return usr_info7();
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			return usr_info8();
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			return usr_info9();
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			return usr_info10();
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			return usr_info11();
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			return usr_info12();
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			return usr_info13();
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			return usr_info14();
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			return usr_info15();
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			return usr_info16();
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			return usr_info17();
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			return usr_info18();
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			return usr_info19();
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			return usr_info20();
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
		if ($th_image_flg.equalsIgnoreCase(name)) {
			return th_image_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm_lcl.equalsIgnoreCase(name)) {
			return usr_nm_lcl();
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			return usr_alt_nm1();
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			return usr_alt_nm2();
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			return usr_alt_nm3();
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			return usr_alt_nm4();
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
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			return usr_com_typ();
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			return usr_com();
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			return usr_info1();
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			return usr_info2();
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			return usr_info3();
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			return usr_info4();
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			return usr_info5();
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			return usr_info6();
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			return usr_info7();
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			return usr_info8();
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			return usr_info9();
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			return usr_info10();
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			return usr_info11();
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			return usr_info12();
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			return usr_info13();
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			return usr_info14();
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			return usr_info15();
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			return usr_info16();
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			return usr_info17();
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			return usr_info18();
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			return usr_info19();
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			return usr_info20();
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
		if ($th_image_flg.equalsIgnoreCase(name)) {
			return th_image_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm_lcl.equalsIgnoreCase(name)) {
			usr_nm_lcl(value);
			return;
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			usr_alt_nm1(value);
			return;
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			usr_alt_nm2(value);
			return;
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			usr_alt_nm3(value);
			return;
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			usr_alt_nm4(value);
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
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			usr_com_typ(value);
			return;
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			usr_com(value);
			return;
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			usr_info1(value);
			return;
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			usr_info2(value);
			return;
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			usr_info3(value);
			return;
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			usr_info4(value);
			return;
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			usr_info5(value);
			return;
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			usr_info6(value);
			return;
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			usr_info7(value);
			return;
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			usr_info8(value);
			return;
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			usr_info9(value);
			return;
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			usr_info10(value);
			return;
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			usr_info11(value);
			return;
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			usr_info12(value);
			return;
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			usr_info13(value);
			return;
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			usr_info14(value);
			return;
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			usr_info15(value);
			return;
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			usr_info16(value);
			return;
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			usr_info17(value);
			return;
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			usr_info18(value);
			return;
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			usr_info19(value);
			return;
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			usr_info20(value);
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
		if ($th_image_flg.equalsIgnoreCase(name)) {
			th_image_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm_lcl.equalsIgnoreCase(name)) {
			usr_nm_lcl(value);
			return;
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			usr_alt_nm1(value);
			return;
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			usr_alt_nm2(value);
			return;
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			usr_alt_nm3(value);
			return;
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			usr_alt_nm4(value);
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
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			usr_com_typ(value);
			return;
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			usr_com(value);
			return;
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			usr_info1(value);
			return;
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			usr_info2(value);
			return;
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			usr_info3(value);
			return;
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			usr_info4(value);
			return;
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			usr_info5(value);
			return;
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			usr_info6(value);
			return;
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			usr_info7(value);
			return;
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			usr_info8(value);
			return;
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			usr_info9(value);
			return;
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			usr_info10(value);
			return;
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			usr_info11(value);
			return;
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			usr_info12(value);
			return;
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			usr_info13(value);
			return;
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			usr_info14(value);
			return;
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			usr_info15(value);
			return;
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			usr_info16(value);
			return;
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			usr_info17(value);
			return;
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			usr_info18(value);
			return;
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			usr_info19(value);
			return;
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			usr_info20(value);
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
		if ($th_image_flg.equalsIgnoreCase(name)) {
			th_image_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

