package mcframe.serverMSBD.MSBDL5030;

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
 * ブロック"PurcSchd_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PurcSchd_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Direct delivery 仕入直送.<p>
	 *
	 */
	public static final String $purc_ddlv_flg = "purc_ddlv_flg";
	/**
	 * No credit update required 与信更新不要.<p>
	 *
	 */
	public static final String $no_cred_upd_flg = "no_cred_upd_flg";
	public static final String $purc_schd = "purc_schd";

	public static final String $arr_schd_no = $purc_schd + ".arr_schd_no";
	public static final String $arr_pr_no = $purc_schd + ".arr_pr_no";
	public static final String $purc_schd_no = $purc_schd + ".purc_schd_no";
	public static final String $purc_schd_dt = $purc_schd + ".purc_schd_dt";
	public static final String $trd_unit_schd_qty = $purc_schd + ".trd_unit_schd_qty";
	public static final String $trd_unit_cd = $purc_schd + ".trd_unit_cd";
	public static final String $base_unit_schd_qty = $purc_schd + ".base_unit_schd_qty";
	public static final String $base_unit_abort_qty = $purc_schd + ".base_unit_abort_qty";
	public static final String $base_unit_purc_qty = $purc_schd + ".base_unit_purc_qty";
	public static final String $base_unit_accpt_dfct_qty = $purc_schd + ".base_unit_accpt_dfct_qty";
	public static final String $base_unit_cd = $purc_schd + ".base_unit_cd";
	public static final String $non_purc_flg = $purc_schd + ".non_purc_flg";
	public static final String $cmpl_flg = $purc_schd + ".cmpl_flg";
	public static final String $abort_flg = $purc_schd + ".abort_flg";
	public static final String $purc_split_flg = $purc_schd + ".purc_split_flg";
	public static final String $sub_char1 = $purc_schd + ".sub_char1";
	public static final String $sub_char2 = $purc_schd + ".sub_char2";
	public static final String $sub_char3 = $purc_schd + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta purc_ddlv_flg_META = createCommonMeta($purc_ddlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_cred_upd_flg_META = createCommonMeta($no_cred_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_schd_META = createInnerRowMeta($purc_schd, mcframe.serverMS.dbc.MST_PURC_SCHD_R.class);

	protected static final ConstMetaList<PurcSchd_DtlR> constMetas = new ConstMetaList<PurcSchd_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			po_d_no_META,
			purc_ddlv_flg_META,
			no_cred_upd_flg_META,
			purc_schd_META
		},
		new String[][]{
			{
				"arr_schd_no",
				"arr_pr_no",
				"purc_schd_no",
				"purc_schd_dt",
				"trd_unit_schd_qty",
				"trd_unit_cd",
				"base_unit_schd_qty",
				"base_unit_abort_qty",
				"base_unit_purc_qty",
				"base_unit_accpt_dfct_qty",
				"base_unit_cd",
				"non_purc_flg",
				"cmpl_flg",
				"abort_flg",
				"purc_split_flg",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$arr_schd_no,
				$arr_pr_no,
				$purc_schd_no,
				$purc_schd_dt,
				$trd_unit_schd_qty,
				$trd_unit_cd,
				$base_unit_schd_qty,
				$base_unit_abort_qty,
				$base_unit_purc_qty,
				$base_unit_accpt_dfct_qty,
				$base_unit_cd,
				$non_purc_flg,
				$cmpl_flg,
				$abort_flg,
				$purc_split_flg,
				$sub_char1,
				$sub_char2,
				$sub_char3
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
	protected PurcSchd_DtlR_MC_A(ConstMetaList<? extends PurcSchd_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcSchd_DtlR clone() {
		return (PurcSchd_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcSchd_DtlR createInstance() {
		return (PurcSchd_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcSchd_DtlR getValues(String... names) {
		return (PurcSchd_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
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
	 * Direct delivery 仕入直送.<p>
	 *
	 */
	public boolean purc_ddlv_flg() {
		return getConstBoolean(offset + 4, $purc_ddlv_flg);
	}

	/**
	 * Direct delivery 仕入直送.<p>
	 *
	 */
	public void purc_ddlv_flg(boolean value) {
		setConstBoolean(offset + 4, $purc_ddlv_flg, value);
	}


	/**
	 * No credit update required 与信更新不要.<p>
	 *
	 */
	public boolean no_cred_upd_flg() {
		return getConstBoolean(offset + 5, $no_cred_upd_flg);
	}

	/**
	 * No credit update required 与信更新不要.<p>
	 *
	 */
	public void no_cred_upd_flg(boolean value) {
		setConstBoolean(offset + 5, $no_cred_upd_flg, value);
	}


	public mcframe.serverMS.dbc.MST_PURC_SCHD_R purc_schd(){
		return (mcframe.serverMS.dbc.MST_PURC_SCHD_R) getConstInnerRow(offset + 6, $purc_schd);
	}
	
	public void purc_schd(mcframe.serverMS.dbc.MST_PURC_SCHD_R row){
		setConstInnerRow(offset + 6, $purc_schd, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		if ($no_cred_upd_flg.equalsIgnoreCase(name)) {
			return no_cred_upd_flg();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		if ($no_cred_upd_flg.equalsIgnoreCase(name)) {
			return no_cred_upd_flg();
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		if ($no_cred_upd_flg.equalsIgnoreCase(name)) {
			no_cred_upd_flg(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		if ($no_cred_upd_flg.equalsIgnoreCase(name)) {
			no_cred_upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($purc_schd.equalsIgnoreCase(name)) {
			return purc_schd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($purc_schd.equalsIgnoreCase(name)) {
			purc_schd(
				((MCContainerMeta) purc_schd_META).castInnerRow(mcframe.serverMS.dbc.MST_PURC_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return purc_schd().arr_schd_no();
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		purc_schd().arr_schd_no(value);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return purc_schd().arr_pr_no();
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		purc_schd().arr_pr_no(value);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return purc_schd().purc_schd_no();
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		purc_schd().purc_schd_no(value);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return purc_schd().purc_schd_dt();
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		purc_schd().purc_schd_dt(value);
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public MCNumber trd_unit_schd_qty() {
		return purc_schd().trd_unit_schd_qty();
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(MCNumber value) {
		purc_schd().trd_unit_schd_qty(value);
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(int value) {
		purc_schd().trd_unit_schd_qty(value);
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(long value) {
		purc_schd().trd_unit_schd_qty(value);
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(float value) {
		purc_schd().trd_unit_schd_qty(value);
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(double value) {
		purc_schd().trd_unit_schd_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return purc_schd().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		purc_schd().trd_unit_cd(value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public MCNumber base_unit_schd_qty() {
		return purc_schd().base_unit_schd_qty();
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(MCNumber value) {
		purc_schd().base_unit_schd_qty(value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(int value) {
		purc_schd().base_unit_schd_qty(value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(long value) {
		purc_schd().base_unit_schd_qty(value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(float value) {
		purc_schd().base_unit_schd_qty(value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(double value) {
		purc_schd().base_unit_schd_qty(value);
	}

	/**
	 * Base unit cancelled remaining qty. 基準単位打切数量.<p>
	 *
	 */
	public MCNumber base_unit_abort_qty() {
		return purc_schd().base_unit_abort_qty();
	}

	/**
	 * Base unit cancelled remaining qty. 基準単位打切数量.<p>
	 *
	 */
	public void base_unit_abort_qty(MCNumber value) {
		purc_schd().base_unit_abort_qty(value);
	}

	/**
	 * Base unit cancelled remaining qty. 基準単位打切数量.<p>
	 *
	 */
	public void base_unit_abort_qty(int value) {
		purc_schd().base_unit_abort_qty(value);
	}

	/**
	 * Base unit cancelled remaining qty. 基準単位打切数量.<p>
	 *
	 */
	public void base_unit_abort_qty(long value) {
		purc_schd().base_unit_abort_qty(value);
	}

	/**
	 * Base unit cancelled remaining qty. 基準単位打切数量.<p>
	 *
	 */
	public void base_unit_abort_qty(float value) {
		purc_schd().base_unit_abort_qty(value);
	}

	/**
	 * Base unit cancelled remaining qty. 基準単位打切数量.<p>
	 *
	 */
	public void base_unit_abort_qty(double value) {
		purc_schd().base_unit_abort_qty(value);
	}

	/**
	 * Base unit purchase qty. 基準単位仕入数量.<p>
	 *
	 */
	public MCNumber base_unit_purc_qty() {
		return purc_schd().base_unit_purc_qty();
	}

	/**
	 * Base unit purchase qty. 基準単位仕入数量.<p>
	 *
	 */
	public void base_unit_purc_qty(MCNumber value) {
		purc_schd().base_unit_purc_qty(value);
	}

	/**
	 * Base unit purchase qty. 基準単位仕入数量.<p>
	 *
	 */
	public void base_unit_purc_qty(int value) {
		purc_schd().base_unit_purc_qty(value);
	}

	/**
	 * Base unit purchase qty. 基準単位仕入数量.<p>
	 *
	 */
	public void base_unit_purc_qty(long value) {
		purc_schd().base_unit_purc_qty(value);
	}

	/**
	 * Base unit purchase qty. 基準単位仕入数量.<p>
	 *
	 */
	public void base_unit_purc_qty(float value) {
		purc_schd().base_unit_purc_qty(value);
	}

	/**
	 * Base unit purchase qty. 基準単位仕入数量.<p>
	 *
	 */
	public void base_unit_purc_qty(double value) {
		purc_schd().base_unit_purc_qty(value);
	}

	/**
	 * Base unit acceptance detective qty. 基準単位検収不良数量.<p>
	 *
	 */
	public MCNumber base_unit_accpt_dfct_qty() {
		return purc_schd().base_unit_accpt_dfct_qty();
	}

	/**
	 * Base unit acceptance detective qty. 基準単位検収不良数量.<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(MCNumber value) {
		purc_schd().base_unit_accpt_dfct_qty(value);
	}

	/**
	 * Base unit acceptance detective qty. 基準単位検収不良数量.<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(int value) {
		purc_schd().base_unit_accpt_dfct_qty(value);
	}

	/**
	 * Base unit acceptance detective qty. 基準単位検収不良数量.<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(long value) {
		purc_schd().base_unit_accpt_dfct_qty(value);
	}

	/**
	 * Base unit acceptance detective qty. 基準単位検収不良数量.<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(float value) {
		purc_schd().base_unit_accpt_dfct_qty(value);
	}

	/**
	 * Base unit acceptance detective qty. 基準単位検収不良数量.<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(double value) {
		purc_schd().base_unit_accpt_dfct_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return purc_schd().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		purc_schd().base_unit_cd(value);
	}

	/**
	 * Not for purchase 仕入対象外.<p>
	 *
	 */
	public boolean non_purc_flg() {
		return purc_schd().non_purc_flg();
	}

	/**
	 * Not for purchase 仕入対象外.<p>
	 *
	 */
	public void non_purc_flg(boolean value) {
		purc_schd().non_purc_flg(value);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return purc_schd().cmpl_flg();
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		purc_schd().cmpl_flg(value);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return purc_schd().abort_flg();
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		purc_schd().abort_flg(value);
	}

	/**
	 * Purchase split 仕入分割.<p>
	 *
	 */
	public boolean purc_split_flg() {
		return purc_schd().purc_split_flg();
	}

	/**
	 * Purchase split 仕入分割.<p>
	 *
	 */
	public void purc_split_flg(boolean value) {
		purc_schd().purc_split_flg(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return purc_schd().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		purc_schd().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return purc_schd().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		purc_schd().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return purc_schd().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		purc_schd().sub_char3(value);
	}

}

