package mcframe.serverMABC.MABCL1710;

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
 * ブロック"Srch01_Rslt1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt1R_MC_A extends MCConstRow {

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public static final String $biz_typ = "biz_typ";
	/**
	 * Business type name 業務区分名.<p>
	 *
	 */
	public static final String $biz_typ_nm = "biz_typ_nm";
	/**
	 * File name element type 1 ファイル名称要素区分１.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ1 = "rpt_nm_elm_typ1";
	/**
	 * File name element type name 1 ファイル名称要素区分名１.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ_nm1 = "rpt_nm_elm_typ_nm1";
	/**
	 * File name element type 2 ファイル名称要素区分２.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ2 = "rpt_nm_elm_typ2";
	/**
	 * File name element type name 2 ファイル名称要素区分名２.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ_nm2 = "rpt_nm_elm_typ_nm2";
	/**
	 * File name element type 3 ファイル名称要素区分３.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ3 = "rpt_nm_elm_typ3";
	/**
	 * File name element type name 3 ファイル名称要素区分名３.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ_nm3 = "rpt_nm_elm_typ_nm3";
	/**
	 * File name element type 4 ファイル名称要素区分４.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ4 = "rpt_nm_elm_typ4";
	/**
	 * File name element type name 4 ファイル名称要素区分名４.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ_nm4 = "rpt_nm_elm_typ_nm4";
	/**
	 * File name element type 5 ファイル名称要素区分５.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ5 = "rpt_nm_elm_typ5";
	/**
	 * File name element type name 5 ファイル名称要素区分名５.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ_nm5 = "rpt_nm_elm_typ_nm5";
	/**
	 * File name element type 6 ファイル名称要素区分６.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ6 = "rpt_nm_elm_typ6";
	/**
	 * File name element type name 6 ファイル名称要素区分名６.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ_nm6 = "rpt_nm_elm_typ_nm6";
	/**
	 * File name element type 7 ファイル名称要素区分７.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ7 = "rpt_nm_elm_typ7";
	/**
	 * File name element type name 7 ファイル名称要素区分名７.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ_nm7 = "rpt_nm_elm_typ_nm7";
	/**
	 * File name element type 8 ファイル名称要素区分８.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ8 = "rpt_nm_elm_typ8";
	/**
	 * File name element type name 8 ファイル名称要素区分名８.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ_nm8 = "rpt_nm_elm_typ_nm8";
	/**
	 * File name element type 9 ファイル名称要素区分９.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ9 = "rpt_nm_elm_typ9";
	/**
	 * File name element type name 9 ファイル名称要素区分名９.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ_nm9 = "rpt_nm_elm_typ_nm9";
	/**
	 * File name element type 10 ファイル名称要素区分１０.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ10 = "rpt_nm_elm_typ10";
	/**
	 * File name element type name 10 ファイル名称要素区分名１０.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ_nm10 = "rpt_nm_elm_typ_nm10";
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
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";


	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta biz_typ_META = createCommonMeta($biz_typ, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta biz_typ_nm_META = createCommonMeta($biz_typ_nm, mcframe.commonMA.meta.MA_META.BIZ_TYP_NM);
	public static final MCMeta rpt_nm_elm_typ1_META = createCommonMeta($rpt_nm_elm_typ1, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ_nm1_META = createCommonMeta($rpt_nm_elm_typ_nm1, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP_NM);
	public static final MCMeta rpt_nm_elm_typ2_META = createCommonMeta($rpt_nm_elm_typ2, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ_nm2_META = createCommonMeta($rpt_nm_elm_typ_nm2, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP_NM);
	public static final MCMeta rpt_nm_elm_typ3_META = createCommonMeta($rpt_nm_elm_typ3, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ_nm3_META = createCommonMeta($rpt_nm_elm_typ_nm3, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP_NM);
	public static final MCMeta rpt_nm_elm_typ4_META = createCommonMeta($rpt_nm_elm_typ4, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ_nm4_META = createCommonMeta($rpt_nm_elm_typ_nm4, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP_NM);
	public static final MCMeta rpt_nm_elm_typ5_META = createCommonMeta($rpt_nm_elm_typ5, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ_nm5_META = createCommonMeta($rpt_nm_elm_typ_nm5, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP_NM);
	public static final MCMeta rpt_nm_elm_typ6_META = createCommonMeta($rpt_nm_elm_typ6, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ_nm6_META = createCommonMeta($rpt_nm_elm_typ_nm6, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP_NM);
	public static final MCMeta rpt_nm_elm_typ7_META = createCommonMeta($rpt_nm_elm_typ7, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ_nm7_META = createCommonMeta($rpt_nm_elm_typ_nm7, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP_NM);
	public static final MCMeta rpt_nm_elm_typ8_META = createCommonMeta($rpt_nm_elm_typ8, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ_nm8_META = createCommonMeta($rpt_nm_elm_typ_nm8, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP_NM);
	public static final MCMeta rpt_nm_elm_typ9_META = createCommonMeta($rpt_nm_elm_typ9, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ_nm9_META = createCommonMeta($rpt_nm_elm_typ_nm9, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP_NM);
	public static final MCMeta rpt_nm_elm_typ10_META = createCommonMeta($rpt_nm_elm_typ10, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ_nm10_META = createCommonMeta($rpt_nm_elm_typ_nm10, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<Srch01_Rslt1R> constMetas = new ConstMetaList<Srch01_Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			biz_typ_META,
			biz_typ_nm_META,
			rpt_nm_elm_typ1_META,
			rpt_nm_elm_typ_nm1_META,
			rpt_nm_elm_typ2_META,
			rpt_nm_elm_typ_nm2_META,
			rpt_nm_elm_typ3_META,
			rpt_nm_elm_typ_nm3_META,
			rpt_nm_elm_typ4_META,
			rpt_nm_elm_typ_nm4_META,
			rpt_nm_elm_typ5_META,
			rpt_nm_elm_typ_nm5_META,
			rpt_nm_elm_typ6_META,
			rpt_nm_elm_typ_nm6_META,
			rpt_nm_elm_typ7_META,
			rpt_nm_elm_typ_nm7_META,
			rpt_nm_elm_typ8_META,
			rpt_nm_elm_typ_nm8_META,
			rpt_nm_elm_typ9_META,
			rpt_nm_elm_typ_nm9_META,
			rpt_nm_elm_typ10_META,
			rpt_nm_elm_typ_nm10_META,
			memo1_META,
			memo2_META,
			memo3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META
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
				{$biz_typ, "MAC_BIZ_TYP"},	// biz_typ
				{$rpt_nm_elm_typ1, "MAC_RPT_NM_ELM_TYP"},	// rpt_nm_elm_typ1
				{$rpt_nm_elm_typ2, "MAC_RPT_NM_ELM_TYP"},	// rpt_nm_elm_typ2
				{$rpt_nm_elm_typ3, "MAC_RPT_NM_ELM_TYP"},	// rpt_nm_elm_typ3
				{$rpt_nm_elm_typ4, "MAC_RPT_NM_ELM_TYP"},	// rpt_nm_elm_typ4
				{$rpt_nm_elm_typ5, "MAC_RPT_NM_ELM_TYP"},	// rpt_nm_elm_typ5
				{$rpt_nm_elm_typ6, "MAC_RPT_NM_ELM_TYP"},	// rpt_nm_elm_typ6
				{$rpt_nm_elm_typ7, "MAC_RPT_NM_ELM_TYP"},	// rpt_nm_elm_typ7
				{$rpt_nm_elm_typ8, "MAC_RPT_NM_ELM_TYP"},	// rpt_nm_elm_typ8
				{$rpt_nm_elm_typ9, "MAC_RPT_NM_ELM_TYP"},	// rpt_nm_elm_typ9
				{$rpt_nm_elm_typ10, "MAC_RPT_NM_ELM_TYP"}	// rpt_nm_elm_typ10
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
	protected Srch01_Rslt1R_MC_A(ConstMetaList<? extends Srch01_Rslt1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R clone() {
		return (Srch01_Rslt1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R createInstance() {
		return (Srch01_Rslt1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R getValues(String... names) {
		return (Srch01_Rslt1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 0, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 0, $del_flg, value);
	}


	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public String biz_typ() {
		return getConstString(offset + 1, $biz_typ);
	}

	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public void biz_typ(String value) {
		setConstString(offset + 1, $biz_typ, value);
	}


	/**
	 * Business type name 業務区分名.<p>
	 *
	 */
	public String biz_typ_nm() {
		return getConstString(offset + 2, $biz_typ_nm);
	}

	/**
	 * Business type name 業務区分名.<p>
	 *
	 */
	public void biz_typ_nm(String value) {
		setConstString(offset + 2, $biz_typ_nm, value);
	}


	/**
	 * File name element type 1 ファイル名称要素区分１.<p>
	 *
	 */
	public String rpt_nm_elm_typ1() {
		return getConstString(offset + 3, $rpt_nm_elm_typ1);
	}

	/**
	 * File name element type 1 ファイル名称要素区分１.<p>
	 *
	 */
	public void rpt_nm_elm_typ1(String value) {
		setConstString(offset + 3, $rpt_nm_elm_typ1, value);
	}


	/**
	 * File name element type name 1 ファイル名称要素区分名１.<p>
	 *
	 */
	public String rpt_nm_elm_typ_nm1() {
		return getConstString(offset + 4, $rpt_nm_elm_typ_nm1);
	}

	/**
	 * File name element type name 1 ファイル名称要素区分名１.<p>
	 *
	 */
	public void rpt_nm_elm_typ_nm1(String value) {
		setConstString(offset + 4, $rpt_nm_elm_typ_nm1, value);
	}


	/**
	 * File name element type 2 ファイル名称要素区分２.<p>
	 *
	 */
	public String rpt_nm_elm_typ2() {
		return getConstString(offset + 5, $rpt_nm_elm_typ2);
	}

	/**
	 * File name element type 2 ファイル名称要素区分２.<p>
	 *
	 */
	public void rpt_nm_elm_typ2(String value) {
		setConstString(offset + 5, $rpt_nm_elm_typ2, value);
	}


	/**
	 * File name element type name 2 ファイル名称要素区分名２.<p>
	 *
	 */
	public String rpt_nm_elm_typ_nm2() {
		return getConstString(offset + 6, $rpt_nm_elm_typ_nm2);
	}

	/**
	 * File name element type name 2 ファイル名称要素区分名２.<p>
	 *
	 */
	public void rpt_nm_elm_typ_nm2(String value) {
		setConstString(offset + 6, $rpt_nm_elm_typ_nm2, value);
	}


	/**
	 * File name element type 3 ファイル名称要素区分３.<p>
	 *
	 */
	public String rpt_nm_elm_typ3() {
		return getConstString(offset + 7, $rpt_nm_elm_typ3);
	}

	/**
	 * File name element type 3 ファイル名称要素区分３.<p>
	 *
	 */
	public void rpt_nm_elm_typ3(String value) {
		setConstString(offset + 7, $rpt_nm_elm_typ3, value);
	}


	/**
	 * File name element type name 3 ファイル名称要素区分名３.<p>
	 *
	 */
	public String rpt_nm_elm_typ_nm3() {
		return getConstString(offset + 8, $rpt_nm_elm_typ_nm3);
	}

	/**
	 * File name element type name 3 ファイル名称要素区分名３.<p>
	 *
	 */
	public void rpt_nm_elm_typ_nm3(String value) {
		setConstString(offset + 8, $rpt_nm_elm_typ_nm3, value);
	}


	/**
	 * File name element type 4 ファイル名称要素区分４.<p>
	 *
	 */
	public String rpt_nm_elm_typ4() {
		return getConstString(offset + 9, $rpt_nm_elm_typ4);
	}

	/**
	 * File name element type 4 ファイル名称要素区分４.<p>
	 *
	 */
	public void rpt_nm_elm_typ4(String value) {
		setConstString(offset + 9, $rpt_nm_elm_typ4, value);
	}


	/**
	 * File name element type name 4 ファイル名称要素区分名４.<p>
	 *
	 */
	public String rpt_nm_elm_typ_nm4() {
		return getConstString(offset + 10, $rpt_nm_elm_typ_nm4);
	}

	/**
	 * File name element type name 4 ファイル名称要素区分名４.<p>
	 *
	 */
	public void rpt_nm_elm_typ_nm4(String value) {
		setConstString(offset + 10, $rpt_nm_elm_typ_nm4, value);
	}


	/**
	 * File name element type 5 ファイル名称要素区分５.<p>
	 *
	 */
	public String rpt_nm_elm_typ5() {
		return getConstString(offset + 11, $rpt_nm_elm_typ5);
	}

	/**
	 * File name element type 5 ファイル名称要素区分５.<p>
	 *
	 */
	public void rpt_nm_elm_typ5(String value) {
		setConstString(offset + 11, $rpt_nm_elm_typ5, value);
	}


	/**
	 * File name element type name 5 ファイル名称要素区分名５.<p>
	 *
	 */
	public String rpt_nm_elm_typ_nm5() {
		return getConstString(offset + 12, $rpt_nm_elm_typ_nm5);
	}

	/**
	 * File name element type name 5 ファイル名称要素区分名５.<p>
	 *
	 */
	public void rpt_nm_elm_typ_nm5(String value) {
		setConstString(offset + 12, $rpt_nm_elm_typ_nm5, value);
	}


	/**
	 * File name element type 6 ファイル名称要素区分６.<p>
	 *
	 */
	public String rpt_nm_elm_typ6() {
		return getConstString(offset + 13, $rpt_nm_elm_typ6);
	}

	/**
	 * File name element type 6 ファイル名称要素区分６.<p>
	 *
	 */
	public void rpt_nm_elm_typ6(String value) {
		setConstString(offset + 13, $rpt_nm_elm_typ6, value);
	}


	/**
	 * File name element type name 6 ファイル名称要素区分名６.<p>
	 *
	 */
	public String rpt_nm_elm_typ_nm6() {
		return getConstString(offset + 14, $rpt_nm_elm_typ_nm6);
	}

	/**
	 * File name element type name 6 ファイル名称要素区分名６.<p>
	 *
	 */
	public void rpt_nm_elm_typ_nm6(String value) {
		setConstString(offset + 14, $rpt_nm_elm_typ_nm6, value);
	}


	/**
	 * File name element type 7 ファイル名称要素区分７.<p>
	 *
	 */
	public String rpt_nm_elm_typ7() {
		return getConstString(offset + 15, $rpt_nm_elm_typ7);
	}

	/**
	 * File name element type 7 ファイル名称要素区分７.<p>
	 *
	 */
	public void rpt_nm_elm_typ7(String value) {
		setConstString(offset + 15, $rpt_nm_elm_typ7, value);
	}


	/**
	 * File name element type name 7 ファイル名称要素区分名７.<p>
	 *
	 */
	public String rpt_nm_elm_typ_nm7() {
		return getConstString(offset + 16, $rpt_nm_elm_typ_nm7);
	}

	/**
	 * File name element type name 7 ファイル名称要素区分名７.<p>
	 *
	 */
	public void rpt_nm_elm_typ_nm7(String value) {
		setConstString(offset + 16, $rpt_nm_elm_typ_nm7, value);
	}


	/**
	 * File name element type 8 ファイル名称要素区分８.<p>
	 *
	 */
	public String rpt_nm_elm_typ8() {
		return getConstString(offset + 17, $rpt_nm_elm_typ8);
	}

	/**
	 * File name element type 8 ファイル名称要素区分８.<p>
	 *
	 */
	public void rpt_nm_elm_typ8(String value) {
		setConstString(offset + 17, $rpt_nm_elm_typ8, value);
	}


	/**
	 * File name element type name 8 ファイル名称要素区分名８.<p>
	 *
	 */
	public String rpt_nm_elm_typ_nm8() {
		return getConstString(offset + 18, $rpt_nm_elm_typ_nm8);
	}

	/**
	 * File name element type name 8 ファイル名称要素区分名８.<p>
	 *
	 */
	public void rpt_nm_elm_typ_nm8(String value) {
		setConstString(offset + 18, $rpt_nm_elm_typ_nm8, value);
	}


	/**
	 * File name element type 9 ファイル名称要素区分９.<p>
	 *
	 */
	public String rpt_nm_elm_typ9() {
		return getConstString(offset + 19, $rpt_nm_elm_typ9);
	}

	/**
	 * File name element type 9 ファイル名称要素区分９.<p>
	 *
	 */
	public void rpt_nm_elm_typ9(String value) {
		setConstString(offset + 19, $rpt_nm_elm_typ9, value);
	}


	/**
	 * File name element type name 9 ファイル名称要素区分名９.<p>
	 *
	 */
	public String rpt_nm_elm_typ_nm9() {
		return getConstString(offset + 20, $rpt_nm_elm_typ_nm9);
	}

	/**
	 * File name element type name 9 ファイル名称要素区分名９.<p>
	 *
	 */
	public void rpt_nm_elm_typ_nm9(String value) {
		setConstString(offset + 20, $rpt_nm_elm_typ_nm9, value);
	}


	/**
	 * File name element type 10 ファイル名称要素区分１０.<p>
	 *
	 */
	public String rpt_nm_elm_typ10() {
		return getConstString(offset + 21, $rpt_nm_elm_typ10);
	}

	/**
	 * File name element type 10 ファイル名称要素区分１０.<p>
	 *
	 */
	public void rpt_nm_elm_typ10(String value) {
		setConstString(offset + 21, $rpt_nm_elm_typ10, value);
	}


	/**
	 * File name element type name 10 ファイル名称要素区分名１０.<p>
	 *
	 */
	public String rpt_nm_elm_typ_nm10() {
		return getConstString(offset + 22, $rpt_nm_elm_typ_nm10);
	}

	/**
	 * File name element type name 10 ファイル名称要素区分名１０.<p>
	 *
	 */
	public void rpt_nm_elm_typ_nm10(String value) {
		setConstString(offset + 22, $rpt_nm_elm_typ_nm10, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 23, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 23, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 24, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 24, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 25, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 25, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 26, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 26, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 27, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 27, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 28, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 28, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 29, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 29, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 30, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 30, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 31, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 32, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 32, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 33, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 33, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 34, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 34, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 35, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 35, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 36, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 36, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 37, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 37, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 38, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 38, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 39, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 39, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 40, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 40, $del_ts, value);
	}


	public String getString(String name) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			return biz_typ_nm();
		}
		if ($rpt_nm_elm_typ1.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ1();
		}
		if ($rpt_nm_elm_typ_nm1.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm1();
		}
		if ($rpt_nm_elm_typ2.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ2();
		}
		if ($rpt_nm_elm_typ_nm2.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm2();
		}
		if ($rpt_nm_elm_typ3.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ3();
		}
		if ($rpt_nm_elm_typ_nm3.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm3();
		}
		if ($rpt_nm_elm_typ4.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ4();
		}
		if ($rpt_nm_elm_typ_nm4.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm4();
		}
		if ($rpt_nm_elm_typ5.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ5();
		}
		if ($rpt_nm_elm_typ_nm5.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm5();
		}
		if ($rpt_nm_elm_typ6.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ6();
		}
		if ($rpt_nm_elm_typ_nm6.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm6();
		}
		if ($rpt_nm_elm_typ7.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ7();
		}
		if ($rpt_nm_elm_typ_nm7.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm7();
		}
		if ($rpt_nm_elm_typ8.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ8();
		}
		if ($rpt_nm_elm_typ_nm8.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm8();
		}
		if ($rpt_nm_elm_typ9.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ9();
		}
		if ($rpt_nm_elm_typ_nm9.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm9();
		}
		if ($rpt_nm_elm_typ10.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ10();
		}
		if ($rpt_nm_elm_typ_nm10.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm10();
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			return biz_typ_nm();
		}
		if ($rpt_nm_elm_typ1.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ1();
		}
		if ($rpt_nm_elm_typ_nm1.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm1();
		}
		if ($rpt_nm_elm_typ2.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ2();
		}
		if ($rpt_nm_elm_typ_nm2.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm2();
		}
		if ($rpt_nm_elm_typ3.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ3();
		}
		if ($rpt_nm_elm_typ_nm3.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm3();
		}
		if ($rpt_nm_elm_typ4.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ4();
		}
		if ($rpt_nm_elm_typ_nm4.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm4();
		}
		if ($rpt_nm_elm_typ5.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ5();
		}
		if ($rpt_nm_elm_typ_nm5.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm5();
		}
		if ($rpt_nm_elm_typ6.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ6();
		}
		if ($rpt_nm_elm_typ_nm6.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm6();
		}
		if ($rpt_nm_elm_typ7.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ7();
		}
		if ($rpt_nm_elm_typ_nm7.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm7();
		}
		if ($rpt_nm_elm_typ8.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ8();
		}
		if ($rpt_nm_elm_typ_nm8.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm8();
		}
		if ($rpt_nm_elm_typ9.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ9();
		}
		if ($rpt_nm_elm_typ_nm9.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm9();
		}
		if ($rpt_nm_elm_typ10.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ10();
		}
		if ($rpt_nm_elm_typ_nm10.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ_nm10();
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			biz_typ_nm(value);
			return;
		}
		if ($rpt_nm_elm_typ1.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ1(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm1.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm1(value);
			return;
		}
		if ($rpt_nm_elm_typ2.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ2(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm2.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm2(value);
			return;
		}
		if ($rpt_nm_elm_typ3.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ3(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm3.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm3(value);
			return;
		}
		if ($rpt_nm_elm_typ4.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ4(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm4.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm4(value);
			return;
		}
		if ($rpt_nm_elm_typ5.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ5(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm5.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm5(value);
			return;
		}
		if ($rpt_nm_elm_typ6.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ6(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm6.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm6(value);
			return;
		}
		if ($rpt_nm_elm_typ7.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ7(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm7.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm7(value);
			return;
		}
		if ($rpt_nm_elm_typ8.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ8(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm8.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm8(value);
			return;
		}
		if ($rpt_nm_elm_typ9.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ9(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm9.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm9(value);
			return;
		}
		if ($rpt_nm_elm_typ10.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ10(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm10.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm10(value);
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			biz_typ_nm(value);
			return;
		}
		if ($rpt_nm_elm_typ1.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ1(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm1.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm1(value);
			return;
		}
		if ($rpt_nm_elm_typ2.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ2(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm2.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm2(value);
			return;
		}
		if ($rpt_nm_elm_typ3.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ3(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm3.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm3(value);
			return;
		}
		if ($rpt_nm_elm_typ4.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ4(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm4.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm4(value);
			return;
		}
		if ($rpt_nm_elm_typ5.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ5(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm5.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm5(value);
			return;
		}
		if ($rpt_nm_elm_typ6.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ6(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm6.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm6(value);
			return;
		}
		if ($rpt_nm_elm_typ7.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ7(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm7.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm7(value);
			return;
		}
		if ($rpt_nm_elm_typ8.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ8(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm8.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm8(value);
			return;
		}
		if ($rpt_nm_elm_typ9.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ9(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm9.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm9(value);
			return;
		}
		if ($rpt_nm_elm_typ10.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ10(value);
			return;
		}
		if ($rpt_nm_elm_typ_nm10.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ_nm10(value);
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

