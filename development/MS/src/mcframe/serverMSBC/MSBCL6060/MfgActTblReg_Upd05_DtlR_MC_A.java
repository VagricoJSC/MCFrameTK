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
 * ブロック"MfgActTblReg_Upd05_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActTblReg_Upd05_DtlR_MC_A extends MCConstRow {

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
	public static final String $wk_act = "wk_act";

	public static final String $wk_act_no = $wk_act + ".wk_act_no";
	public static final String $mfg_act_no = $wk_act + ".mfg_act_no";
	public static final String $itm_mfg_inst_no = $wk_act + ".itm_mfg_inst_no";
	public static final String $oper_act_no = $wk_act + ".oper_act_no";
	public static final String $wk_schd_no = $wk_act + ".wk_schd_no";
	public static final String $div_seq = $wk_act + ".div_seq";
	public static final String $wk_cost_cd = $wk_act + ".wk_cost_cd";
	public static final String $wk_cost = $wk_act + ".wk_cost";
	public static final String $st_tm = $wk_act + ".st_tm";
	public static final String $end_tm = $wk_act + ".end_tm";
	public static final String $brk_pd = $wk_act + ".brk_pd";
	public static final String $ac_dt = $wk_act + ".ac_dt";
	public static final String $wk_rsn_cd = $wk_act + ".wk_rsn_cd";
	public static final String $wk_cost_calc_ctl_flg = $wk_act + ".wk_cost_calc_ctl_flg";
	public static final String $wk_day_cd = $wk_act + ".wk_day_cd";
	public static final String $dpt_cd = $wk_act + ".dpt_cd";
	public static final String $loc_cd = $wk_act + ".loc_cd";
	public static final String $str_ln_cd = $wk_act + ".str_ln_cd";
	public static final String $wk_usr_dpt_cd = $wk_act + ".wk_usr_dpt_cd";
	public static final String $wk_usr_cd = $wk_act + ".wk_usr_cd";
	public static final String $fclty = $wk_act + ".fclty";
	public static final String $oper_cd = $wk_act + ".oper_cd";
	public static final String $sno1 = $wk_act + ".sno1";
	public static final String $sno2 = $wk_act + ".sno2";
	public static final String $sno3 = $wk_act + ".sno3";
	public static final String $sno4 = $wk_act + ".sno4";
	public static final String $itm_cd = $wk_act + ".itm_cd";
	public static final String $itm_sub1 = $wk_act + ".itm_sub1";
	public static final String $itm_sub2 = $wk_act + ".itm_sub2";
	public static final String $itm_sub3 = $wk_act + ".itm_sub3";
	public static final String $lot_no = $wk_act + ".lot_no";
	public static final String $sublot_no = $wk_act + ".sublot_no";
	public static final String $dpt_wg_cd = $wk_act + ".dpt_wg_cd";
	public static final String $loc_wg_cd = $wk_act + ".loc_wg_cd";
	public static final String $intr_rmrks = $wk_act + ".intr_rmrks";
	public static final String $sub_char1 = $wk_act + ".sub_char1";
	public static final String $sub_char2 = $wk_act + ".sub_char2";
	public static final String $sub_char3 = $wk_act + ".sub_char3";
	public static final String $mes_flg = $wk_act + ".mes_flg";
	public static final String $ext_sys_cd = $wk_act + ".ext_sys_cd";
	public static final String $ext_wk_act_no = $wk_act + ".ext_wk_act_no";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta wk_act_META = createInnerRowMeta($wk_act, mcframe.serverMS.dbc.MST_WK_ACT_R.class);

	protected static final ConstMetaList<MfgActTblReg_Upd05_DtlR> constMetas = new ConstMetaList<MfgActTblReg_Upd05_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			wk_act_META
		},
		new String[][]{
			{
				"wk_act_no",
				"mfg_act_no",
				"itm_mfg_inst_no",
				"oper_act_no",
				"wk_schd_no",
				"div_seq",
				"wk_cost_cd",
				"wk_cost",
				"st_tm",
				"end_tm",
				"brk_pd",
				"ac_dt",
				"wk_rsn_cd",
				"wk_cost_calc_ctl_flg",
				"wk_day_cd",
				"dpt_cd",
				"loc_cd",
				"str_ln_cd",
				"wk_usr_dpt_cd",
				"wk_usr_cd",
				"fclty",
				"oper_cd",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"lot_no",
				"sublot_no",
				"dpt_wg_cd",
				"loc_wg_cd",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"mes_flg",
				"ext_sys_cd",
				"ext_wk_act_no"
			},
			{
				$wk_act_no,
				$mfg_act_no,
				$itm_mfg_inst_no,
				$oper_act_no,
				$wk_schd_no,
				$div_seq,
				$wk_cost_cd,
				$wk_cost,
				$st_tm,
				$end_tm,
				$brk_pd,
				$ac_dt,
				$wk_rsn_cd,
				$wk_cost_calc_ctl_flg,
				$wk_day_cd,
				$dpt_cd,
				$loc_cd,
				$str_ln_cd,
				$wk_usr_dpt_cd,
				$wk_usr_cd,
				$fclty,
				$oper_cd,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$lot_no,
				$sublot_no,
				$dpt_wg_cd,
				$loc_wg_cd,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$mes_flg,
				$ext_sys_cd,
				$ext_wk_act_no
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
	protected MfgActTblReg_Upd05_DtlR_MC_A(ConstMetaList<? extends MfgActTblReg_Upd05_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd05_DtlR clone() {
		return (MfgActTblReg_Upd05_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd05_DtlR createInstance() {
		return (MfgActTblReg_Upd05_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd05_DtlR getValues(String... names) {
		return (MfgActTblReg_Upd05_DtlR) super.getValues(names);
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


	public mcframe.serverMS.dbc.MST_WK_ACT_R wk_act(){
		return (mcframe.serverMS.dbc.MST_WK_ACT_R) getConstInnerRow(offset + 2, $wk_act);
	}
	
	public void wk_act(mcframe.serverMS.dbc.MST_WK_ACT_R row){
		setConstInnerRow(offset + 2, $wk_act, row);
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
		if ($wk_act.equalsIgnoreCase(name)) {
			return wk_act();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wk_act.equalsIgnoreCase(name)) {
			wk_act(
				((MCContainerMeta) wk_act_META).castInnerRow(mcframe.serverMS.dbc.MST_WK_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public String wk_act_no() {
		return wk_act().wk_act_no();
	}

	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public void wk_act_no(String value) {
		wk_act().wk_act_no(value);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return wk_act().mfg_act_no();
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		wk_act().mfg_act_no(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return wk_act().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		wk_act().itm_mfg_inst_no(value);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return wk_act().oper_act_no();
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		wk_act().oper_act_no(value);
	}

	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public String wk_schd_no() {
		return wk_act().wk_schd_no();
	}

	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public void wk_schd_no(String value) {
		wk_act().wk_schd_no(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return wk_act().div_seq();
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		wk_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		wk_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		wk_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		wk_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		wk_act().div_seq(value);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return wk_act().wk_cost_cd();
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		wk_act().wk_cost_cd(value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public MCNumber wk_cost() {
		return wk_act().wk_cost();
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void wk_cost(MCNumber value) {
		wk_act().wk_cost(value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void wk_cost(int value) {
		wk_act().wk_cost(value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void wk_cost(long value) {
		wk_act().wk_cost(value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void wk_cost(float value) {
		wk_act().wk_cost(value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void wk_cost(double value) {
		wk_act().wk_cost(value);
	}

	/**
	 * Start time 着手時刻.<p>
	 *
	 */
	public MCDate st_tm() {
		return wk_act().st_tm();
	}

	/**
	 * Start time 着手時刻.<p>
	 *
	 */
	public void st_tm(MCDate value) {
		wk_act().st_tm(value);
	}

	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public MCDate end_tm() {
		return wk_act().end_tm();
	}

	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public void end_tm(MCDate value) {
		wk_act().end_tm(value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public MCNumber brk_pd() {
		return wk_act().brk_pd();
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(MCNumber value) {
		wk_act().brk_pd(value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(int value) {
		wk_act().brk_pd(value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(long value) {
		wk_act().brk_pd(value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(float value) {
		wk_act().brk_pd(value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(double value) {
		wk_act().brk_pd(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return wk_act().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		wk_act().ac_dt(value);
	}

	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public String wk_rsn_cd() {
		return wk_act().wk_rsn_cd();
	}

	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public void wk_rsn_cd(String value) {
		wk_act().wk_rsn_cd(value);
	}

	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public boolean wk_cost_calc_ctl_flg() {
		return wk_act().wk_cost_calc_ctl_flg();
	}

	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public void wk_cost_calc_ctl_flg(boolean value) {
		wk_act().wk_cost_calc_ctl_flg(value);
	}

	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public String wk_day_cd() {
		return wk_act().wk_day_cd();
	}

	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public void wk_day_cd(String value) {
		wk_act().wk_day_cd(value);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return wk_act().dpt_cd();
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		wk_act().dpt_cd(value);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return wk_act().loc_cd();
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		wk_act().loc_cd(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return wk_act().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		wk_act().str_ln_cd(value);
	}

	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public String wk_usr_dpt_cd() {
		return wk_act().wk_usr_dpt_cd();
	}

	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public void wk_usr_dpt_cd(String value) {
		wk_act().wk_usr_dpt_cd(value);
	}

	/**
	 * Worker cd. 作業者ＣＤ.<p>
	 *
	 */
	public String wk_usr_cd() {
		return wk_act().wk_usr_cd();
	}

	/**
	 * Worker cd. 作業者ＣＤ.<p>
	 *
	 */
	public void wk_usr_cd(String value) {
		wk_act().wk_usr_cd(value);
	}

	/**
	 * Equipment 設備.<p>
	 *
	 */
	public String fclty() {
		return wk_act().fclty();
	}

	/**
	 * Equipment 設備.<p>
	 *
	 */
	public void fclty(String value) {
		wk_act().fclty(value);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return wk_act().oper_cd();
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		wk_act().oper_cd(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return wk_act().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		wk_act().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return wk_act().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		wk_act().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return wk_act().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		wk_act().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return wk_act().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		wk_act().sno4(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return wk_act().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		wk_act().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return wk_act().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		wk_act().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return wk_act().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		wk_act().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return wk_act().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		wk_act().itm_sub3(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return wk_act().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		wk_act().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return wk_act().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		wk_act().sublot_no(value);
	}

	/**
	 * Dept. WG 部門ワーキンググループ.<p>
	 *
	 */
	public String dpt_wg_cd() {
		return wk_act().dpt_wg_cd();
	}

	/**
	 * Dept. WG 部門ワーキンググループ.<p>
	 *
	 */
	public void dpt_wg_cd(String value) {
		wk_act().dpt_wg_cd(value);
	}

	/**
	 * Location WG group 場所ワーキンググループ.<p>
	 *
	 */
	public String loc_wg_cd() {
		return wk_act().loc_wg_cd();
	}

	/**
	 * Location WG group 場所ワーキンググループ.<p>
	 *
	 */
	public void loc_wg_cd(String value) {
		wk_act().loc_wg_cd(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return wk_act().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		wk_act().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return wk_act().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		wk_act().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return wk_act().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		wk_act().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return wk_act().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		wk_act().sub_char3(value);
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return wk_act().mes_flg();
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		wk_act().mes_flg(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return wk_act().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		wk_act().ext_sys_cd(value);
	}

	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public String ext_wk_act_no() {
		return wk_act().ext_wk_act_no();
	}

	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public void ext_wk_act_no(String value) {
		wk_act().ext_wk_act_no(value);
	}

}

