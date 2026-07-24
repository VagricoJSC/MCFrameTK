package mcframe.clientMGUC.MGUCP0050;

import java.awt.Color;

import mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase;

/**
 * 色を扱うクラスです。
 */
abstract public class MGUCP_Color_MC {

	//費目Ｇがある画面の総合計
	public static Color getAllTtlColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "all_ttl",
				"bg");
	}

	//費目（入力可能）
	public static Color getExpnsEnableColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell",
				"expns_enable", "bg");
	}

	//費目Ｇがある画面の小計
	public static Color getAllSubTtlColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell",
				"all_subttl", "bg");
	}

	//費目Ｇの合計
	public static Color getExpnsGTtlColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell",
				"expnsg_ttl", "bg");
	}

	//費目Ｇの内訳小計
	public static Color getExpnsGSubTtlColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell",
				"expnsg_subttl", "bg");
	}

	//費目（入力不可）
	public static Color getExpnsReadOnlyColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell",
				"expns_read_only", "bg");
	}

	//費目のある画面の合計
	public static Color getExpnsTtlColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "expns_ttl",
				"bg");
	}

	//合計以外の背景
	public static Color getBgOtherColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "bg_other",
				"bg");
	}
	
	//横の合計
	public static Color getHTtlColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "h_ttl",
				"bg");
	}
	
	//縦の合計行
	public static Color getVTtlColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "v_ttl",
				"bg");
	}

	//費目のある参照画面の背景
	public static Color getExpnsSrchRsltColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "expns_srch_rslt",
				"bg");
	}
	
	//年月を展開する画面の合計
	public static Color getYmTtlColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "ym_ttl",
				"bg");
	}
	
	//配賦率
	public static Color getAlcRateColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "alc_rate",
				"bg");
	}
	
	//費目の合計（横一列）
	public static Color getExpnsTtlHColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "expns_ttl_h",
				"bg");
	}
	
	//売上原価
	public static Color getSlsCostColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "sls_cost",
				"bg");
	}
	
	//限界利益関連
	public static Color getProfitColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "profit",
				"bg");
	}
	
	//発生合計
	public static Color getGenTtlColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "gen_ttl",
				"bg");
	}
	
	//単価・金額差異
	public static Color getMoneyDiffColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "money_diff",
				"bg");
	}
	
	//標準単価・原価
	public static Color getStdUpriColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "std_upri",
				"bg");
	}
	
	//固定費・変動費
	public static Color getVarFxdColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "var_fxd",
				"bg");
	}
	
	//在庫回転率
	public static Color getStkrColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "stkr",
				"bg");
	}
	
	//総平均単価
	public static Color getAveUpriColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "ave_upri",
				"bg");
	}
	
	//費目Ｇ縦合計行
	public static Color getVttlExpnsgColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "v_ttl_expnsg",
				"bg");
	}
	
	//費目縦合計行
	public static Color getVttlExpnsColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "v_ttl_expns",
				"bg");
	}
	
	//先頭行
	public static Color getTopColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "top",
				"bg");
	}
	
	//理論～
	public static Color getTheoryColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "theory",
				"bg");
	}
	
	//在庫金額
	public static Color getStkAmtColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "stk_amt",
				"bg");
	}
	
	//評価損
	public static Color getLossColor(MGUDP_PanelBase panel) {
		return panel.getPgmSettingColorDef(panel, "color", "cell", "loss",
				"bg");
	}
}
