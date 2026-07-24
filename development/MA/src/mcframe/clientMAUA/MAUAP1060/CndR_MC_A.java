package mcframe.clientMAUA.MAUAP1060;

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
	 * Account cd. (Input value) 勘定科目ＣＤ（入力値）.<p>
	 *
	 */
	public static final String $ac_cd_input = "ac_cd_input";
	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public static final String $ac_cd = "ac_cd";
	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public static final String $ac_nm = "ac_nm";
	/**
	 * Account abbreviation name 勘定科目略名.<p>
	 *
	 */
	public static final String $ac_nm2 = "ac_nm2";
	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public static final String $sub_flg = "sub_flg";
	/**
	 * Debit and credit type 貸借区分.<p>
	 *
	 */
	public static final String $dc_typ = "dc_typ";
	/**
	 * Debit and credit type name 貸借区分名.<p>
	 *
	 */
	public static final String $dc_typ_nm = "dc_typ_nm";
	/**
	 * Account type 勘定科目区分.<p>
	 *
	 */
	public static final String $ac_typ = "ac_typ";
	/**
	 * Account type name 勘定科目区分名.<p>
	 *
	 */
	public static final String $ac_typ_nm = "ac_typ_nm";
	/**
	 * AP type ＡＰ科目区分.<p>
	 *
	 */
	public static final String $ap_typ = "ap_typ";
	/**
	 * AP type name ＡＰ科目区分名.<p>
	 *
	 */
	public static final String $ap_typ_nm = "ap_typ_nm";
	/**
	 * AR type ＡＲ科目区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * AR type name ＡＲ科目区分名.<p>
	 *
	 */
	public static final String $ar_typ_nm = "ar_typ_nm";
	/**
	 * Accounting tax cd. 会計税ＣＤ.<p>
	 *
	 */
	public static final String $ac_tax_cd = "ac_tax_cd";
	/**
	 * Accounting tax name 会計税名.<p>
	 *
	 */
	public static final String $ac_tax_nm = "ac_tax_nm";
	/**
	 * Account spare type 1 科目予備区分１.<p>
	 *
	 */
	public static final String $ac_typ1 = "ac_typ1";
	/**
	 * Account spare type name 1 科目予備区分名１.<p>
	 *
	 */
	public static final String $ac_typ_nm1 = "ac_typ_nm1";
	/**
	 * Account spare type 2 科目予備区分２.<p>
	 *
	 */
	public static final String $ac_typ2 = "ac_typ2";
	/**
	 * Account spare type name 2 科目予備区分名２.<p>
	 *
	 */
	public static final String $ac_typ_nm2 = "ac_typ_nm2";
	/**
	 * Account spare type 3 科目予備区分３.<p>
	 *
	 */
	public static final String $ac_typ3 = "ac_typ3";
	/**
	 * Account spare type name 3 科目予備区分名３.<p>
	 *
	 */
	public static final String $ac_typ_nm3 = "ac_typ_nm3";
	/**
	 * Account spare type 4 科目予備区分４.<p>
	 *
	 */
	public static final String $ac_typ4 = "ac_typ4";
	/**
	 * Account spare type name 4 科目予備区分名４.<p>
	 *
	 */
	public static final String $ac_typ_nm4 = "ac_typ_nm4";
	/**
	 * Account spare type 5 科目予備区分５.<p>
	 *
	 */
	public static final String $ac_typ5 = "ac_typ5";
	/**
	 * Account spare type name 5 科目予備区分名５.<p>
	 *
	 */
	public static final String $ac_typ_nm5 = "ac_typ_nm5";
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
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public static final String $match_typ = "match_typ";


	public static final MCMeta ac_cd_input_META = createCommonMeta($ac_cd_input, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta ac_cd_META = createCommonMeta($ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta ac_nm_META = createCommonMeta($ac_nm, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta ac_nm2_META = createCommonMeta($ac_nm2, mcframe.commonMA.meta.MA_META.AC_NM2);
	public static final MCMeta sub_flg_META = createCommonMeta($sub_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dc_typ_META = createCommonMeta($dc_typ, mcframe.commonMA.meta.MA_META.DC_TYP);
	public static final MCMeta dc_typ_nm_META = createCommonMeta($dc_typ_nm, mcframe.commonMA.meta.MA_META.DC_TYP_NM);
	public static final MCMeta ac_typ_META = createCommonMeta($ac_typ, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ_nm_META = createCommonMeta($ac_typ_nm, mcframe.commonMA.meta.MA_META.AC_TYP_NM);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ap_typ_nm_META = createCommonMeta($ap_typ_nm, mcframe.commonMA.meta.MA_META.AC_TYP_NM);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ar_typ_nm_META = createCommonMeta($ar_typ_nm, mcframe.commonMA.meta.MA_META.AC_TYP_NM);
	public static final MCMeta ac_tax_cd_META = createCommonMeta($ac_tax_cd, mcframe.commonMA.meta.MA_META.AC_TAX_CD);
	public static final MCMeta ac_tax_nm_META = createCommonMeta($ac_tax_nm, mcframe.commonMA.meta.MA_META.AC_TAX_NM);
	public static final MCMeta ac_typ1_META = createCommonMeta($ac_typ1, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ_nm1_META = createCommonMeta($ac_typ_nm1, mcframe.commonMA.meta.MA_META.AC_TYP_NM);
	public static final MCMeta ac_typ2_META = createCommonMeta($ac_typ2, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ_nm2_META = createCommonMeta($ac_typ_nm2, mcframe.commonMA.meta.MA_META.AC_TYP_NM);
	public static final MCMeta ac_typ3_META = createCommonMeta($ac_typ3, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ_nm3_META = createCommonMeta($ac_typ_nm3, mcframe.commonMA.meta.MA_META.AC_TYP_NM);
	public static final MCMeta ac_typ4_META = createCommonMeta($ac_typ4, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ_nm4_META = createCommonMeta($ac_typ_nm4, mcframe.commonMA.meta.MA_META.AC_TYP_NM);
	public static final MCMeta ac_typ5_META = createCommonMeta($ac_typ5, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ_nm5_META = createCommonMeta($ac_typ_nm5, mcframe.commonMA.meta.MA_META.AC_TYP_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta match_typ_META = createStringMeta($match_typ);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_cd_input_META,
			ac_cd_META,
			ac_nm_META,
			ac_nm2_META,
			sub_flg_META,
			dc_typ_META,
			dc_typ_nm_META,
			ac_typ_META,
			ac_typ_nm_META,
			ap_typ_META,
			ap_typ_nm_META,
			ar_typ_META,
			ar_typ_nm_META,
			ac_tax_cd_META,
			ac_tax_nm_META,
			ac_typ1_META,
			ac_typ_nm1_META,
			ac_typ2_META,
			ac_typ_nm2_META,
			ac_typ3_META,
			ac_typ_nm3_META,
			ac_typ4_META,
			ac_typ_nm4_META,
			ac_typ5_META,
			ac_typ_nm5_META,
			memo1_META,
			memo2_META,
			memo3_META,
			match_typ_META
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

	/** 項目属性情報のグループ[FLG_GRP]のキー定数 */
	public static final String $$FLG_GRP = "FLG_GRP";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$FLG_GRP, new MCExtList(
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
	 * Account cd. (Input value) 勘定科目ＣＤ（入力値）.<p>
	 *
	 */
	public String ac_cd_input() {
		return getConstString(offset + 0, $ac_cd_input);
	}

	/**
	 * Account cd. (Input value) 勘定科目ＣＤ（入力値）.<p>
	 *
	 */
	public void ac_cd_input(String value) {
		setConstString(offset + 0, $ac_cd_input, value);
	}


	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public String ac_cd() {
		return getConstString(offset + 1, $ac_cd);
	}

	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public void ac_cd(String value) {
		setConstString(offset + 1, $ac_cd, value);
	}


	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public String ac_nm() {
		return getConstString(offset + 2, $ac_nm);
	}

	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public void ac_nm(String value) {
		setConstString(offset + 2, $ac_nm, value);
	}


	/**
	 * Account abbreviation name 勘定科目略名.<p>
	 *
	 */
	public String ac_nm2() {
		return getConstString(offset + 3, $ac_nm2);
	}

	/**
	 * Account abbreviation name 勘定科目略名.<p>
	 *
	 */
	public void ac_nm2(String value) {
		setConstString(offset + 3, $ac_nm2, value);
	}


	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public boolean sub_flg() {
		return getConstBoolean(offset + 4, $sub_flg);
	}

	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public void sub_flg(boolean value) {
		setConstBoolean(offset + 4, $sub_flg, value);
	}


	/**
	 * Debit and credit type 貸借区分.<p>
	 *
	 */
	public String dc_typ() {
		return getConstString(offset + 5, $dc_typ);
	}

	/**
	 * Debit and credit type 貸借区分.<p>
	 *
	 */
	public void dc_typ(String value) {
		setConstString(offset + 5, $dc_typ, value);
	}


	/**
	 * Debit and credit type name 貸借区分名.<p>
	 *
	 */
	public String dc_typ_nm() {
		return getConstString(offset + 6, $dc_typ_nm);
	}

	/**
	 * Debit and credit type name 貸借区分名.<p>
	 *
	 */
	public void dc_typ_nm(String value) {
		setConstString(offset + 6, $dc_typ_nm, value);
	}


	/**
	 * Account type 勘定科目区分.<p>
	 *
	 */
	public String ac_typ() {
		return getConstString(offset + 7, $ac_typ);
	}

	/**
	 * Account type 勘定科目区分.<p>
	 *
	 */
	public void ac_typ(String value) {
		setConstString(offset + 7, $ac_typ, value);
	}


	/**
	 * Account type name 勘定科目区分名.<p>
	 *
	 */
	public String ac_typ_nm() {
		return getConstString(offset + 8, $ac_typ_nm);
	}

	/**
	 * Account type name 勘定科目区分名.<p>
	 *
	 */
	public void ac_typ_nm(String value) {
		setConstString(offset + 8, $ac_typ_nm, value);
	}


	/**
	 * AP type ＡＰ科目区分.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 9, $ap_typ);
	}

	/**
	 * AP type ＡＰ科目区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 9, $ap_typ, value);
	}


	/**
	 * AP type name ＡＰ科目区分名.<p>
	 *
	 */
	public String ap_typ_nm() {
		return getConstString(offset + 10, $ap_typ_nm);
	}

	/**
	 * AP type name ＡＰ科目区分名.<p>
	 *
	 */
	public void ap_typ_nm(String value) {
		setConstString(offset + 10, $ap_typ_nm, value);
	}


	/**
	 * AR type ＡＲ科目区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 11, $ar_typ);
	}

	/**
	 * AR type ＡＲ科目区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 11, $ar_typ, value);
	}


	/**
	 * AR type name ＡＲ科目区分名.<p>
	 *
	 */
	public String ar_typ_nm() {
		return getConstString(offset + 12, $ar_typ_nm);
	}

	/**
	 * AR type name ＡＲ科目区分名.<p>
	 *
	 */
	public void ar_typ_nm(String value) {
		setConstString(offset + 12, $ar_typ_nm, value);
	}


	/**
	 * Accounting tax cd. 会計税ＣＤ.<p>
	 *
	 */
	public String ac_tax_cd() {
		return getConstString(offset + 13, $ac_tax_cd);
	}

	/**
	 * Accounting tax cd. 会計税ＣＤ.<p>
	 *
	 */
	public void ac_tax_cd(String value) {
		setConstString(offset + 13, $ac_tax_cd, value);
	}


	/**
	 * Accounting tax name 会計税名.<p>
	 *
	 */
	public String ac_tax_nm() {
		return getConstString(offset + 14, $ac_tax_nm);
	}

	/**
	 * Accounting tax name 会計税名.<p>
	 *
	 */
	public void ac_tax_nm(String value) {
		setConstString(offset + 14, $ac_tax_nm, value);
	}


	/**
	 * Account spare type 1 科目予備区分１.<p>
	 *
	 */
	public String ac_typ1() {
		return getConstString(offset + 15, $ac_typ1);
	}

	/**
	 * Account spare type 1 科目予備区分１.<p>
	 *
	 */
	public void ac_typ1(String value) {
		setConstString(offset + 15, $ac_typ1, value);
	}


	/**
	 * Account spare type name 1 科目予備区分名１.<p>
	 *
	 */
	public String ac_typ_nm1() {
		return getConstString(offset + 16, $ac_typ_nm1);
	}

	/**
	 * Account spare type name 1 科目予備区分名１.<p>
	 *
	 */
	public void ac_typ_nm1(String value) {
		setConstString(offset + 16, $ac_typ_nm1, value);
	}


	/**
	 * Account spare type 2 科目予備区分２.<p>
	 *
	 */
	public String ac_typ2() {
		return getConstString(offset + 17, $ac_typ2);
	}

	/**
	 * Account spare type 2 科目予備区分２.<p>
	 *
	 */
	public void ac_typ2(String value) {
		setConstString(offset + 17, $ac_typ2, value);
	}


	/**
	 * Account spare type name 2 科目予備区分名２.<p>
	 *
	 */
	public String ac_typ_nm2() {
		return getConstString(offset + 18, $ac_typ_nm2);
	}

	/**
	 * Account spare type name 2 科目予備区分名２.<p>
	 *
	 */
	public void ac_typ_nm2(String value) {
		setConstString(offset + 18, $ac_typ_nm2, value);
	}


	/**
	 * Account spare type 3 科目予備区分３.<p>
	 *
	 */
	public String ac_typ3() {
		return getConstString(offset + 19, $ac_typ3);
	}

	/**
	 * Account spare type 3 科目予備区分３.<p>
	 *
	 */
	public void ac_typ3(String value) {
		setConstString(offset + 19, $ac_typ3, value);
	}


	/**
	 * Account spare type name 3 科目予備区分名３.<p>
	 *
	 */
	public String ac_typ_nm3() {
		return getConstString(offset + 20, $ac_typ_nm3);
	}

	/**
	 * Account spare type name 3 科目予備区分名３.<p>
	 *
	 */
	public void ac_typ_nm3(String value) {
		setConstString(offset + 20, $ac_typ_nm3, value);
	}


	/**
	 * Account spare type 4 科目予備区分４.<p>
	 *
	 */
	public String ac_typ4() {
		return getConstString(offset + 21, $ac_typ4);
	}

	/**
	 * Account spare type 4 科目予備区分４.<p>
	 *
	 */
	public void ac_typ4(String value) {
		setConstString(offset + 21, $ac_typ4, value);
	}


	/**
	 * Account spare type name 4 科目予備区分名４.<p>
	 *
	 */
	public String ac_typ_nm4() {
		return getConstString(offset + 22, $ac_typ_nm4);
	}

	/**
	 * Account spare type name 4 科目予備区分名４.<p>
	 *
	 */
	public void ac_typ_nm4(String value) {
		setConstString(offset + 22, $ac_typ_nm4, value);
	}


	/**
	 * Account spare type 5 科目予備区分５.<p>
	 *
	 */
	public String ac_typ5() {
		return getConstString(offset + 23, $ac_typ5);
	}

	/**
	 * Account spare type 5 科目予備区分５.<p>
	 *
	 */
	public void ac_typ5(String value) {
		setConstString(offset + 23, $ac_typ5, value);
	}


	/**
	 * Account spare type name 5 科目予備区分名５.<p>
	 *
	 */
	public String ac_typ_nm5() {
		return getConstString(offset + 24, $ac_typ_nm5);
	}

	/**
	 * Account spare type name 5 科目予備区分名５.<p>
	 *
	 */
	public void ac_typ_nm5(String value) {
		setConstString(offset + 24, $ac_typ_nm5, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 25, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 25, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 26, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 26, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 27, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 27, $memo3, value);
	}


	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public String match_typ() {
		return getConstString(offset + 28, $match_typ);
	}

	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public void match_typ(String value) {
		setConstString(offset + 28, $match_typ, value);
	}


	public String getString(String name) {
		if ($ac_cd_input.equalsIgnoreCase(name)) {
			return ac_cd_input();
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			return ac_nm();
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			return ac_nm2();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		if ($dc_typ_nm.equalsIgnoreCase(name)) {
			return dc_typ_nm();
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			return ac_typ();
		}
		if ($ac_typ_nm.equalsIgnoreCase(name)) {
			return ac_typ_nm();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			return ac_tax_cd();
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			return ac_tax_nm();
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			return ac_typ1();
		}
		if ($ac_typ_nm1.equalsIgnoreCase(name)) {
			return ac_typ_nm1();
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			return ac_typ2();
		}
		if ($ac_typ_nm2.equalsIgnoreCase(name)) {
			return ac_typ_nm2();
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			return ac_typ3();
		}
		if ($ac_typ_nm3.equalsIgnoreCase(name)) {
			return ac_typ_nm3();
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			return ac_typ4();
		}
		if ($ac_typ_nm4.equalsIgnoreCase(name)) {
			return ac_typ_nm4();
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			return ac_typ5();
		}
		if ($ac_typ_nm5.equalsIgnoreCase(name)) {
			return ac_typ_nm5();
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
		if ($match_typ.equalsIgnoreCase(name)) {
			return match_typ();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			return sub_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ac_cd_input.equalsIgnoreCase(name)) {
			return ac_cd_input();
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			return ac_nm();
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			return ac_nm2();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		if ($dc_typ_nm.equalsIgnoreCase(name)) {
			return dc_typ_nm();
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			return ac_typ();
		}
		if ($ac_typ_nm.equalsIgnoreCase(name)) {
			return ac_typ_nm();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			return ac_tax_cd();
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			return ac_tax_nm();
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			return ac_typ1();
		}
		if ($ac_typ_nm1.equalsIgnoreCase(name)) {
			return ac_typ_nm1();
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			return ac_typ2();
		}
		if ($ac_typ_nm2.equalsIgnoreCase(name)) {
			return ac_typ_nm2();
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			return ac_typ3();
		}
		if ($ac_typ_nm3.equalsIgnoreCase(name)) {
			return ac_typ_nm3();
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			return ac_typ4();
		}
		if ($ac_typ_nm4.equalsIgnoreCase(name)) {
			return ac_typ_nm4();
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			return ac_typ5();
		}
		if ($ac_typ_nm5.equalsIgnoreCase(name)) {
			return ac_typ_nm5();
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
		if ($match_typ.equalsIgnoreCase(name)) {
			return match_typ();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			return sub_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ac_cd_input.equalsIgnoreCase(name)) {
			ac_cd_input(value);
			return;
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			ac_nm(value);
			return;
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			ac_nm2(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		if ($dc_typ_nm.equalsIgnoreCase(name)) {
			dc_typ_nm(value);
			return;
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			ac_typ(value);
			return;
		}
		if ($ac_typ_nm.equalsIgnoreCase(name)) {
			ac_typ_nm(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
			return;
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			ac_tax_cd(value);
			return;
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			ac_tax_nm(value);
			return;
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			ac_typ1(value);
			return;
		}
		if ($ac_typ_nm1.equalsIgnoreCase(name)) {
			ac_typ_nm1(value);
			return;
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			ac_typ2(value);
			return;
		}
		if ($ac_typ_nm2.equalsIgnoreCase(name)) {
			ac_typ_nm2(value);
			return;
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			ac_typ3(value);
			return;
		}
		if ($ac_typ_nm3.equalsIgnoreCase(name)) {
			ac_typ_nm3(value);
			return;
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			ac_typ4(value);
			return;
		}
		if ($ac_typ_nm4.equalsIgnoreCase(name)) {
			ac_typ_nm4(value);
			return;
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			ac_typ5(value);
			return;
		}
		if ($ac_typ_nm5.equalsIgnoreCase(name)) {
			ac_typ_nm5(value);
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
		if ($match_typ.equalsIgnoreCase(name)) {
			match_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			sub_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ac_cd_input.equalsIgnoreCase(name)) {
			ac_cd_input(value);
			return;
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			ac_nm(value);
			return;
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			ac_nm2(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		if ($dc_typ_nm.equalsIgnoreCase(name)) {
			dc_typ_nm(value);
			return;
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			ac_typ(value);
			return;
		}
		if ($ac_typ_nm.equalsIgnoreCase(name)) {
			ac_typ_nm(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
			return;
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			ac_tax_cd(value);
			return;
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			ac_tax_nm(value);
			return;
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			ac_typ1(value);
			return;
		}
		if ($ac_typ_nm1.equalsIgnoreCase(name)) {
			ac_typ_nm1(value);
			return;
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			ac_typ2(value);
			return;
		}
		if ($ac_typ_nm2.equalsIgnoreCase(name)) {
			ac_typ_nm2(value);
			return;
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			ac_typ3(value);
			return;
		}
		if ($ac_typ_nm3.equalsIgnoreCase(name)) {
			ac_typ_nm3(value);
			return;
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			ac_typ4(value);
			return;
		}
		if ($ac_typ_nm4.equalsIgnoreCase(name)) {
			ac_typ_nm4(value);
			return;
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			ac_typ5(value);
			return;
		}
		if ($ac_typ_nm5.equalsIgnoreCase(name)) {
			ac_typ_nm5(value);
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
		if ($match_typ.equalsIgnoreCase(name)) {
			match_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			sub_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

