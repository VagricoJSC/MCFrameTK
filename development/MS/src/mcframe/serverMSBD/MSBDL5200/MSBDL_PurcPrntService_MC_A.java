package mcframe.serverMSBD.MSBDL5200;

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
 * "MSBDL_PurcPrntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDL_PurcPrntService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBDL5200";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDL_PurcPrntService.PurcPrnt_Upd01 aPurcPrnt_Upd01;

	protected void initPurcPrnt_Upd01() {
		this.info = PDef.MS_MSBDL5200_PurcPrnt_Upd01_INFO;
		this.aPurcPrnt_Upd01 = ((MSBDL_PurcPrntService)this).new PurcPrnt_Upd01();
	}

	public static MSBDL_PurcPrntService.PurcPrnt_Upd01 crtPurcPrnt_Upd01() {
		MSBDL_PurcPrntService lgc = new MSBDL_PurcPrntService();
		lgc.initPurcPrnt_Upd01();
		return lgc.aPurcPrnt_Upd01;
	}

	protected void paramPurcPrnt_Upd01(MCParam p) {
		if (this.aPurcPrnt_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcPrnt_Upd01.up0());
		p.addUpBlock(aPurcPrnt_Upd01.up1());
		p.addDownBlock(aPurcPrnt_Upd01.down0());
		p.addDownBlock(aPurcPrnt_Upd01.down1());
	}

	protected void doPurcPrnt_Upd01() {
		aPurcPrnt_Upd01.call();
	};

	/**
	 * PurcPrnt_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_HdrR createPurcPrnt_Upd01_HdrR(){
		return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_HdrR.create();
	}

	/**
	 * PurcPrnt_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_HdrR> createPurcPrnt_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_HdrR.class);
	}

	/**
	 * PurcPrnt_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_DtlR createPurcPrnt_Upd01_DtlR(){
		return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_DtlR.create();
	}

	/**
	 * PurcPrnt_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_DtlR> createPurcPrnt_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_DtlR.class);
	}

	/**
	 * PurcPrnt_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_CndR createPurcPrnt_Upd01_CndR(){
		return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_CndR.create();
	}
	protected MSBDL_PurcPrntService.PurcPrnt_Upd02 aPurcPrnt_Upd02;

	protected void initPurcPrnt_Upd02() {
		this.info = PDef.MS_MSBDL5200_PurcPrnt_Upd02_INFO;
		this.aPurcPrnt_Upd02 = ((MSBDL_PurcPrntService)this).new PurcPrnt_Upd02();
	}

	public static MSBDL_PurcPrntService.PurcPrnt_Upd02 crtPurcPrnt_Upd02() {
		MSBDL_PurcPrntService lgc = new MSBDL_PurcPrntService();
		lgc.initPurcPrnt_Upd02();
		return lgc.aPurcPrnt_Upd02;
	}

	protected void paramPurcPrnt_Upd02(MCParam p) {
		if (this.aPurcPrnt_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcPrnt_Upd02.up0());
		p.addDownBlock(aPurcPrnt_Upd02.down0());
		p.addDownBlock(aPurcPrnt_Upd02.down1());
	}

	protected void doPurcPrnt_Upd02() {
		aPurcPrnt_Upd02.call();
	};

	/**
	 * PurcPrnt_Upd02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_HdrR createPurcPrnt_Upd02_HdrR(){
		return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_HdrR.create();
	}

	/**
	 * PurcPrnt_Upd02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_HdrR> createPurcPrnt_Upd02_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_HdrR.class);
	}

	/**
	 * PurcPrnt_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_DtlR createPurcPrnt_Upd02_DtlR(){
		return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_DtlR.create();
	}

	/**
	 * PurcPrnt_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_DtlR> createPurcPrnt_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_DtlR.class);
	}
	protected MSBDL_PurcPrntService.PurcPrnt_Prnt01 aPurcPrnt_Prnt01;

	protected void initPurcPrnt_Prnt01() {
		this.info = PDef.MS_MSBDL5200_PurcPrnt_Prnt01_INFO;
		this.aPurcPrnt_Prnt01 = ((MSBDL_PurcPrntService)this).new PurcPrnt_Prnt01();
	}

	public static MSBDL_PurcPrntService.PurcPrnt_Prnt01 crtPurcPrnt_Prnt01() {
		MSBDL_PurcPrntService lgc = new MSBDL_PurcPrntService();
		lgc.initPurcPrnt_Prnt01();
		return lgc.aPurcPrnt_Prnt01;
	}

	protected void paramPurcPrnt_Prnt01(MCParam p) {
		if (this.aPurcPrnt_Prnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcPrnt_Prnt01.up0());
		p.addUpBlock(aPurcPrnt_Prnt01.up1());
		p.addUpBlock(aPurcPrnt_Prnt01.up2());
		p.addUpBlock(aPurcPrnt_Prnt01.up3());
		p.addUpBlock(aPurcPrnt_Prnt01.up4());
		p.addDownBlock(aPurcPrnt_Prnt01.down0());
		p.addDownBlock(aPurcPrnt_Prnt01.down1());
		p.addDownBlock(aPurcPrnt_Prnt01.down2());
		p.addDownBlock(aPurcPrnt_Prnt01.down3());
	}

	protected void doPurcPrnt_Prnt01() {
		aPurcPrnt_Prnt01.call();
	};

	/**
	 * PurcPrnt_Prnt01_PoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_PoR createPurcPrnt_Prnt01_PoR(){
		return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_PoR.create();
	}

	/**
	 * PurcPrnt_Prnt01_PoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_PoR> createPurcPrnt_Prnt01_PoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_PoR.class);
	}

	/**
	 * PurcPrnt_Prnt01_DlvInstブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvInstR createPurcPrnt_Prnt01_DlvInstR(){
		return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvInstR.create();
	}

	/**
	 * PurcPrnt_Prnt01_DlvInstブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvInstR> createPurcPrnt_Prnt01_DlvInstL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvInstR.class);
	}

	/**
	 * PurcPrnt_Prnt01_DlvSlipブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR createPurcPrnt_Prnt01_DlvSlipR(){
		return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR.create();
	}

	/**
	 * PurcPrnt_Prnt01_DlvSlipブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR> createPurcPrnt_Prnt01_DlvSlipL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR.class);
	}

	/**
	 * PurcPrnt_Prnt01_DlvSlipDataブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipDataR createPurcPrnt_Prnt01_DlvSlipDataR(){
		return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipDataR.create();
	}

	/**
	 * PurcPrnt_Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_CndR createPurcPrnt_Prnt01_CndR(){
		return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_CndR.create();
	}

	/**
	 * PurcPrnt_Prnt01_PurcDDlvブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR createPurcPrnt_Prnt01_PurcDDlvR(){
		return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR.create();
	}

	/**
	 * PurcPrnt_Prnt01_PurcDDlvブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR> createPurcPrnt_Prnt01_PurcDDlvL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR.class);
	}
	protected MSBDL_PurcPrntService.PurcPrnt_Prnt02 aPurcPrnt_Prnt02;

	protected void initPurcPrnt_Prnt02() {
		this.info = PDef.MS_MSBDL5200_PurcPrnt_Prnt02_INFO;
		this.aPurcPrnt_Prnt02 = ((MSBDL_PurcPrntService)this).new PurcPrnt_Prnt02();
	}

	public static MSBDL_PurcPrntService.PurcPrnt_Prnt02 crtPurcPrnt_Prnt02() {
		MSBDL_PurcPrntService lgc = new MSBDL_PurcPrntService();
		lgc.initPurcPrnt_Prnt02();
		return lgc.aPurcPrnt_Prnt02;
	}

	protected void paramPurcPrnt_Prnt02(MCParam p) {
		if (this.aPurcPrnt_Prnt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcPrnt_Prnt02.up0());
		p.addUpBlock(aPurcPrnt_Prnt02.up1());
	}

	protected void doPurcPrnt_Prnt02() {
		aPurcPrnt_Prnt02.call();
	};

	/**
	 * PurcPrnt_Prnt02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndR createPurcPrnt_Prnt02_CndR(){
		return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndR.create();
	}

	/**
	 * PurcPrnt_Prnt02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndR> createPurcPrnt_Prnt02_CndL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndR.class);
	}

	/**
	 * PurcPrnt_Prnt02_CndRブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndRR createPurcPrnt_Prnt02_CndRR(){
		return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndRR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PurcPrnt_Upd01オペレーション.<p>
	 *
	 * 購買納品伝票・明細トランザクションの作成・更新(削除含む)と納品書発行する<br>
	 */
	abstract public class PurcPrnt_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcPrnt_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_DtlR> down1;
		
		
		// コンストラクタ
		protected PurcPrnt_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_HdrR.class);
			up1 = mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_DtlR.class);

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
			invoke((MSBDL_PurcPrntService)MSBDL_PurcPrntService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * PurcPrnt_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_HdrR createPurcPrnt_Upd01_HdrR(){
			return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_HdrR.create();
		}

		/**
		 * PurcPrnt_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_HdrR> createPurcPrnt_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_HdrR.class);
		}

		/**
		 * PurcPrnt_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_DtlR createPurcPrnt_Upd01_DtlR(){
			return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_DtlR.create();
		}

		/**
		 * PurcPrnt_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_DtlR> createPurcPrnt_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_DtlR.class);
		}

		/**
		 * PurcPrnt_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_CndR createPurcPrnt_Upd01_CndR(){
			return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pds.po_no</td></tr>
		 * 	<tr><td><br></td><td>pds.po_rev</td></tr>
		 * 	<tr><td><br></td><td>pds.dlv_inst_grp_no</td></tr>
		 * 	<tr><td><br></td><td>pds.prms_rcpt_grp_no</td></tr>
		 * 	<tr><td><br></td><td>pds.purc_dlv_slip_src_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_HdrR> up0() {
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
		 * @see mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_CndR
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_CndR up1() {
			return up1;
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
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pdsd.dlv_slip_mng_d_no</td></tr>
		 * 	<tr><td><br></td><td>pdsd.dlv_slip_mng_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pdsd.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pdsd.dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pdsd.dlv_slip_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pdsd.dlv_slip_mng_seq</td></tr>
		 * 	<tr><td><br></td><td>pdsd.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pdsd.dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>pdsd.prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcPrntService)MSBDL_PurcPrntService_MC_A.this).info;
		}


	}
	/**
	 * PurcPrnt_Upd02オペレーション.<p>
	 *
	 * 仕入直送の納品伝票・明細トランザクションを作成する<br>
	 */
	abstract public class PurcPrnt_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcPrnt_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_DtlR> down1;
		
		
		// コンストラクタ
		protected PurcPrnt_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_DtlR.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcPrntService)MSBDL_PurcPrntService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * PurcPrnt_Upd02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_HdrR createPurcPrnt_Upd02_HdrR(){
			return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_HdrR.create();
		}

		/**
		 * PurcPrnt_Upd02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_HdrR> createPurcPrnt_Upd02_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_HdrR.class);
		}

		/**
		 * PurcPrnt_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_DtlR createPurcPrnt_Upd02_DtlR(){
			return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_DtlR.create();
		}

		/**
		 * PurcPrnt_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_DtlR> createPurcPrnt_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pdsd.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pdsd.dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>pdsd.prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>pdsd.purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pdsd.purc_ddlv_dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>pdsd.purc_ddlv_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Upd02_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcPrntService)MSBDL_PurcPrntService_MC_A.this).info;
		}


	}
	/**
	 * PurcPrnt_Prnt01オペレーション.<p>
	 *
	 * 注文書、納入指示書、納品書を発行する。<br>
	 */
	abstract public class PurcPrnt_Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcPrnt_Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_PoR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvInstR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_CndR up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_PoR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvInstR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR> down3;
		/** [PurcPrnt_Prnt01_DlvSlipData]ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipDataR aPurcPrnt_Prnt01_DlvSlipData;
		
		
		// コンストラクタ
		protected PurcPrnt_Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_PoR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvInstR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR.class);
			up3 = mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_CndR.create();
			up4 = MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_PoR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvInstR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR.class);
			down3 = MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR.class);
			aPurcPrnt_Prnt01_DlvSlipData = mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipDataR.create();

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
			if (i == 4) return up4();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcPrntService)MSBDL_PurcPrntService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * PurcPrnt_Prnt01_PoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_PoR createPurcPrnt_Prnt01_PoR(){
			return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_PoR.create();
		}

		/**
		 * PurcPrnt_Prnt01_PoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_PoR> createPurcPrnt_Prnt01_PoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_PoR.class);
		}

		/**
		 * PurcPrnt_Prnt01_DlvInstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvInstR createPurcPrnt_Prnt01_DlvInstR(){
			return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvInstR.create();
		}

		/**
		 * PurcPrnt_Prnt01_DlvInstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvInstR> createPurcPrnt_Prnt01_DlvInstL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvInstR.class);
		}

		/**
		 * PurcPrnt_Prnt01_DlvSlipブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR createPurcPrnt_Prnt01_DlvSlipR(){
			return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR.create();
		}

		/**
		 * PurcPrnt_Prnt01_DlvSlipブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR> createPurcPrnt_Prnt01_DlvSlipL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR.class);
		}

		/**
		 * PurcPrnt_Prnt01_DlvSlipDataブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipDataR createPurcPrnt_Prnt01_DlvSlipDataR(){
			return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipDataR.create();
		}

		/**
		 * PurcPrnt_Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_CndR createPurcPrnt_Prnt01_CndR(){
			return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_CndR.create();
		}

		/**
		 * PurcPrnt_Prnt01_PurcDDlvブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR createPurcPrnt_Prnt01_PurcDDlvR(){
			return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR.create();
		}

		/**
		 * PurcPrnt_Prnt01_PurcDDlvブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR> createPurcPrnt_Prnt01_PurcDDlvL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_PoR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvInstR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_srch_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_grp_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_grp_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_CndR
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_CndR up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_seq</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_grp_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_grp_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>inc_can_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR> up4() {
			return up4;
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
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_PoR> down0() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvInstR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipR> down3() {
			return down3;
		}


		/**
		 * [PurcPrnt_Prnt01_DlvSlipData]ブロックのコンテナaPurcPrnt_Prnt01_DlvSlipDataRを返します。
		 *
		 * @return PurcPrnt_Prnt01_DlvSlipDataR
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt01_DlvSlipDataR PurcPrnt_Prnt01_DlvSlipData() {
			return aPurcPrnt_Prnt01_DlvSlipData;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcPrntService)MSBDL_PurcPrntService_MC_A.this).info;
		}


	}
	/**
	 * PurcPrnt_Prnt02オペレーション.<p>
	 *
	 * 仕入返品票を発行する。<br>
	 */
	abstract public class PurcPrnt_Prnt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcPrnt_Prnt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndRR up1;
		
		
		// コンストラクタ
		protected PurcPrnt_Prnt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndR.class);
			up1 = mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndRR.create();

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
			invoke((MSBDL_PurcPrntService)MSBDL_PurcPrntService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PurcPrnt_Prnt02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndR createPurcPrnt_Prnt02_CndR(){
			return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndR.create();
		}

		/**
		 * PurcPrnt_Prnt02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndR> createPurcPrnt_Prnt02_CndL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndR.class);
		}

		/**
		 * PurcPrnt_Prnt02_CndRブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndRR createPurcPrnt_Prnt02_CndRR(){
			return mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndRR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_prnt_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndR> up0() {
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
		 * @see mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndRR
		 */
		public mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndRR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcPrntService)MSBDL_PurcPrntService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}