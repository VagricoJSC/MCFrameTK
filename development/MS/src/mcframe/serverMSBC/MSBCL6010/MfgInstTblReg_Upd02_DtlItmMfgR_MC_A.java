package mcframe.serverMSBC.MSBCL6010;

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
 * ブロック"MfgInstTblReg_Upd02_DtlItmMfg"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstTblReg_Upd02_DtlItmMfgR_MC_A extends MCConstRow {

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
	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public static final String $inst_abort_flg = "inst_abort_flg";
	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public static final String $old_inst_abort_flg = "old_inst_abort_flg";
	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public static final String $not_frst_inst_can_flg = "not_frst_inst_can_flg";
	public static final String $itm_mfg_inst = "itm_mfg_inst";

	public static final String $itm_mfg_inst_no = $itm_mfg_inst + ".itm_mfg_inst_no";
	public static final String $itm_ord_no = $itm_mfg_inst + ".itm_ord_no";
	public static final String $io_schd_pr_no = $itm_mfg_inst + ".io_schd_pr_no";
	public static final String $frst_mfg_inst_no = $itm_mfg_inst + ".frst_mfg_inst_no";
	public static final String $mfg_mtd_typ = $itm_mfg_inst + ".mfg_mtd_typ";
	public static final String $sppl_cd = $itm_mfg_inst + ".sppl_cd";
	public static final String $itm_cd = $itm_mfg_inst + ".itm_cd";
	public static final String $itm_sub1 = $itm_mfg_inst + ".itm_sub1";
	public static final String $itm_sub2 = $itm_mfg_inst + ".itm_sub2";
	public static final String $itm_sub3 = $itm_mfg_inst + ".itm_sub3";
	public static final String $oper_ptn = $itm_mfg_inst + ".oper_ptn";
	public static final String $bom_ptn = $itm_mfg_inst + ".bom_ptn";
	public static final String $base_unit_yield_qty = $itm_mfg_inst + ".base_unit_yield_qty";
	public static final String $base_unit_inst_qty = $itm_mfg_inst + ".base_unit_inst_qty";
	public static final String $base_unit_cd = $itm_mfg_inst + ".base_unit_cd";
	public static final String $master_dt = $itm_mfg_inst + ".master_dt";
	public static final String $lot_no = $itm_mfg_inst + ".lot_no";
	public static final String $sublot_no = $itm_mfg_inst + ".sublot_no";
	public static final String $sno1 = $itm_mfg_inst + ".sno1";
	public static final String $sno2 = $itm_mfg_inst + ".sno2";
	public static final String $sno3 = $itm_mfg_inst + ".sno3";
	public static final String $sno4 = $itm_mfg_inst + ".sno4";
	public static final String $unschd_inst_flg = $itm_mfg_inst + ".unschd_inst_flg";
	public static final String $unschd_act_flg = $itm_mfg_inst + ".unschd_act_flg";
	public static final String $strg_loc_cd = $itm_mfg_inst + ".strg_loc_cd";
	public static final String $strg_str_ln_cd = $itm_mfg_inst + ".strg_str_ln_cd";
	public static final String $mfg_loc_cd = $itm_mfg_inst + ".mfg_loc_cd";
	public static final String $mfg_str_ln_cd = $itm_mfg_inst + ".mfg_str_ln_cd";
	public static final String $wg_cd = $itm_mfg_inst + ".wg_cd";
	public static final String $site_cd = $itm_mfg_inst + ".site_cd";
	public static final String $itm_lower_yield = $itm_mfg_inst + ".itm_lower_yield";
	public static final String $itm_std_yield = $itm_mfg_inst + ".itm_std_yield";
	public static final String $itm_upper_yield = $itm_mfg_inst + ".itm_upper_yield";
	public static final String $can_flg = $itm_mfg_inst + ".can_flg";
	public static final String $sub_char1 = $itm_mfg_inst + ".sub_char1";
	public static final String $sub_char2 = $itm_mfg_inst + ".sub_char2";
	public static final String $sub_char3 = $itm_mfg_inst + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta inst_abort_flg_META = createCommonMeta($inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_inst_abort_flg_META = createCommonMeta($old_inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_frst_inst_can_flg_META = createCommonMeta($not_frst_inst_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_mfg_inst_META = createInnerRowMeta($itm_mfg_inst, mcframe.serverMS.dbc.MST_ITM_MFG_INST_R.class);

	protected static final ConstMetaList<MfgInstTblReg_Upd02_DtlItmMfgR> constMetas = new ConstMetaList<MfgInstTblReg_Upd02_DtlItmMfgR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			inst_abort_flg_META,
			old_inst_abort_flg_META,
			not_frst_inst_can_flg_META,
			itm_mfg_inst_META
		},
		new String[][]{
			{
				"itm_mfg_inst_no",
				"itm_ord_no",
				"io_schd_pr_no",
				"frst_mfg_inst_no",
				"mfg_mtd_typ",
				"sppl_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"oper_ptn",
				"bom_ptn",
				"base_unit_yield_qty",
				"base_unit_inst_qty",
				"base_unit_cd",
				"master_dt",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"unschd_inst_flg",
				"unschd_act_flg",
				"strg_loc_cd",
				"strg_str_ln_cd",
				"mfg_loc_cd",
				"mfg_str_ln_cd",
				"wg_cd",
				"site_cd",
				"itm_lower_yield",
				"itm_std_yield",
				"itm_upper_yield",
				"can_flg",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$itm_mfg_inst_no,
				$itm_ord_no,
				$io_schd_pr_no,
				$frst_mfg_inst_no,
				$mfg_mtd_typ,
				$sppl_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$oper_ptn,
				$bom_ptn,
				$base_unit_yield_qty,
				$base_unit_inst_qty,
				$base_unit_cd,
				$master_dt,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$unschd_inst_flg,
				$unschd_act_flg,
				$strg_loc_cd,
				$strg_str_ln_cd,
				$mfg_loc_cd,
				$mfg_str_ln_cd,
				$wg_cd,
				$site_cd,
				$itm_lower_yield,
				$itm_std_yield,
				$itm_upper_yield,
				$can_flg,
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
	protected MfgInstTblReg_Upd02_DtlItmMfgR_MC_A(ConstMetaList<? extends MfgInstTblReg_Upd02_DtlItmMfgR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd02_DtlItmMfgR clone() {
		return (MfgInstTblReg_Upd02_DtlItmMfgR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd02_DtlItmMfgR createInstance() {
		return (MfgInstTblReg_Upd02_DtlItmMfgR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd02_DtlItmMfgR getValues(String... names) {
		return (MfgInstTblReg_Upd02_DtlItmMfgR) super.getValues(names);
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


	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public boolean inst_abort_flg() {
		return getConstBoolean(offset + 2, $inst_abort_flg);
	}

	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public void inst_abort_flg(boolean value) {
		setConstBoolean(offset + 2, $inst_abort_flg, value);
	}


	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public boolean old_inst_abort_flg() {
		return getConstBoolean(offset + 3, $old_inst_abort_flg);
	}

	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public void old_inst_abort_flg(boolean value) {
		setConstBoolean(offset + 3, $old_inst_abort_flg, value);
	}


	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public boolean not_frst_inst_can_flg() {
		return getConstBoolean(offset + 4, $not_frst_inst_can_flg);
	}

	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public void not_frst_inst_can_flg(boolean value) {
		setConstBoolean(offset + 4, $not_frst_inst_can_flg, value);
	}


	public mcframe.serverMS.dbc.MST_ITM_MFG_INST_R itm_mfg_inst(){
		return (mcframe.serverMS.dbc.MST_ITM_MFG_INST_R) getConstInnerRow(offset + 5, $itm_mfg_inst);
	}
	
	public void itm_mfg_inst(mcframe.serverMS.dbc.MST_ITM_MFG_INST_R row){
		setConstInnerRow(offset + 5, $itm_mfg_inst, row);
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
	public boolean getBoolean(String name) {
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			return old_inst_abort_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		return super.getBoolean(name);
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
	public boolean getBooleanNE(String name) {
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			return old_inst_abort_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		return super.getBooleanNE(name);
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
	public void setBoolean(String name, boolean value) {
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			old_inst_abort_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		super.setBoolean(name, value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			old_inst_abort_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_mfg_inst.equalsIgnoreCase(name)) {
			return itm_mfg_inst();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_mfg_inst.equalsIgnoreCase(name)) {
			itm_mfg_inst(
				((MCContainerMeta) itm_mfg_inst_META).castInnerRow(mcframe.serverMS.dbc.MST_ITM_MFG_INST_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return itm_mfg_inst().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		itm_mfg_inst().itm_mfg_inst_no(value);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return itm_mfg_inst().itm_ord_no();
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		itm_mfg_inst().itm_ord_no(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return itm_mfg_inst().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		itm_mfg_inst().io_schd_pr_no(value);
	}

	/**
	 * Initial mfg. order No. 初回製造指図ＮＯ.<p>
	 *
	 */
	public String frst_mfg_inst_no() {
		return itm_mfg_inst().frst_mfg_inst_no();
	}

	/**
	 * Initial mfg. order No. 初回製造指図ＮＯ.<p>
	 *
	 */
	public void frst_mfg_inst_no(String value) {
		itm_mfg_inst().frst_mfg_inst_no(value);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return itm_mfg_inst().mfg_mtd_typ();
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		itm_mfg_inst().mfg_mtd_typ(value);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return itm_mfg_inst().sppl_cd();
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		itm_mfg_inst().sppl_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return itm_mfg_inst().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		itm_mfg_inst().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return itm_mfg_inst().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		itm_mfg_inst().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return itm_mfg_inst().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		itm_mfg_inst().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return itm_mfg_inst().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		itm_mfg_inst().itm_sub3(value);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return itm_mfg_inst().oper_ptn();
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		itm_mfg_inst().oper_ptn(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return itm_mfg_inst().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		itm_mfg_inst().bom_ptn(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return itm_mfg_inst().base_unit_yield_qty();
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		itm_mfg_inst().base_unit_yield_qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		itm_mfg_inst().base_unit_yield_qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		itm_mfg_inst().base_unit_yield_qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		itm_mfg_inst().base_unit_yield_qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		itm_mfg_inst().base_unit_yield_qty(value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public MCNumber base_unit_inst_qty() {
		return itm_mfg_inst().base_unit_inst_qty();
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(MCNumber value) {
		itm_mfg_inst().base_unit_inst_qty(value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(int value) {
		itm_mfg_inst().base_unit_inst_qty(value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(long value) {
		itm_mfg_inst().base_unit_inst_qty(value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(float value) {
		itm_mfg_inst().base_unit_inst_qty(value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(double value) {
		itm_mfg_inst().base_unit_inst_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return itm_mfg_inst().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		itm_mfg_inst().base_unit_cd(value);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return itm_mfg_inst().master_dt();
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		itm_mfg_inst().master_dt(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return itm_mfg_inst().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		itm_mfg_inst().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return itm_mfg_inst().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		itm_mfg_inst().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return itm_mfg_inst().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		itm_mfg_inst().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return itm_mfg_inst().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		itm_mfg_inst().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return itm_mfg_inst().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		itm_mfg_inst().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return itm_mfg_inst().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		itm_mfg_inst().sno4(value);
	}

	/**
	 * Unplanned order flg. 計画外指図ＦＬＧ.<p>
	 *
	 */
	public boolean unschd_inst_flg() {
		return itm_mfg_inst().unschd_inst_flg();
	}

	/**
	 * Unplanned order flg. 計画外指図ＦＬＧ.<p>
	 *
	 */
	public void unschd_inst_flg(boolean value) {
		itm_mfg_inst().unschd_inst_flg(value);
	}

	/**
	 * Unplanned result flg. 計画外実績ＦＬＧ.<p>
	 *
	 */
	public boolean unschd_act_flg() {
		return itm_mfg_inst().unschd_act_flg();
	}

	/**
	 * Unplanned result flg. 計画外実績ＦＬＧ.<p>
	 *
	 */
	public void unschd_act_flg(boolean value) {
		itm_mfg_inst().unschd_act_flg(value);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return itm_mfg_inst().strg_loc_cd();
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		itm_mfg_inst().strg_loc_cd(value);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return itm_mfg_inst().strg_str_ln_cd();
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		itm_mfg_inst().strg_str_ln_cd(value);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return itm_mfg_inst().mfg_loc_cd();
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		itm_mfg_inst().mfg_loc_cd(value);
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return itm_mfg_inst().mfg_str_ln_cd();
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		itm_mfg_inst().mfg_str_ln_cd(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return itm_mfg_inst().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		itm_mfg_inst().wg_cd(value);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return itm_mfg_inst().site_cd();
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		itm_mfg_inst().site_cd(value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public MCNumber itm_lower_yield() {
		return itm_mfg_inst().itm_lower_yield();
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(MCNumber value) {
		itm_mfg_inst().itm_lower_yield(value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(int value) {
		itm_mfg_inst().itm_lower_yield(value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(long value) {
		itm_mfg_inst().itm_lower_yield(value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(float value) {
		itm_mfg_inst().itm_lower_yield(value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(double value) {
		itm_mfg_inst().itm_lower_yield(value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public MCNumber itm_std_yield() {
		return itm_mfg_inst().itm_std_yield();
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(MCNumber value) {
		itm_mfg_inst().itm_std_yield(value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(int value) {
		itm_mfg_inst().itm_std_yield(value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(long value) {
		itm_mfg_inst().itm_std_yield(value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(float value) {
		itm_mfg_inst().itm_std_yield(value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(double value) {
		itm_mfg_inst().itm_std_yield(value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public MCNumber itm_upper_yield() {
		return itm_mfg_inst().itm_upper_yield();
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(MCNumber value) {
		itm_mfg_inst().itm_upper_yield(value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(int value) {
		itm_mfg_inst().itm_upper_yield(value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(long value) {
		itm_mfg_inst().itm_upper_yield(value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(float value) {
		itm_mfg_inst().itm_upper_yield(value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(double value) {
		itm_mfg_inst().itm_upper_yield(value);
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public boolean can_flg() {
		return itm_mfg_inst().can_flg();
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public void can_flg(boolean value) {
		itm_mfg_inst().can_flg(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return itm_mfg_inst().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		itm_mfg_inst().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return itm_mfg_inst().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		itm_mfg_inst().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return itm_mfg_inst().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		itm_mfg_inst().sub_char3(value);
	}

}

