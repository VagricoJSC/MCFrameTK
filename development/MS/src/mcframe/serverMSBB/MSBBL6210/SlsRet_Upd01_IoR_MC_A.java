package mcframe.serverMSBB.MSBBL6210;

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
 * ブロック"SlsRet_Upd01_Io"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SlsRet_Upd01_IoR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public static final String $dtl_peg_no = "dtl_peg_no";
	/**
	 * GR/GI pegging No. 受払紐付けＮＯ.<p>
	 *
	 */
	public static final String $io_peg_no = "io_peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Sales result GR/GI No. 売上実績受払ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_io_no = "sls_act_io_no";
	/**
	 * Sales result GR/GI sequence number 売上実績受払連番.<p>
	 *
	 */
	public static final String $sls_act_io_seq = "sls_act_io_seq";
	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public static final String $sls_ret_schd_d_no = "sls_ret_schd_d_no";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $arr_act_no = "arr_act_no";
	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_io_no = "purc_act_io_no";
	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";
	/**
	 * Cancel remaining sales return schedule 売上返品予定打切.<p>
	 *
	 */
	public static final String $sls_ret_schd_abort_flg = "sls_ret_schd_abort_flg";
	/**
	 * Details spare 1 詳細予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Details spare 2 詳細予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Details spare 3 詳細予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta dtl_peg_no_META = createCommonMeta($dtl_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta io_peg_no_META = createCommonMeta($io_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta sls_act_io_no_META = createCommonMeta($sls_act_io_no, mcframe.commonMA.meta.MA_META.SLS_ACT_IO_NO);
	public static final MCMeta sls_act_io_seq_META = createCommonMeta($sls_act_io_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta sls_ret_schd_d_no_META = createCommonMeta($sls_ret_schd_d_no, mcframe.commonMA.meta.MA_META.SLS_RET_SCHD_D_NO);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta purc_act_io_no_META = createCommonMeta($purc_act_io_no, mcframe.commonMA.meta.MA_META.PURC_ACT_IO_NO);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_ret_schd_abort_flg_META = createCommonMeta($sls_ret_schd_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLS_ACT_IO_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLS_ACT_IO_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLS_ACT_IO_SUB_CHAR3);

	protected static final ConstMetaList<SlsRet_Upd01_IoR> constMetas = new ConstMetaList<SlsRet_Upd01_IoR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			dtl_peg_no_META,
			io_peg_no_META,
			data_crud_typ_META,
			sls_act_io_no_META,
			sls_act_io_seq_META,
			sls_ret_schd_d_no_META,
			trd_unit_cd_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_qty_META,
			pack_unit_cd_META,
			pack_unit_qty_META,
			gd_cd_META,
			loc_cd_META,
			str_ln_cd_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			arr_act_no_META,
			purc_act_io_no_META,
			sync_flg_META,
			sls_ret_schd_abort_flg_META,
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
	protected SlsRet_Upd01_IoR_MC_A(ConstMetaList<? extends SlsRet_Upd01_IoR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsRet_Upd01_IoR clone() {
		return (SlsRet_Upd01_IoR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsRet_Upd01_IoR createInstance() {
		return (SlsRet_Upd01_IoR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsRet_Upd01_IoR getValues(String... names) {
		return (SlsRet_Upd01_IoR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public MCNumber dtl_peg_no() {
		return getConstNumber(offset + 1, $dtl_peg_no);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $dtl_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(int value) {
		setConstNumber(offset + 1, $dtl_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(long value) {
		setConstNumber(offset + 1, $dtl_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(float value) {
		setConstNumber(offset + 1, $dtl_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(double value) {
		setConstNumber(offset + 1, $dtl_peg_no, value);
	}


	/**
	 * GR/GI pegging No. 受払紐付けＮＯ.<p>
	 *
	 */
	public MCNumber io_peg_no() {
		return getConstNumber(offset + 2, $io_peg_no);
	}

	/**
	 * GR/GI pegging No. 受払紐付けＮＯ.<p>
	 *
	 */
	public void io_peg_no(MCNumber value) {
		setConstNumber(offset + 2, $io_peg_no, value);
	}

	/**
	 * GR/GI pegging No. 受払紐付けＮＯ.<p>
	 *
	 */
	public void io_peg_no(int value) {
		setConstNumber(offset + 2, $io_peg_no, value);
	}

	/**
	 * GR/GI pegging No. 受払紐付けＮＯ.<p>
	 *
	 */
	public void io_peg_no(long value) {
		setConstNumber(offset + 2, $io_peg_no, value);
	}

	/**
	 * GR/GI pegging No. 受払紐付けＮＯ.<p>
	 *
	 */
	public void io_peg_no(float value) {
		setConstNumber(offset + 2, $io_peg_no, value);
	}

	/**
	 * GR/GI pegging No. 受払紐付けＮＯ.<p>
	 *
	 */
	public void io_peg_no(double value) {
		setConstNumber(offset + 2, $io_peg_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 3, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 3, $data_crud_typ, value);
	}


	/**
	 * Sales result GR/GI No. 売上実績受払ＮＯ.<p>
	 *
	 */
	public String sls_act_io_no() {
		return getConstString(offset + 4, $sls_act_io_no);
	}

	/**
	 * Sales result GR/GI No. 売上実績受払ＮＯ.<p>
	 *
	 */
	public void sls_act_io_no(String value) {
		setConstString(offset + 4, $sls_act_io_no, value);
	}


	/**
	 * Sales result GR/GI sequence number 売上実績受払連番.<p>
	 *
	 */
	public MCNumber sls_act_io_seq() {
		return getConstNumber(offset + 5, $sls_act_io_seq);
	}

	/**
	 * Sales result GR/GI sequence number 売上実績受払連番.<p>
	 *
	 */
	public void sls_act_io_seq(MCNumber value) {
		setConstNumber(offset + 5, $sls_act_io_seq, value);
	}

	/**
	 * Sales result GR/GI sequence number 売上実績受払連番.<p>
	 *
	 */
	public void sls_act_io_seq(int value) {
		setConstNumber(offset + 5, $sls_act_io_seq, value);
	}

	/**
	 * Sales result GR/GI sequence number 売上実績受払連番.<p>
	 *
	 */
	public void sls_act_io_seq(long value) {
		setConstNumber(offset + 5, $sls_act_io_seq, value);
	}

	/**
	 * Sales result GR/GI sequence number 売上実績受払連番.<p>
	 *
	 */
	public void sls_act_io_seq(float value) {
		setConstNumber(offset + 5, $sls_act_io_seq, value);
	}

	/**
	 * Sales result GR/GI sequence number 売上実績受払連番.<p>
	 *
	 */
	public void sls_act_io_seq(double value) {
		setConstNumber(offset + 5, $sls_act_io_seq, value);
	}


	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public String sls_ret_schd_d_no() {
		return getConstString(offset + 6, $sls_ret_schd_d_no);
	}

	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public void sls_ret_schd_d_no(String value) {
		setConstString(offset + 6, $sls_ret_schd_d_no, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 7, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 7, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 8, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 8, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 8, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 8, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 8, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 8, $trd_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 9, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 9, $base_unit_cd, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 10, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 10, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 10, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 10, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 10, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 10, $base_unit_qty, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 11, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 11, $pack_unit_cd, value);
	}


	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 12, $pack_unit_qty);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 12, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 12, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 12, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 12, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 12, $pack_unit_qty, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 13, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 13, $gd_cd, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 14, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 14, $loc_cd, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 15, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 15, $str_ln_cd, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 16, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 16, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 17, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 17, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 18, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 18, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 19, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 19, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 20, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 20, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 21, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 21, $sno4, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 22, $arr_act_no);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 22, $arr_act_no, value);
	}


	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public String purc_act_io_no() {
		return getConstString(offset + 23, $purc_act_io_no);
	}

	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public void purc_act_io_no(String value) {
		setConstString(offset + 23, $purc_act_io_no, value);
	}


	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 24, $sync_flg);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 24, $sync_flg, value);
	}


	/**
	 * Cancel remaining sales return schedule 売上返品予定打切.<p>
	 *
	 */
	public boolean sls_ret_schd_abort_flg() {
		return getConstBoolean(offset + 25, $sls_ret_schd_abort_flg);
	}

	/**
	 * Cancel remaining sales return schedule 売上返品予定打切.<p>
	 *
	 */
	public void sls_ret_schd_abort_flg(boolean value) {
		setConstBoolean(offset + 25, $sls_ret_schd_abort_flg, value);
	}


	/**
	 * Details spare 1 詳細予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 26, $sub_char1);
	}

	/**
	 * Details spare 1 詳細予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 26, $sub_char1, value);
	}


	/**
	 * Details spare 2 詳細予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 27, $sub_char2);
	}

	/**
	 * Details spare 2 詳細予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 27, $sub_char2, value);
	}


	/**
	 * Details spare 3 詳細予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 28, $sub_char3);
	}

	/**
	 * Details spare 3 詳細予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 28, $sub_char3, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			return sls_act_io_no();
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_d_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			return purc_act_io_no();
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
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		if ($io_peg_no.equalsIgnoreCase(name)) {
			return io_peg_no();
		}
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			return sls_act_io_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($sls_ret_schd_abort_flg.equalsIgnoreCase(name)) {
			return sls_ret_schd_abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			return sls_act_io_no();
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_d_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			return purc_act_io_no();
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
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		if ($io_peg_no.equalsIgnoreCase(name)) {
			return io_peg_no();
		}
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			return sls_act_io_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($sls_ret_schd_abort_flg.equalsIgnoreCase(name)) {
			return sls_ret_schd_abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			sls_act_io_no(value);
			return;
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			sls_ret_schd_d_no(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			purc_act_io_no(value);
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
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($io_peg_no.equalsIgnoreCase(name)) {
			io_peg_no(value);
			return;
		}
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($io_peg_no.equalsIgnoreCase(name)) {
			io_peg_no(value);
			return;
		}
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($io_peg_no.equalsIgnoreCase(name)) {
			io_peg_no(value);
			return;
		}
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($io_peg_no.equalsIgnoreCase(name)) {
			io_peg_no(value);
			return;
		}
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($io_peg_no.equalsIgnoreCase(name)) {
			io_peg_no(value);
			return;
		}
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($sls_ret_schd_abort_flg.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			sls_act_io_no(value);
			return;
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			sls_ret_schd_d_no(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			purc_act_io_no(value);
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
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($io_peg_no.equalsIgnoreCase(name)) {
			io_peg_no(value);
			return;
		}
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($io_peg_no.equalsIgnoreCase(name)) {
			io_peg_no(value);
			return;
		}
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($io_peg_no.equalsIgnoreCase(name)) {
			io_peg_no(value);
			return;
		}
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($io_peg_no.equalsIgnoreCase(name)) {
			io_peg_no(value);
			return;
		}
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($io_peg_no.equalsIgnoreCase(name)) {
			io_peg_no(value);
			return;
		}
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($sls_ret_schd_abort_flg.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

