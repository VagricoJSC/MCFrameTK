package mcframe.commonMAUC.MAUCC2010;

import mcframe.commonCore.annotation.EI;
import mcframe.commonCore.container.*;

/**
 * MCRowMapperのコピー処理中に固定的に使う値を使用する値をセットできるRowMapperです
 * <P>
 * ヘッダ・明細をリストに渡す場合にヘッダのRowをセットすることを想定しています。
 * </P>
 * 
 * @param <D> コピー先のRow
 * @param <S> コピー元のRow
 * @param <W> 固定的に使う値
 */
@EI
public abstract class MAUCC_RowMapperWith<D extends MCRow, S extends MCRow, W extends Object>
		extends MAUCC_RowMapperWith_MC<D, S, W> {
}

