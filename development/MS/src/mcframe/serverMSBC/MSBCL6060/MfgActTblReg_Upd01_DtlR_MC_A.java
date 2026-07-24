package mcframe.serverMSBC.MSBCL6060;

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
 * ブロック"MfgActTblReg_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActTblReg_Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	public static final String $mfg_act = "mfg_act";

	public static final String $mfg_act_no = $mfg_act + ".mfg_act_no";
	public static final String $mfg_inst_no = $mfg_act + ".mfg_inst_no";
	public static final String $div_seq = $mfg_act + ".div_seq";
	public static final String $itm_mfg_inst_no = $mfg_act + ".itm_mfg_inst_no";
	public static final String $trd_cd = $mfg_act + ".trd_cd";
	public static final String $st_act_tm = $mfg_act + ".st_act_tm";
	public static final String $end_act_tm = $mfg_act + ".end_act_tm";
	public static final String $base_unit_yield_qty = $mfg_act + ".base_unit_yield_qty";
	public static final String $base_unit_dfct_qty = $mfg_act + ".base_unit_dfct_qty";
	public static final String $base_unit_cd = $mfg_act + ".base_unit_cd";
	public static final String $st_ac_dt = $mfg_act + ".st_ac_dt";
	public static final String $end_ac_dt = $mfg_act + ".end_ac_dt";
	public static final String $itm_yield = $mfg_act + ".itm_yield";
	public static final String $mfg_aprv_sts_typ = $mfg_act + ".mfg_aprv_sts_typ";
	public static final String $aprv_dt = $mfg_act + ".aprv_dt";
	public static final String $aprv_dpt_cd = $mfg_act + ".aprv_dpt_cd";
	public static final String $aprv_usr_cd = $mfg_act + ".aprv_usr_cd";
	public static final String $aprv_tm = $mfg_act + ".aprv_tm";
	public static final String $aprv_rsn = $mfg_act + ".aprv_rsn";
	public static final String $act_prnt_flg = $mfg_act + ".act_prnt_flg";
	public static final String $act_prnt_tm = $mfg_act + ".act_prnt_tm";
	public static final String $prnt_seq = $mfg_act + ".seq";
	public static final String $act_dpt_cd = $mfg_act + ".act_dpt_cd";
	public static final String $act_usr_cd = $mfg_act + ".act_usr_cd";
	public static final String $arr_purc_auto_reg_flg = $mfg_act + ".arr_purc_auto_reg_flg";
	public static final String $mfg_act_intr_rmrks = $mfg_act + ".intr_rmrks";
	public static final String $mfg_act_rpt_rmrks = $mfg_act + ".act_rpt_rmrks";
	public static final String $mfg_act_sub_char1 = $mfg_act + ".sub_char1";
	public static final String $mfg_act_sub_char2 = $mfg_act + ".sub_char2";
	public static final String $mfg_act_sub_char3 = $mfg_act + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta mfg_act_META = createInnerRowMeta($mfg_act, mcframe.serverMS.dbc.MST_MFG_ACT_R.class);

	protected static final ConstMetaList<MfgActTblReg_Upd01_DtlR> constMetas = new ConstMetaList<MfgActTblReg_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			mfg_act_META
		},
		new String[][]{
			{
				"mfg_act_no",
				"mfg_inst_no",
				"div_seq",
				"itm_mfg_inst_no",
				"trd_cd",
				"st_act_tm",
				"end_act_tm",
				"base_unit_yield_qty",
				"base_unit_dfct_qty",
				"base_unit_cd",
				"st_ac_dt",
				"end_ac_dt",
				"itm_yield",
				"mfg_aprv_sts_typ",
				"aprv_dt",
				"aprv_dpt_cd",
				"aprv_usr_cd",
				"aprv_tm",
				"aprv_rsn",
				"act_prnt_flg",
				"act_prnt_tm",
				"prnt_seq",
				"act_dpt_cd",
				"act_usr_cd",
				"arr_purc_auto_reg_flg",
				"mfg_act_intr_rmrks",
				"mfg_act_rpt_rmrks",
				"mfg_act_sub_char1",
				"mfg_act_sub_char2",
				"mfg_act_sub_char3"
			},
			{
				$mfg_act_no,
				$mfg_inst_no,
				$div_seq,
				$itm_mfg_inst_no,
				$trd_cd,
				$st_act_tm,
				$end_act_tm,
				$base_unit_yield_qty,
				$base_unit_dfct_qty,
				$base_unit_cd,
				$st_ac_dt,
				$end_ac_dt,
				$itm_yield,
				$mfg_aprv_sts_typ,
				$aprv_dt,
				$aprv_dpt_cd,
				$aprv_usr_cd,
				$aprv_tm,
				$aprv_rsn,
				$act_prnt_flg,
				$act_prnt_tm,
				$prnt_seq,
				$act_dpt_cd,
				$act_usr_cd,
				$arr_purc_auto_reg_flg,
				$mfg_act_intr_rmrks,
				$mfg_act_rpt_rmrks,
				$mfg_act_sub_char1,
				$mfg_act_sub_char2,
				$mfg_act_sub_char3
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
	protected MfgActTblReg_Upd01_DtlR_MC_A(ConstMetaList<? extends MfgActTblReg_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd01_DtlR clone() {
		return (MfgActTblReg_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd01_DtlR createInstance() {
		return (MfgActTblReg_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd01_DtlR getValues(String... names) {
		return (MfgActTblReg_Upd01_DtlR) super.getValues(names);
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
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	public mcframe.serverMS.dbc.MST_MFG_ACT_R mfg_act(){
		return (mcframe.serverMS.dbc.MST_MFG_ACT_R) getConstInnerRow(offset + 2, $mfg_act);
	}
	
	public void mfg_act(mcframe.serverMS.dbc.MST_MFG_ACT_R row){
		setConstInnerRow(offset + 2, $mfg_act, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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

	public MCRow getInnerRow(String name) {
		if ($mfg_act.equalsIgnoreCase(name)) {
			return mfg_act();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($mfg_act.equalsIgnoreCase(name)) {
			mfg_act(
				((MCContainerMeta) mfg_act_META).castInnerRow(mcframe.serverMS.dbc.MST_MFG_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return mfg_act().mfg_act_no();
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		mfg_act().mfg_act_no(value);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return mfg_act().mfg_inst_no();
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		mfg_act().mfg_inst_no(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return mfg_act().div_seq();
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		mfg_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		mfg_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		mfg_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		mfg_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		mfg_act().div_seq(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return mfg_act().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		mfg_act().itm_mfg_inst_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return mfg_act().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		mfg_act().trd_cd(value);
	}

	/**
	 * Actual start date and time 着手実績日時.<p>
	 *
	 */
	public MCDate st_act_tm() {
		return mfg_act().st_act_tm();
	}

	/**
	 * Actual start date and time 着手実績日時.<p>
	 *
	 */
	public void st_act_tm(MCDate value) {
		mfg_act().st_act_tm(value);
	}

	/**
	 * Actual end date and time 終了実績日時.<p>
	 *
	 */
	public MCDate end_act_tm() {
		return mfg_act().end_act_tm();
	}

	/**
	 * Actual end date and time 終了実績日時.<p>
	 *
	 */
	public void end_act_tm(MCDate value) {
		mfg_act().end_act_tm(value);
	}

	/**
	 * Base unit conforming qty. 基準単位良品数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return mfg_act().base_unit_yield_qty();
	}

	/**
	 * Base unit conforming qty. 基準単位良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		mfg_act().base_unit_yield_qty(value);
	}

	/**
	 * Base unit conforming qty. 基準単位良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		mfg_act().base_unit_yield_qty(value);
	}

	/**
	 * Base unit conforming qty. 基準単位良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		mfg_act().base_unit_yield_qty(value);
	}

	/**
	 * Base unit conforming qty. 基準単位良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		mfg_act().base_unit_yield_qty(value);
	}

	/**
	 * Base unit conforming qty. 基準単位良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		mfg_act().base_unit_yield_qty(value);
	}

	/**
	 * Base unit defective qty. 基準単位不良数量.<p>
	 *
	 */
	public MCNumber base_unit_dfct_qty() {
		return mfg_act().base_unit_dfct_qty();
	}

	/**
	 * Base unit defective qty. 基準単位不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(MCNumber value) {
		mfg_act().base_unit_dfct_qty(value);
	}

	/**
	 * Base unit defective qty. 基準単位不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(int value) {
		mfg_act().base_unit_dfct_qty(value);
	}

	/**
	 * Base unit defective qty. 基準単位不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(long value) {
		mfg_act().base_unit_dfct_qty(value);
	}

	/**
	 * Base unit defective qty. 基準単位不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(float value) {
		mfg_act().base_unit_dfct_qty(value);
	}

	/**
	 * Base unit defective qty. 基準単位不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(double value) {
		mfg_act().base_unit_dfct_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return mfg_act().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		mfg_act().base_unit_cd(value);
	}

	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public MCDate st_ac_dt() {
		return mfg_act().st_ac_dt();
	}

	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public void st_ac_dt(MCDate value) {
		mfg_act().st_ac_dt(value);
	}

	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public MCDate end_ac_dt() {
		return mfg_act().end_ac_dt();
	}

	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public void end_ac_dt(MCDate value) {
		mfg_act().end_ac_dt(value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public MCNumber itm_yield() {
		return mfg_act().itm_yield();
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(MCNumber value) {
		mfg_act().itm_yield(value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(int value) {
		mfg_act().itm_yield(value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(long value) {
		mfg_act().itm_yield(value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(float value) {
		mfg_act().itm_yield(value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(double value) {
		mfg_act().itm_yield(value);
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return mfg_act().mfg_aprv_sts_typ();
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		mfg_act().mfg_aprv_sts_typ(value);
	}

	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return mfg_act().aprv_dt();
	}

	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		mfg_act().aprv_dt(value);
	}

	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return mfg_act().aprv_dpt_cd();
	}

	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		mfg_act().aprv_dpt_cd(value);
	}

	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return mfg_act().aprv_usr_cd();
	}

	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		mfg_act().aprv_usr_cd(value);
	}

	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public MCDate aprv_tm() {
		return mfg_act().aprv_tm();
	}

	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public void aprv_tm(MCDate value) {
		mfg_act().aprv_tm(value);
	}

	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public String aprv_rsn() {
		return mfg_act().aprv_rsn();
	}

	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		mfg_act().aprv_rsn(value);
	}

	/**
	 * Mfg. record sheet issued 製造記録書発行済.<p>
	 *
	 */
	public boolean act_prnt_flg() {
		return mfg_act().act_prnt_flg();
	}

	/**
	 * Mfg. record sheet issued 製造記録書発行済.<p>
	 *
	 */
	public void act_prnt_flg(boolean value) {
		mfg_act().act_prnt_flg(value);
	}

	/**
	 * Mfg. record sheet issued date and time 製造記録書発行日時.<p>
	 *
	 */
	public MCDate act_prnt_tm() {
		return mfg_act().act_prnt_tm();
	}

	/**
	 * Mfg. record sheet issued date and time 製造記録書発行日時.<p>
	 *
	 */
	public void act_prnt_tm(MCDate value) {
		mfg_act().act_prnt_tm(value);
	}

	/**
	 * Mfg. record sheet sequence number 製造記録書連番.<p>
	 *
	 */
	public MCNumber prnt_seq() {
		return mfg_act().seq();
	}

	/**
	 * Mfg. record sheet sequence number 製造記録書連番.<p>
	 *
	 */
	public void prnt_seq(MCNumber value) {
		mfg_act().seq(value);
	}

	/**
	 * Mfg. record sheet sequence number 製造記録書連番.<p>
	 *
	 */
	public void prnt_seq(int value) {
		mfg_act().seq(value);
	}

	/**
	 * Mfg. record sheet sequence number 製造記録書連番.<p>
	 *
	 */
	public void prnt_seq(long value) {
		mfg_act().seq(value);
	}

	/**
	 * Mfg. record sheet sequence number 製造記録書連番.<p>
	 *
	 */
	public void prnt_seq(float value) {
		mfg_act().seq(value);
	}

	/**
	 * Mfg. record sheet sequence number 製造記録書連番.<p>
	 *
	 */
	public void prnt_seq(double value) {
		mfg_act().seq(value);
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return mfg_act().act_dpt_cd();
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		mfg_act().act_dpt_cd(value);
	}

	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return mfg_act().act_usr_cd();
	}

	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		mfg_act().act_usr_cd(value);
	}

	/**
	 * Auto-create at receipt/purchase 入荷・仕入時自動作成.<p>
	 *
	 */
	public boolean arr_purc_auto_reg_flg() {
		return mfg_act().arr_purc_auto_reg_flg();
	}

	/**
	 * Auto-create at receipt/purchase 入荷・仕入時自動作成.<p>
	 *
	 */
	public void arr_purc_auto_reg_flg(boolean value) {
		mfg_act().arr_purc_auto_reg_flg(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String mfg_act_intr_rmrks() {
		return mfg_act().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void mfg_act_intr_rmrks(String value) {
		mfg_act().intr_rmrks(value);
	}

	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public String mfg_act_rpt_rmrks() {
		return mfg_act().act_rpt_rmrks();
	}

	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public void mfg_act_rpt_rmrks(String value) {
		mfg_act().act_rpt_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String mfg_act_sub_char1() {
		return mfg_act().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void mfg_act_sub_char1(String value) {
		mfg_act().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String mfg_act_sub_char2() {
		return mfg_act().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void mfg_act_sub_char2(String value) {
		mfg_act().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String mfg_act_sub_char3() {
		return mfg_act().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void mfg_act_sub_char3(String value) {
		mfg_act().sub_char3(value);
	}

}

