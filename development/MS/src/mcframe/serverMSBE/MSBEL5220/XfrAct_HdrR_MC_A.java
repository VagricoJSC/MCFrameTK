package mcframe.serverMSBE.MSBEL5220;

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
 * ブロック"XfrAct_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrAct_HdrR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	public static final String $xah = "xah";
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public static final String $immd_dlv_prnt_flg = "immd_dlv_prnt_flg";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";

	public static final String $xfr_act_no = $xah + ".xfr_act_no";
	public static final String $xfr_inst_no = $xah + ".xfr_inst_no";
	public static final String $trd_cd = $xah + ".trd_cd";
	public static final String $trd_ptn_typ = $xah + ".trd_ptn_typ";
	public static final String $wg_cd = $xah + ".wg_cd";
	public static final String $lg_grp_cd = $xah + ".lg_grp_cd";
	public static final String $gr_loc_cd = $xah + ".gr_loc_cd";
	public static final String $gr_stk_arrv_bp_cd = $xah + ".gr_stk_arrv_bp_cd";
	public static final String $xfr_dt = $xah + ".xfr_dt";
	public static final String $ac_dt = $xah + ".ac_dt";
	public static final String $act_usr_cd = $xah + ".act_usr_cd";
	public static final String $act_dpt_cd = $xah + ".act_dpt_cd";
	public static final String $dlv_prnt_flg = $xah + ".dlv_prnt_flg";
	public static final String $dlv_prnt_tm = $xah + ".dlv_prnt_tm";
	public static final String $intr_rmrks = $xah + ".intr_rmrks";
	public static final String $trd_rmrks = $xah + ".trd_rmrks";
	public static final String $sub_char1 = $xah + ".sub_char1";
	public static final String $sub_char2 = $xah + ".sub_char2";
	public static final String $sub_char3 = $xah + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta xah_META = createInnerRowMeta($xah, mcframe.serverMS.dbc.MST_XFR_ACT_R.class);
	public static final MCMeta immd_dlv_prnt_flg_META = createCommonMeta($immd_dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);

	protected static final ConstMetaList<XfrAct_HdrR> constMetas = new ConstMetaList<XfrAct_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			xah_META,
			immd_dlv_prnt_flg_META,
			can_ac_dt_META,
			slo_no_META
		},
		new String[][]{
			{
				"xfr_act_no",
				"xfr_inst_no",
				"trd_cd",
				"trd_ptn_typ",
				"wg_cd",
				"lg_grp_cd",
				"gr_loc_cd",
				"gr_stk_arrv_bp_cd",
				"xfr_dt",
				"ac_dt",
				"act_usr_cd",
				"act_dpt_cd",
				"dlv_prnt_flg",
				"dlv_prnt_tm",
				"intr_rmrks",
				"trd_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$xfr_act_no,
				$xfr_inst_no,
				$trd_cd,
				$trd_ptn_typ,
				$wg_cd,
				$lg_grp_cd,
				$gr_loc_cd,
				$gr_stk_arrv_bp_cd,
				$xfr_dt,
				$ac_dt,
				$act_usr_cd,
				$act_dpt_cd,
				$dlv_prnt_flg,
				$dlv_prnt_tm,
				$intr_rmrks,
				$trd_rmrks,
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
	protected XfrAct_HdrR_MC_A(ConstMetaList<? extends XfrAct_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrAct_HdrR clone() {
		return (XfrAct_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrAct_HdrR createInstance() {
		return (XfrAct_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrAct_HdrR getValues(String... names) {
		return (XfrAct_HdrR) super.getValues(names);
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


	public mcframe.serverMS.dbc.MST_XFR_ACT_R xah(){
		return (mcframe.serverMS.dbc.MST_XFR_ACT_R) getConstInnerRow(offset + 1, $xah);
	}
	
	public void xah(mcframe.serverMS.dbc.MST_XFR_ACT_R row){
		setConstInnerRow(offset + 1, $xah, row);
	}


	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public boolean immd_dlv_prnt_flg() {
		return getConstBoolean(offset + 2, $immd_dlv_prnt_flg);
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public void immd_dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 2, $immd_dlv_prnt_flg, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 3, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 3, $can_ac_dt, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 4, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 4, $slo_no, value);
	}


	public String getString(String name) {
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return immd_dlv_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return immd_dlv_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
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
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			immd_dlv_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
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
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			immd_dlv_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($xah.equalsIgnoreCase(name)) {
			return xah();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($xah.equalsIgnoreCase(name)) {
			xah(
				((MCContainerMeta) xah_META).castInnerRow(mcframe.serverMS.dbc.MST_XFR_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public String xfr_act_no() {
		return xah().xfr_act_no();
	}

	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public void xfr_act_no(String value) {
		xah().xfr_act_no(value);
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public String xfr_inst_no() {
		return xah().xfr_inst_no();
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public void xfr_inst_no(String value) {
		xah().xfr_inst_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return xah().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		xah().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return xah().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		xah().trd_ptn_typ(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return xah().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		xah().wg_cd(value);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return xah().lg_grp_cd();
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		xah().lg_grp_cd(value);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return xah().gr_loc_cd();
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		xah().gr_loc_cd(value);
	}

	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gr_stk_arrv_bp_cd() {
		return xah().gr_stk_arrv_bp_cd();
	}

	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gr_stk_arrv_bp_cd(String value) {
		xah().gr_stk_arrv_bp_cd(value);
	}

	/**
	 * Movement day 移動日.<p>
	 *
	 */
	public MCDate xfr_dt() {
		return xah().xfr_dt();
	}

	/**
	 * Movement day 移動日.<p>
	 *
	 */
	public void xfr_dt(MCDate value) {
		xah().xfr_dt(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return xah().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		xah().ac_dt(value);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return xah().act_usr_cd();
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		xah().act_usr_cd(value);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return xah().act_dpt_cd();
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		xah().act_dpt_cd(value);
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public boolean dlv_prnt_flg() {
		return xah().dlv_prnt_flg();
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public void dlv_prnt_flg(boolean value) {
		xah().dlv_prnt_flg(value);
	}

	/**
	 * Delivery note issue date and time 納品書発行日時.<p>
	 *
	 */
	public MCDate dlv_prnt_tm() {
		return xah().dlv_prnt_tm();
	}

	/**
	 * Delivery note issue date and time 納品書発行日時.<p>
	 *
	 */
	public void dlv_prnt_tm(MCDate value) {
		xah().dlv_prnt_tm(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return xah().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		xah().intr_rmrks(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return xah().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		xah().trd_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return xah().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		xah().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return xah().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		xah().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return xah().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		xah().sub_char3(value);
	}

}

