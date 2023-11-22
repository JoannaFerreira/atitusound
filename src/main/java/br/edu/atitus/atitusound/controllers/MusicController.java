package br.edu.atitus.atitusound.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.atitus.atitusound.dtos.MusicDTO;
import br.edu.atitus.atitusound.entities.ArtistEntity;
import br.edu.atitus.atitusound.entities.MusicEntity;
import br.edu.atitus.atitusound.services.MusicService;
import br.edu.atitus.atitusound.services.GenericService;

@RestController
@RequestMapping("/musics")
public class MusicController extends GenericController<MusicEntity, MusicDTO> {

	private final MusicService musicService;

	public MusicController(MusicService musicService) {
		this.musicService = musicService;
	}

	@Override
	protected MusicEntity convertDTO2Entity(MusicDTO dto) {
		MusicEntity entidade = new MusicEntity();
		entidade.setDuration(dto.getDuration());
		entidade.setName(dto.getName());
		entidade.setUrl(dto.getUrl());
		ArtistEntity entidadeArtista = new ArtistEntity();
		entidadeArtista.setUuid(dto.getArtist().getUuid());
		entidade.setArtist(entidadeArtista);
		return entidade;
	}

	@Override
	public GenericService<MusicEntity> getService() {
		return musicService;
	}

}
