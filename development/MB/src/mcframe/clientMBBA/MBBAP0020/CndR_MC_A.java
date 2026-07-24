package mcframe.clientMBBA.MBBAP0020;

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
	 * 0,Approve/Reject;1,Cancel (Approval);2,Cancel (Reject);3,Update (Remarks);4,View 0,承認・却下する;1,取り消す（承認）;2,取り消す（却下）;3,更新する（備考）;4,参照する.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public static final String $aprv_func_typ = "aprv_func_typ";
	/**
	 * Approval function type name 承認機能区分名.<p>
	 *
	 */
	public static final String $aprv_func_typ_nm = "aprv_func_typ_nm";
	/**
	 * Approval details status type 承認明細状況区分.<p>
	 *
	 */
	public static final String $aprv_d_sts_typ = "aprv_d_sts_typ";
	/**
	 * Approval details status type name 承認明細状況区分名.<p>
	 *
	 */
	public static final String $aprv_d_sts_typ_nm = "aprv_d_sts_typ_nm";
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	/**
	 * Approval creating source No. 1 承認作成元ＮＯ１.<p>
	 *
	 */
	public static final String $aprv_src_no1 = "aprv_src_no1";
	/**
	 * Approval creating source No. 2 承認作成元ＮＯ２.<p>
	 *
	 */
	public static final String $aprv_src_no2 = "aprv_src_no2";
	/**
	 * Entry date FROM 登録日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ins_dt_fr = "ins_dt_fr";
	/**
	 * Entry date TO 登録日ＴＯ.<p>
	 *
	 */
	public static final String $ins_dt_to = "ins_dt_to";
	/**
	 * Approval date and time FROM 承認日時ＦＲＯＭ.<p>
	 *
	 */
	public static final String $aprv_d_tm_fr = "aprv_d_tm_fr";
	/**
	 * Approval date and time TO 承認日時ＴＯ.<p>
	 *
	 */
	public static final String $aprv_d_tm_to = "aprv_d_tm_to";
	/**
	 * Entry/business PIC cd. 登録／業務担当者ＣＤ.<p>
	 *
	 */
	public static final String $ins_biz_usr_cd = "ins_biz_usr_cd";
	/**
	 * Entry/business PIC name 登録／業務担当者名.<p>
	 *
	 */
	public static final String $ins_biz_usr_nm = "ins_biz_usr_nm";
	/**
	 * Approver cd. 承認担当者ＣＤ.<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	/**
	 * Approver name 承認担当者名.<p>
	 *
	 */
	public static final String $aprv_usr_nm = "aprv_usr_nm";
	/**
	 * Main PIC 主担当.<p>
	 *
	 */
	public static final String $main_role_flg = "main_role_flg";
	/**
	 * Sub PIC 副担当.<p>
	 *
	 */
	public static final String $sub_role_flg = "sub_role_flg";
	/**
	 * Include next completed process 次処理済含む.<p>
	 *
	 */
	public static final String $next_opr_flg = "next_opr_flg";
	/**
	 * Include not updatable 更新不可含む.<p>
	 *
	 */
	public static final String $not_upd_flg = "not_upd_flg";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta aprv_func_typ_META = createCommonMeta($aprv_func_typ, mcframe.commonMA.meta.MA_META.APRV_FUNC_TYP);
	public static final MCMeta aprv_func_typ_nm_META = createCommonMeta($aprv_func_typ_nm, mcframe.commonMA.meta.MA_META.APRV_FUNC_TYP_NM);
	public static final MCMeta aprv_d_sts_typ_META = createCommonMeta($aprv_d_sts_typ, mcframe.commonMA.meta.MA_META.APRV_D_STS_TYP);
	public static final MCMeta aprv_d_sts_typ_nm_META = createCommonMeta($aprv_d_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_D_STS_TYP_NM);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_src_no1_META = createCommonMeta($aprv_src_no1, mcframe.commonMA.meta.MA_META.APRV_SRC_NO);
	public static final MCMeta aprv_src_no2_META = createCommonMeta($aprv_src_no2, mcframe.commonMA.meta.MA_META.APRV_SRC_NO);
	public static final MCMeta ins_dt_fr_META = createCommonMeta($ins_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ins_dt_to_META = createCommonMeta($ins_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_d_tm_fr_META = createCommonMeta($aprv_d_tm_fr, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta aprv_d_tm_to_META = createCommonMeta($aprv_d_tm_to, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ins_biz_usr_cd_META = createCommonMeta($ins_biz_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ins_biz_usr_nm_META = createCommonMeta($ins_biz_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_usr_nm_META = createCommonMeta($aprv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta main_role_flg_META = createCommonMeta($main_role_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_role_flg_META = createCommonMeta($sub_role_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta next_opr_flg_META = createCommonMeta($next_opr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_upd_flg_META = createCommonMeta($not_upd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			aprv_func_typ_META,
			aprv_func_typ_nm_META,
			aprv_d_sts_typ_META,
			aprv_d_sts_typ_nm_META,
			aprv_no_META,
			aprv_src_no1_META,
			aprv_src_no2_META,
			ins_dt_fr_META,
			ins_dt_to_META,
			aprv_d_tm_fr_META,
			aprv_d_tm_to_META,
			ins_biz_usr_cd_META,
			ins_biz_usr_nm_META,
			aprv_usr_cd_META,
			aprv_usr_nm_META,
			main_role_flg_META,
			sub_role_flg_META,
			next_opr_flg_META,
			not_upd_flg_META
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

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$ins_biz_usr_cd, "usr_nm"},	// ins_biz_usr_cd
				{$aprv_usr_cd, "usr_nm"}	// aprv_usr_cd
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
	 * 0,Approve/Reject;1,Cancel (Approval);2,Cancel (Reject);3,Update (Remarks);4,View 0,承認・却下する;1,取り消す（承認）;2,取り消す（却下）;3,更新する（備考）;4,参照する.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * 0,Approve/Reject;1,Cancel (Approval);2,Cancel (Reject);3,Update (Remarks);4,View 0,承認・却下する;1,取り消す（承認）;2,取り消す（却下）;3,更新する（備考）;4,参照する.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public String aprv_func_typ() {
		return getConstString(offset + 1, $aprv_func_typ);
	}

	/**
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public void aprv_func_typ(String value) {
		setConstString(offset + 1, $aprv_func_typ, value);
	}


	/**
	 * Approval function type name 承認機能区分名.<p>
	 *
	 */
	public String aprv_func_typ_nm() {
		return getConstString(offset + 2, $aprv_func_typ_nm);
	}

	/**
	 * Approval function type name 承認機能区分名.<p>
	 *
	 */
	public void aprv_func_typ_nm(String value) {
		setConstString(offset + 2, $aprv_func_typ_nm, value);
	}


	/**
	 * Approval details status type 承認明細状況区分.<p>
	 *
	 */
	public String aprv_d_sts_typ() {
		return getConstString(offset + 3, $aprv_d_sts_typ);
	}

	/**
	 * Approval details status type 承認明細状況区分.<p>
	 *
	 */
	public void aprv_d_sts_typ(String value) {
		setConstString(offset + 3, $aprv_d_sts_typ, value);
	}


	/**
	 * Approval details status type name 承認明細状況区分名.<p>
	 *
	 */
	public String aprv_d_sts_typ_nm() {
		return getConstString(offset + 4, $aprv_d_sts_typ_nm);
	}

	/**
	 * Approval details status type name 承認明細状況区分名.<p>
	 *
	 */
	public void aprv_d_sts_typ_nm(String value) {
		setConstString(offset + 4, $aprv_d_sts_typ_nm, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 5, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 5, $aprv_no, value);
	}


	/**
	 * Approval creating source No. 1 承認作成元ＮＯ１.<p>
	 *
	 */
	public String aprv_src_no1() {
		return getConstString(offset + 6, $aprv_src_no1);
	}

	/**
	 * Approval creating source No. 1 承認作成元ＮＯ１.<p>
	 *
	 */
	public void aprv_src_no1(String value) {
		setConstString(offset + 6, $aprv_src_no1, value);
	}


	/**
	 * Approval creating source No. 2 承認作成元ＮＯ２.<p>
	 *
	 */
	public String aprv_src_no2() {
		return getConstString(offset + 7, $aprv_src_no2);
	}

	/**
	 * Approval creating source No. 2 承認作成元ＮＯ２.<p>
	 *
	 */
	public void aprv_src_no2(String value) {
		setConstString(offset + 7, $aprv_src_no2, value);
	}


	/**
	 * Entry date FROM 登録日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ins_dt_fr() {
		return getConstDate(offset + 8, $ins_dt_fr);
	}

	/**
	 * Entry date FROM 登録日ＦＲＯＭ.<p>
	 *
	 */
	public void ins_dt_fr(MCDate value) {
		setConstDate(offset + 8, $ins_dt_fr, value);
	}


	/**
	 * Entry date TO 登録日ＴＯ.<p>
	 *
	 */
	public MCDate ins_dt_to() {
		return getConstDate(offset + 9, $ins_dt_to);
	}

	/**
	 * Entry date TO 登録日ＴＯ.<p>
	 *
	 */
	public void ins_dt_to(MCDate value) {
		setConstDate(offset + 9, $ins_dt_to, value);
	}


	/**
	 * Approval date and time FROM 承認日時ＦＲＯＭ.<p>
	 *
	 */
	public MCDate aprv_d_tm_fr() {
		return getConstDate(offset + 10, $aprv_d_tm_fr);
	}

	/**
	 * Approval date and time FROM 承認日時ＦＲＯＭ.<p>
	 *
	 */
	public void aprv_d_tm_fr(MCDate value) {
		setConstDate(offset + 10, $aprv_d_tm_fr, value);
	}


	/**
	 * Approval date and time TO 承認日時ＴＯ.<p>
	 *
	 */
	public MCDate aprv_d_tm_to() {
		return getConstDate(offset + 11, $aprv_d_tm_to);
	}

	/**
	 * Approval date and time TO 承認日時ＴＯ.<p>
	 *
	 */
	public void aprv_d_tm_to(MCDate value) {
		setConstDate(offset + 11, $aprv_d_tm_to, value);
	}


	/**
	 * Entry/business PIC cd. 登録／業務担当者ＣＤ.<p>
	 *
	 */
	public String ins_biz_usr_cd() {
		return getConstString(offset + 12, $ins_biz_usr_cd);
	}

	/**
	 * Entry/business PIC cd. 登録／業務担当者ＣＤ.<p>
	 *
	 */
	public void ins_biz_usr_cd(String value) {
		setConstString(offset + 12, $ins_biz_usr_cd, value);
	}


	/**
	 * Entry/business PIC name 登録／業務担当者名.<p>
	 *
	 */
	public String ins_biz_usr_nm() {
		return getConstString(offset + 13, $ins_biz_usr_nm);
	}

	/**
	 * Entry/business PIC name 登録／業務担当者名.<p>
	 *
	 */
	public void ins_biz_usr_nm(String value) {
		setConstString(offset + 13, $ins_biz_usr_nm, value);
	}


	/**
	 * Approver cd. 承認担当者ＣＤ.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 14, $aprv_usr_cd);
	}

	/**
	 * Approver cd. 承認担当者ＣＤ.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 14, $aprv_usr_cd, value);
	}


	/**
	 * Approver name 承認担当者名.<p>
	 *
	 */
	public String aprv_usr_nm() {
		return getConstString(offset + 15, $aprv_usr_nm);
	}

	/**
	 * Approver name 承認担当者名.<p>
	 *
	 */
	public void aprv_usr_nm(String value) {
		setConstString(offset + 15, $aprv_usr_nm, value);
	}


	/**
	 * Main PIC 主担当.<p>
	 *
	 */
	public boolean main_role_flg() {
		return getConstBoolean(offset + 16, $main_role_flg);
	}

	/**
	 * Main PIC 主担当.<p>
	 *
	 */
	public void main_role_flg(boolean value) {
		setConstBoolean(offset + 16, $main_role_flg, value);
	}


	/**
	 * Sub PIC 副担当.<p>
	 *
	 */
	public boolean sub_role_flg() {
		return getConstBoolean(offset + 17, $sub_role_flg);
	}

	/**
	 * Sub PIC 副担当.<p>
	 *
	 */
	public void sub_role_flg(boolean value) {
		setConstBoolean(offset + 17, $sub_role_flg, value);
	}


	/**
	 * Include next completed process 次処理済含む.<p>
	 *
	 */
	public boolean next_opr_flg() {
		return getConstBoolean(offset + 18, $next_opr_flg);
	}

	/**
	 * Include next completed process 次処理済含む.<p>
	 *
	 */
	public void next_opr_flg(boolean value) {
		setConstBoolean(offset + 18, $next_opr_flg, value);
	}


	/**
	 * Include not updatable 更新不可含む.<p>
	 *
	 */
	public boolean not_upd_flg() {
		return getConstBoolean(offset + 19, $not_upd_flg);
	}

	/**
	 * Include not updatable 更新不可含む.<p>
	 *
	 */
	public void not_upd_flg(boolean value) {
		setConstBoolean(offset + 19, $not_upd_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			return aprv_func_typ();
		}
		if ($aprv_func_typ_nm.equalsIgnoreCase(name)) {
			return aprv_func_typ_nm();
		}
		if ($aprv_d_sts_typ.equalsIgnoreCase(name)) {
			return aprv_d_sts_typ();
		}
		if ($aprv_d_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_d_sts_typ_nm();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			return aprv_src_no1();
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			return aprv_src_no2();
		}
		if ($ins_biz_usr_cd.equalsIgnoreCase(name)) {
			return ins_biz_usr_cd();
		}
		if ($ins_biz_usr_nm.equalsIgnoreCase(name)) {
			return ins_biz_usr_nm();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ins_dt_fr.equalsIgnoreCase(name)) {
			return ins_dt_fr();
		}
		if ($ins_dt_to.equalsIgnoreCase(name)) {
			return ins_dt_to();
		}
		if ($aprv_d_tm_fr.equalsIgnoreCase(name)) {
			return aprv_d_tm_fr();
		}
		if ($aprv_d_tm_to.equalsIgnoreCase(name)) {
			return aprv_d_tm_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($main_role_flg.equalsIgnoreCase(name)) {
			return main_role_flg();
		}
		if ($sub_role_flg.equalsIgnoreCase(name)) {
			return sub_role_flg();
		}
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			return next_opr_flg();
		}
		if ($not_upd_flg.equalsIgnoreCase(name)) {
			return not_upd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			return aprv_func_typ();
		}
		if ($aprv_func_typ_nm.equalsIgnoreCase(name)) {
			return aprv_func_typ_nm();
		}
		if ($aprv_d_sts_typ.equalsIgnoreCase(name)) {
			return aprv_d_sts_typ();
		}
		if ($aprv_d_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_d_sts_typ_nm();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			return aprv_src_no1();
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			return aprv_src_no2();
		}
		if ($ins_biz_usr_cd.equalsIgnoreCase(name)) {
			return ins_biz_usr_cd();
		}
		if ($ins_biz_usr_nm.equalsIgnoreCase(name)) {
			return ins_biz_usr_nm();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ins_dt_fr.equalsIgnoreCase(name)) {
			return ins_dt_fr();
		}
		if ($ins_dt_to.equalsIgnoreCase(name)) {
			return ins_dt_to();
		}
		if ($aprv_d_tm_fr.equalsIgnoreCase(name)) {
			return aprv_d_tm_fr();
		}
		if ($aprv_d_tm_to.equalsIgnoreCase(name)) {
			return aprv_d_tm_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($main_role_flg.equalsIgnoreCase(name)) {
			return main_role_flg();
		}
		if ($sub_role_flg.equalsIgnoreCase(name)) {
			return sub_role_flg();
		}
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			return next_opr_flg();
		}
		if ($not_upd_flg.equalsIgnoreCase(name)) {
			return not_upd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			aprv_func_typ(value);
			return;
		}
		if ($aprv_func_typ_nm.equalsIgnoreCase(name)) {
			aprv_func_typ_nm(value);
			return;
		}
		if ($aprv_d_sts_typ.equalsIgnoreCase(name)) {
			aprv_d_sts_typ(value);
			return;
		}
		if ($aprv_d_sts_typ_nm.equalsIgnoreCase(name)) {
			aprv_d_sts_typ_nm(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			aprv_src_no1(value);
			return;
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			aprv_src_no2(value);
			return;
		}
		if ($ins_biz_usr_cd.equalsIgnoreCase(name)) {
			ins_biz_usr_cd(value);
			return;
		}
		if ($ins_biz_usr_nm.equalsIgnoreCase(name)) {
			ins_biz_usr_nm(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ins_dt_fr.equalsIgnoreCase(name)) {
			ins_dt_fr(value);
			return;
		}
		if ($ins_dt_to.equalsIgnoreCase(name)) {
			ins_dt_to(value);
			return;
		}
		if ($aprv_d_tm_fr.equalsIgnoreCase(name)) {
			aprv_d_tm_fr(value);
			return;
		}
		if ($aprv_d_tm_to.equalsIgnoreCase(name)) {
			aprv_d_tm_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($main_role_flg.equalsIgnoreCase(name)) {
			main_role_flg(value);
			return;
		}
		if ($sub_role_flg.equalsIgnoreCase(name)) {
			sub_role_flg(value);
			return;
		}
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			next_opr_flg(value);
			return;
		}
		if ($not_upd_flg.equalsIgnoreCase(name)) {
			not_upd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			aprv_func_typ(value);
			return;
		}
		if ($aprv_func_typ_nm.equalsIgnoreCase(name)) {
			aprv_func_typ_nm(value);
			return;
		}
		if ($aprv_d_sts_typ.equalsIgnoreCase(name)) {
			aprv_d_sts_typ(value);
			return;
		}
		if ($aprv_d_sts_typ_nm.equalsIgnoreCase(name)) {
			aprv_d_sts_typ_nm(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			aprv_src_no1(value);
			return;
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			aprv_src_no2(value);
			return;
		}
		if ($ins_biz_usr_cd.equalsIgnoreCase(name)) {
			ins_biz_usr_cd(value);
			return;
		}
		if ($ins_biz_usr_nm.equalsIgnoreCase(name)) {
			ins_biz_usr_nm(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ins_dt_fr.equalsIgnoreCase(name)) {
			ins_dt_fr(value);
			return;
		}
		if ($ins_dt_to.equalsIgnoreCase(name)) {
			ins_dt_to(value);
			return;
		}
		if ($aprv_d_tm_fr.equalsIgnoreCase(name)) {
			aprv_d_tm_fr(value);
			return;
		}
		if ($aprv_d_tm_to.equalsIgnoreCase(name)) {
			aprv_d_tm_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($main_role_flg.equalsIgnoreCase(name)) {
			main_role_flg(value);
			return;
		}
		if ($sub_role_flg.equalsIgnoreCase(name)) {
			sub_role_flg(value);
			return;
		}
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			next_opr_flg(value);
			return;
		}
		if ($not_upd_flg.equalsIgnoreCase(name)) {
			not_upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

