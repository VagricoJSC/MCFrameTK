package mcframe.clientMABC.MABCP0250;

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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3;REF_APRV,View (Approval role),5;REF_DPT,View (Belonging dept.),6 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3;REF_APRV,参照する（承認役割）,5;REF_DPT,参照する（所属部門）,6.<p>
	 *
	 */
	public static final String $ope = "ope";
	public static final String $dt_p = "dt_p";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 * Employee type 社員区分.<p>
	 *
	 */
	public static final String $usr_com_typ = "usr_com_typ";
	/**
	 * Employee type name 社員区分名.<p>
	 *
	 */
	public static final String $usr_com_typ_nm = "usr_com_typ_nm";
	/**
	 * Affiliation company 所属会社.<p>
	 *
	 */
	public static final String $usr_com = "usr_com";
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
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Main dept. name 主部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Own dept. cd. 所属部門ＣＤ.<p>
	 *
	 */
	public static final String $usr_dpt_cd = "usr_dpt_cd";
	/**
	 * Own dept. name 所属部門名.<p>
	 *
	 */
	public static final String $usr_dpt_nm = "usr_dpt_nm";
	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public static final String $da_cd = "da_cd";
	/**
	 * Data access name データアクセス名.<p>
	 *
	 */
	public static final String $da_nm = "da_nm";
	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public static final String $usr_aprv_role_cd = "usr_aprv_role_cd";
	/**
	 * Approval role name 承認役割名.<p>
	 *
	 */
	public static final String $usr_aprv_role_nm = "usr_aprv_role_nm";
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

	public static final String $st_dt_fr = $dt_p + ".st_dt_fr";
	public static final String $st_dt_to = $dt_p + ".st_dt_to";
	public static final String $end_dt_fr = $dt_p + ".end_dt_fr";
	public static final String $end_dt_to = $dt_p + ".end_dt_to";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta dt_p_META = createInnerRowMeta($dt_p, mcframe.clientMAUB.MAUBP0020.StEndDtR.class);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_com_typ_META = createCommonMeta($usr_com_typ, mcframe.commonMA.meta.MA_META.USR_COM_TYP);
	public static final MCMeta usr_com_typ_nm_META = createCommonMeta($usr_com_typ_nm, mcframe.commonMA.meta.MA_META.USR_COM_TYP_NM);
	public static final MCMeta usr_com_META = createCommonMeta($usr_com, mcframe.commonMA.meta.MA_META.USR_COM);
	public static final MCMeta usr_alt_nm1_META = createCommonMeta($usr_alt_nm1, mcframe.commonMA.meta.MA_META.USR_LNM1);
	public static final MCMeta usr_alt_nm2_META = createCommonMeta($usr_alt_nm2, mcframe.commonMA.meta.MA_META.USR_LNM2);
	public static final MCMeta usr_alt_nm3_META = createCommonMeta($usr_alt_nm3, mcframe.commonMA.meta.MA_META.USR_LNM3);
	public static final MCMeta usr_alt_nm4_META = createCommonMeta($usr_alt_nm4, mcframe.commonMA.meta.MA_META.USR_LNM4);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta usr_dpt_cd_META = createCommonMeta($usr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta usr_dpt_nm_META = createCommonMeta($usr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta da_cd_META = createCommonMeta($da_cd, mcframe.commonMA.meta.MA_META.DA_CD);
	public static final MCMeta da_nm_META = createCommonMeta($da_nm, mcframe.commonMA.meta.MA_META.DA_NM);
	public static final MCMeta usr_aprv_role_cd_META = createCommonMeta($usr_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta usr_aprv_role_nm_META = createCommonMeta($usr_aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);
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

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			dt_p_META,
			usr_cd_META,
			usr_nm_META,
			usr_com_typ_META,
			usr_com_typ_nm_META,
			usr_com_META,
			usr_alt_nm1_META,
			usr_alt_nm2_META,
			usr_alt_nm3_META,
			usr_alt_nm4_META,
			dpt_cd_META,
			dpt_nm_META,
			usr_dpt_cd_META,
			usr_dpt_nm_META,
			da_cd_META,
			da_nm_META,
			usr_aprv_role_cd_META,
			usr_aprv_role_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			off_del_flg_META,
			on_del_flg_META,
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
				"st_dt_fr",
				"st_dt_to",
				"end_dt_fr",
				"end_dt_to"
			},
			{
				$st_dt_fr,
				$st_dt_to,
				$end_dt_fr,
				$end_dt_to
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

	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dpt_cd, "MAC_DPT_IS_SRCH_TYP.COMM;true;true"},	// dpt_cd
				{$usr_dpt_cd, "MAC_DPT_IS_SRCH_TYP.COMM;true;true"}	// usr_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dpt_cd, "dpt_is_srch_typ;mode_today_flg;dpt_nm_rem_flg"},	// dpt_cd
				{$usr_dpt_cd, "dpt_is_srch_typ;mode_today_flg;dpt_nm_rem_flg"}	// usr_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$dpt_cd, "dpt_nm"},	// dpt_cd
				{$usr_dpt_cd, "dpt_nm"},	// usr_dpt_cd
				{$usr_aprv_role_cd, "aprv_role_nm"}	// usr_aprv_role_cd
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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3;REF_APRV,View (Approval role),5;REF_DPT,View (Belonging dept.),6 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3;REF_APRV,参照する（承認役割）,5;REF_DPT,参照する（所属部門）,6.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3;REF_APRV,View (Approval role),5;REF_DPT,View (Belonging dept.),6 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3;REF_APRV,参照する（承認役割）,5;REF_DPT,参照する（所属部門）,6.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	public mcframe.clientMAUB.MAUBP0020.StEndDtR dt_p(){
		return (mcframe.clientMAUB.MAUBP0020.StEndDtR) getConstInnerRow(offset + 1, $dt_p);
	}
	
	public void dt_p(mcframe.clientMAUB.MAUBP0020.StEndDtR row){
		setConstInnerRow(offset + 1, $dt_p, row);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 2, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 2, $usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 3, $usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 3, $usr_nm, value);
	}


	/**
	 * Employee type 社員区分.<p>
	 *
	 */
	public String usr_com_typ() {
		return getConstString(offset + 4, $usr_com_typ);
	}

	/**
	 * Employee type 社員区分.<p>
	 *
	 */
	public void usr_com_typ(String value) {
		setConstString(offset + 4, $usr_com_typ, value);
	}


	/**
	 * Employee type name 社員区分名.<p>
	 *
	 */
	public String usr_com_typ_nm() {
		return getConstString(offset + 5, $usr_com_typ_nm);
	}

	/**
	 * Employee type name 社員区分名.<p>
	 *
	 */
	public void usr_com_typ_nm(String value) {
		setConstString(offset + 5, $usr_com_typ_nm, value);
	}


	/**
	 * Affiliation company 所属会社.<p>
	 *
	 */
	public String usr_com() {
		return getConstString(offset + 6, $usr_com);
	}

	/**
	 * Affiliation company 所属会社.<p>
	 *
	 */
	public void usr_com(String value) {
		setConstString(offset + 6, $usr_com, value);
	}


	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public String usr_alt_nm1() {
		return getConstString(offset + 7, $usr_alt_nm1);
	}

	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public void usr_alt_nm1(String value) {
		setConstString(offset + 7, $usr_alt_nm1, value);
	}


	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public String usr_alt_nm2() {
		return getConstString(offset + 8, $usr_alt_nm2);
	}

	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public void usr_alt_nm2(String value) {
		setConstString(offset + 8, $usr_alt_nm2, value);
	}


	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public String usr_alt_nm3() {
		return getConstString(offset + 9, $usr_alt_nm3);
	}

	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public void usr_alt_nm3(String value) {
		setConstString(offset + 9, $usr_alt_nm3, value);
	}


	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public String usr_alt_nm4() {
		return getConstString(offset + 10, $usr_alt_nm4);
	}

	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public void usr_alt_nm4(String value) {
		setConstString(offset + 10, $usr_alt_nm4, value);
	}


	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 11, $dpt_cd);
	}

	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 11, $dpt_cd, value);
	}


	/**
	 * Main dept. name 主部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 12, $dpt_nm);
	}

	/**
	 * Main dept. name 主部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 12, $dpt_nm, value);
	}


	/**
	 * Own dept. cd. 所属部門ＣＤ.<p>
	 *
	 */
	public String usr_dpt_cd() {
		return getConstString(offset + 13, $usr_dpt_cd);
	}

	/**
	 * Own dept. cd. 所属部門ＣＤ.<p>
	 *
	 */
	public void usr_dpt_cd(String value) {
		setConstString(offset + 13, $usr_dpt_cd, value);
	}


	/**
	 * Own dept. name 所属部門名.<p>
	 *
	 */
	public String usr_dpt_nm() {
		return getConstString(offset + 14, $usr_dpt_nm);
	}

	/**
	 * Own dept. name 所属部門名.<p>
	 *
	 */
	public void usr_dpt_nm(String value) {
		setConstString(offset + 14, $usr_dpt_nm, value);
	}


	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public String da_cd() {
		return getConstString(offset + 15, $da_cd);
	}

	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public void da_cd(String value) {
		setConstString(offset + 15, $da_cd, value);
	}


	/**
	 * Data access name データアクセス名.<p>
	 *
	 */
	public String da_nm() {
		return getConstString(offset + 16, $da_nm);
	}

	/**
	 * Data access name データアクセス名.<p>
	 *
	 */
	public void da_nm(String value) {
		setConstString(offset + 16, $da_nm, value);
	}


	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public String usr_aprv_role_cd() {
		return getConstString(offset + 17, $usr_aprv_role_cd);
	}

	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public void usr_aprv_role_cd(String value) {
		setConstString(offset + 17, $usr_aprv_role_cd, value);
	}


	/**
	 * Approval role name 承認役割名.<p>
	 *
	 */
	public String usr_aprv_role_nm() {
		return getConstString(offset + 18, $usr_aprv_role_nm);
	}

	/**
	 * Approval role name 承認役割名.<p>
	 *
	 */
	public void usr_aprv_role_nm(String value) {
		setConstString(offset + 18, $usr_aprv_role_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 19, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 19, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 20, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 20, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 21, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 21, $memo3, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 22, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 22, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 23, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 23, $on_del_flg, value);
	}


	/**
	 * PIC info. 1 担当者情報１.<p>
	 *
	 */
	public String usr_info1() {
		return getConstString(offset + 24, $usr_info1);
	}

	/**
	 * PIC info. 1 担当者情報１.<p>
	 *
	 */
	public void usr_info1(String value) {
		setConstString(offset + 24, $usr_info1, value);
	}


	/**
	 * PIC info. 2 担当者情報２.<p>
	 *
	 */
	public String usr_info2() {
		return getConstString(offset + 25, $usr_info2);
	}

	/**
	 * PIC info. 2 担当者情報２.<p>
	 *
	 */
	public void usr_info2(String value) {
		setConstString(offset + 25, $usr_info2, value);
	}


	/**
	 * PIC info. 3 担当者情報３.<p>
	 *
	 */
	public String usr_info3() {
		return getConstString(offset + 26, $usr_info3);
	}

	/**
	 * PIC info. 3 担当者情報３.<p>
	 *
	 */
	public void usr_info3(String value) {
		setConstString(offset + 26, $usr_info3, value);
	}


	/**
	 * PIC info. 4 担当者情報４.<p>
	 *
	 */
	public String usr_info4() {
		return getConstString(offset + 27, $usr_info4);
	}

	/**
	 * PIC info. 4 担当者情報４.<p>
	 *
	 */
	public void usr_info4(String value) {
		setConstString(offset + 27, $usr_info4, value);
	}


	/**
	 * PIC info. 5 担当者情報５.<p>
	 *
	 */
	public String usr_info5() {
		return getConstString(offset + 28, $usr_info5);
	}

	/**
	 * PIC info. 5 担当者情報５.<p>
	 *
	 */
	public void usr_info5(String value) {
		setConstString(offset + 28, $usr_info5, value);
	}


	/**
	 * PIC info. 6 担当者情報６.<p>
	 *
	 */
	public String usr_info6() {
		return getConstString(offset + 29, $usr_info6);
	}

	/**
	 * PIC info. 6 担当者情報６.<p>
	 *
	 */
	public void usr_info6(String value) {
		setConstString(offset + 29, $usr_info6, value);
	}


	/**
	 * PIC info. 7 担当者情報７.<p>
	 *
	 */
	public String usr_info7() {
		return getConstString(offset + 30, $usr_info7);
	}

	/**
	 * PIC info. 7 担当者情報７.<p>
	 *
	 */
	public void usr_info7(String value) {
		setConstString(offset + 30, $usr_info7, value);
	}


	/**
	 * PIC info. 8 担当者情報８.<p>
	 *
	 */
	public String usr_info8() {
		return getConstString(offset + 31, $usr_info8);
	}

	/**
	 * PIC info. 8 担当者情報８.<p>
	 *
	 */
	public void usr_info8(String value) {
		setConstString(offset + 31, $usr_info8, value);
	}


	/**
	 * PIC info. 9 担当者情報９.<p>
	 *
	 */
	public String usr_info9() {
		return getConstString(offset + 32, $usr_info9);
	}

	/**
	 * PIC info. 9 担当者情報９.<p>
	 *
	 */
	public void usr_info9(String value) {
		setConstString(offset + 32, $usr_info9, value);
	}


	/**
	 * PIC info. 10 担当者情報１０.<p>
	 *
	 */
	public String usr_info10() {
		return getConstString(offset + 33, $usr_info10);
	}

	/**
	 * PIC info. 10 担当者情報１０.<p>
	 *
	 */
	public void usr_info10(String value) {
		setConstString(offset + 33, $usr_info10, value);
	}


	/**
	 * PIC info. 11 担当者情報１１.<p>
	 *
	 */
	public String usr_info11() {
		return getConstString(offset + 34, $usr_info11);
	}

	/**
	 * PIC info. 11 担当者情報１１.<p>
	 *
	 */
	public void usr_info11(String value) {
		setConstString(offset + 34, $usr_info11, value);
	}


	/**
	 * PIC info. 12 担当者情報１２.<p>
	 *
	 */
	public String usr_info12() {
		return getConstString(offset + 35, $usr_info12);
	}

	/**
	 * PIC info. 12 担当者情報１２.<p>
	 *
	 */
	public void usr_info12(String value) {
		setConstString(offset + 35, $usr_info12, value);
	}


	/**
	 * PIC info. 13 担当者情報１３.<p>
	 *
	 */
	public String usr_info13() {
		return getConstString(offset + 36, $usr_info13);
	}

	/**
	 * PIC info. 13 担当者情報１３.<p>
	 *
	 */
	public void usr_info13(String value) {
		setConstString(offset + 36, $usr_info13, value);
	}


	/**
	 * PIC info. 14 担当者情報１４.<p>
	 *
	 */
	public String usr_info14() {
		return getConstString(offset + 37, $usr_info14);
	}

	/**
	 * PIC info. 14 担当者情報１４.<p>
	 *
	 */
	public void usr_info14(String value) {
		setConstString(offset + 37, $usr_info14, value);
	}


	/**
	 * PIC info. 15 担当者情報１５.<p>
	 *
	 */
	public String usr_info15() {
		return getConstString(offset + 38, $usr_info15);
	}

	/**
	 * PIC info. 15 担当者情報１５.<p>
	 *
	 */
	public void usr_info15(String value) {
		setConstString(offset + 38, $usr_info15, value);
	}


	/**
	 * PIC info. 16 担当者情報１６.<p>
	 *
	 */
	public String usr_info16() {
		return getConstString(offset + 39, $usr_info16);
	}

	/**
	 * PIC info. 16 担当者情報１６.<p>
	 *
	 */
	public void usr_info16(String value) {
		setConstString(offset + 39, $usr_info16, value);
	}


	/**
	 * PIC info. 17 担当者情報１７.<p>
	 *
	 */
	public String usr_info17() {
		return getConstString(offset + 40, $usr_info17);
	}

	/**
	 * PIC info. 17 担当者情報１７.<p>
	 *
	 */
	public void usr_info17(String value) {
		setConstString(offset + 40, $usr_info17, value);
	}


	/**
	 * PIC info. 18 担当者情報１８.<p>
	 *
	 */
	public String usr_info18() {
		return getConstString(offset + 41, $usr_info18);
	}

	/**
	 * PIC info. 18 担当者情報１８.<p>
	 *
	 */
	public void usr_info18(String value) {
		setConstString(offset + 41, $usr_info18, value);
	}


	/**
	 * PIC info. 19 担当者情報１９.<p>
	 *
	 */
	public String usr_info19() {
		return getConstString(offset + 42, $usr_info19);
	}

	/**
	 * PIC info. 19 担当者情報１９.<p>
	 *
	 */
	public void usr_info19(String value) {
		setConstString(offset + 42, $usr_info19, value);
	}


	/**
	 * PIC info. 20 担当者情報２０.<p>
	 *
	 */
	public String usr_info20() {
		return getConstString(offset + 43, $usr_info20);
	}

	/**
	 * PIC info. 20 担当者情報２０.<p>
	 *
	 */
	public void usr_info20(String value) {
		setConstString(offset + 43, $usr_info20, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			return usr_com_typ();
		}
		if ($usr_com_typ_nm.equalsIgnoreCase(name)) {
			return usr_com_typ_nm();
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			return usr_com();
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($usr_dpt_cd.equalsIgnoreCase(name)) {
			return usr_dpt_cd();
		}
		if ($usr_dpt_nm.equalsIgnoreCase(name)) {
			return usr_dpt_nm();
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			return da_cd();
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			return da_nm();
		}
		if ($usr_aprv_role_cd.equalsIgnoreCase(name)) {
			return usr_aprv_role_cd();
		}
		if ($usr_aprv_role_nm.equalsIgnoreCase(name)) {
			return usr_aprv_role_nm();
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
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			return usr_com_typ();
		}
		if ($usr_com_typ_nm.equalsIgnoreCase(name)) {
			return usr_com_typ_nm();
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			return usr_com();
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($usr_dpt_cd.equalsIgnoreCase(name)) {
			return usr_dpt_cd();
		}
		if ($usr_dpt_nm.equalsIgnoreCase(name)) {
			return usr_dpt_nm();
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			return da_cd();
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			return da_nm();
		}
		if ($usr_aprv_role_cd.equalsIgnoreCase(name)) {
			return usr_aprv_role_cd();
		}
		if ($usr_aprv_role_nm.equalsIgnoreCase(name)) {
			return usr_aprv_role_nm();
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
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			usr_com_typ(value);
			return;
		}
		if ($usr_com_typ_nm.equalsIgnoreCase(name)) {
			usr_com_typ_nm(value);
			return;
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			usr_com(value);
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($usr_dpt_cd.equalsIgnoreCase(name)) {
			usr_dpt_cd(value);
			return;
		}
		if ($usr_dpt_nm.equalsIgnoreCase(name)) {
			usr_dpt_nm(value);
			return;
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			da_cd(value);
			return;
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			da_nm(value);
			return;
		}
		if ($usr_aprv_role_cd.equalsIgnoreCase(name)) {
			usr_aprv_role_cd(value);
			return;
		}
		if ($usr_aprv_role_nm.equalsIgnoreCase(name)) {
			usr_aprv_role_nm(value);
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
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			usr_com_typ(value);
			return;
		}
		if ($usr_com_typ_nm.equalsIgnoreCase(name)) {
			usr_com_typ_nm(value);
			return;
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			usr_com(value);
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($usr_dpt_cd.equalsIgnoreCase(name)) {
			usr_dpt_cd(value);
			return;
		}
		if ($usr_dpt_nm.equalsIgnoreCase(name)) {
			usr_dpt_nm(value);
			return;
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			da_cd(value);
			return;
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			da_nm(value);
			return;
		}
		if ($usr_aprv_role_cd.equalsIgnoreCase(name)) {
			usr_aprv_role_cd(value);
			return;
		}
		if ($usr_aprv_role_nm.equalsIgnoreCase(name)) {
			usr_aprv_role_nm(value);
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
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dt_p.equalsIgnoreCase(name)) {
			return dt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dt_p.equalsIgnoreCase(name)) {
			dt_p(
				((MCContainerMeta) dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0020.StEndDtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate st_dt_fr() {
		return dt_p().st_dt_fr();
	}

	public void st_dt_fr(MCDate value) {
		dt_p().st_dt_fr(value);
	}

	public MCDate st_dt_to() {
		return dt_p().st_dt_to();
	}

	public void st_dt_to(MCDate value) {
		dt_p().st_dt_to(value);
	}

	public MCDate end_dt_fr() {
		return dt_p().end_dt_fr();
	}

	public void end_dt_fr(MCDate value) {
		dt_p().end_dt_fr(value);
	}

	public MCDate end_dt_to() {
		return dt_p().end_dt_to();
	}

	public void end_dt_to(MCDate value) {
		dt_p().end_dt_to(value);
	}

}

