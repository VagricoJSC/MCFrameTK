package mcframe.serverMSUC.MSUCL0130;

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
 * "MSUCL_AmtUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUCL_AmtUtil_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSUC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSUCL0130";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSUCL_AmtUtil.AmtUtil_Calc01 aAmtUtil_Calc01;

	protected void initAmtUtil_Calc01() {
		this.info = PDef.MS_MSUCL0130_AmtUtil_Calc01_INFO;
		this.aAmtUtil_Calc01 = ((MSUCL_AmtUtil)this).new AmtUtil_Calc01();
	}

	public static MSUCL_AmtUtil.AmtUtil_Calc01 crtAmtUtil_Calc01() {
		MSUCL_AmtUtil lgc = new MSUCL_AmtUtil();
		lgc.initAmtUtil_Calc01();
		return lgc.aAmtUtil_Calc01;
	}

	protected void paramAmtUtil_Calc01(MCParam p) {
		if (this.aAmtUtil_Calc01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAmtUtil_Calc01.up0());
		p.addUpBlock(aAmtUtil_Calc01.up1());
		p.addDownBlock(aAmtUtil_Calc01.down0());
	}

	protected void doAmtUtil_Calc01() {
		aAmtUtil_Calc01.call();
	};

	/**
	 * AmtUtil_Calc01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_HdrR createAmtUtil_Calc01_HdrR(){
		return mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_HdrR.create();
	}

	/**
	 * AmtUtil_Calc01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_DtlR createAmtUtil_Calc01_DtlR(){
		return mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_DtlR.create();
	}

	/**
	 * AmtUtil_Calc01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_DtlR> createAmtUtil_Calc01_DtlL(){
		return MCList.create(mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * AmtUtil_Calc01オペレーション.<p>
	 *
	 * 金額に関するユーティリティを提供します。<br>
	 */
	abstract public class AmtUtil_Calc01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AmtUtil_Calc01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_DtlR> down0;
		
		
		// コンストラクタ
		protected AmtUtil_Calc01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_DtlR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSUCL_AmtUtil)MSUCL_AmtUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AmtUtil_Calc01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_HdrR createAmtUtil_Calc01_HdrR(){
			return mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_HdrR.create();
		}

		/**
		 * AmtUtil_Calc01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_DtlR createAmtUtil_Calc01_DtlR(){
			return mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_DtlR.create();
		}

		/**
		 * AmtUtil_Calc01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_DtlR> createAmtUtil_Calc01_DtlL(){
			return MCList.create(mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_HdrR
		 */
		public mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0130.AmtUtil_Calc01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSUCL_AmtUtil)MSUCL_AmtUtil_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}