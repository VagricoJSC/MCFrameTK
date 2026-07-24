package mcframe.serverMSBE.MSBEL5520;

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
 * "MSBEL_ShipLotChkService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ShipLotChkService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL5520";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ShipLotChkService.ShipLotChk_Chk01 aShipLotChk_Chk01;

	protected void initShipLotChk_Chk01() {
		this.info = PDef.MS_MSBEL5520_ShipLotChk_Chk01_INFO;
		this.aShipLotChk_Chk01 = ((MSBEL_ShipLotChkService)this).new ShipLotChk_Chk01();
	}

	public static MSBEL_ShipLotChkService.ShipLotChk_Chk01 crtShipLotChk_Chk01() {
		MSBEL_ShipLotChkService lgc = new MSBEL_ShipLotChkService();
		lgc.initShipLotChk_Chk01();
		return lgc.aShipLotChk_Chk01;
	}

	protected void paramShipLotChk_Chk01(MCParam p) {
		if (this.aShipLotChk_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipLotChk_Chk01.up0());
		p.addDownBlock(aShipLotChk_Chk01.down0());
	}

	protected void doShipLotChk_Chk01() {
		aShipLotChk_Chk01.call();
	};

	/**
	 * ShipLot_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR createShipLot_DtlR(){
		return mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR.create();
	}

	/**
	 * ShipLot_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> createShipLot_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR.class);
	}
	protected MSBEL_ShipLotChkService.ShipLotChk_Srch01 aShipLotChk_Srch01;

	protected void initShipLotChk_Srch01() {
		this.info = PDef.MS_MSBEL5520_ShipLotChk_Srch01_INFO;
		this.aShipLotChk_Srch01 = ((MSBEL_ShipLotChkService)this).new ShipLotChk_Srch01();
	}

	public static MSBEL_ShipLotChkService.ShipLotChk_Srch01 crtShipLotChk_Srch01() {
		MSBEL_ShipLotChkService lgc = new MSBEL_ShipLotChkService();
		lgc.initShipLotChk_Srch01();
		return lgc.aShipLotChk_Srch01;
	}

	protected void paramShipLotChk_Srch01(MCParam p) {
		if (this.aShipLotChk_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipLotChk_Srch01.up0());
		p.addDownBlock(aShipLotChk_Srch01.down0());
	}

	protected void doShipLotChk_Srch01() {
		aShipLotChk_Srch01.call();
	};
	protected MSBEL_ShipLotChkService.ShipLotChk_Upd01 aShipLotChk_Upd01;

	protected void initShipLotChk_Upd01() {
		this.info = PDef.MS_MSBEL5520_ShipLotChk_Upd01_INFO;
		this.aShipLotChk_Upd01 = ((MSBEL_ShipLotChkService)this).new ShipLotChk_Upd01();
	}

	public static MSBEL_ShipLotChkService.ShipLotChk_Upd01 crtShipLotChk_Upd01() {
		MSBEL_ShipLotChkService lgc = new MSBEL_ShipLotChkService();
		lgc.initShipLotChk_Upd01();
		return lgc.aShipLotChk_Upd01;
	}

	protected void paramShipLotChk_Upd01(MCParam p) {
		if (this.aShipLotChk_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipLotChk_Upd01.up0());
		p.addDownBlock(aShipLotChk_Upd01.down0());
	}

	protected void doShipLotChk_Upd01() {
		aShipLotChk_Upd01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ShipLotChk_Chk01オペレーション.<p>
	 *
	 * 出荷対象のロットがマスタで定義する有効期限日数を満たしているか、またロットの有効期限が出荷済みのロットと比較して逆転していないかチェックする。<br>
	 */
	abstract public class ShipLotChk_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipLotChk_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> down0;
		
		
		// コンストラクタ
		protected ShipLotChk_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipLotChkService)MSBEL_ShipLotChkService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipLot_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR createShipLot_DtlR(){
			return mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR.create();
		}

		/**
		 * ShipLot_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> createShipLot_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>sl.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sl.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>sl.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sl.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>sl.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>sl.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sl.base_dt</td></tr>
		 * 	<tr><td><br></td><td>sl.lot_no</td></tr>
		 * 	<tr><td><br></td><td>sl.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sl.ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipLotChkService)MSBEL_ShipLotChkService_MC_A.this).info;
		}


	}
	/**
	 * ShipLotChk_Srch01オペレーション.<p>
	 *
	 * 出荷済みのロットから最小・最大の有効期限を取得する。<br>
	 */
	abstract public class ShipLotChk_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipLotChk_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> down0;
		
		
		// コンストラクタ
		protected ShipLotChk_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipLotChkService)MSBEL_ShipLotChkService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipLot_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR createShipLot_DtlR(){
			return mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR.create();
		}

		/**
		 * ShipLot_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> createShipLot_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>sl.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sl.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>sl.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sl.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>sl.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>sl.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sl.base_dt</td></tr>
		 * 	<tr><td><br></td><td>sl.ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>lock_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_fr_grp</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_to</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipLotChkService)MSBEL_ShipLotChkService_MC_A.this).info;
		}


	}
	/**
	 * ShipLotChk_Upd01オペレーション.<p>
	 *
	 * 出荷ロットを登録・削除する。<br>
	 */
	abstract public class ShipLotChk_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipLotChk_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> down0;
		
		
		// コンストラクタ
		protected ShipLotChk_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipLotChkService)MSBEL_ShipLotChkService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipLot_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR createShipLot_DtlR(){
			return mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR.create();
		}

		/**
		 * ShipLot_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> createShipLot_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>sl.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sl.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>sl.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sl.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>sl.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>sl.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sl.base_dt</td></tr>
		 * 	<tr><td><br></td><td>sl.lot_no</td></tr>
		 * 	<tr><td><br></td><td>sl.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sl.ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>sl.ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>lock_flg</td></tr>
		 * 	<tr><td><br></td><td>org_ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>org_ship_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> up0() {
			return up0;
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
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipLotChkService)MSBEL_ShipLotChkService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}