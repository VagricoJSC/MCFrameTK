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
 * ブロック"MfgActTblReg_Upd04_DtlLoss"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActTblReg_Upd04_DtlLossR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public static final String $inpt_peg_no = "inpt_peg_no";
	/**
	 * Skip Loss result entry ロス実績登録スキップ.<p>
	 *
	 */
	public static final String $loss_act_reg_skip_flg = "loss_act_reg_skip_flg";
	public static final String $loss_act = "loss_act";

	public static final String $loss_act_no = $loss_act + ".loss_act_no";
	public static final String $inpt_act_no = $loss_act + ".inpt_act_no";
	public static final String $loss_rsn_cd = $loss_act + ".loss_rsn_cd";
	public static final String $fxd_loss_flg = $loss_act + ".fxd_loss_flg";
	public static final String $base_unit_qty = $loss_act + ".base_unit_qty";
	public static final String $cont_qty = $loss_act + ".cont_qty";
	public static final String $intr_rmrks = $loss_act + ".intr_rmrks";
	public static final String $trd_rmrks = $loss_act + ".trd_rmrks";
	public static final String $loss_act_sub_char1 = $loss_act + ".sub_char1";
	public static final String $loss_act_sub_char2 = $loss_act + ".sub_char2";
	public static final String $loss_act_sub_char3 = $loss_act + ".sub_char3";

	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta inpt_peg_no_META = createCommonMeta($inpt_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta loss_act_reg_skip_flg_META = createCommonMeta($loss_act_reg_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loss_act_META = createInnerRowMeta($loss_act, mcframe.serverMS.dbc.MST_LOSS_ACT_R.class);

	protected static final ConstMetaList<MfgActTblReg_Upd04_DtlLossR> constMetas = new ConstMetaList<MfgActTblReg_Upd04_DtlLossR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			inpt_peg_no_META,
			loss_act_reg_skip_flg_META,
			loss_act_META
		},
		new String[][]{
			{
				"loss_act_no",
				"inpt_act_no",
				"loss_rsn_cd",
				"fxd_loss_flg",
				"base_unit_qty",
				"cont_qty",
				"intr_rmrks",
				"trd_rmrks",
				"loss_act_sub_char1",
				"loss_act_sub_char2",
				"loss_act_sub_char3"
			},
			{
				$loss_act_no,
				$inpt_act_no,
				$loss_rsn_cd,
				$fxd_loss_flg,
				$base_unit_qty,
				$cont_qty,
				$intr_rmrks,
				$trd_rmrks,
				$loss_act_sub_char1,
				$loss_act_sub_char2,
				$loss_act_sub_char3
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
	protected MfgActTblReg_Upd04_DtlLossR_MC_A(ConstMetaList<? extends MfgActTblReg_Upd04_DtlLossR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd04_DtlLossR clone() {
		return (MfgActTblReg_Upd04_DtlLossR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd04_DtlLossR createInstance() {
		return (MfgActTblReg_Upd04_DtlLossR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd04_DtlLossR getValues(String... names) {
		return (MfgActTblReg_Upd04_DtlLossR) super.getValues(names);
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
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public MCNumber inpt_peg_no() {
		return getConstNumber(offset + 1, $inpt_peg_no);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(int value) {
		setConstNumber(offset + 1, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(long value) {
		setConstNumber(offset + 1, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(float value) {
		setConstNumber(offset + 1, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(double value) {
		setConstNumber(offset + 1, $inpt_peg_no, value);
	}


	/**
	 * Skip Loss result entry ロス実績登録スキップ.<p>
	 *
	 */
	public boolean loss_act_reg_skip_flg() {
		return getConstBoolean(offset + 2, $loss_act_reg_skip_flg);
	}

	/**
	 * Skip Loss result entry ロス実績登録スキップ.<p>
	 *
	 */
	public void loss_act_reg_skip_flg(boolean value) {
		setConstBoolean(offset + 2, $loss_act_reg_skip_flg, value);
	}


	public mcframe.serverMS.dbc.MST_LOSS_ACT_R loss_act(){
		return (mcframe.serverMS.dbc.MST_LOSS_ACT_R) getConstInnerRow(offset + 3, $loss_act);
	}
	
	public void loss_act(mcframe.serverMS.dbc.MST_LOSS_ACT_R row){
		setConstInnerRow(offset + 3, $loss_act, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			return inpt_peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($loss_act_reg_skip_flg.equalsIgnoreCase(name)) {
			return loss_act_reg_skip_flg();
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
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			return inpt_peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($loss_act_reg_skip_flg.equalsIgnoreCase(name)) {
			return loss_act_reg_skip_flg();
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
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($loss_act_reg_skip_flg.equalsIgnoreCase(name)) {
			loss_act_reg_skip_flg(value);
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
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($loss_act_reg_skip_flg.equalsIgnoreCase(name)) {
			loss_act_reg_skip_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($loss_act.equalsIgnoreCase(name)) {
			return loss_act();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($loss_act.equalsIgnoreCase(name)) {
			loss_act(
				((MCContainerMeta) loss_act_META).castInnerRow(mcframe.serverMS.dbc.MST_LOSS_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public String loss_act_no() {
		return loss_act().loss_act_no();
	}

	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public void loss_act_no(String value) {
		loss_act().loss_act_no(value);
	}

	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public String inpt_act_no() {
		return loss_act().inpt_act_no();
	}

	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public void inpt_act_no(String value) {
		loss_act().inpt_act_no(value);
	}

	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public String loss_rsn_cd() {
		return loss_act().loss_rsn_cd();
	}

	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public void loss_rsn_cd(String value) {
		loss_act().loss_rsn_cd(value);
	}

	/**
	 * Constant loss flg. 固定ロスＦＬＧ.<p>
	 *
	 */
	public boolean fxd_loss_flg() {
		return loss_act().fxd_loss_flg();
	}

	/**
	 * Constant loss flg. 固定ロスＦＬＧ.<p>
	 *
	 */
	public void fxd_loss_flg(boolean value) {
		loss_act().fxd_loss_flg(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return loss_act().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		loss_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		loss_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		loss_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		loss_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		loss_act().base_unit_qty(value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return loss_act().cont_qty();
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		loss_act().cont_qty(value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(int value) {
		loss_act().cont_qty(value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(long value) {
		loss_act().cont_qty(value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(float value) {
		loss_act().cont_qty(value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(double value) {
		loss_act().cont_qty(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return loss_act().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		loss_act().intr_rmrks(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return loss_act().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		loss_act().trd_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String loss_act_sub_char1() {
		return loss_act().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void loss_act_sub_char1(String value) {
		loss_act().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String loss_act_sub_char2() {
		return loss_act().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void loss_act_sub_char2(String value) {
		loss_act().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String loss_act_sub_char3() {
		return loss_act().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void loss_act_sub_char3(String value) {
		loss_act().sub_char3(value);
	}

}

