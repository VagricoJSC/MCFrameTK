package mcframe.serverMSBE.MSBEL6620;

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
 * "MSBEL_StktkActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_StktkActRcptIFService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL6620";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_StktkActRcptIFService.StktkActRcptIF_Chk01 aStktkActRcptIF_Chk01;

	protected void initStktkActRcptIF_Chk01() {
		this.info = PDef.MS_MSBEL6620_StktkActRcptIF_Chk01_INFO;
		this.aStktkActRcptIF_Chk01 = ((MSBEL_StktkActRcptIFService)this).new StktkActRcptIF_Chk01();
	}

	public static MSBEL_StktkActRcptIFService.StktkActRcptIF_Chk01 crtStktkActRcptIF_Chk01() {
		MSBEL_StktkActRcptIFService lgc = new MSBEL_StktkActRcptIFService();
		lgc.initStktkActRcptIF_Chk01();
		return lgc.aStktkActRcptIF_Chk01;
	}

	protected void paramStktkActRcptIF_Chk01(MCParam p) {
		if (this.aStktkActRcptIF_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStktkActRcptIF_Chk01.up0());
		p.addUpBlock(aStktkActRcptIF_Chk01.up1());
		p.addDownBlock(aStktkActRcptIF_Chk01.down0());
		p.addDownBlock(aStktkActRcptIF_Chk01.down1());
	}

	protected void doStktkActRcptIF_Chk01() {
		aStktkActRcptIF_Chk01.call();
	};

	/**
	 * StktkActRcptIF_Chk01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR createStktkActRcptIF_Chk01_CtrlR(){
		return mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR.create();
	}

	/**
	 * StktkActRcptIF_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR createStktkActRcptIF_Chk01_DtlR(){
		return mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR.create();
	}

	/**
	 * StktkActRcptIF_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> createStktkActRcptIF_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR.class);
	}
	protected MSBEL_StktkActRcptIFService.StktkActRcptIF_Upd01 aStktkActRcptIF_Upd01;

	protected void initStktkActRcptIF_Upd01() {
		this.info = PDef.MS_MSBEL6620_StktkActRcptIF_Upd01_INFO;
		this.aStktkActRcptIF_Upd01 = ((MSBEL_StktkActRcptIFService)this).new StktkActRcptIF_Upd01();
	}

	public static MSBEL_StktkActRcptIFService.StktkActRcptIF_Upd01 crtStktkActRcptIF_Upd01() {
		MSBEL_StktkActRcptIFService lgc = new MSBEL_StktkActRcptIFService();
		lgc.initStktkActRcptIF_Upd01();
		return lgc.aStktkActRcptIF_Upd01;
	}

	protected void paramStktkActRcptIF_Upd01(MCParam p) {
		if (this.aStktkActRcptIF_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStktkActRcptIF_Upd01.up0());
		p.addUpBlock(aStktkActRcptIF_Upd01.up1());
		p.addDownBlock(aStktkActRcptIF_Upd01.down0());
	}

	protected void doStktkActRcptIF_Upd01() {
		aStktkActRcptIF_Upd01.call();
	};

	/**
	 * StktkActRcptIF_Upd01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR createStktkActRcptIF_Upd01_CtrlR(){
		return mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR.create();
	}

	/**
	 * StktkActRcptIF_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR createStktkActRcptIF_Upd01_DtlR(){
		return mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR.create();
	}

	/**
	 * StktkActRcptIF_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> createStktkActRcptIF_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * StktkActRcptIF_Chk01オペレーション.<p>
	 *
	 */
	abstract public class StktkActRcptIF_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StktkActRcptIF_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> down1;
		
		/**
		 * 連携情報 SAR<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Chk01 （{@link #so02}）<br>
		 * 連携先 mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Chk02 （{@link #so03}）<br>
		 */
		public final String SAR = "SAR";

		/**
		 * 連携オペレーション so02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Chk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so02_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so02_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Chk01 so02;
		/**
		 * 連携オペレーション so03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Chk02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so03_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so03_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Chk02 so03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so02_up0;
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so03_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so02_down0;
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so03_down0;
		
		// コンストラクタ
		protected StktkActRcptIF_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR.class);

			// 連携オペレーションの初期化
			so02 = mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.crtStktkAct_Chk01();
			so03 = mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.crtStktkAct_Chk02();
			
			// 連携オペレーションのコンテナ取得
			so02_up0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so02.up(0);
			so03_up0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so03.up(0);
			so02_down0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so02.down(0);
			so03_down0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so03.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SAR, so02);
			appendOpe(SAR, so03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SAR<br>
		 * up1() => MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so03_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SAR)) {
				up_SAR(so02_up0, so03_up0, up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SAR<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt;（{@link #so02_down0}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt;（{@link #so03_down0}）=> down1()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SAR)) {
				down_SAR(down1(), so02_down0, so03_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_StktkActRcptIFService)MSBEL_StktkActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * StktkActRcptIF_Chk01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR createStktkActRcptIF_Chk01_CtrlR(){
			return mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR.create();
		}

		/**
		 * StktkActRcptIF_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR createStktkActRcptIF_Chk01_DtlR(){
			return mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR.create();
		}

		/**
		 * StktkActRcptIF_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> createStktkActRcptIF_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>act_input_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_base_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_make_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>tor_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>act_diff_qty</td></tr>
		 * 	<tr><td><br></td><td>use_diff_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_act_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stktk_itm_spc_flg</td></tr>
		 * 	<tr><td><br></td><td>stktkact_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>stktk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>act_input_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_base_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>stktk_amt_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_tor_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_stktk_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>not_new_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_make_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>tor_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>act_diff_qty</td></tr>
		 * 	<tr><td><br></td><td>use_diff_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>std_upri</td></tr>
		 * 	<tr><td><br></td><td>std_cost</td></tr>
		 * 	<tr><td><br></td><td>act_diff_cost</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>stktk_act_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stktk_itm_spc_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>stktk_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stktkact_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>stktk_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StktkActRcptIFService)MSBEL_StktkActRcptIFService_MC_A.this).info;
		}

		//-----------------------SAR専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSARの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SAR(MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest0_0, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest1_0, MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> src_StktkActRcptIF_Chk01_Dtl){
			up_SAR_so02_0(dest0_0, src_StktkActRcptIF_Chk01_Dtl);
			up_SAR_so03_0(dest1_0, src_StktkActRcptIF_Chk01_Dtl);
		}
		
		/**
		 * 連携処理SAR_so02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SAR_so02_0() {
			MCRowMapper map = new Map_up_SAR_so02_0();
			return map;
		}

		/**
		 * 連携処理SAR_so02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SAR_so02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("act_input_flg", "act_input_flg");
				addColumnPathMap("stktk_base_dt", "stktk_base_dt");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("lot_make_flg", "lot_make_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("fix_no_flg", "fix_no_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("in_xfr_typ", "in_xfr_typ");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("tor_qty", "tor_qty");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("act_diff_qty", "act_diff_qty");
				addColumnPathMap("use_diff_flg", "use_diff_flg");
				addColumnPathMap("stktk_act_rmrks", "stktk_act_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("stktk_itm_spc_flg", "stktk_itm_spc_flg");
				addColumnPathMap("stktkact_upd_cntr", "stktkact_upd_cntr");
				addColumnPathMap("stktk_upd_cntr", "stktk_upd_cntr");
			}
		}

		/**
		 * 連携処理SAR_so02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SAR_so02_0(mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理SAR_so02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SAR_so02_0(MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_SAR_so02_0();
			for(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SAR_so02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理SAR_so03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SAR_so03_0() {
			MCRowMapper map = new Map_up_SAR_so03_0();
			return map;
		}

		/**
		 * 連携処理SAR_so03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SAR_so03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("stktk_base_dt", "stktk_base_dt");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("fix_no_flg", "fix_no_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("in_xfr_typ", "in_xfr_typ");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("tor_qty", "tor_qty");
				addColumnPathMap("stktk_itm_spc_flg", "stktk_itm_spc_flg");
			}
		}

		/**
		 * 連携処理SAR_so03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SAR_so03_0(mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理SAR_so03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SAR_so03_0(MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_SAR_so03_0();
			for(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SAR_so03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------SAR専用down関連メソッド--------------------------
		/**
		 * 連携処理SAR_so03の下りブロック0のJoinKey<p>
		 */
		protected MCJoinKey<MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>> SAR_so03_0_jk;

		/**
		 * オペレーショングループSARの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SAR(MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> dest_StktkActRcptIF_Chk01_Dtl, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src0_0, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src1_0){
			down_SAR_so02_0(dest_StktkActRcptIF_Chk01_Dtl, src0_0);
			join_SAR_so03_0(dest_StktkActRcptIF_Chk01_Dtl, src1_0);
			down_SAR_so03_0(dest_StktkActRcptIF_Chk01_Dtl);
		}

		/**
		 * 連携処理SAR_so02の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SAR_so02_0() {
			MCRowMapper map = new Map_down_SAR_so02_0();
			return map;
		}

		/**
		 * 連携処理SAR_so02の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SAR_so02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("act_input_flg", "act_input_flg");
				addColumnPathMap("stktk_base_dt", "stktk_base_dt");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("stktk_amt_flg", "stktk_amt_flg");
				addColumnPathMap("stktk_tor_disp_flg", "stktk_tor_disp_flg");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("alloc_grp_nm", "alloc_grp_nm");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("str_ln_tgt_flg", "str_ln_tgt_flg");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("stk_arrv_bp_nm", "stk_arrv_bp_nm");
				addColumnPathMap("cnsgn_stktk_flg", "cnsgn_stktk_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("not_new_lot_flg", "not_new_lot_flg");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("lot_make_flg", "lot_make_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("fix_no_flg", "fix_no_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("gd_nm", "gd_nm");
				addColumnPathMap("in_xfr_typ", "in_xfr_typ");
				addColumnPathMap("in_xfr_typ_nm", "in_xfr_typ_nm");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("quality_typ_nm", "quality_typ_nm");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_insp_typ_nm", "stk_insp_typ_nm");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_id_typ_nm", "stk_id_typ_nm");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("stk_bp_nm", "stk_bp_nm");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_unit_dec_place", "trd_unit_dec_place");
				addColumnPathMap("trd_unit_rnd_typ", "trd_unit_rnd_typ");
				addColumnPathMap("trd_unit_base_qty", "trd_unit_base_qty");
				addColumnPathMap("trd_unit_conv_qty", "trd_unit_conv_qty");
				addColumnPathMap("tor_qty", "tor_qty");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("act_diff_qty", "act_diff_qty");
				addColumnPathMap("use_diff_flg", "use_diff_flg");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_rnd_typ");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("std_upri", "std_upri");
				addColumnPathMap("std_cost", "std_cost");
				addColumnPathMap("act_diff_cost", "act_diff_cost");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("upri_dec_place", "upri_dec_place");
				addColumnPathMap("amt_dec_place", "amt_dec_place");
				addColumnPathMap("stktk_act_rmrks", "stktk_act_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("stktk_itm_spc_flg", "stktk_itm_spc_flg");
				addColumnPathMap("stktk_sts_typ", "stktk_sts_typ");
				addColumnPathMap("stktk_sts_typ_nm", "stktk_sts_typ_nm");
				addColumnPathMap("stktkact_upd_cntr", "stktkact_upd_cntr");
				addColumnPathMap("stktk_upd_cntr", "stktk_upd_cntr");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
			}
		}

		/**
		 * 連携処理SAR_so02の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SAR_so02_0(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理SAR_so02の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SAR_so02_0(MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_down_SAR_so02_0();
			for(mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SAR_so02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理SAR_so03の下りブロック0のJoinKeyを作成する。<p>
		 */
		protected void join_SAR_so03_0(MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src){
			String[] dest_cols ={
				};
			String[] src_cols = {
				};
			SAR_so03_0_jk = dest.join(dest_cols, src, src_cols);
		}

		/**
		 * 連携処理SAR_so03の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SAR_so03_0() {
			MCRowMapper map = new Map_down_SAR_so03_0();
			return map;
		}

		/**
		 * 連携処理SAR_so03の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SAR_so03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("stktk_base_dt", "stktk_base_dt");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("fix_no_flg", "fix_no_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("in_xfr_typ", "in_xfr_typ");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("tor_qty", "tor_qty");
				addColumnPathMap("stktk_itm_spc_flg", "stktk_itm_spc_flg");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
			}
		}

		/**
		 * 連携処理SAR_so03の下りブロック0のJoin処理を行う。<p>
		 *
		 * @param dest コピー先のList
		 */
		protected void down_SAR_so03_0(MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> dest){
			if(SAR_so03_0_jk == null) return;
			for(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR r_dest : dest){
				mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR jRow = (mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR)r_dest.getJoinedRow(SAR_so03_0_jk);
				if(jRow == null) continue;
				r_dest.peg_no(jRow.peg_no());
				r_dest.err_flg(jRow.err_flg());
				r_dest.data_crud_typ(jRow.data_crud_typ());
				r_dest.stktk_base_dt(jRow.stktk_base_dt());
				r_dest.loc_cd(jRow.loc_cd());
				r_dest.str_ln_cd(jRow.str_ln_cd());
				r_dest.stk_arrv_bp_cd(jRow.stk_arrv_bp_cd());
				r_dest.itm_cd(jRow.itm_cd());
				r_dest.itm_sub1(jRow.itm_sub1());
				r_dest.itm_sub2(jRow.itm_sub2());
				r_dest.itm_sub3(jRow.itm_sub3());
				r_dest.lot_no(jRow.lot_no());
				r_dest.sublot_no(jRow.sublot_no());
				r_dest.sno1(jRow.sno1());
				r_dest.sno2(jRow.sno2());
				r_dest.sno3(jRow.sno3());
				r_dest.sno4(jRow.sno4());
				r_dest.fix_no_flg(jRow.fix_no_flg());
				r_dest.gd_cd(jRow.gd_cd());
				r_dest.in_xfr_typ(jRow.in_xfr_typ());
				r_dest.quality_typ(jRow.quality_typ());
				r_dest.stk_insp_typ(jRow.stk_insp_typ());
				r_dest.stk_id_typ(jRow.stk_id_typ());
				r_dest.stk_bp_cd(jRow.stk_bp_cd());
				r_dest.trd_unit_cd(jRow.trd_unit_cd());
				r_dest.tor_qty(jRow.tor_qty());
				r_dest.stktk_itm_spc_flg(jRow.stktk_itm_spc_flg());
				r_dest.rtn_sts_typ(jRow.rtn_sts_typ());
			}
		}
	}
	/**
	 * StktkActRcptIF_Upd01オペレーション.<p>
	 *
	 * 外部システムから実棚実績の登録、更新、取消を行います。<br>
	 */
	abstract public class StktkActRcptIF_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StktkActRcptIF_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> down0;
		
		/**
		 * 連携情報 SAR<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Upd01 （{@link #so04}）<br>
		 * 連携先 mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Del01 （{@link #so05}）<br>
		 */
		public final String SAR = "SAR";

		/**
		 * 連携オペレーション so04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so04_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so04_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Upd01 so04;
		/**
		 * 連携オペレーション so05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so05_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so05_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Del01 so05;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so04_up0;
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so05_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so04_down0;
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so05_down0;
		
		// コンストラクタ
		protected StktkActRcptIF_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR.class);

			// 連携オペレーションの初期化
			so04 = mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.crtStktkAct_Upd01();
			so05 = mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.crtStktkAct_Del01();
			
			// 連携オペレーションのコンテナ取得
			so04_up0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so04.up(0);
			so05_up0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so05.up(0);
			so04_down0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so04.down(0);
			so05_down0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so05.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SAR, so04);
			appendOpe(SAR, so05);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SAR<br>
		 * up1() => MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so04_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so05_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SAR)) {
				up_SAR(so04_up0, so05_up0, up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SAR<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt;（{@link #so04_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt;（{@link #so05_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SAR)) {
				down_SAR(down0(), so04_down0, so05_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_StktkActRcptIFService)MSBEL_StktkActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * StktkActRcptIF_Upd01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR createStktkActRcptIF_Upd01_CtrlR(){
			return mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR.create();
		}

		/**
		 * StktkActRcptIF_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR createStktkActRcptIF_Upd01_DtlR(){
			return mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR.create();
		}

		/**
		 * StktkActRcptIF_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> createStktkActRcptIF_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>act_input_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_base_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_make_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>tor_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>act_diff_qty</td></tr>
		 * 	<tr><td><br></td><td>use_diff_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_act_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stktk_itm_spc_flg</td></tr>
		 * 	<tr><td><br></td><td>stktkact_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>stktk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StktkActRcptIFService)MSBEL_StktkActRcptIFService_MC_A.this).info;
		}

		//-----------------------SAR専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSARの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SAR(MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest0_0, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest1_0, MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> src_StktkActRcptIF_Upd01_Dtl){
			up_SAR_so04_0(dest0_0, src_StktkActRcptIF_Upd01_Dtl);
			up_SAR_so05_0(dest1_0, src_StktkActRcptIF_Upd01_Dtl);
		}
		
		/**
		 * 連携処理SAR_so04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SAR_so04_0() {
			MCRowMapper map = new Map_up_SAR_so04_0();
			return map;
		}

		/**
		 * 連携処理SAR_so04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SAR_so04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("act_input_flg", "act_input_flg");
				addColumnPathMap("stktk_base_dt", "stktk_base_dt");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("lot_make_flg", "lot_make_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("fix_no_flg", "fix_no_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("in_xfr_typ", "in_xfr_typ");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("tor_qty", "tor_qty");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("act_diff_qty", "act_diff_qty");
				addColumnPathMap("use_diff_flg", "use_diff_flg");
				addColumnPathMap("stktk_act_rmrks", "stktk_act_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("stktk_itm_spc_flg", "stktk_itm_spc_flg");
				addColumnPathMap("stktkact_upd_cntr", "stktkact_upd_cntr");
				addColumnPathMap("stktk_upd_cntr", "stktk_upd_cntr");
			}
		}

		/**
		 * 連携処理SAR_so04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SAR_so04_0(mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理SAR_so04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SAR_so04_0(MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_SAR_so04_0();
			for(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SAR_so04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理SAR_so05の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SAR_so05_0() {
			MCRowMapper map = new Map_up_SAR_so05_0();
			return map;
		}

		/**
		 * 連携処理SAR_so05の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SAR_so05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("stktk_base_dt", "stktk_base_dt");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("fix_no_flg", "fix_no_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("in_xfr_typ", "in_xfr_typ");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("tor_qty", "tor_qty");
				addColumnPathMap("stktk_itm_spc_flg", "stktk_itm_spc_flg");
				addColumnPathMap("stktkact_upd_cntr", "stktkact_upd_cntr");
				addColumnPathMap("stktk_upd_cntr", "stktk_upd_cntr");
			}
		}

		/**
		 * 連携処理SAR_so05の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SAR_so05_0(mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理SAR_so05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SAR_so05_0(MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_SAR_so05_0();
			for(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SAR_so05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------SAR専用down関連メソッド--------------------------
		/**
		 * 連携処理SAR_so05の下りブロック0のJoinKey<p>
		 */
		protected MCJoinKey<MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>> SAR_so05_0_jk;

		/**
		 * オペレーショングループSARの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SAR(MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> dest_StktkActRcptIF_Upd01_Dtl, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src0_0, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src1_0){
			down_SAR_so04_0(dest_StktkActRcptIF_Upd01_Dtl, src0_0);
			join_SAR_so05_0(dest_StktkActRcptIF_Upd01_Dtl, src1_0);
			down_SAR_so05_0(dest_StktkActRcptIF_Upd01_Dtl);
		}

		/**
		 * 連携処理SAR_so04の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SAR_so04_0() {
			MCRowMapper map = new Map_down_SAR_so04_0();
			return map;
		}

		/**
		 * 連携処理SAR_so04の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SAR_so04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
			}
		}

		/**
		 * 連携処理SAR_so04の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SAR_so04_0(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理SAR_so04の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SAR_so04_0(MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_down_SAR_so04_0();
			for(mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SAR_so04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理SAR_so05の下りブロック0のJoinKeyを作成する。<p>
		 */
		protected void join_SAR_so05_0(MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src){
			String[] dest_cols ={
				};
			String[] src_cols = {
				};
			SAR_so05_0_jk = dest.join(dest_cols, src, src_cols);
		}

		/**
		 * 連携処理SAR_so05の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SAR_so05_0() {
			MCRowMapper map = new Map_down_SAR_so05_0();
			return map;
		}

		/**
		 * 連携処理SAR_so05の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SAR_so05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
			}
		}

		/**
		 * 連携処理SAR_so05の下りブロック0のJoin処理を行う。<p>
		 *
		 * @param dest コピー先のList
		 */
		protected void down_SAR_so05_0(MCList<mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR> dest){
			if(SAR_so05_0_jk == null) return;
			for(mcframe.serverMSBE.MSBEL6620.StktkActRcptIF_Chk01_DtlR r_dest : dest){
				mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR jRow = (mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR)r_dest.getJoinedRow(SAR_so05_0_jk);
				if(jRow == null) continue;
				r_dest.rtn_sts_typ(jRow.rtn_sts_typ());
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}