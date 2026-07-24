package mcframe.serverMSBC.MSBCL6040;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBCL_LotPropService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_LotPropService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCL6040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_LotPropService.LotProp_Sprt01 aLotProp_Sprt01;

	protected void initLotProp_Sprt01() {
		this.info = PDef.MS_MSBCL6040_LotProp_Sprt01_INFO;
		this.aLotProp_Sprt01 = ((MSBCL_LotPropService)this).new LotProp_Sprt01();
	}

	public static MSBCL_LotPropService.LotProp_Sprt01 crtLotProp_Sprt01() {
		MSBCL_LotPropService lgc = new MSBCL_LotPropService();
		lgc.initLotProp_Sprt01();
		return lgc.aLotProp_Sprt01;
	}

	protected void paramLotProp_Sprt01(MCParam p) {
		if (this.aLotProp_Sprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotProp_Sprt01.up0());
		p.addUpBlock(aLotProp_Sprt01.up1());
		p.addUpBlock(aLotProp_Sprt01.up2());
		p.addUpBlock(aLotProp_Sprt01.up3());
		p.addDownBlock(aLotProp_Sprt01.down0());
		p.addDownBlock(aLotProp_Sprt01.down1());
		p.addDownBlock(aLotProp_Sprt01.down2());
	}

	protected void doLotProp_Sprt01() {
		aLotProp_Sprt01.call();
	};

	/**
	 * LotProp_Sprt01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_CtrlR createLotProp_Sprt01_CtrlR(){
		return mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_CtrlR.create();
	}

	/**
	 * LotProp_Sprt01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl1R createLotProp_Sprt01_Dtl1R(){
		return mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl1R.create();
	}

	/**
	 * LotProp_Sprt01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl1R> createLotProp_Sprt01_Dtl1L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl1R.class);
	}

	/**
	 * LotProp_Sprt01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl2R createLotProp_Sprt01_Dtl2R(){
		return mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl2R.create();
	}

	/**
	 * LotProp_Sprt01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl2R> createLotProp_Sprt01_Dtl2L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl2R.class);
	}

	/**
	 * LotProp_Sprt01_Dtl3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl3R createLotProp_Sprt01_Dtl3R(){
		return mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl3R.create();
	}

	/**
	 * LotProp_Sprt01_Dtl3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl3R> createLotProp_Sprt01_Dtl3L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl3R.class);
	}

	/**
	 * LotProp_Sprt01_Dtl4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl4R createLotProp_Sprt01_Dtl4R(){
		return mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl4R.create();
	}

	/**
	 * LotProp_Sprt01_Dtl4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl4R> createLotProp_Sprt01_Dtl4L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl4R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * LotProp_Sprt01オペレーション.<p>
	 *
	 * 渡された製造品、投入品の情報から、使用可能なロットの情報を取得する。<br>
	 */
	abstract public class LotProp_Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotProp_Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl1R> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl3R> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl4R> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl2R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl4R> down2;
		
		
		// コンストラクタ
		protected LotProp_Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl1R.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl3R.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl4R.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl1R.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl2R.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl4R.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_LotPropService)MSBCL_LotPropService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * LotProp_Sprt01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_CtrlR createLotProp_Sprt01_CtrlR(){
			return mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_CtrlR.create();
		}

		/**
		 * LotProp_Sprt01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl1R createLotProp_Sprt01_Dtl1R(){
			return mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl1R.create();
		}

		/**
		 * LotProp_Sprt01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl1R> createLotProp_Sprt01_Dtl1L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl1R.class);
		}

		/**
		 * LotProp_Sprt01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl2R createLotProp_Sprt01_Dtl2R(){
			return mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl2R.create();
		}

		/**
		 * LotProp_Sprt01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl2R> createLotProp_Sprt01_Dtl2L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl2R.class);
		}

		/**
		 * LotProp_Sprt01_Dtl3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl3R createLotProp_Sprt01_Dtl3R(){
			return mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl3R.create();
		}

		/**
		 * LotProp_Sprt01_Dtl3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl3R> createLotProp_Sprt01_Dtl3L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl3R.class);
		}

		/**
		 * LotProp_Sprt01_Dtl4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl4R createLotProp_Sprt01_Dtl4R(){
			return mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl4R.create();
		}

		/**
		 * LotProp_Sprt01_Dtl4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl4R> createLotProp_Sprt01_Dtl4L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl4R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_flg</td></tr>
		 * 	<tr><td><br></td><td>exec_prop_btn_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>alt_qty</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>not_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>loss_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>set_stk_str_ln_flg</td></tr>
		 * 	<tr><td><br></td><td>not_pd_chk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl1R> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl3R> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_peg_no</td></tr>
		 * 	<tr><td><br></td><td>fxd_loss_flg</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl4R> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>sum_peg_no</td></tr>
		 * 	<tr><td><br></td><td>loss_peg_no</td></tr>
		 * 	<tr><td><br></td><td>add_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>inpt_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>not_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>not_alloc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>not_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>loss_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>sum_peg_no</td></tr>
		 * 	<tr><td><br></td><td>add_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>inpt_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>not_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>not_alloc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>not_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl2R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_peg_no</td></tr>
		 * 	<tr><td><br></td><td>loss_peg_no</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>add_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6040.LotProp_Sprt01_Dtl4R> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_LotPropService)MSBCL_LotPropService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}