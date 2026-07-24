package mcframe.serverMSBH.MSBHL5130;

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
 * "MSBHL_ApSwBalService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_ApSwBalService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBHL5130";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_ApSwBalService.ApSwBal_Chk01 aApSwBal_Chk01;

	protected void initApSwBal_Chk01() {
		this.info = PDef.MS_MSBHL5130_ApSwBal_Chk01_INFO;
		this.aApSwBal_Chk01 = ((MSBHL_ApSwBalService)this).new ApSwBal_Chk01();
	}

	public static MSBHL_ApSwBalService.ApSwBal_Chk01 crtApSwBal_Chk01() {
		MSBHL_ApSwBalService lgc = new MSBHL_ApSwBalService();
		lgc.initApSwBal_Chk01();
		return lgc.aApSwBal_Chk01;
	}

	protected void paramApSwBal_Chk01(MCParam p) {
		if (this.aApSwBal_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApSwBal_Chk01.up0());
		p.addUpBlock(aApSwBal_Chk01.up1());
		p.addUpBlock(aApSwBal_Chk01.up2());
		p.addDownBlock(aApSwBal_Chk01.down0());
		p.addDownBlock(aApSwBal_Chk01.down1());
		p.addDownBlock(aApSwBal_Chk01.down2());
	}

	protected void doApSwBal_Chk01() {
		aApSwBal_Chk01.call();
	};

	/**
	 * ApSwBal_Chk01_FrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR createApSwBal_Chk01_FrR(){
		return mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR.create();
	}

	/**
	 * ApSwBal_Chk01_FrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR> createApSwBal_Chk01_FrL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR.class);
	}

	/**
	 * ApSwBal_Chk01_BaseブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR createApSwBal_Chk01_BaseR(){
		return mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR.create();
	}

	/**
	 * ApSwBal_Chk01_BaseブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR> createApSwBal_Chk01_BaseL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR.class);
	}

	/**
	 * ApSwBal_Chk01_ToブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR createApSwBal_Chk01_ToR(){
		return mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR.create();
	}

	/**
	 * ApSwBal_Chk01_ToブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR> createApSwBal_Chk01_ToL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR.class);
	}
	protected MSBHL_ApSwBalService.ApSwBal_Ins01 aApSwBal_Ins01;

	protected void initApSwBal_Ins01() {
		this.info = PDef.MS_MSBHL5130_ApSwBal_Ins01_INFO;
		this.aApSwBal_Ins01 = ((MSBHL_ApSwBalService)this).new ApSwBal_Ins01();
	}

	public static MSBHL_ApSwBalService.ApSwBal_Ins01 crtApSwBal_Ins01() {
		MSBHL_ApSwBalService lgc = new MSBHL_ApSwBalService();
		lgc.initApSwBal_Ins01();
		return lgc.aApSwBal_Ins01;
	}

	protected void paramApSwBal_Ins01(MCParam p) {
		if (this.aApSwBal_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApSwBal_Ins01.up0());
		p.addUpBlock(aApSwBal_Ins01.up1());
		p.addUpBlock(aApSwBal_Ins01.up2());
		p.addDownBlock(aApSwBal_Ins01.down0());
	}

	protected void doApSwBal_Ins01() {
		aApSwBal_Ins01.call();
	};

	/**
	 * ApSwBal_Ins01_FrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR createApSwBal_Ins01_FrR(){
		return mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR.create();
	}

	/**
	 * ApSwBal_Ins01_FrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR> createApSwBal_Ins01_FrL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR.class);
	}

	/**
	 * ApSwBal_Ins01_BaseブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR createApSwBal_Ins01_BaseR(){
		return mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR.create();
	}

	/**
	 * ApSwBal_Ins01_BaseブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR> createApSwBal_Ins01_BaseL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR.class);
	}

	/**
	 * ApSwBal_Ins01_ToブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR createApSwBal_Ins01_ToR(){
		return mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR.create();
	}

	/**
	 * ApSwBal_Ins01_ToブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR> createApSwBal_Ins01_ToL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR.class);
	}
	protected MSBHL_ApSwBalService.ApSwBal_Prnt01 aApSwBal_Prnt01;

	protected void initApSwBal_Prnt01() {
		this.info = PDef.MS_MSBHL5130_ApSwBal_Prnt01_INFO;
		this.aApSwBal_Prnt01 = ((MSBHL_ApSwBalService)this).new ApSwBal_Prnt01();
	}

	public static MSBHL_ApSwBalService.ApSwBal_Prnt01 crtApSwBal_Prnt01() {
		MSBHL_ApSwBalService lgc = new MSBHL_ApSwBalService();
		lgc.initApSwBal_Prnt01();
		return lgc.aApSwBal_Prnt01;
	}

	protected void paramApSwBal_Prnt01(MCParam p) {
		if (this.aApSwBal_Prnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApSwBal_Prnt01.up0());
		p.addUpBlock(aApSwBal_Prnt01.up1());
	}

	protected void doApSwBal_Prnt01() {
		aApSwBal_Prnt01.call();
	};

	/**
	 * ApSwBal_Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_CndR createApSwBal_Prnt01_CndR(){
		return mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_CndR.create();
	}

	/**
	 * ApSwBal_Prnt01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_CndR> createApSwBal_Prnt01_CndL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_CndR.class);
	}

	/**
	 * ApSwBal_Prnt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_HdrR createApSwBal_Prnt01_HdrR(){
		return mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_HdrR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ApSwBal_Chk01オペレーション.<p>
	 *
	 * 債務残高振替が可能かチェックをする。<br>
	 */
	abstract public class ApSwBal_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApSwBal_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR> down2;
		
		
		// コンストラクタ
		protected ApSwBal_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR.class);
			down1 = MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR.class);
			down2 = MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR.class);

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
			invoke((MSBHL_ApSwBalService)MSBHL_ApSwBalService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * ApSwBal_Chk01_FrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR createApSwBal_Chk01_FrR(){
			return mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR.create();
		}

		/**
		 * ApSwBal_Chk01_FrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR> createApSwBal_Chk01_FrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR.class);
		}

		/**
		 * ApSwBal_Chk01_BaseブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR createApSwBal_Chk01_BaseR(){
			return mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR.create();
		}

		/**
		 * ApSwBal_Chk01_BaseブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR> createApSwBal_Chk01_BaseL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR.class);
		}

		/**
		 * ApSwBal_Chk01_ToブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR createApSwBal_Chk01_ToR(){
			return mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR.create();
		}

		/**
		 * ApSwBal_Chk01_ToブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR> createApSwBal_Chk01_ToL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>sw_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dac_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>sw_chk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_ope_typ</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>sw_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sw_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_ope_typ</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApSwBalService)MSBHL_ApSwBalService_MC_A.this).info;
		}


	}
	/**
	 * ApSwBal_Ins01オペレーション.<p>
	 *
	 * 債務残高振替を行う。<br>
	 */
	abstract public class ApSwBal_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApSwBal_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR> down0;
		
		
		// コンストラクタ
		protected ApSwBal_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_ApSwBalService)MSBHL_ApSwBalService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ApSwBal_Ins01_FrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR createApSwBal_Ins01_FrR(){
			return mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR.create();
		}

		/**
		 * ApSwBal_Ins01_FrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR> createApSwBal_Ins01_FrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR.class);
		}

		/**
		 * ApSwBal_Ins01_BaseブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR createApSwBal_Ins01_BaseR(){
			return mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR.create();
		}

		/**
		 * ApSwBal_Ins01_BaseブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR> createApSwBal_Ins01_BaseL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR.class);
		}

		/**
		 * ApSwBal_Ins01_ToブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR createApSwBal_Ins01_ToR(){
			return mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR.create();
		}

		/**
		 * ApSwBal_Ins01_ToブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR> createApSwBal_Ins01_ToL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>sw_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sw_chk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_BaseR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_ope_typ</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_ToR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ap_appl_schd_no</td></tr>
		 * 	<tr><td><br></td><td>to_ap_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Chk01_FrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApSwBalService)MSBHL_ApSwBalService_MC_A.this).info;
		}


	}
	/**
	 * ApSwBal_Prnt01オペレーション.<p>
	 *
	 * 振替伝票を発行する。<br>
	 */
	abstract public class ApSwBal_Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApSwBal_Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_CndR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_HdrR up1;
		
		
		// コンストラクタ
		protected ApSwBal_Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_CndR.class);
			up1 = mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_HdrR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_ApSwBalService)MSBHL_ApSwBalService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ApSwBal_Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_CndR createApSwBal_Prnt01_CndR(){
			return mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_CndR.create();
		}

		/**
		 * ApSwBal_Prnt01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_CndR> createApSwBal_Prnt01_CndL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_CndR.class);
		}

		/**
		 * ApSwBal_Prnt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_HdrR createApSwBal_Prnt01_HdrR(){
			return mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>reprnt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_CndR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_HdrR
		 */
		public mcframe.serverMSBH.MSBHL5130.ApSwBal_Prnt01_HdrR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApSwBalService)MSBHL_ApSwBalService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}