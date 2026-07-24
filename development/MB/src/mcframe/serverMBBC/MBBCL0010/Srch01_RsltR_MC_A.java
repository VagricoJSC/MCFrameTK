package mcframe.serverMBBC.MBBCL0010;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 * Version 版.<p>
	 *
	 */
	public static final String $edition = "edition";
	/**
	 * Storage location file path 保存先ファイルパス.<p>
	 *
	 */
	public static final String $file_path = "file_path";
	/**
	 * Storage location file name 保存先ファイル名.<p>
	 *
	 */
	public static final String $file_nm = "file_nm";
	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public static final String $report_id = "report_id";
	/**
	 * Report name 帳票名.<p>
	 *
	 */
	public static final String $report_nm = "report_nm";
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
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public static final String $biz_key1 = "biz_key1";
	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public static final String $biz_key2 = "biz_key2";
	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public static final String $biz_key3 = "biz_key3";
	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public static final String $biz_key4 = "biz_key4";
	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public static final String $biz_key5 = "biz_key5";
	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public static final String $biz_key6 = "biz_key6";
	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public static final String $biz_key7 = "biz_key7";
	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public static final String $biz_key8 = "biz_key8";
	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public static final String $biz_key9 = "biz_key9";
	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public static final String $biz_key10 = "biz_key10";
	/**
	 * Transaction date 取引年月日.<p>
	 *
	 */
	public static final String $dt = "dt";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Transaction currency name 取引通貨名称.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public static final String $amt = "amt";
	/**
	 * File server ファイルサーバ.<p>
	 *
	 */
	public static final String $fs_flg = "fs_flg";
	/**
	 * Document ID ドキュメントＩＤ.<p>
	 *
	 */
	public static final String $doc_id = "doc_id";
	/**
	 * Preview URL link プレビューＵＲＬリンク.<p>
	 *
	 */
	public static final String $preview_url = "preview_url";
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public static final String $rmrks1 = "rmrks1";
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public static final String $rmrks2 = "rmrks2";
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public static final String $rmrks3 = "rmrks3";
	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public static final String $rmrks4 = "rmrks4";
	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public static final String $rmrks5 = "rmrks5";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $rpt_attr1 = "rpt_attr1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $rpt_attr2 = "rpt_attr2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $rpt_attr3 = "rpt_attr3";
	/**
	 * Spare 4 予備４.<p>
	 *
	 */
	public static final String $rpt_attr4 = "rpt_attr4";
	/**
	 * Spare 5 予備５.<p>
	 *
	 */
	public static final String $rpt_attr5 = "rpt_attr5";
	/**
	 * Spare 6 予備６.<p>
	 *
	 */
	public static final String $rpt_attr6 = "rpt_attr6";
	/**
	 * Spare 7 予備７.<p>
	 *
	 */
	public static final String $rpt_attr7 = "rpt_attr7";
	/**
	 * Spare 8 予備８.<p>
	 *
	 */
	public static final String $rpt_attr8 = "rpt_attr8";
	/**
	 * Spare 9 予備９.<p>
	 *
	 */
	public static final String $rpt_attr9 = "rpt_attr9";
	/**
	 * Spare 10 予備１０.<p>
	 *
	 */
	public static final String $rpt_attr10 = "rpt_attr10";
	/**
	 * Spare 11 予備１１.<p>
	 *
	 */
	public static final String $rpt_attr11 = "rpt_attr11";
	/**
	 * Spare 12 予備１２.<p>
	 *
	 */
	public static final String $rpt_attr12 = "rpt_attr12";
	/**
	 * Spare 13 予備１３.<p>
	 *
	 */
	public static final String $rpt_attr13 = "rpt_attr13";
	/**
	 * Spare 14 予備１４.<p>
	 *
	 */
	public static final String $rpt_attr14 = "rpt_attr14";
	/**
	 * Spare 15 予備１５.<p>
	 *
	 */
	public static final String $rpt_attr15 = "rpt_attr15";
	/**
	 * Spare 16 予備１６.<p>
	 *
	 */
	public static final String $rpt_attr16 = "rpt_attr16";
	/**
	 * Spare 17 予備１７.<p>
	 *
	 */
	public static final String $rpt_attr17 = "rpt_attr17";
	/**
	 * Spare 18 予備１８.<p>
	 *
	 */
	public static final String $rpt_attr18 = "rpt_attr18";
	/**
	 * Spare 19 予備１９.<p>
	 *
	 */
	public static final String $rpt_attr19 = "rpt_attr19";
	/**
	 * Spare 20 予備２０.<p>
	 *
	 */
	public static final String $rpt_attr20 = "rpt_attr20";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Data update type name データ更新区分名.<p>
	 *
	 */
	public static final String $data_crud_typ_nm = "data_crud_typ_nm";
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


	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IT_DAT_NO);
	public static final MCMeta edition_META = createCommonMeta($edition, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta file_path_META = createCommonMeta($file_path, mcframe.commonMA.meta.MA_META.FILE_PATH);
	public static final MCMeta file_nm_META = createCommonMeta($file_nm, mcframe.commonMA.meta.MA_META.FILE_NM);
	public static final MCMeta report_id_META = createCommonMeta($report_id, mcframe.commonMA.meta.MA_META.REPORT_ID);
	public static final MCMeta report_nm_META = createCommonMeta($report_nm, mcframe.commonMA.meta.MA_META.REPORT_NM);
	public static final MCMeta biz_typ_META = createCommonMeta($biz_typ, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta biz_typ_nm_META = createCommonMeta($biz_typ_nm, mcframe.commonMA.meta.MA_META.BIZ_TYP_NM);
	public static final MCMeta biz_key1_META = createCommonMeta($biz_key1, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta biz_key2_META = createCommonMeta($biz_key2, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta biz_key3_META = createCommonMeta($biz_key3, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta biz_key4_META = createCommonMeta($biz_key4, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta biz_key5_META = createCommonMeta($biz_key5, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta biz_key6_META = createCommonMeta($biz_key6, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta biz_key7_META = createCommonMeta($biz_key7, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta biz_key8_META = createCommonMeta($biz_key8, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta biz_key9_META = createCommonMeta($biz_key9, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta biz_key10_META = createCommonMeta($biz_key10, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta fs_flg_META = createCommonMeta($fs_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta doc_id_META = createCommonMeta($doc_id, mcframe.commonMA.meta.MA_META.DOC_ID);
	public static final MCMeta preview_url_META = createCommonMeta($preview_url, mcframe.commonMA.meta.MA_META.URL);
	public static final MCMeta rmrks1_META = createCommonMeta($rmrks1, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks2_META = createCommonMeta($rmrks2, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks3_META = createCommonMeta($rmrks3, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks4_META = createCommonMeta($rmrks4, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks5_META = createCommonMeta($rmrks5, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rpt_attr1_META = createCommonMeta($rpt_attr1, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR1);
	public static final MCMeta rpt_attr2_META = createCommonMeta($rpt_attr2, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR2);
	public static final MCMeta rpt_attr3_META = createCommonMeta($rpt_attr3, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR3);
	public static final MCMeta rpt_attr4_META = createCommonMeta($rpt_attr4, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR4);
	public static final MCMeta rpt_attr5_META = createCommonMeta($rpt_attr5, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR5);
	public static final MCMeta rpt_attr6_META = createCommonMeta($rpt_attr6, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR6);
	public static final MCMeta rpt_attr7_META = createCommonMeta($rpt_attr7, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR7);
	public static final MCMeta rpt_attr8_META = createCommonMeta($rpt_attr8, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR8);
	public static final MCMeta rpt_attr9_META = createCommonMeta($rpt_attr9, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR9);
	public static final MCMeta rpt_attr10_META = createCommonMeta($rpt_attr10, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR10);
	public static final MCMeta rpt_attr11_META = createCommonMeta($rpt_attr11, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR11);
	public static final MCMeta rpt_attr12_META = createCommonMeta($rpt_attr12, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR12);
	public static final MCMeta rpt_attr13_META = createCommonMeta($rpt_attr13, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR13);
	public static final MCMeta rpt_attr14_META = createCommonMeta($rpt_attr14, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR14);
	public static final MCMeta rpt_attr15_META = createCommonMeta($rpt_attr15, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR15);
	public static final MCMeta rpt_attr16_META = createCommonMeta($rpt_attr16, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR16);
	public static final MCMeta rpt_attr17_META = createCommonMeta($rpt_attr17, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR17);
	public static final MCMeta rpt_attr18_META = createCommonMeta($rpt_attr18, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR18);
	public static final MCMeta rpt_attr19_META = createCommonMeta($rpt_attr19, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR19);
	public static final MCMeta rpt_attr20_META = createCommonMeta($rpt_attr20, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR20);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta data_crud_typ_nm_META = createCommonMeta($data_crud_typ_nm, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP_NM);
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

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_no_META,
			edition_META,
			file_path_META,
			file_nm_META,
			report_id_META,
			report_nm_META,
			biz_typ_META,
			biz_typ_nm_META,
			biz_key1_META,
			biz_key2_META,
			biz_key3_META,
			biz_key4_META,
			biz_key5_META,
			biz_key6_META,
			biz_key7_META,
			biz_key8_META,
			biz_key9_META,
			biz_key10_META,
			dt_META,
			bp_cd_META,
			bp_nm_META,
			cur_cd_META,
			cur_nm_META,
			amt_META,
			fs_flg_META,
			doc_id_META,
			preview_url_META,
			rmrks1_META,
			rmrks2_META,
			rmrks3_META,
			rmrks4_META,
			rmrks5_META,
			rpt_attr1_META,
			rpt_attr2_META,
			rpt_attr3_META,
			rpt_attr4_META,
			rpt_attr5_META,
			rpt_attr6_META,
			rpt_attr7_META,
			rpt_attr8_META,
			rpt_attr9_META,
			rpt_attr10_META,
			rpt_attr11_META,
			rpt_attr12_META,
			rpt_attr13_META,
			rpt_attr14_META,
			rpt_attr15_META,
			rpt_attr16_META,
			rpt_attr17_META,
			rpt_attr18_META,
			rpt_attr19_META,
			rpt_attr20_META,
			data_crud_typ_META,
			data_crud_typ_nm_META,
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
			upd_srv_req_no_META
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
				{$data_crud_typ, "MAC_DATA_CRUD_TYP"}	// data_crud_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public String data_no() {
		return getConstString(offset + 0, $data_no);
	}

	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public void data_no(String value) {
		setConstString(offset + 0, $data_no, value);
	}


	/**
	 * Version 版.<p>
	 *
	 */
	public MCNumber edition() {
		return getConstNumber(offset + 1, $edition);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void edition(MCNumber value) {
		setConstNumber(offset + 1, $edition, value);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void edition(int value) {
		setConstNumber(offset + 1, $edition, value);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void edition(long value) {
		setConstNumber(offset + 1, $edition, value);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void edition(float value) {
		setConstNumber(offset + 1, $edition, value);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void edition(double value) {
		setConstNumber(offset + 1, $edition, value);
	}


	/**
	 * Storage location file path 保存先ファイルパス.<p>
	 *
	 */
	public String file_path() {
		return getConstString(offset + 2, $file_path);
	}

	/**
	 * Storage location file path 保存先ファイルパス.<p>
	 *
	 */
	public void file_path(String value) {
		setConstString(offset + 2, $file_path, value);
	}


	/**
	 * Storage location file name 保存先ファイル名.<p>
	 *
	 */
	public String file_nm() {
		return getConstString(offset + 3, $file_nm);
	}

	/**
	 * Storage location file name 保存先ファイル名.<p>
	 *
	 */
	public void file_nm(String value) {
		setConstString(offset + 3, $file_nm, value);
	}


	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public String report_id() {
		return getConstString(offset + 4, $report_id);
	}

	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public void report_id(String value) {
		setConstString(offset + 4, $report_id, value);
	}


	/**
	 * Report name 帳票名.<p>
	 *
	 */
	public String report_nm() {
		return getConstString(offset + 5, $report_nm);
	}

	/**
	 * Report name 帳票名.<p>
	 *
	 */
	public void report_nm(String value) {
		setConstString(offset + 5, $report_nm, value);
	}


	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public String biz_typ() {
		return getConstString(offset + 6, $biz_typ);
	}

	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public void biz_typ(String value) {
		setConstString(offset + 6, $biz_typ, value);
	}


	/**
	 * Business type name 業務区分名.<p>
	 *
	 */
	public String biz_typ_nm() {
		return getConstString(offset + 7, $biz_typ_nm);
	}

	/**
	 * Business type name 業務区分名.<p>
	 *
	 */
	public void biz_typ_nm(String value) {
		setConstString(offset + 7, $biz_typ_nm, value);
	}


	/**
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public String biz_key1() {
		return getConstString(offset + 8, $biz_key1);
	}

	/**
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public void biz_key1(String value) {
		setConstString(offset + 8, $biz_key1, value);
	}


	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public String biz_key2() {
		return getConstString(offset + 9, $biz_key2);
	}

	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public void biz_key2(String value) {
		setConstString(offset + 9, $biz_key2, value);
	}


	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public String biz_key3() {
		return getConstString(offset + 10, $biz_key3);
	}

	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public void biz_key3(String value) {
		setConstString(offset + 10, $biz_key3, value);
	}


	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public String biz_key4() {
		return getConstString(offset + 11, $biz_key4);
	}

	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public void biz_key4(String value) {
		setConstString(offset + 11, $biz_key4, value);
	}


	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public String biz_key5() {
		return getConstString(offset + 12, $biz_key5);
	}

	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public void biz_key5(String value) {
		setConstString(offset + 12, $biz_key5, value);
	}


	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public String biz_key6() {
		return getConstString(offset + 13, $biz_key6);
	}

	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public void biz_key6(String value) {
		setConstString(offset + 13, $biz_key6, value);
	}


	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public String biz_key7() {
		return getConstString(offset + 14, $biz_key7);
	}

	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public void biz_key7(String value) {
		setConstString(offset + 14, $biz_key7, value);
	}


	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public String biz_key8() {
		return getConstString(offset + 15, $biz_key8);
	}

	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public void biz_key8(String value) {
		setConstString(offset + 15, $biz_key8, value);
	}


	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public String biz_key9() {
		return getConstString(offset + 16, $biz_key9);
	}

	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public void biz_key9(String value) {
		setConstString(offset + 16, $biz_key9, value);
	}


	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public String biz_key10() {
		return getConstString(offset + 17, $biz_key10);
	}

	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public void biz_key10(String value) {
		setConstString(offset + 17, $biz_key10, value);
	}


	/**
	 * Transaction date 取引年月日.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 18, $dt);
	}

	/**
	 * Transaction date 取引年月日.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 18, $dt, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 19, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 19, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 20, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 20, $bp_nm, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 21, $cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 21, $cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名称.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 22, $cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名称.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 22, $cur_nm, value);
	}


	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 23, $amt);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 23, $amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 23, $amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 23, $amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 23, $amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 23, $amt, value);
	}


	/**
	 * File server ファイルサーバ.<p>
	 *
	 */
	public boolean fs_flg() {
		return getConstBoolean(offset + 24, $fs_flg);
	}

	/**
	 * File server ファイルサーバ.<p>
	 *
	 */
	public void fs_flg(boolean value) {
		setConstBoolean(offset + 24, $fs_flg, value);
	}


	/**
	 * Document ID ドキュメントＩＤ.<p>
	 *
	 */
	public String doc_id() {
		return getConstString(offset + 25, $doc_id);
	}

	/**
	 * Document ID ドキュメントＩＤ.<p>
	 *
	 */
	public void doc_id(String value) {
		setConstString(offset + 25, $doc_id, value);
	}


	/**
	 * Preview URL link プレビューＵＲＬリンク.<p>
	 *
	 */
	public String preview_url() {
		return getConstString(offset + 26, $preview_url);
	}

	/**
	 * Preview URL link プレビューＵＲＬリンク.<p>
	 *
	 */
	public void preview_url(String value) {
		setConstString(offset + 26, $preview_url, value);
	}


	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public String rmrks1() {
		return getConstString(offset + 27, $rmrks1);
	}

	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public void rmrks1(String value) {
		setConstString(offset + 27, $rmrks1, value);
	}


	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public String rmrks2() {
		return getConstString(offset + 28, $rmrks2);
	}

	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public void rmrks2(String value) {
		setConstString(offset + 28, $rmrks2, value);
	}


	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public String rmrks3() {
		return getConstString(offset + 29, $rmrks3);
	}

	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public void rmrks3(String value) {
		setConstString(offset + 29, $rmrks3, value);
	}


	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public String rmrks4() {
		return getConstString(offset + 30, $rmrks4);
	}

	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public void rmrks4(String value) {
		setConstString(offset + 30, $rmrks4, value);
	}


	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public String rmrks5() {
		return getConstString(offset + 31, $rmrks5);
	}

	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public void rmrks5(String value) {
		setConstString(offset + 31, $rmrks5, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String rpt_attr1() {
		return getConstString(offset + 32, $rpt_attr1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void rpt_attr1(String value) {
		setConstString(offset + 32, $rpt_attr1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String rpt_attr2() {
		return getConstString(offset + 33, $rpt_attr2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void rpt_attr2(String value) {
		setConstString(offset + 33, $rpt_attr2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String rpt_attr3() {
		return getConstString(offset + 34, $rpt_attr3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void rpt_attr3(String value) {
		setConstString(offset + 34, $rpt_attr3, value);
	}


	/**
	 * Spare 4 予備４.<p>
	 *
	 */
	public String rpt_attr4() {
		return getConstString(offset + 35, $rpt_attr4);
	}

	/**
	 * Spare 4 予備４.<p>
	 *
	 */
	public void rpt_attr4(String value) {
		setConstString(offset + 35, $rpt_attr4, value);
	}


	/**
	 * Spare 5 予備５.<p>
	 *
	 */
	public String rpt_attr5() {
		return getConstString(offset + 36, $rpt_attr5);
	}

	/**
	 * Spare 5 予備５.<p>
	 *
	 */
	public void rpt_attr5(String value) {
		setConstString(offset + 36, $rpt_attr5, value);
	}


	/**
	 * Spare 6 予備６.<p>
	 *
	 */
	public String rpt_attr6() {
		return getConstString(offset + 37, $rpt_attr6);
	}

	/**
	 * Spare 6 予備６.<p>
	 *
	 */
	public void rpt_attr6(String value) {
		setConstString(offset + 37, $rpt_attr6, value);
	}


	/**
	 * Spare 7 予備７.<p>
	 *
	 */
	public String rpt_attr7() {
		return getConstString(offset + 38, $rpt_attr7);
	}

	/**
	 * Spare 7 予備７.<p>
	 *
	 */
	public void rpt_attr7(String value) {
		setConstString(offset + 38, $rpt_attr7, value);
	}


	/**
	 * Spare 8 予備８.<p>
	 *
	 */
	public String rpt_attr8() {
		return getConstString(offset + 39, $rpt_attr8);
	}

	/**
	 * Spare 8 予備８.<p>
	 *
	 */
	public void rpt_attr8(String value) {
		setConstString(offset + 39, $rpt_attr8, value);
	}


	/**
	 * Spare 9 予備９.<p>
	 *
	 */
	public String rpt_attr9() {
		return getConstString(offset + 40, $rpt_attr9);
	}

	/**
	 * Spare 9 予備９.<p>
	 *
	 */
	public void rpt_attr9(String value) {
		setConstString(offset + 40, $rpt_attr9, value);
	}


	/**
	 * Spare 10 予備１０.<p>
	 *
	 */
	public String rpt_attr10() {
		return getConstString(offset + 41, $rpt_attr10);
	}

	/**
	 * Spare 10 予備１０.<p>
	 *
	 */
	public void rpt_attr10(String value) {
		setConstString(offset + 41, $rpt_attr10, value);
	}


	/**
	 * Spare 11 予備１１.<p>
	 *
	 */
	public String rpt_attr11() {
		return getConstString(offset + 42, $rpt_attr11);
	}

	/**
	 * Spare 11 予備１１.<p>
	 *
	 */
	public void rpt_attr11(String value) {
		setConstString(offset + 42, $rpt_attr11, value);
	}


	/**
	 * Spare 12 予備１２.<p>
	 *
	 */
	public String rpt_attr12() {
		return getConstString(offset + 43, $rpt_attr12);
	}

	/**
	 * Spare 12 予備１２.<p>
	 *
	 */
	public void rpt_attr12(String value) {
		setConstString(offset + 43, $rpt_attr12, value);
	}


	/**
	 * Spare 13 予備１３.<p>
	 *
	 */
	public String rpt_attr13() {
		return getConstString(offset + 44, $rpt_attr13);
	}

	/**
	 * Spare 13 予備１３.<p>
	 *
	 */
	public void rpt_attr13(String value) {
		setConstString(offset + 44, $rpt_attr13, value);
	}


	/**
	 * Spare 14 予備１４.<p>
	 *
	 */
	public String rpt_attr14() {
		return getConstString(offset + 45, $rpt_attr14);
	}

	/**
	 * Spare 14 予備１４.<p>
	 *
	 */
	public void rpt_attr14(String value) {
		setConstString(offset + 45, $rpt_attr14, value);
	}


	/**
	 * Spare 15 予備１５.<p>
	 *
	 */
	public String rpt_attr15() {
		return getConstString(offset + 46, $rpt_attr15);
	}

	/**
	 * Spare 15 予備１５.<p>
	 *
	 */
	public void rpt_attr15(String value) {
		setConstString(offset + 46, $rpt_attr15, value);
	}


	/**
	 * Spare 16 予備１６.<p>
	 *
	 */
	public String rpt_attr16() {
		return getConstString(offset + 47, $rpt_attr16);
	}

	/**
	 * Spare 16 予備１６.<p>
	 *
	 */
	public void rpt_attr16(String value) {
		setConstString(offset + 47, $rpt_attr16, value);
	}


	/**
	 * Spare 17 予備１７.<p>
	 *
	 */
	public String rpt_attr17() {
		return getConstString(offset + 48, $rpt_attr17);
	}

	/**
	 * Spare 17 予備１７.<p>
	 *
	 */
	public void rpt_attr17(String value) {
		setConstString(offset + 48, $rpt_attr17, value);
	}


	/**
	 * Spare 18 予備１８.<p>
	 *
	 */
	public String rpt_attr18() {
		return getConstString(offset + 49, $rpt_attr18);
	}

	/**
	 * Spare 18 予備１８.<p>
	 *
	 */
	public void rpt_attr18(String value) {
		setConstString(offset + 49, $rpt_attr18, value);
	}


	/**
	 * Spare 19 予備１９.<p>
	 *
	 */
	public String rpt_attr19() {
		return getConstString(offset + 50, $rpt_attr19);
	}

	/**
	 * Spare 19 予備１９.<p>
	 *
	 */
	public void rpt_attr19(String value) {
		setConstString(offset + 50, $rpt_attr19, value);
	}


	/**
	 * Spare 20 予備２０.<p>
	 *
	 */
	public String rpt_attr20() {
		return getConstString(offset + 51, $rpt_attr20);
	}

	/**
	 * Spare 20 予備２０.<p>
	 *
	 */
	public void rpt_attr20(String value) {
		setConstString(offset + 51, $rpt_attr20, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 52, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 52, $data_crud_typ, value);
	}


	/**
	 * Data update type name データ更新区分名.<p>
	 *
	 */
	public String data_crud_typ_nm() {
		return getConstString(offset + 53, $data_crud_typ_nm);
	}

	/**
	 * Data update type name データ更新区分名.<p>
	 *
	 */
	public void data_crud_typ_nm(String value) {
		setConstString(offset + 53, $data_crud_typ_nm, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 54, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 54, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 55, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 55, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 56, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 56, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 57, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 57, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 58, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 58, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 59, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 60, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 60, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 61, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 61, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 62, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 62, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 63, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 63, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 64, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 64, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 65, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 65, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($file_path.equalsIgnoreCase(name)) {
			return file_path();
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($report_id.equalsIgnoreCase(name)) {
			return report_id();
		}
		if ($report_nm.equalsIgnoreCase(name)) {
			return report_nm();
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			return biz_typ_nm();
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			return biz_key1();
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			return biz_key2();
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			return biz_key3();
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			return biz_key4();
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			return biz_key5();
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			return biz_key6();
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			return biz_key7();
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			return biz_key8();
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			return biz_key9();
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			return biz_key10();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($doc_id.equalsIgnoreCase(name)) {
			return doc_id();
		}
		if ($preview_url.equalsIgnoreCase(name)) {
			return preview_url();
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			return rmrks1();
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			return rmrks2();
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			return rmrks3();
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			return rmrks4();
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			return rmrks5();
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			return rpt_attr1();
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			return rpt_attr2();
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			return rpt_attr3();
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			return rpt_attr4();
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			return rpt_attr5();
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			return rpt_attr6();
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			return rpt_attr7();
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			return rpt_attr8();
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			return rpt_attr9();
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			return rpt_attr10();
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			return rpt_attr11();
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			return rpt_attr12();
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			return rpt_attr13();
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			return rpt_attr14();
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			return rpt_attr15();
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			return rpt_attr16();
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			return rpt_attr17();
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			return rpt_attr18();
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			return rpt_attr19();
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			return rpt_attr20();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($data_crud_typ_nm.equalsIgnoreCase(name)) {
			return data_crud_typ_nm();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($edition.equalsIgnoreCase(name)) {
			return edition();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($fs_flg.equalsIgnoreCase(name)) {
			return fs_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($file_path.equalsIgnoreCase(name)) {
			return file_path();
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($report_id.equalsIgnoreCase(name)) {
			return report_id();
		}
		if ($report_nm.equalsIgnoreCase(name)) {
			return report_nm();
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			return biz_typ_nm();
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			return biz_key1();
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			return biz_key2();
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			return biz_key3();
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			return biz_key4();
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			return biz_key5();
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			return biz_key6();
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			return biz_key7();
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			return biz_key8();
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			return biz_key9();
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			return biz_key10();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($doc_id.equalsIgnoreCase(name)) {
			return doc_id();
		}
		if ($preview_url.equalsIgnoreCase(name)) {
			return preview_url();
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			return rmrks1();
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			return rmrks2();
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			return rmrks3();
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			return rmrks4();
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			return rmrks5();
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			return rpt_attr1();
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			return rpt_attr2();
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			return rpt_attr3();
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			return rpt_attr4();
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			return rpt_attr5();
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			return rpt_attr6();
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			return rpt_attr7();
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			return rpt_attr8();
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			return rpt_attr9();
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			return rpt_attr10();
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			return rpt_attr11();
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			return rpt_attr12();
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			return rpt_attr13();
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			return rpt_attr14();
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			return rpt_attr15();
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			return rpt_attr16();
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			return rpt_attr17();
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			return rpt_attr18();
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			return rpt_attr19();
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			return rpt_attr20();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($data_crud_typ_nm.equalsIgnoreCase(name)) {
			return data_crud_typ_nm();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($edition.equalsIgnoreCase(name)) {
			return edition();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($fs_flg.equalsIgnoreCase(name)) {
			return fs_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($file_path.equalsIgnoreCase(name)) {
			file_path(value);
			return;
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
			return;
		}
		if ($report_id.equalsIgnoreCase(name)) {
			report_id(value);
			return;
		}
		if ($report_nm.equalsIgnoreCase(name)) {
			report_nm(value);
			return;
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			biz_typ_nm(value);
			return;
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			biz_key1(value);
			return;
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			biz_key2(value);
			return;
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			biz_key3(value);
			return;
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			biz_key4(value);
			return;
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			biz_key5(value);
			return;
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			biz_key6(value);
			return;
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			biz_key7(value);
			return;
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			biz_key8(value);
			return;
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			biz_key9(value);
			return;
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			biz_key10(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($doc_id.equalsIgnoreCase(name)) {
			doc_id(value);
			return;
		}
		if ($preview_url.equalsIgnoreCase(name)) {
			preview_url(value);
			return;
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			rmrks1(value);
			return;
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			rmrks2(value);
			return;
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			rmrks3(value);
			return;
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			rmrks4(value);
			return;
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			rmrks5(value);
			return;
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			rpt_attr1(value);
			return;
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			rpt_attr2(value);
			return;
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			rpt_attr3(value);
			return;
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			rpt_attr4(value);
			return;
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			rpt_attr5(value);
			return;
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			rpt_attr6(value);
			return;
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			rpt_attr7(value);
			return;
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			rpt_attr8(value);
			return;
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			rpt_attr9(value);
			return;
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			rpt_attr10(value);
			return;
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			rpt_attr11(value);
			return;
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			rpt_attr12(value);
			return;
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			rpt_attr13(value);
			return;
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			rpt_attr14(value);
			return;
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			rpt_attr15(value);
			return;
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			rpt_attr16(value);
			return;
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			rpt_attr17(value);
			return;
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			rpt_attr18(value);
			return;
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			rpt_attr19(value);
			return;
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			rpt_attr20(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($data_crud_typ_nm.equalsIgnoreCase(name)) {
			data_crud_typ_nm(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDate(name, value);
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
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($fs_flg.equalsIgnoreCase(name)) {
			fs_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($file_path.equalsIgnoreCase(name)) {
			file_path(value);
			return;
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
			return;
		}
		if ($report_id.equalsIgnoreCase(name)) {
			report_id(value);
			return;
		}
		if ($report_nm.equalsIgnoreCase(name)) {
			report_nm(value);
			return;
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			biz_typ_nm(value);
			return;
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			biz_key1(value);
			return;
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			biz_key2(value);
			return;
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			biz_key3(value);
			return;
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			biz_key4(value);
			return;
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			biz_key5(value);
			return;
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			biz_key6(value);
			return;
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			biz_key7(value);
			return;
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			biz_key8(value);
			return;
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			biz_key9(value);
			return;
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			biz_key10(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($doc_id.equalsIgnoreCase(name)) {
			doc_id(value);
			return;
		}
		if ($preview_url.equalsIgnoreCase(name)) {
			preview_url(value);
			return;
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			rmrks1(value);
			return;
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			rmrks2(value);
			return;
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			rmrks3(value);
			return;
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			rmrks4(value);
			return;
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			rmrks5(value);
			return;
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			rpt_attr1(value);
			return;
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			rpt_attr2(value);
			return;
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			rpt_attr3(value);
			return;
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			rpt_attr4(value);
			return;
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			rpt_attr5(value);
			return;
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			rpt_attr6(value);
			return;
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			rpt_attr7(value);
			return;
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			rpt_attr8(value);
			return;
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			rpt_attr9(value);
			return;
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			rpt_attr10(value);
			return;
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			rpt_attr11(value);
			return;
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			rpt_attr12(value);
			return;
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			rpt_attr13(value);
			return;
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			rpt_attr14(value);
			return;
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			rpt_attr15(value);
			return;
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			rpt_attr16(value);
			return;
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			rpt_attr17(value);
			return;
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			rpt_attr18(value);
			return;
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			rpt_attr19(value);
			return;
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			rpt_attr20(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($data_crud_typ_nm.equalsIgnoreCase(name)) {
			data_crud_typ_nm(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDateNE(name, value);
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
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($fs_flg.equalsIgnoreCase(name)) {
			fs_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

