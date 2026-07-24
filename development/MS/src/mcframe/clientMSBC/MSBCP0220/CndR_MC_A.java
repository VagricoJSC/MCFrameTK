package mcframe.clientMSBC.MSBCP0220;

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
	 * MRP type ＭＲＰ区分.<p>
	 *
	 */
	public static final String $mrp_typ = "mrp_typ";
	/**
	 * MRP type name ＭＲＰ区分名.<p>
	 *
	 */
	public static final String $mrp_typ_nm = "mrp_typ_nm";
	/**
	 * MRP calculation No. ＭＲＰ計算ＮＯ.<p>
	 *
	 */
	public static final String $mrp_calc_no = "mrp_calc_no";
	/**
	 * Log time FROM ログ時間ＦＲＯＭ.<p>
	 *
	 */
	public static final String $log_time_fr = "log_time_fr";
	/**
	 * Log time TO ログ時間ＴＯ.<p>
	 *
	 */
	public static final String $log_time_to = "log_time_to";
	/**
	 * Process group cd. 処理グループＣＤ.<p>
	 *
	 */
	public static final String $gp_batch_grp_cd = "gp_batch_grp_cd";
	/**
	 * Process group name 処理グループ名.<p>
	 *
	 */
	public static final String $gp_batch_grp_nm = "gp_batch_grp_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public static final String $msg_id = "msg_id";
	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public static final String $req_no = "req_no";
	/**
	 * Search string 1 検索文字列１.<p>
	 *
	 */
	public static final String $msg1 = "msg1";
	/**
	 * Search string 2 検索文字列２.<p>
	 *
	 */
	public static final String $msg2 = "msg2";
	/**
	 * Search string 3 検索文字列３.<p>
	 *
	 */
	public static final String $msg3 = "msg3";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";


	public static final MCMeta mrp_typ_META = createCommonMeta($mrp_typ, mcframe.commonMS.meta.MS_META.MRP_TYP);
	public static final MCMeta mrp_typ_nm_META = createCommonMeta($mrp_typ_nm, mcframe.commonMS.meta.MS_META.MRP_TYP_NM);
	public static final MCMeta mrp_calc_no_META = createCommonMeta($mrp_calc_no, mcframe.commonMA.meta.MA_META.MRP_CALC_NO);
	public static final MCMeta log_time_fr_META = createCommonMeta($log_time_fr, mcframe.commonMA.meta.MA_META.YMDHMS);
	public static final MCMeta log_time_to_META = createCommonMeta($log_time_to, mcframe.commonMA.meta.MA_META.YMDHMS);
	public static final MCMeta gp_batch_grp_cd_META = createCommonMeta($gp_batch_grp_cd, mcframe.commonMA.meta.MA_META.GP_BATCH_GRP_CD);
	public static final MCMeta gp_batch_grp_nm_META = createCommonMeta($gp_batch_grp_nm, mcframe.commonMA.meta.MA_META.GP_BATCH_GRP_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta msg_id_META = createCommonMeta($msg_id, mcframe.commonMA.meta.MA_META.MSG_ID);
	public static final MCMeta req_no_META = createCommonMeta($req_no, mcframe.commonCore.meta.M_META.SRV_REQ_NO);
	public static final MCMeta msg1_META = createCommonMeta($msg1, mcframe.commonMA.meta.MA_META.MSG);
	public static final MCMeta msg2_META = createCommonMeta($msg2, mcframe.commonMA.meta.MA_META.MSG);
	public static final MCMeta msg3_META = createCommonMeta($msg3, mcframe.commonMA.meta.MA_META.MSG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.MRPLOG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.MRPLOG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.MRPLOG_SUB_CHAR3);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mrp_typ_META,
			mrp_typ_nm_META,
			mrp_calc_no_META,
			log_time_fr_META,
			log_time_to_META,
			gp_batch_grp_cd_META,
			gp_batch_grp_nm_META,
			wg_cd_META,
			wg_nm_META,
			msg_id_META,
			req_no_META,
			msg1_META,
			msg2_META,
			msg3_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META
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

	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	 * MRP type ＭＲＰ区分.<p>
	 *
	 */
	public String mrp_typ() {
		return getConstString(offset + 0, $mrp_typ);
	}

	/**
	 * MRP type ＭＲＰ区分.<p>
	 *
	 */
	public void mrp_typ(String value) {
		setConstString(offset + 0, $mrp_typ, value);
	}


	/**
	 * MRP type name ＭＲＰ区分名.<p>
	 *
	 */
	public String mrp_typ_nm() {
		return getConstString(offset + 1, $mrp_typ_nm);
	}

	/**
	 * MRP type name ＭＲＰ区分名.<p>
	 *
	 */
	public void mrp_typ_nm(String value) {
		setConstString(offset + 1, $mrp_typ_nm, value);
	}


	/**
	 * MRP calculation No. ＭＲＰ計算ＮＯ.<p>
	 *
	 */
	public String mrp_calc_no() {
		return getConstString(offset + 2, $mrp_calc_no);
	}

	/**
	 * MRP calculation No. ＭＲＰ計算ＮＯ.<p>
	 *
	 */
	public void mrp_calc_no(String value) {
		setConstString(offset + 2, $mrp_calc_no, value);
	}


	/**
	 * Log time FROM ログ時間ＦＲＯＭ.<p>
	 *
	 */
	public MCDate log_time_fr() {
		return getConstDate(offset + 3, $log_time_fr);
	}

	/**
	 * Log time FROM ログ時間ＦＲＯＭ.<p>
	 *
	 */
	public void log_time_fr(MCDate value) {
		setConstDate(offset + 3, $log_time_fr, value);
	}


	/**
	 * Log time TO ログ時間ＴＯ.<p>
	 *
	 */
	public MCDate log_time_to() {
		return getConstDate(offset + 4, $log_time_to);
	}

	/**
	 * Log time TO ログ時間ＴＯ.<p>
	 *
	 */
	public void log_time_to(MCDate value) {
		setConstDate(offset + 4, $log_time_to, value);
	}


	/**
	 * Process group cd. 処理グループＣＤ.<p>
	 *
	 */
	public String gp_batch_grp_cd() {
		return getConstString(offset + 5, $gp_batch_grp_cd);
	}

	/**
	 * Process group cd. 処理グループＣＤ.<p>
	 *
	 */
	public void gp_batch_grp_cd(String value) {
		setConstString(offset + 5, $gp_batch_grp_cd, value);
	}


	/**
	 * Process group name 処理グループ名.<p>
	 *
	 */
	public String gp_batch_grp_nm() {
		return getConstString(offset + 6, $gp_batch_grp_nm);
	}

	/**
	 * Process group name 処理グループ名.<p>
	 *
	 */
	public void gp_batch_grp_nm(String value) {
		setConstString(offset + 6, $gp_batch_grp_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 7, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 7, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 8, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 8, $wg_nm, value);
	}


	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public String msg_id() {
		return getConstString(offset + 9, $msg_id);
	}

	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public void msg_id(String value) {
		setConstString(offset + 9, $msg_id, value);
	}


	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public String req_no() {
		return getConstString(offset + 10, $req_no);
	}

	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public void req_no(String value) {
		setConstString(offset + 10, $req_no, value);
	}


	/**
	 * Search string 1 検索文字列１.<p>
	 *
	 */
	public String msg1() {
		return getConstString(offset + 11, $msg1);
	}

	/**
	 * Search string 1 検索文字列１.<p>
	 *
	 */
	public void msg1(String value) {
		setConstString(offset + 11, $msg1, value);
	}


	/**
	 * Search string 2 検索文字列２.<p>
	 *
	 */
	public String msg2() {
		return getConstString(offset + 12, $msg2);
	}

	/**
	 * Search string 2 検索文字列２.<p>
	 *
	 */
	public void msg2(String value) {
		setConstString(offset + 12, $msg2, value);
	}


	/**
	 * Search string 3 検索文字列３.<p>
	 *
	 */
	public String msg3() {
		return getConstString(offset + 13, $msg3);
	}

	/**
	 * Search string 3 検索文字列３.<p>
	 *
	 */
	public void msg3(String value) {
		setConstString(offset + 13, $msg3, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 14, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 14, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 15, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 15, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 16, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 16, $sub_char3, value);
	}


	public String getString(String name) {
		if ($mrp_typ.equalsIgnoreCase(name)) {
			return mrp_typ();
		}
		if ($mrp_typ_nm.equalsIgnoreCase(name)) {
			return mrp_typ_nm();
		}
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			return mrp_calc_no();
		}
		if ($gp_batch_grp_cd.equalsIgnoreCase(name)) {
			return gp_batch_grp_cd();
		}
		if ($gp_batch_grp_nm.equalsIgnoreCase(name)) {
			return gp_batch_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			return msg_id();
		}
		if ($req_no.equalsIgnoreCase(name)) {
			return req_no();
		}
		if ($msg1.equalsIgnoreCase(name)) {
			return msg1();
		}
		if ($msg2.equalsIgnoreCase(name)) {
			return msg2();
		}
		if ($msg3.equalsIgnoreCase(name)) {
			return msg3();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($log_time_fr.equalsIgnoreCase(name)) {
			return log_time_fr();
		}
		if ($log_time_to.equalsIgnoreCase(name)) {
			return log_time_to();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($mrp_typ.equalsIgnoreCase(name)) {
			return mrp_typ();
		}
		if ($mrp_typ_nm.equalsIgnoreCase(name)) {
			return mrp_typ_nm();
		}
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			return mrp_calc_no();
		}
		if ($gp_batch_grp_cd.equalsIgnoreCase(name)) {
			return gp_batch_grp_cd();
		}
		if ($gp_batch_grp_nm.equalsIgnoreCase(name)) {
			return gp_batch_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			return msg_id();
		}
		if ($req_no.equalsIgnoreCase(name)) {
			return req_no();
		}
		if ($msg1.equalsIgnoreCase(name)) {
			return msg1();
		}
		if ($msg2.equalsIgnoreCase(name)) {
			return msg2();
		}
		if ($msg3.equalsIgnoreCase(name)) {
			return msg3();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($log_time_fr.equalsIgnoreCase(name)) {
			return log_time_fr();
		}
		if ($log_time_to.equalsIgnoreCase(name)) {
			return log_time_to();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($mrp_typ.equalsIgnoreCase(name)) {
			mrp_typ(value);
			return;
		}
		if ($mrp_typ_nm.equalsIgnoreCase(name)) {
			mrp_typ_nm(value);
			return;
		}
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			mrp_calc_no(value);
			return;
		}
		if ($gp_batch_grp_cd.equalsIgnoreCase(name)) {
			gp_batch_grp_cd(value);
			return;
		}
		if ($gp_batch_grp_nm.equalsIgnoreCase(name)) {
			gp_batch_grp_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			msg_id(value);
			return;
		}
		if ($req_no.equalsIgnoreCase(name)) {
			req_no(value);
			return;
		}
		if ($msg1.equalsIgnoreCase(name)) {
			msg1(value);
			return;
		}
		if ($msg2.equalsIgnoreCase(name)) {
			msg2(value);
			return;
		}
		if ($msg3.equalsIgnoreCase(name)) {
			msg3(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($log_time_fr.equalsIgnoreCase(name)) {
			log_time_fr(value);
			return;
		}
		if ($log_time_to.equalsIgnoreCase(name)) {
			log_time_to(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mrp_typ.equalsIgnoreCase(name)) {
			mrp_typ(value);
			return;
		}
		if ($mrp_typ_nm.equalsIgnoreCase(name)) {
			mrp_typ_nm(value);
			return;
		}
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			mrp_calc_no(value);
			return;
		}
		if ($gp_batch_grp_cd.equalsIgnoreCase(name)) {
			gp_batch_grp_cd(value);
			return;
		}
		if ($gp_batch_grp_nm.equalsIgnoreCase(name)) {
			gp_batch_grp_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			msg_id(value);
			return;
		}
		if ($req_no.equalsIgnoreCase(name)) {
			req_no(value);
			return;
		}
		if ($msg1.equalsIgnoreCase(name)) {
			msg1(value);
			return;
		}
		if ($msg2.equalsIgnoreCase(name)) {
			msg2(value);
			return;
		}
		if ($msg3.equalsIgnoreCase(name)) {
			msg3(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($log_time_fr.equalsIgnoreCase(name)) {
			log_time_fr(value);
			return;
		}
		if ($log_time_to.equalsIgnoreCase(name)) {
			log_time_to(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

