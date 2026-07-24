package mcframe.serverPFUD.PFUDL0030;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public static final String $if_proc_typ = "if_proc_typ";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * Uncorrectable after exporting 送信後訂正不可.<p>
	 *
	 */
	public static final String $not_send_upd_flg = "not_send_upd_flg";
	/**
	 * Exporting/importing client ID 送受信クライアントＩＤ.<p>
	 *
	 */
	public static final String $sdrv_clt_id = "sdrv_clt_id";
	/**
	 * Exporting/importing user ID 送受信ユーザＩＤ.<p>
	 *
	 */
	public static final String $sdrv_usr_id = "sdrv_usr_id";
	/**
	 * Exporting/importing user name 送受信ユーザ名.<p>
	 *
	 */
	public static final String $sdrv_usr_nm = "sdrv_usr_nm";
	/**
	 * Business info. character string 1 業務情報文字列１.<p>
	 *
	 */
	public static final String $attr_char1 = "attr_char1";
	/**
	 * Business info. character string 2 業務情報文字列２.<p>
	 *
	 */
	public static final String $attr_char2 = "attr_char2";
	/**
	 * Business info. character string 3 業務情報文字列３.<p>
	 *
	 */
	public static final String $attr_char3 = "attr_char3";
	/**
	 * Business info. character string 4 業務情報文字列４.<p>
	 *
	 */
	public static final String $attr_char4 = "attr_char4";
	/**
	 * Business info. character string 5 業務情報文字列５.<p>
	 *
	 */
	public static final String $attr_char5 = "attr_char5";
	/**
	 * Business info. character string 6 業務情報文字列６.<p>
	 *
	 */
	public static final String $attr_char6 = "attr_char6";
	/**
	 * Business info. character string 7 業務情報文字列７.<p>
	 *
	 */
	public static final String $attr_char7 = "attr_char7";
	/**
	 * Business info. character string 8 業務情報文字列８.<p>
	 *
	 */
	public static final String $attr_char8 = "attr_char8";
	/**
	 * Business info. character string 9 業務情報文字列９.<p>
	 *
	 */
	public static final String $attr_char9 = "attr_char9";
	/**
	 * Business info. character string 10 業務情報文字列１０.<p>
	 *
	 */
	public static final String $attr_char10 = "attr_char10";
	/**
	 * Business info. character string 11 業務情報文字列１１.<p>
	 *
	 */
	public static final String $attr_char11 = "attr_char11";
	/**
	 * Business info. character string 12 業務情報文字列１２.<p>
	 *
	 */
	public static final String $attr_char12 = "attr_char12";
	/**
	 * Business info. character string 13 業務情報文字列１３.<p>
	 *
	 */
	public static final String $attr_char13 = "attr_char13";
	/**
	 * Business info. character string 14 業務情報文字列１４.<p>
	 *
	 */
	public static final String $attr_char14 = "attr_char14";
	/**
	 * Business info. character string 15 業務情報文字列１５.<p>
	 *
	 */
	public static final String $attr_char15 = "attr_char15";
	/**
	 * Business info. character string 16 業務情報文字列１６.<p>
	 *
	 */
	public static final String $attr_char16 = "attr_char16";
	/**
	 * Business info. character string 17 業務情報文字列１７.<p>
	 *
	 */
	public static final String $attr_char17 = "attr_char17";
	/**
	 * Business info. character string 18 業務情報文字列１８.<p>
	 *
	 */
	public static final String $attr_char18 = "attr_char18";
	/**
	 * Business info. character string 19 業務情報文字列１９.<p>
	 *
	 */
	public static final String $attr_char19 = "attr_char19";
	/**
	 * Business info. character string 20 業務情報文字列２０.<p>
	 *
	 */
	public static final String $attr_char20 = "attr_char20";
	/**
	 * Business info. character string 21 業務情報文字列２１.<p>
	 *
	 */
	public static final String $attr_char21 = "attr_char21";
	/**
	 * Business info. character string 22 業務情報文字列２２.<p>
	 *
	 */
	public static final String $attr_char22 = "attr_char22";
	/**
	 * Business info. character string 23 業務情報文字列２３.<p>
	 *
	 */
	public static final String $attr_char23 = "attr_char23";
	/**
	 * Business info. character string 24 業務情報文字列２４.<p>
	 *
	 */
	public static final String $attr_char24 = "attr_char24";
	/**
	 * Business info. character string 25 業務情報文字列２５.<p>
	 *
	 */
	public static final String $attr_char25 = "attr_char25";
	/**
	 * Business info. character string 26 業務情報文字列２６.<p>
	 *
	 */
	public static final String $attr_char26 = "attr_char26";
	/**
	 * Business info. character string 27 業務情報文字列２７.<p>
	 *
	 */
	public static final String $attr_char27 = "attr_char27";
	/**
	 * Business info. character string 28 業務情報文字列２８.<p>
	 *
	 */
	public static final String $attr_char28 = "attr_char28";
	/**
	 * Business info. character string 29 業務情報文字列２９.<p>
	 *
	 */
	public static final String $attr_char29 = "attr_char29";
	/**
	 * Business info. character string 30 業務情報文字列３０.<p>
	 *
	 */
	public static final String $attr_char30 = "attr_char30";
	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public static final String $attr_num1 = "attr_num1";
	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public static final String $attr_num2 = "attr_num2";
	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public static final String $attr_num3 = "attr_num3";
	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public static final String $attr_num4 = "attr_num4";
	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public static final String $attr_num5 = "attr_num5";
	/**
	 * Business info. date 1 業務情報日付１.<p>
	 *
	 */
	public static final String $attr_dt1 = "attr_dt1";
	/**
	 * Business info. date 2 業務情報日付２.<p>
	 *
	 */
	public static final String $attr_dt2 = "attr_dt2";
	/**
	 * Business info. date 3 業務情報日付３.<p>
	 *
	 */
	public static final String $attr_dt3 = "attr_dt3";
	/**
	 * Business info. date 4 業務情報日付４.<p>
	 *
	 */
	public static final String $attr_dt4 = "attr_dt4";
	/**
	 * Business info. date 5 業務情報日付５.<p>
	 *
	 */
	public static final String $attr_dt5 = "attr_dt5";
	/**
	 * Business info. date and time 1 業務情報日時１.<p>
	 *
	 */
	public static final String $attr_tm1 = "attr_tm1";
	/**
	 * Business info. date and time 2 業務情報日時２.<p>
	 *
	 */
	public static final String $attr_tm2 = "attr_tm2";
	/**
	 * Business info. date and time 3 業務情報日時３.<p>
	 *
	 */
	public static final String $attr_tm3 = "attr_tm3";
	/**
	 * Business info. date and time 4 業務情報日時４.<p>
	 *
	 */
	public static final String $attr_tm4 = "attr_tm4";
	/**
	 * Business info. date and time 5 業務情報日時５.<p>
	 *
	 */
	public static final String $attr_tm5 = "attr_tm5";
	/**
	 * No WebAPI linkage ＷｅｂＡＰＩ連携しない.<p>
	 *
	 */
	public static final String $webapi_not_link_flg = "webapi_not_link_flg";


	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta if_proc_typ_META = createCommonMeta($if_proc_typ, mcframe.commonMA.meta.MA_META.IF_PROC_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta not_send_upd_flg_META = createCommonMeta($not_send_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sdrv_clt_id_META = createCommonMeta($sdrv_clt_id, mcframe.commonMA.meta.MA_META.MACHINE);
	public static final MCMeta sdrv_usr_id_META = createCommonMeta($sdrv_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta sdrv_usr_nm_META = createCommonMeta($sdrv_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta attr_char1_META = createCommonMeta($attr_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta attr_char2_META = createCommonMeta($attr_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta attr_char3_META = createCommonMeta($attr_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta attr_char4_META = createCommonMeta($attr_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta attr_char5_META = createCommonMeta($attr_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta attr_char6_META = createCommonMeta($attr_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta attr_char7_META = createCommonMeta($attr_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta attr_char8_META = createCommonMeta($attr_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta attr_char9_META = createCommonMeta($attr_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta attr_char10_META = createCommonMeta($attr_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta attr_char11_META = createCommonMeta($attr_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta attr_char12_META = createCommonMeta($attr_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta attr_char13_META = createCommonMeta($attr_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta attr_char14_META = createCommonMeta($attr_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta attr_char15_META = createCommonMeta($attr_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta attr_char16_META = createCommonMeta($attr_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta attr_char17_META = createCommonMeta($attr_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta attr_char18_META = createCommonMeta($attr_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta attr_char19_META = createCommonMeta($attr_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta attr_char20_META = createCommonMeta($attr_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta attr_char21_META = createCommonMeta($attr_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta attr_char22_META = createCommonMeta($attr_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta attr_char23_META = createCommonMeta($attr_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta attr_char24_META = createCommonMeta($attr_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta attr_char25_META = createCommonMeta($attr_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta attr_char26_META = createCommonMeta($attr_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta attr_char27_META = createCommonMeta($attr_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta attr_char28_META = createCommonMeta($attr_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta attr_char29_META = createCommonMeta($attr_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta attr_char30_META = createCommonMeta($attr_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta attr_num1_META = createCommonMeta($attr_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta attr_num2_META = createCommonMeta($attr_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta attr_num3_META = createCommonMeta($attr_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta attr_num4_META = createCommonMeta($attr_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta attr_num5_META = createCommonMeta($attr_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta attr_dt1_META = createCommonMeta($attr_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt2_META = createCommonMeta($attr_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt3_META = createCommonMeta($attr_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt4_META = createCommonMeta($attr_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt5_META = createCommonMeta($attr_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_tm1_META = createCommonMeta($attr_tm1, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm2_META = createCommonMeta($attr_tm2, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm3_META = createCommonMeta($attr_tm3, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm4_META = createCommonMeta($attr_tm4, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm5_META = createCommonMeta($attr_tm5, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta webapi_not_link_flg_META = createCommonMeta($webapi_not_link_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_no_META,
			if_proc_typ_META,
			ext_sys_cd_META,
			not_send_upd_flg_META,
			sdrv_clt_id_META,
			sdrv_usr_id_META,
			sdrv_usr_nm_META,
			attr_char1_META,
			attr_char2_META,
			attr_char3_META,
			attr_char4_META,
			attr_char5_META,
			attr_char6_META,
			attr_char7_META,
			attr_char8_META,
			attr_char9_META,
			attr_char10_META,
			attr_char11_META,
			attr_char12_META,
			attr_char13_META,
			attr_char14_META,
			attr_char15_META,
			attr_char16_META,
			attr_char17_META,
			attr_char18_META,
			attr_char19_META,
			attr_char20_META,
			attr_char21_META,
			attr_char22_META,
			attr_char23_META,
			attr_char24_META,
			attr_char25_META,
			attr_char26_META,
			attr_char27_META,
			attr_char28_META,
			attr_char29_META,
			attr_char30_META,
			attr_num1_META,
			attr_num2_META,
			attr_num3_META,
			attr_num4_META,
			attr_num5_META,
			attr_dt1_META,
			attr_dt2_META,
			attr_dt3_META,
			attr_dt4_META,
			attr_dt5_META,
			attr_tm1_META,
			attr_tm2_META,
			attr_tm3_META,
			attr_tm4_META,
			attr_tm5_META,
			webapi_not_link_flg_META
		},
		new String[][]{
			{
			},
			{
			}
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 0, $data_no);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 0, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 0, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 0, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 0, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 0, $data_no, value);
	}


	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public String if_proc_typ() {
		return getConstString(offset + 1, $if_proc_typ);
	}

	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public void if_proc_typ(String value) {
		setConstString(offset + 1, $if_proc_typ, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 2, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 2, $ext_sys_cd, value);
	}


	/**
	 * Uncorrectable after exporting 送信後訂正不可.<p>
	 *
	 */
	public boolean not_send_upd_flg() {
		return getConstBoolean(offset + 3, $not_send_upd_flg);
	}

	/**
	 * Uncorrectable after exporting 送信後訂正不可.<p>
	 *
	 */
	public void not_send_upd_flg(boolean value) {
		setConstBoolean(offset + 3, $not_send_upd_flg, value);
	}


	/**
	 * Exporting/importing client ID 送受信クライアントＩＤ.<p>
	 *
	 */
	public String sdrv_clt_id() {
		return getConstString(offset + 4, $sdrv_clt_id);
	}

	/**
	 * Exporting/importing client ID 送受信クライアントＩＤ.<p>
	 *
	 */
	public void sdrv_clt_id(String value) {
		setConstString(offset + 4, $sdrv_clt_id, value);
	}


	/**
	 * Exporting/importing user ID 送受信ユーザＩＤ.<p>
	 *
	 */
	public String sdrv_usr_id() {
		return getConstString(offset + 5, $sdrv_usr_id);
	}

	/**
	 * Exporting/importing user ID 送受信ユーザＩＤ.<p>
	 *
	 */
	public void sdrv_usr_id(String value) {
		setConstString(offset + 5, $sdrv_usr_id, value);
	}


	/**
	 * Exporting/importing user name 送受信ユーザ名.<p>
	 *
	 */
	public String sdrv_usr_nm() {
		return getConstString(offset + 6, $sdrv_usr_nm);
	}

	/**
	 * Exporting/importing user name 送受信ユーザ名.<p>
	 *
	 */
	public void sdrv_usr_nm(String value) {
		setConstString(offset + 6, $sdrv_usr_nm, value);
	}


	/**
	 * Business info. character string 1 業務情報文字列１.<p>
	 *
	 */
	public String attr_char1() {
		return getConstString(offset + 7, $attr_char1);
	}

	/**
	 * Business info. character string 1 業務情報文字列１.<p>
	 *
	 */
	public void attr_char1(String value) {
		setConstString(offset + 7, $attr_char1, value);
	}


	/**
	 * Business info. character string 2 業務情報文字列２.<p>
	 *
	 */
	public String attr_char2() {
		return getConstString(offset + 8, $attr_char2);
	}

	/**
	 * Business info. character string 2 業務情報文字列２.<p>
	 *
	 */
	public void attr_char2(String value) {
		setConstString(offset + 8, $attr_char2, value);
	}


	/**
	 * Business info. character string 3 業務情報文字列３.<p>
	 *
	 */
	public String attr_char3() {
		return getConstString(offset + 9, $attr_char3);
	}

	/**
	 * Business info. character string 3 業務情報文字列３.<p>
	 *
	 */
	public void attr_char3(String value) {
		setConstString(offset + 9, $attr_char3, value);
	}


	/**
	 * Business info. character string 4 業務情報文字列４.<p>
	 *
	 */
	public String attr_char4() {
		return getConstString(offset + 10, $attr_char4);
	}

	/**
	 * Business info. character string 4 業務情報文字列４.<p>
	 *
	 */
	public void attr_char4(String value) {
		setConstString(offset + 10, $attr_char4, value);
	}


	/**
	 * Business info. character string 5 業務情報文字列５.<p>
	 *
	 */
	public String attr_char5() {
		return getConstString(offset + 11, $attr_char5);
	}

	/**
	 * Business info. character string 5 業務情報文字列５.<p>
	 *
	 */
	public void attr_char5(String value) {
		setConstString(offset + 11, $attr_char5, value);
	}


	/**
	 * Business info. character string 6 業務情報文字列６.<p>
	 *
	 */
	public String attr_char6() {
		return getConstString(offset + 12, $attr_char6);
	}

	/**
	 * Business info. character string 6 業務情報文字列６.<p>
	 *
	 */
	public void attr_char6(String value) {
		setConstString(offset + 12, $attr_char6, value);
	}


	/**
	 * Business info. character string 7 業務情報文字列７.<p>
	 *
	 */
	public String attr_char7() {
		return getConstString(offset + 13, $attr_char7);
	}

	/**
	 * Business info. character string 7 業務情報文字列７.<p>
	 *
	 */
	public void attr_char7(String value) {
		setConstString(offset + 13, $attr_char7, value);
	}


	/**
	 * Business info. character string 8 業務情報文字列８.<p>
	 *
	 */
	public String attr_char8() {
		return getConstString(offset + 14, $attr_char8);
	}

	/**
	 * Business info. character string 8 業務情報文字列８.<p>
	 *
	 */
	public void attr_char8(String value) {
		setConstString(offset + 14, $attr_char8, value);
	}


	/**
	 * Business info. character string 9 業務情報文字列９.<p>
	 *
	 */
	public String attr_char9() {
		return getConstString(offset + 15, $attr_char9);
	}

	/**
	 * Business info. character string 9 業務情報文字列９.<p>
	 *
	 */
	public void attr_char9(String value) {
		setConstString(offset + 15, $attr_char9, value);
	}


	/**
	 * Business info. character string 10 業務情報文字列１０.<p>
	 *
	 */
	public String attr_char10() {
		return getConstString(offset + 16, $attr_char10);
	}

	/**
	 * Business info. character string 10 業務情報文字列１０.<p>
	 *
	 */
	public void attr_char10(String value) {
		setConstString(offset + 16, $attr_char10, value);
	}


	/**
	 * Business info. character string 11 業務情報文字列１１.<p>
	 *
	 */
	public String attr_char11() {
		return getConstString(offset + 17, $attr_char11);
	}

	/**
	 * Business info. character string 11 業務情報文字列１１.<p>
	 *
	 */
	public void attr_char11(String value) {
		setConstString(offset + 17, $attr_char11, value);
	}


	/**
	 * Business info. character string 12 業務情報文字列１２.<p>
	 *
	 */
	public String attr_char12() {
		return getConstString(offset + 18, $attr_char12);
	}

	/**
	 * Business info. character string 12 業務情報文字列１２.<p>
	 *
	 */
	public void attr_char12(String value) {
		setConstString(offset + 18, $attr_char12, value);
	}


	/**
	 * Business info. character string 13 業務情報文字列１３.<p>
	 *
	 */
	public String attr_char13() {
		return getConstString(offset + 19, $attr_char13);
	}

	/**
	 * Business info. character string 13 業務情報文字列１３.<p>
	 *
	 */
	public void attr_char13(String value) {
		setConstString(offset + 19, $attr_char13, value);
	}


	/**
	 * Business info. character string 14 業務情報文字列１４.<p>
	 *
	 */
	public String attr_char14() {
		return getConstString(offset + 20, $attr_char14);
	}

	/**
	 * Business info. character string 14 業務情報文字列１４.<p>
	 *
	 */
	public void attr_char14(String value) {
		setConstString(offset + 20, $attr_char14, value);
	}


	/**
	 * Business info. character string 15 業務情報文字列１５.<p>
	 *
	 */
	public String attr_char15() {
		return getConstString(offset + 21, $attr_char15);
	}

	/**
	 * Business info. character string 15 業務情報文字列１５.<p>
	 *
	 */
	public void attr_char15(String value) {
		setConstString(offset + 21, $attr_char15, value);
	}


	/**
	 * Business info. character string 16 業務情報文字列１６.<p>
	 *
	 */
	public String attr_char16() {
		return getConstString(offset + 22, $attr_char16);
	}

	/**
	 * Business info. character string 16 業務情報文字列１６.<p>
	 *
	 */
	public void attr_char16(String value) {
		setConstString(offset + 22, $attr_char16, value);
	}


	/**
	 * Business info. character string 17 業務情報文字列１７.<p>
	 *
	 */
	public String attr_char17() {
		return getConstString(offset + 23, $attr_char17);
	}

	/**
	 * Business info. character string 17 業務情報文字列１７.<p>
	 *
	 */
	public void attr_char17(String value) {
		setConstString(offset + 23, $attr_char17, value);
	}


	/**
	 * Business info. character string 18 業務情報文字列１８.<p>
	 *
	 */
	public String attr_char18() {
		return getConstString(offset + 24, $attr_char18);
	}

	/**
	 * Business info. character string 18 業務情報文字列１８.<p>
	 *
	 */
	public void attr_char18(String value) {
		setConstString(offset + 24, $attr_char18, value);
	}


	/**
	 * Business info. character string 19 業務情報文字列１９.<p>
	 *
	 */
	public String attr_char19() {
		return getConstString(offset + 25, $attr_char19);
	}

	/**
	 * Business info. character string 19 業務情報文字列１９.<p>
	 *
	 */
	public void attr_char19(String value) {
		setConstString(offset + 25, $attr_char19, value);
	}


	/**
	 * Business info. character string 20 業務情報文字列２０.<p>
	 *
	 */
	public String attr_char20() {
		return getConstString(offset + 26, $attr_char20);
	}

	/**
	 * Business info. character string 20 業務情報文字列２０.<p>
	 *
	 */
	public void attr_char20(String value) {
		setConstString(offset + 26, $attr_char20, value);
	}


	/**
	 * Business info. character string 21 業務情報文字列２１.<p>
	 *
	 */
	public String attr_char21() {
		return getConstString(offset + 27, $attr_char21);
	}

	/**
	 * Business info. character string 21 業務情報文字列２１.<p>
	 *
	 */
	public void attr_char21(String value) {
		setConstString(offset + 27, $attr_char21, value);
	}


	/**
	 * Business info. character string 22 業務情報文字列２２.<p>
	 *
	 */
	public String attr_char22() {
		return getConstString(offset + 28, $attr_char22);
	}

	/**
	 * Business info. character string 22 業務情報文字列２２.<p>
	 *
	 */
	public void attr_char22(String value) {
		setConstString(offset + 28, $attr_char22, value);
	}


	/**
	 * Business info. character string 23 業務情報文字列２３.<p>
	 *
	 */
	public String attr_char23() {
		return getConstString(offset + 29, $attr_char23);
	}

	/**
	 * Business info. character string 23 業務情報文字列２３.<p>
	 *
	 */
	public void attr_char23(String value) {
		setConstString(offset + 29, $attr_char23, value);
	}


	/**
	 * Business info. character string 24 業務情報文字列２４.<p>
	 *
	 */
	public String attr_char24() {
		return getConstString(offset + 30, $attr_char24);
	}

	/**
	 * Business info. character string 24 業務情報文字列２４.<p>
	 *
	 */
	public void attr_char24(String value) {
		setConstString(offset + 30, $attr_char24, value);
	}


	/**
	 * Business info. character string 25 業務情報文字列２５.<p>
	 *
	 */
	public String attr_char25() {
		return getConstString(offset + 31, $attr_char25);
	}

	/**
	 * Business info. character string 25 業務情報文字列２５.<p>
	 *
	 */
	public void attr_char25(String value) {
		setConstString(offset + 31, $attr_char25, value);
	}


	/**
	 * Business info. character string 26 業務情報文字列２６.<p>
	 *
	 */
	public String attr_char26() {
		return getConstString(offset + 32, $attr_char26);
	}

	/**
	 * Business info. character string 26 業務情報文字列２６.<p>
	 *
	 */
	public void attr_char26(String value) {
		setConstString(offset + 32, $attr_char26, value);
	}


	/**
	 * Business info. character string 27 業務情報文字列２７.<p>
	 *
	 */
	public String attr_char27() {
		return getConstString(offset + 33, $attr_char27);
	}

	/**
	 * Business info. character string 27 業務情報文字列２７.<p>
	 *
	 */
	public void attr_char27(String value) {
		setConstString(offset + 33, $attr_char27, value);
	}


	/**
	 * Business info. character string 28 業務情報文字列２８.<p>
	 *
	 */
	public String attr_char28() {
		return getConstString(offset + 34, $attr_char28);
	}

	/**
	 * Business info. character string 28 業務情報文字列２８.<p>
	 *
	 */
	public void attr_char28(String value) {
		setConstString(offset + 34, $attr_char28, value);
	}


	/**
	 * Business info. character string 29 業務情報文字列２９.<p>
	 *
	 */
	public String attr_char29() {
		return getConstString(offset + 35, $attr_char29);
	}

	/**
	 * Business info. character string 29 業務情報文字列２９.<p>
	 *
	 */
	public void attr_char29(String value) {
		setConstString(offset + 35, $attr_char29, value);
	}


	/**
	 * Business info. character string 30 業務情報文字列３０.<p>
	 *
	 */
	public String attr_char30() {
		return getConstString(offset + 36, $attr_char30);
	}

	/**
	 * Business info. character string 30 業務情報文字列３０.<p>
	 *
	 */
	public void attr_char30(String value) {
		setConstString(offset + 36, $attr_char30, value);
	}


	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public MCNumber attr_num1() {
		return getConstNumber(offset + 37, $attr_num1);
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public void attr_num1(MCNumber value) {
		setConstNumber(offset + 37, $attr_num1, value);
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public void attr_num1(int value) {
		setConstNumber(offset + 37, $attr_num1, value);
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public void attr_num1(long value) {
		setConstNumber(offset + 37, $attr_num1, value);
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public void attr_num1(float value) {
		setConstNumber(offset + 37, $attr_num1, value);
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public void attr_num1(double value) {
		setConstNumber(offset + 37, $attr_num1, value);
	}


	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public MCNumber attr_num2() {
		return getConstNumber(offset + 38, $attr_num2);
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public void attr_num2(MCNumber value) {
		setConstNumber(offset + 38, $attr_num2, value);
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public void attr_num2(int value) {
		setConstNumber(offset + 38, $attr_num2, value);
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public void attr_num2(long value) {
		setConstNumber(offset + 38, $attr_num2, value);
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public void attr_num2(float value) {
		setConstNumber(offset + 38, $attr_num2, value);
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public void attr_num2(double value) {
		setConstNumber(offset + 38, $attr_num2, value);
	}


	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public MCNumber attr_num3() {
		return getConstNumber(offset + 39, $attr_num3);
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public void attr_num3(MCNumber value) {
		setConstNumber(offset + 39, $attr_num3, value);
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public void attr_num3(int value) {
		setConstNumber(offset + 39, $attr_num3, value);
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public void attr_num3(long value) {
		setConstNumber(offset + 39, $attr_num3, value);
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public void attr_num3(float value) {
		setConstNumber(offset + 39, $attr_num3, value);
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public void attr_num3(double value) {
		setConstNumber(offset + 39, $attr_num3, value);
	}


	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public MCNumber attr_num4() {
		return getConstNumber(offset + 40, $attr_num4);
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public void attr_num4(MCNumber value) {
		setConstNumber(offset + 40, $attr_num4, value);
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public void attr_num4(int value) {
		setConstNumber(offset + 40, $attr_num4, value);
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public void attr_num4(long value) {
		setConstNumber(offset + 40, $attr_num4, value);
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public void attr_num4(float value) {
		setConstNumber(offset + 40, $attr_num4, value);
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public void attr_num4(double value) {
		setConstNumber(offset + 40, $attr_num4, value);
	}


	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public MCNumber attr_num5() {
		return getConstNumber(offset + 41, $attr_num5);
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public void attr_num5(MCNumber value) {
		setConstNumber(offset + 41, $attr_num5, value);
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public void attr_num5(int value) {
		setConstNumber(offset + 41, $attr_num5, value);
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public void attr_num5(long value) {
		setConstNumber(offset + 41, $attr_num5, value);
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public void attr_num5(float value) {
		setConstNumber(offset + 41, $attr_num5, value);
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public void attr_num5(double value) {
		setConstNumber(offset + 41, $attr_num5, value);
	}


	/**
	 * Business info. date 1 業務情報日付１.<p>
	 *
	 */
	public MCDate attr_dt1() {
		return getConstDate(offset + 42, $attr_dt1);
	}

	/**
	 * Business info. date 1 業務情報日付１.<p>
	 *
	 */
	public void attr_dt1(MCDate value) {
		setConstDate(offset + 42, $attr_dt1, value);
	}


	/**
	 * Business info. date 2 業務情報日付２.<p>
	 *
	 */
	public MCDate attr_dt2() {
		return getConstDate(offset + 43, $attr_dt2);
	}

	/**
	 * Business info. date 2 業務情報日付２.<p>
	 *
	 */
	public void attr_dt2(MCDate value) {
		setConstDate(offset + 43, $attr_dt2, value);
	}


	/**
	 * Business info. date 3 業務情報日付３.<p>
	 *
	 */
	public MCDate attr_dt3() {
		return getConstDate(offset + 44, $attr_dt3);
	}

	/**
	 * Business info. date 3 業務情報日付３.<p>
	 *
	 */
	public void attr_dt3(MCDate value) {
		setConstDate(offset + 44, $attr_dt3, value);
	}


	/**
	 * Business info. date 4 業務情報日付４.<p>
	 *
	 */
	public MCDate attr_dt4() {
		return getConstDate(offset + 45, $attr_dt4);
	}

	/**
	 * Business info. date 4 業務情報日付４.<p>
	 *
	 */
	public void attr_dt4(MCDate value) {
		setConstDate(offset + 45, $attr_dt4, value);
	}


	/**
	 * Business info. date 5 業務情報日付５.<p>
	 *
	 */
	public MCDate attr_dt5() {
		return getConstDate(offset + 46, $attr_dt5);
	}

	/**
	 * Business info. date 5 業務情報日付５.<p>
	 *
	 */
	public void attr_dt5(MCDate value) {
		setConstDate(offset + 46, $attr_dt5, value);
	}


	/**
	 * Business info. date and time 1 業務情報日時１.<p>
	 *
	 */
	public MCDate attr_tm1() {
		return getConstDate(offset + 47, $attr_tm1);
	}

	/**
	 * Business info. date and time 1 業務情報日時１.<p>
	 *
	 */
	public void attr_tm1(MCDate value) {
		setConstDate(offset + 47, $attr_tm1, value);
	}


	/**
	 * Business info. date and time 2 業務情報日時２.<p>
	 *
	 */
	public MCDate attr_tm2() {
		return getConstDate(offset + 48, $attr_tm2);
	}

	/**
	 * Business info. date and time 2 業務情報日時２.<p>
	 *
	 */
	public void attr_tm2(MCDate value) {
		setConstDate(offset + 48, $attr_tm2, value);
	}


	/**
	 * Business info. date and time 3 業務情報日時３.<p>
	 *
	 */
	public MCDate attr_tm3() {
		return getConstDate(offset + 49, $attr_tm3);
	}

	/**
	 * Business info. date and time 3 業務情報日時３.<p>
	 *
	 */
	public void attr_tm3(MCDate value) {
		setConstDate(offset + 49, $attr_tm3, value);
	}


	/**
	 * Business info. date and time 4 業務情報日時４.<p>
	 *
	 */
	public MCDate attr_tm4() {
		return getConstDate(offset + 50, $attr_tm4);
	}

	/**
	 * Business info. date and time 4 業務情報日時４.<p>
	 *
	 */
	public void attr_tm4(MCDate value) {
		setConstDate(offset + 50, $attr_tm4, value);
	}


	/**
	 * Business info. date and time 5 業務情報日時５.<p>
	 *
	 */
	public MCDate attr_tm5() {
		return getConstDate(offset + 51, $attr_tm5);
	}

	/**
	 * Business info. date and time 5 業務情報日時５.<p>
	 *
	 */
	public void attr_tm5(MCDate value) {
		setConstDate(offset + 51, $attr_tm5, value);
	}


	/**
	 * No WebAPI linkage ＷｅｂＡＰＩ連携しない.<p>
	 *
	 */
	public boolean webapi_not_link_flg() {
		return getConstBoolean(offset + 52, $webapi_not_link_flg);
	}

	/**
	 * No WebAPI linkage ＷｅｂＡＰＩ連携しない.<p>
	 *
	 */
	public void webapi_not_link_flg(boolean value) {
		setConstBoolean(offset + 52, $webapi_not_link_flg, value);
	}


	public String getString(String name) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($sdrv_clt_id.equalsIgnoreCase(name)) {
			return sdrv_clt_id();
		}
		if ($sdrv_usr_id.equalsIgnoreCase(name)) {
			return sdrv_usr_id();
		}
		if ($sdrv_usr_nm.equalsIgnoreCase(name)) {
			return sdrv_usr_nm();
		}
		if ($attr_char1.equalsIgnoreCase(name)) {
			return attr_char1();
		}
		if ($attr_char2.equalsIgnoreCase(name)) {
			return attr_char2();
		}
		if ($attr_char3.equalsIgnoreCase(name)) {
			return attr_char3();
		}
		if ($attr_char4.equalsIgnoreCase(name)) {
			return attr_char4();
		}
		if ($attr_char5.equalsIgnoreCase(name)) {
			return attr_char5();
		}
		if ($attr_char6.equalsIgnoreCase(name)) {
			return attr_char6();
		}
		if ($attr_char7.equalsIgnoreCase(name)) {
			return attr_char7();
		}
		if ($attr_char8.equalsIgnoreCase(name)) {
			return attr_char8();
		}
		if ($attr_char9.equalsIgnoreCase(name)) {
			return attr_char9();
		}
		if ($attr_char10.equalsIgnoreCase(name)) {
			return attr_char10();
		}
		if ($attr_char11.equalsIgnoreCase(name)) {
			return attr_char11();
		}
		if ($attr_char12.equalsIgnoreCase(name)) {
			return attr_char12();
		}
		if ($attr_char13.equalsIgnoreCase(name)) {
			return attr_char13();
		}
		if ($attr_char14.equalsIgnoreCase(name)) {
			return attr_char14();
		}
		if ($attr_char15.equalsIgnoreCase(name)) {
			return attr_char15();
		}
		if ($attr_char16.equalsIgnoreCase(name)) {
			return attr_char16();
		}
		if ($attr_char17.equalsIgnoreCase(name)) {
			return attr_char17();
		}
		if ($attr_char18.equalsIgnoreCase(name)) {
			return attr_char18();
		}
		if ($attr_char19.equalsIgnoreCase(name)) {
			return attr_char19();
		}
		if ($attr_char20.equalsIgnoreCase(name)) {
			return attr_char20();
		}
		if ($attr_char21.equalsIgnoreCase(name)) {
			return attr_char21();
		}
		if ($attr_char22.equalsIgnoreCase(name)) {
			return attr_char22();
		}
		if ($attr_char23.equalsIgnoreCase(name)) {
			return attr_char23();
		}
		if ($attr_char24.equalsIgnoreCase(name)) {
			return attr_char24();
		}
		if ($attr_char25.equalsIgnoreCase(name)) {
			return attr_char25();
		}
		if ($attr_char26.equalsIgnoreCase(name)) {
			return attr_char26();
		}
		if ($attr_char27.equalsIgnoreCase(name)) {
			return attr_char27();
		}
		if ($attr_char28.equalsIgnoreCase(name)) {
			return attr_char28();
		}
		if ($attr_char29.equalsIgnoreCase(name)) {
			return attr_char29();
		}
		if ($attr_char30.equalsIgnoreCase(name)) {
			return attr_char30();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			return attr_num1();
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			return attr_num2();
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			return attr_num3();
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			return attr_num4();
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			return attr_num5();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($attr_dt1.equalsIgnoreCase(name)) {
			return attr_dt1();
		}
		if ($attr_dt2.equalsIgnoreCase(name)) {
			return attr_dt2();
		}
		if ($attr_dt3.equalsIgnoreCase(name)) {
			return attr_dt3();
		}
		if ($attr_dt4.equalsIgnoreCase(name)) {
			return attr_dt4();
		}
		if ($attr_dt5.equalsIgnoreCase(name)) {
			return attr_dt5();
		}
		if ($attr_tm1.equalsIgnoreCase(name)) {
			return attr_tm1();
		}
		if ($attr_tm2.equalsIgnoreCase(name)) {
			return attr_tm2();
		}
		if ($attr_tm3.equalsIgnoreCase(name)) {
			return attr_tm3();
		}
		if ($attr_tm4.equalsIgnoreCase(name)) {
			return attr_tm4();
		}
		if ($attr_tm5.equalsIgnoreCase(name)) {
			return attr_tm5();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			return not_send_upd_flg();
		}
		if ($webapi_not_link_flg.equalsIgnoreCase(name)) {
			return webapi_not_link_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($sdrv_clt_id.equalsIgnoreCase(name)) {
			return sdrv_clt_id();
		}
		if ($sdrv_usr_id.equalsIgnoreCase(name)) {
			return sdrv_usr_id();
		}
		if ($sdrv_usr_nm.equalsIgnoreCase(name)) {
			return sdrv_usr_nm();
		}
		if ($attr_char1.equalsIgnoreCase(name)) {
			return attr_char1();
		}
		if ($attr_char2.equalsIgnoreCase(name)) {
			return attr_char2();
		}
		if ($attr_char3.equalsIgnoreCase(name)) {
			return attr_char3();
		}
		if ($attr_char4.equalsIgnoreCase(name)) {
			return attr_char4();
		}
		if ($attr_char5.equalsIgnoreCase(name)) {
			return attr_char5();
		}
		if ($attr_char6.equalsIgnoreCase(name)) {
			return attr_char6();
		}
		if ($attr_char7.equalsIgnoreCase(name)) {
			return attr_char7();
		}
		if ($attr_char8.equalsIgnoreCase(name)) {
			return attr_char8();
		}
		if ($attr_char9.equalsIgnoreCase(name)) {
			return attr_char9();
		}
		if ($attr_char10.equalsIgnoreCase(name)) {
			return attr_char10();
		}
		if ($attr_char11.equalsIgnoreCase(name)) {
			return attr_char11();
		}
		if ($attr_char12.equalsIgnoreCase(name)) {
			return attr_char12();
		}
		if ($attr_char13.equalsIgnoreCase(name)) {
			return attr_char13();
		}
		if ($attr_char14.equalsIgnoreCase(name)) {
			return attr_char14();
		}
		if ($attr_char15.equalsIgnoreCase(name)) {
			return attr_char15();
		}
		if ($attr_char16.equalsIgnoreCase(name)) {
			return attr_char16();
		}
		if ($attr_char17.equalsIgnoreCase(name)) {
			return attr_char17();
		}
		if ($attr_char18.equalsIgnoreCase(name)) {
			return attr_char18();
		}
		if ($attr_char19.equalsIgnoreCase(name)) {
			return attr_char19();
		}
		if ($attr_char20.equalsIgnoreCase(name)) {
			return attr_char20();
		}
		if ($attr_char21.equalsIgnoreCase(name)) {
			return attr_char21();
		}
		if ($attr_char22.equalsIgnoreCase(name)) {
			return attr_char22();
		}
		if ($attr_char23.equalsIgnoreCase(name)) {
			return attr_char23();
		}
		if ($attr_char24.equalsIgnoreCase(name)) {
			return attr_char24();
		}
		if ($attr_char25.equalsIgnoreCase(name)) {
			return attr_char25();
		}
		if ($attr_char26.equalsIgnoreCase(name)) {
			return attr_char26();
		}
		if ($attr_char27.equalsIgnoreCase(name)) {
			return attr_char27();
		}
		if ($attr_char28.equalsIgnoreCase(name)) {
			return attr_char28();
		}
		if ($attr_char29.equalsIgnoreCase(name)) {
			return attr_char29();
		}
		if ($attr_char30.equalsIgnoreCase(name)) {
			return attr_char30();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			return attr_num1();
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			return attr_num2();
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			return attr_num3();
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			return attr_num4();
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			return attr_num5();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($attr_dt1.equalsIgnoreCase(name)) {
			return attr_dt1();
		}
		if ($attr_dt2.equalsIgnoreCase(name)) {
			return attr_dt2();
		}
		if ($attr_dt3.equalsIgnoreCase(name)) {
			return attr_dt3();
		}
		if ($attr_dt4.equalsIgnoreCase(name)) {
			return attr_dt4();
		}
		if ($attr_dt5.equalsIgnoreCase(name)) {
			return attr_dt5();
		}
		if ($attr_tm1.equalsIgnoreCase(name)) {
			return attr_tm1();
		}
		if ($attr_tm2.equalsIgnoreCase(name)) {
			return attr_tm2();
		}
		if ($attr_tm3.equalsIgnoreCase(name)) {
			return attr_tm3();
		}
		if ($attr_tm4.equalsIgnoreCase(name)) {
			return attr_tm4();
		}
		if ($attr_tm5.equalsIgnoreCase(name)) {
			return attr_tm5();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			return not_send_upd_flg();
		}
		if ($webapi_not_link_flg.equalsIgnoreCase(name)) {
			return webapi_not_link_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($sdrv_clt_id.equalsIgnoreCase(name)) {
			sdrv_clt_id(value);
			return;
		}
		if ($sdrv_usr_id.equalsIgnoreCase(name)) {
			sdrv_usr_id(value);
			return;
		}
		if ($sdrv_usr_nm.equalsIgnoreCase(name)) {
			sdrv_usr_nm(value);
			return;
		}
		if ($attr_char1.equalsIgnoreCase(name)) {
			attr_char1(value);
			return;
		}
		if ($attr_char2.equalsIgnoreCase(name)) {
			attr_char2(value);
			return;
		}
		if ($attr_char3.equalsIgnoreCase(name)) {
			attr_char3(value);
			return;
		}
		if ($attr_char4.equalsIgnoreCase(name)) {
			attr_char4(value);
			return;
		}
		if ($attr_char5.equalsIgnoreCase(name)) {
			attr_char5(value);
			return;
		}
		if ($attr_char6.equalsIgnoreCase(name)) {
			attr_char6(value);
			return;
		}
		if ($attr_char7.equalsIgnoreCase(name)) {
			attr_char7(value);
			return;
		}
		if ($attr_char8.equalsIgnoreCase(name)) {
			attr_char8(value);
			return;
		}
		if ($attr_char9.equalsIgnoreCase(name)) {
			attr_char9(value);
			return;
		}
		if ($attr_char10.equalsIgnoreCase(name)) {
			attr_char10(value);
			return;
		}
		if ($attr_char11.equalsIgnoreCase(name)) {
			attr_char11(value);
			return;
		}
		if ($attr_char12.equalsIgnoreCase(name)) {
			attr_char12(value);
			return;
		}
		if ($attr_char13.equalsIgnoreCase(name)) {
			attr_char13(value);
			return;
		}
		if ($attr_char14.equalsIgnoreCase(name)) {
			attr_char14(value);
			return;
		}
		if ($attr_char15.equalsIgnoreCase(name)) {
			attr_char15(value);
			return;
		}
		if ($attr_char16.equalsIgnoreCase(name)) {
			attr_char16(value);
			return;
		}
		if ($attr_char17.equalsIgnoreCase(name)) {
			attr_char17(value);
			return;
		}
		if ($attr_char18.equalsIgnoreCase(name)) {
			attr_char18(value);
			return;
		}
		if ($attr_char19.equalsIgnoreCase(name)) {
			attr_char19(value);
			return;
		}
		if ($attr_char20.equalsIgnoreCase(name)) {
			attr_char20(value);
			return;
		}
		if ($attr_char21.equalsIgnoreCase(name)) {
			attr_char21(value);
			return;
		}
		if ($attr_char22.equalsIgnoreCase(name)) {
			attr_char22(value);
			return;
		}
		if ($attr_char23.equalsIgnoreCase(name)) {
			attr_char23(value);
			return;
		}
		if ($attr_char24.equalsIgnoreCase(name)) {
			attr_char24(value);
			return;
		}
		if ($attr_char25.equalsIgnoreCase(name)) {
			attr_char25(value);
			return;
		}
		if ($attr_char26.equalsIgnoreCase(name)) {
			attr_char26(value);
			return;
		}
		if ($attr_char27.equalsIgnoreCase(name)) {
			attr_char27(value);
			return;
		}
		if ($attr_char28.equalsIgnoreCase(name)) {
			attr_char28(value);
			return;
		}
		if ($attr_char29.equalsIgnoreCase(name)) {
			attr_char29(value);
			return;
		}
		if ($attr_char30.equalsIgnoreCase(name)) {
			attr_char30(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($attr_dt1.equalsIgnoreCase(name)) {
			attr_dt1(value);
			return;
		}
		if ($attr_dt2.equalsIgnoreCase(name)) {
			attr_dt2(value);
			return;
		}
		if ($attr_dt3.equalsIgnoreCase(name)) {
			attr_dt3(value);
			return;
		}
		if ($attr_dt4.equalsIgnoreCase(name)) {
			attr_dt4(value);
			return;
		}
		if ($attr_dt5.equalsIgnoreCase(name)) {
			attr_dt5(value);
			return;
		}
		if ($attr_tm1.equalsIgnoreCase(name)) {
			attr_tm1(value);
			return;
		}
		if ($attr_tm2.equalsIgnoreCase(name)) {
			attr_tm2(value);
			return;
		}
		if ($attr_tm3.equalsIgnoreCase(name)) {
			attr_tm3(value);
			return;
		}
		if ($attr_tm4.equalsIgnoreCase(name)) {
			attr_tm4(value);
			return;
		}
		if ($attr_tm5.equalsIgnoreCase(name)) {
			attr_tm5(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			not_send_upd_flg(value);
			return;
		}
		if ($webapi_not_link_flg.equalsIgnoreCase(name)) {
			webapi_not_link_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($sdrv_clt_id.equalsIgnoreCase(name)) {
			sdrv_clt_id(value);
			return;
		}
		if ($sdrv_usr_id.equalsIgnoreCase(name)) {
			sdrv_usr_id(value);
			return;
		}
		if ($sdrv_usr_nm.equalsIgnoreCase(name)) {
			sdrv_usr_nm(value);
			return;
		}
		if ($attr_char1.equalsIgnoreCase(name)) {
			attr_char1(value);
			return;
		}
		if ($attr_char2.equalsIgnoreCase(name)) {
			attr_char2(value);
			return;
		}
		if ($attr_char3.equalsIgnoreCase(name)) {
			attr_char3(value);
			return;
		}
		if ($attr_char4.equalsIgnoreCase(name)) {
			attr_char4(value);
			return;
		}
		if ($attr_char5.equalsIgnoreCase(name)) {
			attr_char5(value);
			return;
		}
		if ($attr_char6.equalsIgnoreCase(name)) {
			attr_char6(value);
			return;
		}
		if ($attr_char7.equalsIgnoreCase(name)) {
			attr_char7(value);
			return;
		}
		if ($attr_char8.equalsIgnoreCase(name)) {
			attr_char8(value);
			return;
		}
		if ($attr_char9.equalsIgnoreCase(name)) {
			attr_char9(value);
			return;
		}
		if ($attr_char10.equalsIgnoreCase(name)) {
			attr_char10(value);
			return;
		}
		if ($attr_char11.equalsIgnoreCase(name)) {
			attr_char11(value);
			return;
		}
		if ($attr_char12.equalsIgnoreCase(name)) {
			attr_char12(value);
			return;
		}
		if ($attr_char13.equalsIgnoreCase(name)) {
			attr_char13(value);
			return;
		}
		if ($attr_char14.equalsIgnoreCase(name)) {
			attr_char14(value);
			return;
		}
		if ($attr_char15.equalsIgnoreCase(name)) {
			attr_char15(value);
			return;
		}
		if ($attr_char16.equalsIgnoreCase(name)) {
			attr_char16(value);
			return;
		}
		if ($attr_char17.equalsIgnoreCase(name)) {
			attr_char17(value);
			return;
		}
		if ($attr_char18.equalsIgnoreCase(name)) {
			attr_char18(value);
			return;
		}
		if ($attr_char19.equalsIgnoreCase(name)) {
			attr_char19(value);
			return;
		}
		if ($attr_char20.equalsIgnoreCase(name)) {
			attr_char20(value);
			return;
		}
		if ($attr_char21.equalsIgnoreCase(name)) {
			attr_char21(value);
			return;
		}
		if ($attr_char22.equalsIgnoreCase(name)) {
			attr_char22(value);
			return;
		}
		if ($attr_char23.equalsIgnoreCase(name)) {
			attr_char23(value);
			return;
		}
		if ($attr_char24.equalsIgnoreCase(name)) {
			attr_char24(value);
			return;
		}
		if ($attr_char25.equalsIgnoreCase(name)) {
			attr_char25(value);
			return;
		}
		if ($attr_char26.equalsIgnoreCase(name)) {
			attr_char26(value);
			return;
		}
		if ($attr_char27.equalsIgnoreCase(name)) {
			attr_char27(value);
			return;
		}
		if ($attr_char28.equalsIgnoreCase(name)) {
			attr_char28(value);
			return;
		}
		if ($attr_char29.equalsIgnoreCase(name)) {
			attr_char29(value);
			return;
		}
		if ($attr_char30.equalsIgnoreCase(name)) {
			attr_char30(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($attr_dt1.equalsIgnoreCase(name)) {
			attr_dt1(value);
			return;
		}
		if ($attr_dt2.equalsIgnoreCase(name)) {
			attr_dt2(value);
			return;
		}
		if ($attr_dt3.equalsIgnoreCase(name)) {
			attr_dt3(value);
			return;
		}
		if ($attr_dt4.equalsIgnoreCase(name)) {
			attr_dt4(value);
			return;
		}
		if ($attr_dt5.equalsIgnoreCase(name)) {
			attr_dt5(value);
			return;
		}
		if ($attr_tm1.equalsIgnoreCase(name)) {
			attr_tm1(value);
			return;
		}
		if ($attr_tm2.equalsIgnoreCase(name)) {
			attr_tm2(value);
			return;
		}
		if ($attr_tm3.equalsIgnoreCase(name)) {
			attr_tm3(value);
			return;
		}
		if ($attr_tm4.equalsIgnoreCase(name)) {
			attr_tm4(value);
			return;
		}
		if ($attr_tm5.equalsIgnoreCase(name)) {
			attr_tm5(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			not_send_upd_flg(value);
			return;
		}
		if ($webapi_not_link_flg.equalsIgnoreCase(name)) {
			webapi_not_link_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

