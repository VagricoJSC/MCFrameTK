package mcframe.serverMSBC.MSBCL5040;

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
 * "MSBCL_LdCalcService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_LdCalcService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBCL5040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_LdCalcService.ItmOrdLd_Srch01 aItmOrdLd_Srch01;

	protected void initItmOrdLd_Srch01() {
		this.info = PDef.MS_MSBCL5040_ItmOrdLd_Srch01_INFO;
		this.aItmOrdLd_Srch01 = ((MSBCL_LdCalcService)this).new ItmOrdLd_Srch01();
	}

	public static MSBCL_LdCalcService.ItmOrdLd_Srch01 crtItmOrdLd_Srch01() {
		MSBCL_LdCalcService lgc = new MSBCL_LdCalcService();
		lgc.initItmOrdLd_Srch01();
		return lgc.aItmOrdLd_Srch01;
	}

	protected void paramItmOrdLd_Srch01(MCParam p) {
		if (this.aItmOrdLd_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmOrdLd_Srch01.up0());
		p.addUpBlock(aItmOrdLd_Srch01.up1());
		p.addDownBlock(aItmOrdLd_Srch01.down0());
		p.addDownBlock(aItmOrdLd_Srch01.down1());
	}

	protected void doItmOrdLd_Srch01() {
		aItmOrdLd_Srch01.call();
	};

	/**
	 * ItmOrdLd_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_CndR createItmOrdLd_Srch01_CndR(){
		return mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_CndR.create();
	}

	/**
	 * ItmOrdLd_Srch01_LocCndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_LocCndR createItmOrdLd_Srch01_LocCndR(){
		return mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_LocCndR.create();
	}

	/**
	 * ItmOrdLd_Srch01_LocCndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_LocCndR> createItmOrdLd_Srch01_LocCndL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_LocCndR.class);
	}

	/**
	 * ItmOrdLd_Srch01_SumRsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SumRsltR createItmOrdLd_Srch01_SumRsltR(){
		return mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SumRsltR.create();
	}

	/**
	 * ItmOrdLd_Srch01_SumRsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SumRsltR> createItmOrdLd_Srch01_SumRsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SumRsltR.class);
	}

	/**
	 * ItmOrdLd_Srch01_SubRsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SubRsltR createItmOrdLd_Srch01_SubRsltR(){
		return mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SubRsltR.create();
	}

	/**
	 * ItmOrdLd_Srch01_SubRsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SubRsltR> createItmOrdLd_Srch01_SubRsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SubRsltR.class);
	}

	/**
	 * ItmOrdLd_Srch01_SrchRsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SrchRsltR createItmOrdLd_Srch01_SrchRsltR(){
		return mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SrchRsltR.create();
	}

	/**
	 * ItmOrdLd_Srch01_SrchRsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SrchRsltR> createItmOrdLd_Srch01_SrchRsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SrchRsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ItmOrdLd_Srch01オペレーション.<p>
	 *
	 */
	abstract public class ItmOrdLd_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmOrdLd_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_LocCndR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SumRsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SubRsltR> down1;
		/** [ItmOrdLd_Srch01_SrchRslt]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SrchRsltR> aItmOrdLd_Srch01_SrchRslt;
		
		
		// コンストラクタ
		protected ItmOrdLd_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_CndR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_LocCndR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SumRsltR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SubRsltR.class);
			aItmOrdLd_Srch01_SrchRslt = MCList.create(mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SrchRsltR.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_LdCalcService)MSBCL_LdCalcService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ItmOrdLd_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_CndR createItmOrdLd_Srch01_CndR(){
			return mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_CndR.create();
		}

		/**
		 * ItmOrdLd_Srch01_LocCndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_LocCndR createItmOrdLd_Srch01_LocCndR(){
			return mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_LocCndR.create();
		}

		/**
		 * ItmOrdLd_Srch01_LocCndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_LocCndR> createItmOrdLd_Srch01_LocCndL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_LocCndR.class);
		}

		/**
		 * ItmOrdLd_Srch01_SumRsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SumRsltR createItmOrdLd_Srch01_SumRsltR(){
			return mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SumRsltR.create();
		}

		/**
		 * ItmOrdLd_Srch01_SumRsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SumRsltR> createItmOrdLd_Srch01_SumRsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SumRsltR.class);
		}

		/**
		 * ItmOrdLd_Srch01_SubRsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SubRsltR createItmOrdLd_Srch01_SubRsltR(){
			return mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SubRsltR.create();
		}

		/**
		 * ItmOrdLd_Srch01_SubRsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SubRsltR> createItmOrdLd_Srch01_SubRsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SubRsltR.class);
		}

		/**
		 * ItmOrdLd_Srch01_SrchRsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SrchRsltR createItmOrdLd_Srch01_SrchRsltR(){
			return mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SrchRsltR.create();
		}

		/**
		 * ItmOrdLd_Srch01_SrchRsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SrchRsltR> createItmOrdLd_Srch01_SrchRsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SrchRsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>opn_flg</td></tr>
		 * 	<tr><td><br></td><td>sav_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_flg</td></tr>
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>prcd_flg</td></tr>
		 * 	<tr><td><br></td><td>sim_flg</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>period_typ</td></tr>
		 * 	<tr><td><br></td><td>ld_sub_calc_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_CndR
		 */
		public mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_LocCndR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>rsrc_dec_place</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>on_num</td></tr>
		 * 	<tr><td><br></td><td>act_qty</td></tr>
		 * 	<tr><td><br></td><td>base_qty</td></tr>
		 * 	<tr><td><br></td><td>alert_qty</td></tr>
		 * 	<tr><td><br></td><td>ld_rate</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SumRsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>rsrc_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ld_sub_cd</td></tr>
		 * 	<tr><td><br></td><td>ld_sub_nm</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>act_qty</td></tr>
		 * 	<tr><td><br></td><td>ld_rate</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SubRsltR> down1() {
			return down1;
		}


		/**
		 * [ItmOrdLd_Srch01_SrchRslt]ブロックのコンテナaItmOrdLd_Srch01_SrchRsltLを返します。
		 *
		 * @return ItmOrdLd_Srch01_SrchRsltL
		 */
		public MCList<mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SrchRsltR> ItmOrdLd_Srch01_SrchRslt() {
			return aItmOrdLd_Srch01_SrchRslt;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_LdCalcService)MSBCL_LdCalcService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}