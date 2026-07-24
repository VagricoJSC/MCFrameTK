package mcframe.serverMSLA.MSLAL9110;

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
 * "MSLAL_PoRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_PoRecvIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSLA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSLAL9110";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_PoRecvIfService.PoRecvIf_Chk01 aPoRecvIf_Chk01;

	protected void initPoRecvIf_Chk01() {
		this.info = PDef.MS_MSLAL9110_PoRecvIf_Chk01_INFO;
		this.aPoRecvIf_Chk01 = ((MSLAL_PoRecvIfService)this).new PoRecvIf_Chk01();
	}

	public static MSLAL_PoRecvIfService.PoRecvIf_Chk01 crtPoRecvIf_Chk01() {
		MSLAL_PoRecvIfService lgc = new MSLAL_PoRecvIfService();
		lgc.initPoRecvIf_Chk01();
		return lgc.aPoRecvIf_Chk01;
	}

	protected void paramPoRecvIf_Chk01(MCParam p) {
		if (this.aPoRecvIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoRecvIf_Chk01.up0());
		p.addDownBlock(aPoRecvIf_Chk01.down0());
		p.addDownBlock(aPoRecvIf_Chk01.down1());
		p.addDownBlock(aPoRecvIf_Chk01.down2());
		p.addDownBlock(aPoRecvIf_Chk01.down3());
	}

	protected void doPoRecvIf_Chk01() {
		aPoRecvIf_Chk01.call();
	};

	/**
	 * PoRecvIf_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9110.PoRecvIf_Chk01_CndR createPoRecvIf_Chk01_CndR(){
		return mcframe.serverMSLA.MSLAL9110.PoRecvIf_Chk01_CndR.create();
	}

	/**
	 * PoRecvIf_Chk01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Chk01_CndR> createPoRecvIf_Chk01_CndL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9110.PoRecvIf_Chk01_CndR.class);
	}

	/**
	 * PoRecvIf_Chk01_Hdr_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR createPoRecvIf_Chk01_Hdr_RsltR(){
		return mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.create();
	}

	/**
	 * PoRecvIf_Chk01_Hdr_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> createPoRecvIf_Chk01_Hdr_RsltL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
	}

	/**
	 * PoRecvIf_Chk01_Dtl_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR createPoRecvIf_Chk01_Dtl_RsltR(){
		return mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.create();
	}

	/**
	 * PoRecvIf_Chk01_Dtl_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> createPoRecvIf_Chk01_Dtl_RsltL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
	}

	/**
	 * PoRecvIf_Chk01_Dtl_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR createPoRecvIf_Chk01_Dtl_Rslt2R(){
		return mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.create();
	}

	/**
	 * PoRecvIf_Chk01_Dtl_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> createPoRecvIf_Chk01_Dtl_Rslt2L(){
		return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);
	}
	protected MSLAL_PoRecvIfService.PoRecvIf_Upd01 aPoRecvIf_Upd01;

	protected void initPoRecvIf_Upd01() {
		this.info = PDef.MS_MSLAL9110_PoRecvIf_Upd01_INFO;
		this.aPoRecvIf_Upd01 = ((MSLAL_PoRecvIfService)this).new PoRecvIf_Upd01();
	}

	public static MSLAL_PoRecvIfService.PoRecvIf_Upd01 crtPoRecvIf_Upd01() {
		MSLAL_PoRecvIfService lgc = new MSLAL_PoRecvIfService();
		lgc.initPoRecvIf_Upd01();
		return lgc.aPoRecvIf_Upd01;
	}

	protected void paramPoRecvIf_Upd01(MCParam p) {
		if (this.aPoRecvIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoRecvIf_Upd01.up0());
	}

	protected void doPoRecvIf_Upd01() {
		aPoRecvIf_Upd01.call();
	};

	/**
	 * PoRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createPoRecvIf_Upd01_DtlR(){
		return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
	}

	/**
	 * PoRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createPoRecvIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
	}
	protected MSLAL_PoRecvIfService.PoRecvIf_Upd02 aPoRecvIf_Upd02;

	protected void initPoRecvIf_Upd02() {
		this.info = PDef.MS_MSLAL9110_PoRecvIf_Upd02_INFO;
		this.aPoRecvIf_Upd02 = ((MSLAL_PoRecvIfService)this).new PoRecvIf_Upd02();
	}

	public static MSLAL_PoRecvIfService.PoRecvIf_Upd02 crtPoRecvIf_Upd02() {
		MSLAL_PoRecvIfService lgc = new MSLAL_PoRecvIfService();
		lgc.initPoRecvIf_Upd02();
		return lgc.aPoRecvIf_Upd02;
	}

	protected void paramPoRecvIf_Upd02(MCParam p) {
		if (this.aPoRecvIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoRecvIf_Upd02.up0());
		p.addUpBlock(aPoRecvIf_Upd02.up1());
		p.addDownBlock(aPoRecvIf_Upd02.down0());
	}

	protected void doPoRecvIf_Upd02() {
		aPoRecvIf_Upd02.call();
	};

	/**
	 * PoRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createPoRecvIf_Upd01_DtlR_0(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
	}

	/**
	 * PoRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createPoRecvIf_Upd01_DtlL_0(){
		return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
	}

	/**
	 * PoRecvIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createPoRecvIf_Upd02_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * PoRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createPoRecvIf_Upd02_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_PoRecvIfService.PoRecvIf_Upd03 aPoRecvIf_Upd03;

	protected void initPoRecvIf_Upd03() {
		this.info = PDef.MS_MSLAL9110_PoRecvIf_Upd03_INFO;
		this.aPoRecvIf_Upd03 = ((MSLAL_PoRecvIfService)this).new PoRecvIf_Upd03();
	}

	public static MSLAL_PoRecvIfService.PoRecvIf_Upd03 crtPoRecvIf_Upd03() {
		MSLAL_PoRecvIfService lgc = new MSLAL_PoRecvIfService();
		lgc.initPoRecvIf_Upd03();
		return lgc.aPoRecvIf_Upd03;
	}

	protected void paramPoRecvIf_Upd03(MCParam p) {
		if (this.aPoRecvIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoRecvIf_Upd03.up0());
		p.addDownBlock(aPoRecvIf_Upd03.down0());
	}

	protected void doPoRecvIf_Upd03() {
		aPoRecvIf_Upd03.call();
	};

	/**
	 * PoRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd03_DtlR createPoRecvIf_Upd03_DtlR(){
		return mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd03_DtlR.create();
	}

	/**
	 * PoRecvIf_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd03_DtlR> createPoRecvIf_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd03_DtlR.class);
	}

	/**
	 * PoRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createPoRecvIf_Upd03_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_PoRecvIfService.PoRecvIf_Upd04 aPoRecvIf_Upd04;

	protected void initPoRecvIf_Upd04() {
		this.info = PDef.MS_MSLAL9110_PoRecvIf_Upd04_INFO;
		this.aPoRecvIf_Upd04 = ((MSLAL_PoRecvIfService)this).new PoRecvIf_Upd04();
	}

	public static MSLAL_PoRecvIfService.PoRecvIf_Upd04 crtPoRecvIf_Upd04() {
		MSLAL_PoRecvIfService lgc = new MSLAL_PoRecvIfService();
		lgc.initPoRecvIf_Upd04();
		return lgc.aPoRecvIf_Upd04;
	}

	protected void paramPoRecvIf_Upd04(MCParam p) {
		if (this.aPoRecvIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoRecvIf_Upd04.up0());
		p.addDownBlock(aPoRecvIf_Upd04.down0());
		p.addDownBlock(aPoRecvIf_Upd04.down1());
	}

	protected void doPoRecvIf_Upd04() {
		aPoRecvIf_Upd04.call();
	};

	/**
	 * PoRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd04_DtlR createPoRecvIf_Upd04_DtlR(){
		return mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd04_DtlR.create();
	}

	/**
	 * PoRecvIf_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd04_DtlR> createPoRecvIf_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd04_DtlR.class);
	}

	/**
	 * RcvRecvIf_Upd04_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createRcvRecvIf_Upd04_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PoRecvIf_Chk01オペレーション.<p>
	 *
	 * 発注受信ＩＦ取込を行う前のチェック処理<br>
	 */
	abstract public class PoRecvIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoRecvIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Chk01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Chk01_CndR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> down3;
		
		
		// コンストラクタ
		protected PoRecvIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL9110.PoRecvIf_Chk01_CndR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9110.PoRecvIf_Chk01_CndR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
			down3 = MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);

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
			if (i == 2) return down2();
			if (i == 3) return down3();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_PoRecvIfService)MSLAL_PoRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * PoRecvIf_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9110.PoRecvIf_Chk01_CndR createPoRecvIf_Chk01_CndR(){
			return mcframe.serverMSLA.MSLAL9110.PoRecvIf_Chk01_CndR.create();
		}

		/**
		 * PoRecvIf_Chk01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Chk01_CndR> createPoRecvIf_Chk01_CndL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9110.PoRecvIf_Chk01_CndR.class);
		}

		/**
		 * PoRecvIf_Chk01_Hdr_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR createPoRecvIf_Chk01_Hdr_RsltR(){
			return mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.create();
		}

		/**
		 * PoRecvIf_Chk01_Hdr_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> createPoRecvIf_Chk01_Hdr_RsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR.class);
		}

		/**
		 * PoRecvIf_Chk01_Dtl_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR createPoRecvIf_Chk01_Dtl_RsltR(){
			return mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.create();
		}

		/**
		 * PoRecvIf_Chk01_Dtl_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> createPoRecvIf_Chk01_Dtl_RsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR.class);
		}

		/**
		 * PoRecvIf_Chk01_Dtl_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR createPoRecvIf_Chk01_Dtl_Rslt2R(){
			return mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.create();
		}

		/**
		 * PoRecvIf_Chk01_Dtl_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> createPoRecvIf_Chk01_Dtl_Rslt2L(){
			return MCList.create(mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>poif.data_lno</td></tr>
		 * 	<tr><td><br></td><td>poif.data_no</td></tr>
		 * 	<tr><td><br></td><td>poif.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>poif.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>poif.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>poif.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>poif.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>poif.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>poif.recv_dt</td></tr>
		 * 	<tr><td><br></td><td>poif.ext_po_no</td></tr>
		 * 	<tr><td><br></td><td>poif.ext_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>poif.prnt_po_flg</td></tr>
		 * 	<tr><td><br></td><td>poif.prnt_dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>poif.po_dt</td></tr>
		 * 	<tr><td><br></td><td>poif.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>poif.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.xrate</td></tr>
		 * 	<tr><td><br></td><td>poif.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>poif.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>poif.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>poif.po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.upd_po_print_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>poif.crct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>poif.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>poif.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>poif.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>poif.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>poif.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>poif.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>poif.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>poif.po_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>poif.dlv_slip_rmrks</td></tr>
		 * 	<tr><td><br></td><td>poif.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>poif.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>poif.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>poif.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>poif.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>poif.ver_no</td></tr>
		 * 	<tr><td><br></td><td>poif.sno1</td></tr>
		 * 	<tr><td><br></td><td>poif.sno2</td></tr>
		 * 	<tr><td><br></td><td>poif.sno3</td></tr>
		 * 	<tr><td><br></td><td>poif.sno4</td></tr>
		 * 	<tr><td><br></td><td>poif.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>poif.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>poif.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>poif.in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>poif.dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>poif.rqst_avl_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>poif.purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>poif.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>poif.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>poif.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>poif.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>poif.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>poif.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>poif.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>poif.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>poif.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>poif.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>poif.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>poif.purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.pri_print_flg</td></tr>
		 * 	<tr><td><br></td><td>poif.po_conf_rcpt_flg</td></tr>
		 * 	<tr><td><br></td><td>poif.po_conf_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>poif.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>poif.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>poif.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>poif.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>poif.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>poif.po_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>poif.arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>poif.dlv_slip_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>poif.edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>poif.edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>poif.edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>poif.edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>poif.edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>poif.edi_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>poif.edi_sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>poif.edi_sub_d_char1</td></tr>
		 * 	<tr><td><br></td><td>poif.edi_sub_d_char2</td></tr>
		 * 	<tr><td><br></td><td>poif.edi_sub_d_char3</td></tr>
		 * 	<tr><td><br></td><td>poif.edi_sub_d_char4</td></tr>
		 * 	<tr><td><br></td><td>poif.edi_sub_d_char5</td></tr>
		 * 	<tr><td><br></td><td>poif.edi_sub_d_num1</td></tr>
		 * 	<tr><td><br></td><td>poif.edi_sub_d_dt1</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Chk01_CndR> up0() {
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
		public MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Chk01_CndR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_ttl_amt</td></tr>
		 * 	<tr><td><br></td><td>bef_po_rev</td></tr>
		 * 	<tr><td><br></td><td>prnt_po_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * 	<tr><td><br></td><td>po.po_no</td></tr>
		 * 	<tr><td><br></td><td>po.po_rev</td></tr>
		 * 	<tr><td><br></td><td>po.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>po.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>po.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>po.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>po.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>po.sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>po.po_dt</td></tr>
		 * 	<tr><td><br></td><td>po.upd_po_print_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>po.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>po.xrate</td></tr>
		 * 	<tr><td><br></td><td>po.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>po.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>po.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>po.crct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>po.po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>po.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>po.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>po.can_flg</td></tr>
		 * 	<tr><td><br></td><td>po.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>po.aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>po.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po.po_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po.dlv_slip_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>po.edi_sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>po.purc_if_flg</td></tr>
		 * 	<tr><td><br></td><td>po.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>po.ext_po_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_HdrR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>only_upd_pod_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>bef_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pod.po_no</td></tr>
		 * 	<tr><td><br></td><td>pod.po_rev</td></tr>
		 * 	<tr><td><br></td><td>pod.po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pod.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>pod.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pod.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pod.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pod.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pod.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pod.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pod.sno1</td></tr>
		 * 	<tr><td><br></td><td>pod.sno2</td></tr>
		 * 	<tr><td><br></td><td>pod.sno3</td></tr>
		 * 	<tr><td><br></td><td>pod.sno4</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pod.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pod.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pod.in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_lt</td></tr>
		 * 	<tr><td><br></td><td>pod.rqst_avl_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>pod.rqst_dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pod.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pod.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>pod.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>pod.drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>pod.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>pod.bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.outsrc_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>pod.outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.schd_chg_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.po_conf_rcpt_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.po_conf_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>pod.pri_print_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pod.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pod.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>pod.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pod.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pod.po_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pod.dlv_slip_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pod.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pod.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pod.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_char1</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_char2</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_char3</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_char4</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_char5</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_num1</td></tr>
		 * 	<tr><td><br></td><td>pod.edi_sub_d_dt1</td></tr>
		 * 	<tr><td><br></td><td>pod.rqst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>pod.ext_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pod.purc_basis_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_DtlR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>outsrc_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5100.Po_Ins01_Bndl_DtlR> down3() {
			return down3;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_PoRecvIfService)MSLAL_PoRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * PoRecvIf_Upd01オペレーション.<p>
	 *
	 * 発注受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	abstract public class PoRecvIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverPFUD.PFUDL0040.IfPFUDL_ESBRecvIf_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoRecvIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected PoRecvIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_PoRecvIfService)MSLAL_PoRecvIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PoRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createPoRecvIf_Upd01_DtlR(){
			return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
		}

		/**
		 * PoRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createPoRecvIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_PoRecvIfService)MSLAL_PoRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * PoRecvIf_Upd02オペレーション.<p>
	 *
	 * 発注受信ＩＦ取込を行う。（ＩＦデータ確認、および発注受信ＩＦ取込バッチから呼び出される）<br>
	 */
	abstract public class PoRecvIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBE.MBBEL5010.IfMBBEL_IfDataImpService_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoRecvIf_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0;
		
		
		// コンストラクタ
		protected PoRecvIf_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
			down0 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();

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
			invoke((MSLAL_PoRecvIfService)MSLAL_PoRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PoRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createPoRecvIf_Upd01_DtlR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
		}

		/**
		 * PoRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createPoRecvIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
		}

		/**
		 * PoRecvIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createPoRecvIf_Upd02_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * PoRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createPoRecvIf_Upd02_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>exe_unit_lump_flg</td></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_actlumprecv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_num</td></tr>
		 * 	<tr><td><br></td><td>ok_num</td></tr>
		 * 	<tr><td><br></td><td>err_num</td></tr>
		 * 	<tr><td><br></td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_PoRecvIfService)MSLAL_PoRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * PoRecvIf_Upd03オペレーション.<p>
	 *
	 * 発注受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	abstract public class PoRecvIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoRecvIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0;
		
		
		// コンストラクタ
		protected PoRecvIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd03_DtlR.class);
			down0 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();

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
			invoke((MSLAL_PoRecvIfService)MSLAL_PoRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PoRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd03_DtlR createPoRecvIf_Upd03_DtlR(){
			return mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd03_DtlR.create();
		}

		/**
		 * PoRecvIf_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd03_DtlR> createPoRecvIf_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd03_DtlR.class);
		}

		/**
		 * PoRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createPoRecvIf_Upd03_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>poif.data_lno</td></tr>
		 * 	<tr><td><br></td><td>poif.data_no</td></tr>
		 * 	<tr><td><br></td><td>poif.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>poif.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>poif.ext_po_no</td></tr>
		 * 	<tr><td><br></td><td>poif.ext_po_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd03_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_num</td></tr>
		 * 	<tr><td><br></td><td>ok_num</td></tr>
		 * 	<tr><td><br></td><td>err_num</td></tr>
		 * 	<tr><td><br></td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_PoRecvIfService)MSLAL_PoRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * PoRecvIf_Upd04オペレーション.<p>
	 *
	 * 発注受信ＩＦ取込を行う。(発注受信ＩＦサービスを呼び出す本処理）<br>
	 */
	abstract public class PoRecvIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoRecvIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd04_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd04_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down1;
		
		
		// コンストラクタ
		protected PoRecvIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd04_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd04_DtlR.class);
			down1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();

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
			invoke((MSLAL_PoRecvIfService)MSLAL_PoRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * PoRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd04_DtlR createPoRecvIf_Upd04_DtlR(){
			return mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd04_DtlR.create();
		}

		/**
		 * PoRecvIf_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd04_DtlR> createPoRecvIf_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd04_DtlR.class);
		}

		/**
		 * RcvRecvIf_Upd04_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createRcvRecvIf_Upd04_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>poif.data_lno</td></tr>
		 * 	<tr><td><br></td><td>poif.data_no</td></tr>
		 * 	<tr><td><br></td><td>poif.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>poif.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>poif.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>poif.ext_po_no</td></tr>
		 * 	<tr><td><br></td><td>poif.ext_po_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd04_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>poif.data_lno</td></tr>
		 * 	<tr><td><br></td><td>poif.data_no</td></tr>
		 * 	<tr><td><br></td><td>poif.exe_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9110.PoRecvIf_Upd04_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_num</td></tr>
		 * 	<tr><td><br></td><td>ok_num</td></tr>
		 * 	<tr><td><br></td><td>err_num</td></tr>
		 * 	<tr><td><br></td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_PoRecvIfService)MSLAL_PoRecvIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}