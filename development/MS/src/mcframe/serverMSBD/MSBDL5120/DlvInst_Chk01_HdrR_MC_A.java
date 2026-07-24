package mcframe.serverMSBD.MSBDL5120;

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
 * ブロック"DlvInst_Chk01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DlvInst_Chk01_HdrR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_no = "dlv_inst_no";
	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public static final String $dlv_inst_rev = "dlv_inst_rev";
	/**
	 * Delivery order sequence number 納入指示連番.<p>
	 *
	 */
	public static final String $dlv_inst_seq = "dlv_inst_seq";
	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public static final String $dlv_inst_dt = "dlv_inst_dt";
	/**
	 * Delivery order remarks 納入指示書備考.<p>
	 *
	 */
	public static final String $dlv_inst_prnt_rmrks = "dlv_inst_prnt_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
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
	/**
	 * Issue delivery order 納入指示書発行.<p>
	 *
	 */
	public static final String $dlv_inst_print_flg = "dlv_inst_print_flg";
	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public static final String $dlv_slip_print_flg = "dlv_slip_print_flg";
	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_print_flg = "purc_ddlv_dlv_slip_print_flg";
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public static final String $indiv_prnt_flg = "indiv_prnt_flg";
	/**
	 * Delivery order G No. 納入指示ＧＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_grp_no = "dlv_inst_grp_no";
	/**
	 * Current EDI delivery order 今回ＥＤＩ納入指示.<p>
	 *
	 */
	public static final String $crnt_edi_dlv_inst_flg = "crnt_edi_dlv_inst_flg";
	/**
	 * External system type 外部システム区分.<p>
	 *
	 */
	public static final String $ext_sys_typ = "ext_sys_typ";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta dlv_inst_no_META = createCommonMeta($dlv_inst_no, mcframe.commonMA.meta.MA_META.DLV_INST_NO);
	public static final MCMeta dlv_inst_rev_META = createCommonMeta($dlv_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_inst_seq_META = createCommonMeta($dlv_inst_seq, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_inst_dt_META = createCommonMeta($dlv_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_prnt_rmrks_META = createCommonMeta($dlv_inst_prnt_rmrks, mcframe.commonMS.meta.MS_META.DLV_INST_PRINT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.DLV_INST_INTR_RMRKS);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.DLV_INST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.DLV_INST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.DLV_INST_SUB_CHAR3);
	public static final MCMeta dlv_inst_print_flg_META = createCommonMeta($dlv_inst_print_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_print_flg_META = createCommonMeta($dlv_slip_print_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ddlv_dlv_slip_print_flg_META = createCommonMeta($purc_ddlv_dlv_slip_print_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta indiv_prnt_flg_META = createCommonMeta($indiv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_inst_grp_no_META = createCommonMeta($dlv_inst_grp_no, mcframe.commonMS.meta.MS_META.DLV_INST_GRP_NO);
	public static final MCMeta crnt_edi_dlv_inst_flg_META = createCommonMeta($crnt_edi_dlv_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_typ_META = createCommonMeta($ext_sys_typ, mcframe.commonMA.meta.MA_META.EXT_SYS_TYP);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);

	protected static final ConstMetaList<DlvInst_Chk01_HdrR> constMetas = new ConstMetaList<DlvInst_Chk01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			peg_no_META,
			err_flg_META,
			po_d_no_META,
			dlv_inst_no_META,
			dlv_inst_rev_META,
			dlv_inst_seq_META,
			dlv_inst_dt_META,
			dlv_inst_prnt_rmrks_META,
			intr_rmrks_META,
			edi_flg_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			dlv_inst_print_flg_META,
			dlv_slip_print_flg_META,
			purc_ddlv_dlv_slip_print_flg_META,
			indiv_prnt_flg_META,
			dlv_inst_grp_no_META,
			crnt_edi_dlv_inst_flg_META,
			ext_sys_typ_META,
			po_no_META
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
	protected DlvInst_Chk01_HdrR_MC_A(ConstMetaList<? extends DlvInst_Chk01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInst_Chk01_HdrR clone() {
		return (DlvInst_Chk01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInst_Chk01_HdrR createInstance() {
		return (DlvInst_Chk01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInst_Chk01_HdrR getValues(String... names) {
		return (DlvInst_Chk01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 3, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 3, $po_d_no, value);
	}


	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public String dlv_inst_no() {
		return getConstString(offset + 4, $dlv_inst_no);
	}

	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public void dlv_inst_no(String value) {
		setConstString(offset + 4, $dlv_inst_no, value);
	}


	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public MCNumber dlv_inst_rev() {
		return getConstNumber(offset + 5, $dlv_inst_rev);
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rev(MCNumber value) {
		setConstNumber(offset + 5, $dlv_inst_rev, value);
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rev(int value) {
		setConstNumber(offset + 5, $dlv_inst_rev, value);
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rev(long value) {
		setConstNumber(offset + 5, $dlv_inst_rev, value);
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rev(float value) {
		setConstNumber(offset + 5, $dlv_inst_rev, value);
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rev(double value) {
		setConstNumber(offset + 5, $dlv_inst_rev, value);
	}


	/**
	 * Delivery order sequence number 納入指示連番.<p>
	 *
	 */
	public MCNumber dlv_inst_seq() {
		return getConstNumber(offset + 6, $dlv_inst_seq);
	}

	/**
	 * Delivery order sequence number 納入指示連番.<p>
	 *
	 */
	public void dlv_inst_seq(MCNumber value) {
		setConstNumber(offset + 6, $dlv_inst_seq, value);
	}

	/**
	 * Delivery order sequence number 納入指示連番.<p>
	 *
	 */
	public void dlv_inst_seq(int value) {
		setConstNumber(offset + 6, $dlv_inst_seq, value);
	}

	/**
	 * Delivery order sequence number 納入指示連番.<p>
	 *
	 */
	public void dlv_inst_seq(long value) {
		setConstNumber(offset + 6, $dlv_inst_seq, value);
	}

	/**
	 * Delivery order sequence number 納入指示連番.<p>
	 *
	 */
	public void dlv_inst_seq(float value) {
		setConstNumber(offset + 6, $dlv_inst_seq, value);
	}

	/**
	 * Delivery order sequence number 納入指示連番.<p>
	 *
	 */
	public void dlv_inst_seq(double value) {
		setConstNumber(offset + 6, $dlv_inst_seq, value);
	}


	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public MCDate dlv_inst_dt() {
		return getConstDate(offset + 7, $dlv_inst_dt);
	}

	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public void dlv_inst_dt(MCDate value) {
		setConstDate(offset + 7, $dlv_inst_dt, value);
	}


	/**
	 * Delivery order remarks 納入指示書備考.<p>
	 *
	 */
	public String dlv_inst_prnt_rmrks() {
		return getConstString(offset + 8, $dlv_inst_prnt_rmrks);
	}

	/**
	 * Delivery order remarks 納入指示書備考.<p>
	 *
	 */
	public void dlv_inst_prnt_rmrks(String value) {
		setConstString(offset + 8, $dlv_inst_prnt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 9, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 9, $intr_rmrks, value);
	}


	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 10, $edi_flg);
	}

	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 10, $edi_flg, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 11, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 11, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 12, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 12, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 13, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 13, $sub_char3, value);
	}


	/**
	 * Issue delivery order 納入指示書発行.<p>
	 *
	 */
	public boolean dlv_inst_print_flg() {
		return getConstBoolean(offset + 14, $dlv_inst_print_flg);
	}

	/**
	 * Issue delivery order 納入指示書発行.<p>
	 *
	 */
	public void dlv_inst_print_flg(boolean value) {
		setConstBoolean(offset + 14, $dlv_inst_print_flg, value);
	}


	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public boolean dlv_slip_print_flg() {
		return getConstBoolean(offset + 15, $dlv_slip_print_flg);
	}

	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public void dlv_slip_print_flg(boolean value) {
		setConstBoolean(offset + 15, $dlv_slip_print_flg, value);
	}


	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public boolean purc_ddlv_dlv_slip_print_flg() {
		return getConstBoolean(offset + 16, $purc_ddlv_dlv_slip_print_flg);
	}

	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_print_flg(boolean value) {
		setConstBoolean(offset + 16, $purc_ddlv_dlv_slip_print_flg, value);
	}


	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public boolean indiv_prnt_flg() {
		return getConstBoolean(offset + 17, $indiv_prnt_flg);
	}

	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public void indiv_prnt_flg(boolean value) {
		setConstBoolean(offset + 17, $indiv_prnt_flg, value);
	}


	/**
	 * Delivery order G No. 納入指示ＧＮＯ.<p>
	 *
	 */
	public String dlv_inst_grp_no() {
		return getConstString(offset + 18, $dlv_inst_grp_no);
	}

	/**
	 * Delivery order G No. 納入指示ＧＮＯ.<p>
	 *
	 */
	public void dlv_inst_grp_no(String value) {
		setConstString(offset + 18, $dlv_inst_grp_no, value);
	}


	/**
	 * Current EDI delivery order 今回ＥＤＩ納入指示.<p>
	 *
	 */
	public boolean crnt_edi_dlv_inst_flg() {
		return getConstBoolean(offset + 19, $crnt_edi_dlv_inst_flg);
	}

	/**
	 * Current EDI delivery order 今回ＥＤＩ納入指示.<p>
	 *
	 */
	public void crnt_edi_dlv_inst_flg(boolean value) {
		setConstBoolean(offset + 19, $crnt_edi_dlv_inst_flg, value);
	}


	/**
	 * External system type 外部システム区分.<p>
	 *
	 */
	public String ext_sys_typ() {
		return getConstString(offset + 20, $ext_sys_typ);
	}

	/**
	 * External system type 外部システム区分.<p>
	 *
	 */
	public void ext_sys_typ(String value) {
		setConstString(offset + 20, $ext_sys_typ, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 21, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 21, $po_no, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($dlv_inst_prnt_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_prnt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			return dlv_inst_grp_no();
		}
		if ($ext_sys_typ.equalsIgnoreCase(name)) {
			return ext_sys_typ();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			return dlv_inst_rev();
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			return dlv_inst_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($dlv_inst_print_flg.equalsIgnoreCase(name)) {
			return dlv_inst_print_flg();
		}
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return dlv_slip_print_flg();
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_print_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		if ($crnt_edi_dlv_inst_flg.equalsIgnoreCase(name)) {
			return crnt_edi_dlv_inst_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($dlv_inst_prnt_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_prnt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			return dlv_inst_grp_no();
		}
		if ($ext_sys_typ.equalsIgnoreCase(name)) {
			return ext_sys_typ();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			return dlv_inst_rev();
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			return dlv_inst_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($dlv_inst_print_flg.equalsIgnoreCase(name)) {
			return dlv_inst_print_flg();
		}
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return dlv_slip_print_flg();
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_print_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		if ($crnt_edi_dlv_inst_flg.equalsIgnoreCase(name)) {
			return crnt_edi_dlv_inst_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($dlv_inst_prnt_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_prnt_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			dlv_inst_grp_no(value);
			return;
		}
		if ($ext_sys_typ.equalsIgnoreCase(name)) {
			ext_sys_typ(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($dlv_inst_print_flg.equalsIgnoreCase(name)) {
			dlv_inst_print_flg(value);
			return;
		}
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			dlv_slip_print_flg(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_print_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		if ($crnt_edi_dlv_inst_flg.equalsIgnoreCase(name)) {
			crnt_edi_dlv_inst_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($dlv_inst_prnt_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_prnt_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			dlv_inst_grp_no(value);
			return;
		}
		if ($ext_sys_typ.equalsIgnoreCase(name)) {
			ext_sys_typ(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($dlv_inst_print_flg.equalsIgnoreCase(name)) {
			dlv_inst_print_flg(value);
			return;
		}
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			dlv_slip_print_flg(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_print_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		if ($crnt_edi_dlv_inst_flg.equalsIgnoreCase(name)) {
			crnt_edi_dlv_inst_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

